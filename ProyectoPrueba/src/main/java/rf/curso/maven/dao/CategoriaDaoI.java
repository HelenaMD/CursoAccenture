package rf.curso.maven.dao;

import java.sql.SQLException;
import java.util.List;

import rf.curso.maven.dominios.Categoria;
import rf.curso.maven.exception.DomainException;

public interface CategoriaDaoI {

	public Categoria leerUno(int id) throws SQLException, DomainException;
	
	public List<Categoria> leerTodos() throws SQLException, DomainException;
	
	public int actualizar(Categoria categ);
	
	public int delete(Categoria categ);
	
	public int delete(int categ_id);
	
	public Categoria insert(Categoria categ); //Debe devolver el objeto que hemos insertado con todos los datos que se crean
											  // automaticamente en la base de datos.
}
