package rf.curso.maven.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import rf.curso.maven.dominios.Country;
import rf.curso.maven.exception.DomainException;
import rf.curso.maven.util.OracleJDBC;

public class CountryDao implements CountryDaoI {
	
	private Connection conn;
	private static final String QUERY_LEER_TODOS_COUNTRY = "select * from countries";
	private static final String QUERY_LEER_UNO_COUNTRY = "select * from countries where country_id = ";
	private static final String UPDATE_COUNTRY_PREPARED = "update countries set country_name = ? where country_id = ?";
	private static final String DELETE_COUNTRY_PREPARED = "delete from countries where country_id = ?";

	public CountryDao() throws SQLException {
		OracleJDBC ora = new OracleJDBC();
		conn = ora.abrir();
	}
	
	@Override
	public Country leerUno(String id) throws SQLException, DomainException {
		Country c;
		Statement leerTodos = conn.createStatement();
		ResultSet rs = leerTodos.executeQuery(QUERY_LEER_UNO_COUNTRY+ "'" + id + "'");
		rs.next();
			c = carga(rs);
		if (rs != null) {
			rs.close();
		}
		return c;
	}

	@Override
	public List<Country> leerTodos() throws SQLException, DomainException {
		Statement leerTodos = conn.createStatement();
		ResultSet rs = leerTodos.executeQuery(QUERY_LEER_TODOS_COUNTRY);
		List<Country> catlist = new ArrayList<Country>();
		while (rs.next()) {
			catlist.add(carga(rs));
		}
		if (rs != null) {
			rs.close();
		}
		return catlist;
	}

	@Override
	public int actualizar(Country categ) throws SQLException {
		PreparedStatement pStatement = conn.prepareStatement(UPDATE_COUNTRY_PREPARED);
		pStatement.setString(1, categ.getCountry_name());
		pStatement.setString(2, categ.getCountry_id());
		
		return pStatement.executeUpdate();
	}

	@Override
	public int delete(Country categ) throws SQLException {
		PreparedStatement pStatement = conn.prepareStatement(DELETE_COUNTRY_PREPARED);
		pStatement.setString(1, categ.getCountry_id());
		
		return pStatement.executeUpdate();
	}

	@Override
	public int delete(String categ_id) throws SQLException {
		PreparedStatement pStatement = conn.prepareStatement(DELETE_COUNTRY_PREPARED);
		pStatement.setString(1, categ_id);
		
		return pStatement.executeUpdate();
	}

	@Override
	public Country insert(Country categ) {
		// TODO Auto-generated method stub
		return null;
	}

	public Country carga(ResultSet rs) throws DomainException, SQLException {
		Country cat = new Country(rs.getString("COUNTRY_ID"), rs.getString("COUNTRY_NAME"), rs.getInt("REGION_ID"));
		return cat;
	}
	
	public void cerrar() throws SQLException {
		if (conn != null) {
			conn.rollback();
			conn.close();
		}
	}
}
