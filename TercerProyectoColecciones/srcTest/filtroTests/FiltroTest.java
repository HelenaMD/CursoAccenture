package filtroTests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import clasesFiltros.Filtro;

/**
 * Clase de prueba para la clase Filtro
 * @author helena.martinez.duro
 */
class FiltroTest {
	
	//Datos correctos
	final String TITULAR1 = "Este titular es de 21";
	final String CONCEPTO1 = "Esto es un concepto que debe estar entre 10 y 100 caracteres";
	final LocalDate FECHA_CAD1 = LocalDate.of(2028, 10, 9);
	
	//Datos incorrectos
	final String TITULAR2 = "A";
	final String TITULAR3 = "HAY QUE ESCRIBIR MUCHO AQUI PERO MUCHO MUCHO DEMASIADO ME QUIERO SALIR DE LA LINEA HAY QUE ESCRIBIR UN MANIFIESTO";
	final String TITULAR4 = null;
	final String CONCEPTO2 = "E";
	final String CONCEPTO3 = "HAY QUE ESCRIBIR MUCHO AQUI PERO MUCHO MUCHO DEMASIADO ME QUIERO SALIR DE LA LINEA HAY QUE ESCRIBIR UN MANIFIESTOHAY QUE ESCRIBIR MUCHO AQUI PERO MUCHO MUCHO DEMASIADO ME QUIERO SALIR DE LA LINEA HAY QUE ESCRIBIR UN MANIFIESTOHAY QUE ESCRIBIR MUCHO AQUI PERO MUCHO MUCHO DEMASIADO ME QUIERO SALIR DE LA LINEA HAY QUE ESCRIBIR UN MANIFIESTOHAY QUE ESCRIBIR MUCHO AQUI PERO MUCHO MUCHO DEMASIADO ME QUIERO SALIR DE LA LINEA HAY QUE ESCRIBIR UN MANIFIESTOHAY QUE ESCRIBIR MUCHO AQUI PERO MUCHO MUCHO DEMASIADO ME QUIERO SALIR DE LA LINEA HAY QUE ESCRIBIR UN MANIFIESTO";
	final String CONCEPTO4 = null;
	final LocalDate FECHA_CAD2 = LocalDate.of(2025, 10, 9);
	final LocalDate FECHA_CAD3 = LocalDate.of(2035, 10, 9);
	final LocalDate FECHA_CAD4 = LocalDate.of(2020, 10, 9);
	final LocalDate FECHA_CAD5 = LocalDate.now();
	final LocalDate FECHA_CAD6 = null;

	@Test
	void testFiltroString() {
		/*Este metodo pone el limite donde tu le digas, pruebo el mismo dato 
		 * cambiando los limites para probar que funciona*/
		
		//Limites correctos
		assertTrue(Filtro.filtroString(TITULAR1, 20, 30));
		assertTrue(Filtro.filtroString(CONCEPTO1, 0, 200));
		
		//Limites incorrectos
		assertFalse(Filtro.filtroString(TITULAR1, 30, 40));
		assertFalse(Filtro.filtroString(CONCEPTO1, 0, 1));
	}

	@Test
	void testFiltroFechaCaducidad() {
		/*En este metodo los limites ya están predefinidos para la fecha de caducidad,
		 * deben estar entre 3 y 5 anios en el futuro.*/
		//Pruebo dentro de limites
		assertTrue(Filtro.filtroFechaCaducidad(FECHA_CAD1));
		
		//Pruebo fuera de limites
		assertFalse(Filtro.filtroFechaCaducidad(FECHA_CAD2));
		assertFalse(Filtro.filtroFechaCaducidad(FECHA_CAD3));
		assertFalse(Filtro.filtroFechaCaducidad(FECHA_CAD4));
		assertFalse(Filtro.filtroFechaCaducidad(FECHA_CAD5));
		assertFalse(Filtro.filtroFechaCaducidad(FECHA_CAD6));
	}

	@Test
	void testFiltroNombreTitular() {
		/*En este metodo los limites ya están predefinidos para el nombre de titular,
		 * deben estar entre 20 y 30 caracteres.*/
		//Pruebo con el dato dentro de limites
		assertTrue(Filtro.filtroNombreTitular(TITULAR1));
		
		//Pruebo con otros datos fuera de limites
		assertFalse(Filtro.filtroNombreTitular(CONCEPTO1));
		assertFalse(Filtro.filtroNombreTitular(TITULAR2));
		assertFalse(Filtro.filtroNombreTitular(TITULAR3));
		assertFalse(Filtro.filtroNombreTitular(TITULAR4));
	}

	@Test
	void testFiltroConceptoMovimiento() {
		/*En este metodo los limites ya están predefinidos para el concepto,
		 * deben estar entre 10 y 100 caracteres.*/
		//Pruebo con el dato dentro de limites
		assertTrue(Filtro.filtroConceptoMovimiento(CONCEPTO1));
		
		//Pruebo con datos fuera de limites
		assertFalse(Filtro.filtroConceptoMovimiento(CONCEPTO2));
		assertFalse(Filtro.filtroConceptoMovimiento(CONCEPTO3));
		assertFalse(Filtro.filtroConceptoMovimiento(CONCEPTO4));
	}

}
