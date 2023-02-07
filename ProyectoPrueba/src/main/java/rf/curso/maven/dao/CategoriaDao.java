package rf.curso.maven.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import rf.curso.maven.dominios.Categoria;
import rf.curso.maven.exception.DomainException;
import rf.curso.maven.util.OracleJDBC;

public class CategoriaDao implements CategoriaDaoI {
	
	private Connection conn;
	private static final String QUERY_LEER_TODOS_CATEGORIA = "select * from Employees";
	private static final String QUERY_LEER_UNO_CATEGORIA = "select * from Employees where employee_id = ";

	public CategoriaDao() throws SQLException {
		OracleJDBC ora = new OracleJDBC();
		conn = ora.abrir();
	}
	
	@Override
	public Categoria leerUno(int id) throws SQLException, DomainException {
		Categoria c;
		Statement leerTodos = conn.createStatement();
		ResultSet rs = leerTodos.executeQuery(QUERY_LEER_UNO_CATEGORIA + id);
		rs.next();
			c = carga(rs);
		if (rs != null) {
			rs.close();
		}
		return c;
	}

	@Override
	public List<Categoria> leerTodos() throws SQLException, DomainException {
		Statement leerTodos = conn.createStatement();
		ResultSet rs = leerTodos.executeQuery(QUERY_LEER_TODOS_CATEGORIA);
		List<Categoria> catlist = new ArrayList<Categoria>();
		while (rs.next()) {
			catlist.add(carga(rs));
		}
		if (rs != null) {
			rs.close();
		}
		return catlist;
	}

	@Override
	public int actualizar(Categoria categ) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Categoria categ) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int categ_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Categoria insert(Categoria categ) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Categoria carga(ResultSet rs) throws DomainException, SQLException {
		Categoria cat = new Categoria(rs.getString("JOB_ID").replaceAll("_", "AA"));
		return cat;
	}
	
}
