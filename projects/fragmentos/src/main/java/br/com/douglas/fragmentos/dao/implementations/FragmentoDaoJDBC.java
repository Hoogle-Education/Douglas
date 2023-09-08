package br.com.douglas.fragmentos.dao.implementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.douglas.fragmentos.dao.interfaces.FragmentoDao;
import br.com.douglas.fragmentos.db.DbConnector;
import br.com.douglas.fragmentos.db.DbException;
import br.com.douglas.fragmentos.db.DbIntegrityException;
import br.com.douglas.fragmentos.model.Fragmento;

public class FragmentoDaoJDBC implements FragmentoDao {

	private Connection connection;
	
	public FragmentoDaoJDBC(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public Optional<Fragmento> findByGroupId(Integer groupId) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			String sqlStatement = "SELECT * FROM Fragmentos WHERE GroupId = ?";
			st = connection.prepareStatement(sqlStatement);
			st.setInt(1, groupId);
			rs = st.executeQuery();
			
			if (rs.next()) {
				Fragmento fragmento = new Fragmento(rs);
				return Optional.of(fragmento);
			} 
			
			return Optional.empty();
		} catch (SQLException sqlException) {
			throw new DbException(sqlException.getMessage());
		} finally {
			DbConnector.closeStatement(st);
			DbConnector.closeResultSet(rs);
		}
	}

	@Override
	public List<Fragmento> findAll() {
		
		PreparedStatement st = null;
		ResultSet rs = null;
		List<Fragmento> fragmentos = null;
		
		try {
			String sqlStatement = "SELECT * FROM Fragmentos";
			st = connection.prepareStatement(sqlStatement);
			rs = st.executeQuery();
			fragmentos = new ArrayList<>();
						
			while(rs.next()) {
				Fragmento fragmento = new Fragmento(rs);
				fragmentos.add(fragmento);
			}
			
			return fragmentos;
		} catch (SQLException sqlException) {
			throw new DbException(sqlException.getMessage());
		} finally {
			DbConnector.closeStatement(st);
			DbConnector.closeResultSet(rs);
		}
		
	}
	
	@Override
	public List<Fragmento> reorganize() {
		PreparedStatement st = null;
		ResultSet rs = null;
		List<Fragmento> fragmentosOrdenados = new ArrayList<>();
		
		try {
			
			String sqlStatement = "SELECT * FROM Fragmentos "
								 + "ORDER BY Line ASC";
			
			st = connection.prepareStatement(sqlStatement);
			rs = st.executeQuery();
			fragmentosOrdenados = new ArrayList<>();
						
			while(rs.next()) {
				Fragmento fragmento = new Fragmento(rs);
				fragmentosOrdenados.add(fragmento);
			}
			
			return fragmentosOrdenados;
		} catch (SQLException sqlException) {
			throw new DbException(sqlException.getMessage());	
		} finally {
			DbConnector.closeStatement(st);
			DbConnector.closeResultSet(rs);
		}
		
	}

	@Override
	public void save(Fragmento obj) {

		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			String sqlStatement = "INSERT INTRO Fragmentos " 
							+ "(File, Line, Text) VALUES (?, ?, ?)";
								
			st = connection.prepareStatement(sqlStatement, Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, obj.getFile());
			st.setInt(2, obj.getLine());
			st.setString(3, obj.getText());
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
				rs = st.getGeneratedKeys();
				if (rs.next()) {
					int groupId = rs.getInt(1);
					obj.setGroupId(groupId);
				}
				
			} else {
				throw new DbException("Unexpected error! No rows affected.");
			}
						
		} catch(SQLException sqlException) {
			throw new DbException(sqlException.getMessage());
		} finally {
			DbConnector.closeStatement(st);
		}
				
	}

	@Override
	public void update(Fragmento obj) {
		
		PreparedStatement st = null;
		
		try {
			String sqlStatement = "UPDATE Fragmentos "
								+ "SET File = ? "
								+ "SET Line = ? "
								+ "SET Text = ? "
								+ "WHERE GroupId = ? ";
			
			st = connection.prepareStatement(sqlStatement);
			
			
			st.setString(1, obj.getFile());
			st.setInt(2, obj.getLine());
			st.setString(3, obj.getText());
			
			st.executeUpdate();
			
		} catch (SQLException sqlException) {
			throw new DbException(sqlException.getMessage());
		} finally {
			DbConnector.closeStatement(st);
		}
		
	}

	public void deleteByGroupId(Integer groupId) {

		PreparedStatement st = null;
		
		try {
			
			String sqlStatement = "DELETE FROM Fragmentos "
								+ "WHERE GroupId = ?";
			
			st = connection.prepareStatement(sqlStatement);
			st.setInt(1, groupId);
			st.executeUpdate();
					
		} catch (SQLException sqlException) {
			throw new DbIntegrityException(sqlException.getMessage());	
		} finally {
			DbConnector.closeStatement(st);
		}
		
	}


}
