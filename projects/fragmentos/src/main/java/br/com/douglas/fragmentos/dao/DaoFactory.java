package br.com.douglas.fragmentos.dao;

import br.com.douglas.fragmentos.dao.implementations.FragmentoDaoJDBC;
import br.com.douglas.fragmentos.dao.interfaces.FragmentoDao;
import br.com.douglas.fragmentos.db.DbConnector;

public class DaoFactory {
	
	public static FragmentoDao createFragmentoDao() {
		return new FragmentoDaoJDBC(DbConnector.getConnection());
	}

}
