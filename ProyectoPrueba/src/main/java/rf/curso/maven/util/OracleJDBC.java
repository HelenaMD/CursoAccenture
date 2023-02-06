package rf.curso.maven.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBC {
	
	private static Connection conn;
	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@95.17.8.252:1521:xe";
	private static final String DATABASE = "";
	private static final String USUARIO = "hr";
	private static final String PASSWORD = "hr";
	private static final String SQL_USE = "USE ";
	private static final String SQL_CREATE = "CREATE DATABASE ";
	private static final String QUERY_LEER_TODOS = "select * from Employees";

	public static Connection abrir() throws SQLException {
		// TODO Auto-generated method stub
		conn = null;
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Oracle JDBC driver registered");
			
			conn = DriverManager.getConnection(URL + DATABASE, USUARIO, PASSWORD);
			System.out.println("Conexion establecida.");
			
			//lectura();
			conn.setAutoCommit(false);
			return conn;
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			return null;
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} /*finally {
			cerrarConexion();
		}*/
	}
	
	public static void lectura() throws SQLException {
		Statement leerTodos = conn.createStatement();
		ResultSet rs = leerTodos.executeQuery(QUERY_LEER_TODOS);
		String resultado = "";
		while (rs.next()) {
			resultado = rs.getString("First_name");
			System.out.println(resultado);
		}
		if (rs != null) {
			rs.close();
		}
	}
	
	public static void cerrarConexion() throws SQLException {
		if (!conn.isClosed()) {
			conn.rollback();
			conn.close();
			System.out.println("Conexion cerrada.");
		}
	}

}
