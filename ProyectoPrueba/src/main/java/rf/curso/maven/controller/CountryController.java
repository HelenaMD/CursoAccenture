package rf.curso.maven.controller;

import java.sql.SQLException;
import java.util.List;

import rf.curso.maven.dao.CategoriaDao;
import rf.curso.maven.dao.CountryDao;
import rf.curso.maven.dao.CountryDaoI;
import rf.curso.maven.dominios.Categoria;
import rf.curso.maven.dominios.Country;
import rf.curso.maven.exception.DomainException;

public class CountryController {
private CountryDaoI catDao;
	
	public CountryController() throws SQLException {
		catDao = new CountryDao();
	}
	
	public List<Country> leerTodos() throws SQLException, DomainException {
		List<Country> lc = catDao.leerTodos();
		return lc;
	}
	
	public Country leerUno(String id) throws SQLException, DomainException {
		Country lc = catDao.leerUno(id);
		return lc;
	}
	
	public void listarCats(List<Country> catlist) {
		catlist.stream().forEach(System.out::println);
	}
	
	public void mostrarCat(Country c) {
		System.out.println(c.toString());
	}
}
