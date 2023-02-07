package controller;

import java.sql.SQLException;
import java.util.List;

import dao.CountryDao;
import modelos.Country;
import util.DomainException;

public class CountryController {
private CountryDao catDao;
	
	public CountryController() throws SQLException {
		catDao = new CountryDao();
	}
	
	public List<Country> leerTodos() throws SQLException, DomainException {
		List<Country> lc = catDao.obtenerCountries();
		return lc;
	}
	
	public Country leerUno(String id) throws SQLException, DomainException {
		Country lc = catDao.buscar(id);
		return lc;
	}
	
	public void listarCats(List<Country> catlist) {
		catlist.stream().forEach(System.out::println);
	}
	
	public void mostrarCat(Country c) {
		System.out.println(c.toString());
	}
	
	public void actualizar(Country country) {
		catDao.editar(country);
	}
	
	public void borrar(Country country) {
		String id = country.getCountry_id();
		catDao.eliminar(id);
	}
}
