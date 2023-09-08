package br.com.douglas.fragmentos.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbConnector {

	private static Connection connection = null;
	
	private static Connection connectionFactory () throws DbException {
		Connection connection = null;
		
		try {
			Properties properties = loadProperties();
			String url = properties.getProperty("dburl");
			connection = DriverManager.getConnection(url, properties);
		} catch (SQLException sqlException) {
			throw new DbException(sqlException.getMessage());
		}
		
		return connection;
	}
	
	private static Properties loadProperties() {
		
		String path = "\\src\\main\\resources\\mariadb.properties";
		
		try ( FileInputStream fs = new FileInputStream(path) ) {
			Properties properties = new Properties();
			properties.load(fs);
			return properties;
		} catch (IOException iox) {
			throw new DbException(iox.getMessage());
		}
	}
	
	public static Connection getConnection() {
		
		if (connection == null) {
			connection  = connectionFactory();
		}
		
		return connection;
	}
	
	public static void closeConnection() {
		
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException sqlException) {
				throw new DbException(sqlException.getMessage());
			}
		}
	}
	
	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException sqlException) {
				throw new DbException(sqlException.getMessage());
			}
		}
	}
	
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException sqlException) {
				throw new DbException(sqlException.getMessage());
			}
		}
	}
}
