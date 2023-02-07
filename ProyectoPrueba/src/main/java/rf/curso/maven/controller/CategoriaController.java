package rf.curso.maven.controller;

import java.sql.SQLException;
import java.util.List;

import rf.curso.maven.dao.CategoriaDao;
import rf.curso.maven.dominios.Categoria;
import rf.curso.maven.exception.DomainException;

public class CategoriaController {

	private CategoriaDao catDao;
	
	public CategoriaController() throws SQLException {
		catDao = new CategoriaDao();
	}
	
	public List<Categoria> leerTodos() throws SQLException, DomainException {
		List<Categoria> lc = catDao.leerTodos();
		return lc;
	}
	
	public Categoria leerUno(int id) throws SQLException, DomainException {
		Categoria lc = catDao.leerUno(id);
		return lc;
	}
	
	public void listarCats(List<Categoria> catlist) {
		catlist.stream().forEach(System.out::println);
	}
	
	public void mostrarCat(Categoria c) {
		System.out.println(c.toString());
	}
}
