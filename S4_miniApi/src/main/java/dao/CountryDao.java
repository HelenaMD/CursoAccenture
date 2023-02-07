package dao;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import modelos.Categoria;
import modelos.Country;
import service.JPAUtil;

public class CountryDao {
	EntityManager manager = JPAUtil.getEntityManager();

	// guardar Categoria
	public void guardar(Country Categoria) {
		manager.getTransaction().begin();
		manager.persist(Categoria);
		manager.getTransaction().commit();		
	}

	// editar Categoria
	public void editar(Country Categoria) {
		manager.getTransaction().begin();
		manager.merge(Categoria);
		manager.getTransaction().commit();
	}

	// buscar Categoria
	public Country buscar(String id) {
		
		Country c = manager.find(Country.class, id);
		return c;
	}

	/// eliminar Categoria
	public void eliminar(String id) {
		Country c = manager.find(Country.class, id);
		manager.getTransaction().begin();
		manager.remove(c);
		manager.getTransaction().commit();
	}

	// obtener todos los Categoria
	public List<Country> obtenerCountries() {
		List<Country> listaCategorias = new ArrayList<>();
		Query q = manager.createQuery("SELECT c FROM Country c");
		listaCategorias = (List<Country>) q.getResultList();
		return listaCategorias;
	}
}
