package es.rf.tienda.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.rf.tienda.dominio.Categoria;
import es.rf.tienda.objetos.repository.ICategoria;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private ICategoria cDao;
	
	/*public void ICategoria(ICategoria cDao) {
		this.cDao = cDao;
	}*/
	
	@GetMapping("/{id}")
	public String[] leerUno(@PathVariable("id") int id) {
		try {
			Categoria c = cDao.findById(id).get();
			return new String[] {"200", c.toString()};
		} catch (NoSuchElementException nsee) {
			return new String[] {"400", "No existe registro solicitado"};
		}
	}
	
	@GetMapping()
	public List<Categoria> leerTodos() {
		return cDao.findAll();
	}
	
	@PostMapping
	public String[] alta(@RequestBody Categoria c) {
		c.setId_categoria(0);
		if (c.isValidInsert()) {
			cDao.save(c);
			return new String[] {"200", "Registro salvado"};
		} else {
			return new String[] {"500", "Registro no valido"};
		}
	}
	
	@PutMapping
	public String[] modificacion(@RequestBody Categoria c) {
		if(c.isValidUpdate()) {
			cDao.save(c);
			return new String[] {"200", "Registro modificado"};
		} else {
			return new String[] {"500", "Registro invalido"};
		}
	}
	
	@DeleteMapping("/{id}")
	public String[] modificacion(@PathVariable("id") int id) {
		if(id > 0) {
			cDao.deleteById(id);
			return new String[] {"200", "Registro borrado"};
		} else {
			return new String[] {"500", "Registro invalido"};
		}
	}
}
