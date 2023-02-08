package es.rf.tienda.objetos.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import es.rf.tienda.dominio.Categoria;


@Repository
public interface ICategoria extends JpaRepository<Categoria, Integer>{
	

}
