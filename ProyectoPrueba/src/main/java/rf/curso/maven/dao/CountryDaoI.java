package rf.curso.maven.dao;

import java.sql.SQLException;
import java.util.List;

import rf.curso.maven.dominios.Country;
import rf.curso.maven.exception.DomainException;

public interface CountryDaoI {
	
public Country leerUno(String id) throws SQLException, DomainException;
	
	public List<Country> leerTodos() throws SQLException, DomainException;
	
	public int actualizar(Country categ) throws SQLException;
	
	public int delete(Country categ) throws SQLException;
	
	public int delete(String categ_id) throws SQLException;
	
	public Country insert(Country categ); //Debe devolver el objeto que hemos insertado con todos los datos que se crean
											  // automaticamente en la base de datos.
}
