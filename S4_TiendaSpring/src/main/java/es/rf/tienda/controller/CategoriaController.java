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
import es.rf.tienda.exception.DomainException;
import es.rf.tienda.services.ServicioCategoria;

/**
 * Nombre: CategoriaController
 * Descripcion: Controller de la clase Categoria que se encarga de recibir peticiones de cliente 
 * y devolverle respuestas.
 * @author helena.martinez.duro
 * @version 10 de febrero de 2023
 */
@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	/**
	 * Spring instancia un objeto ServicioCategoria que contiene nuestros metodos CRUD
	 * para poder usarlos aqui
	 */
	@Autowired
	private ServicioCategoria cDao;
	
	/**
	 * Metodo que recibe una id y devuelve un objeto MensajeRespuesta que contiene el codigo de respuesta junto
	 * con su mensaje. Si el codigo fue correcto, tambien contiene los datos del objeto que queremos leer.
	 * @param id int
	 * @return MensajeRespuesta<Categoria> Objeto con el mensaje de respuesta y los datos
	 */
	@GetMapping("/{id}")
	public MensajeRespuesta<Categoria> leerUno(@PathVariable("id") String id) {
		MensajeRespuesta<Categoria> resp = new MensajeRespuesta<Categoria>();
		try {
			int idint = Integer.valueOf(id);
			Categoria c = cDao.leerUno(idint);
			if (c == null) {
				resp.setCode_respuesta(400);
				resp.setStatus_mensaje("La categoria que buscas no existe.");
			} else {
				resp.setCode_respuesta(200);
				resp.setStatus_mensaje("Ok");
				resp.setObjeto_dominio(c);
			}
			return resp;
		} catch (NumberFormatException nfe) {
			resp.setCode_respuesta(400);
			resp.setStatus_mensaje("'" + id + "' no es un id valido.");
			return resp;
		}
		
	}
	
	/**
	 * Metodo que devuelve todos los objetos existentes de Categoria en una coleccion.
	 * @return List<Categoria>
	 */
	@GetMapping()
	public List<Categoria> leerTodos() {
		return cDao.listAll();
	}
	
	/**
	 * Metodo que inserta una categoria en la bbdd.
	 * @param c Categoria
	 * @return String[] con el codigo de respuesta
	 */
	@PostMapping
	public String[] alta(@RequestBody Categoria c) {
		c.setId_categoria(0);
		if (cDao.insert(c)) {
			return new String[] {"200", "Registro salvado"};
		} else {
			return new String[] {"400", "Registro no valido"};
		}
		
	}
	
	/**
	 * Metodo que modifica un registro de la bbdd
	 * @param c Categoria
	 * @return String[] con el codigo de respuesta
	 */
	@PutMapping
	public String[] modificacion(@RequestBody Categoria c) {
		if(cDao.update(c)) {
			return new String[] {"200", "Registro modificado"};
		} else {
			return new String[] {"400", "Registro invalido"};
		}
	}
	
	/**
	 * Metodo que borra un registro de la bbdd segun su id
	 * @param id int
	 * @return String[] con el codigo de respuesta
	 */
	@DeleteMapping("/{id}")
	public String[] borrarPorId(@PathVariable("id") String id) {
		try {
			int idint = Integer.valueOf(id);
			if(idint > 0 && cDao.deleteById(idint)) {
				return new String[] {"200", "Registro borrado"};
			} else {
				return new String[] {"400", "Registro invalido"};
			}
		} catch (NumberFormatException nfe) {
			return new String[] {"400", "'" + id + "' no es una id valida."};
		}
		
	}
}
