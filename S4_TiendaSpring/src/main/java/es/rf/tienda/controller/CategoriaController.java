package es.rf.tienda.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.rf.tienda.dominio.Categoria;
import es.rf.tienda.services.ServicioCategoria;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private ServicioCategoria cDao;
	
	/*public void ICategoria(ICategoria cDao) {
		this.cDao = cDao;
	}*/
	
	@GetMapping("/{id}")
	public Map<String, Object> leerUno(@PathVariable("id") int id) {
		Map<String, Object> m = new HashMap<String, Object>();
		Categoria c = cDao.leerUno(id);
		if (c == null) {
			m.put("code", 400);
			m.put("status", "La categoria que buscas no existe.");
		} else {
			m.put("code", 200);
			m.put("status", "Ok");
			m.put("Datos", c);
		}
		return m;
	}
	
	@GetMapping()
	public List<Categoria> leerTodos() {
		return cDao.listAll();
	}
	
	@PostMapping
	public String[] alta(@RequestBody Categoria c) {
		c.setId_categoria(0);
		if (c.isValidInsert()) {
			cDao.insert(c);
			return new String[] {"200", "Registro salvado"};
		} else {
			return new String[] {"400", "Registro no valido"};
		}
	}
	
	@PutMapping
	public String[] modificacion(@RequestBody Categoria c) {
		if(c.isValidUpdate()) {
			cDao.update(c);
			return new String[] {"200", "Registro modificado"};
		} else {
			return new String[] {"400", "Registro invalido"};
		}
	}
	
	@DeleteMapping("/{id}")
	public String[] borrarPorId(@PathVariable("id") int id) {
		if(id > 0) {
			cDao.deleteById(id);
			return new String[] {"200", "Registro borrado"};
		} else {
			return new String[] {"400", "Registro invalido"};
		}
	}
}
