package ejerciciosMiguel.conexionBbdd;

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

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Oracle JDBC driver registered");
			
			connection = DriverManager.getConnection(URL + DATABASE, USUARIO, PASSWORD);
			System.out.println("Conexion establecida.");
			
			lectura(connection);
			
			cerrarConexion(connection);
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cerrarConexion(connection);
		}
	}
	
	public static void lectura(Connection conn) throws SQLException {
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
	
	public static void cerrarConexion(Connection conexion) throws SQLException {
		if (!conexion.isClosed()) {
			conexion.close();
			System.out.println("Conexion cerrada.");
		}
	}

}
