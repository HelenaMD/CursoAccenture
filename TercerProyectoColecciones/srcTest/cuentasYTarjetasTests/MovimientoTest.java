package cuentasYTarjetasTests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clasesExcepciones.LongitudStringInvalidaException;
import ejercicioDiapositivasExcepciones.cuentasYTarjetas.Movimiento;

/**
 * Clase para probar Movimiento
 * @author helena.martinez.duro
 *
 */
class MovimientoTest {
	
	/*Un objeto movimiento y unas finales con un concepto y un importe para comparar*/
	Movimiento movOk;
	final String concepto = "Concepto que se acepta y pasa el filtro.";
	final double importe = 1450.60;
	
	
	//Voy con el objeto creado antes de cada metodo
	@BeforeEach
	void crearMovimiento() throws LongitudStringInvalidaException {
		movOk = new Movimiento(concepto, importe);
	}

	@Test
	void testMovimiento() throws LongitudStringInvalidaException {
		//Creo otro objeto auxiliar con los mismos valores
		Movimiento movAux = new Movimiento(concepto, importe);
		//Compruebo que no es un nulo
		assertNotNull(movAux);
		//Comparo datos para ver si se asignaron
		assertEquals(concepto, movAux.getmConcepto());
		assertEquals(importe, movAux.getmImporte());
	}
	
	
	@Test
	void testMovimientoE() {
		//Compruebo que no se pueden crear movimientos sin concepto valido
		Movimiento movAux;
		assertThrows(LongitudStringInvalidaException.class, () -> new Movimiento("", 1450.60),
	            "Se ha tragado el concepto sin letras!!!");
	}

	@Test
	void testGetmConcepto() {
		//Compruebo que no es nulo y que me devuelve el dato correcto
		assertNotNull(movOk.getmConcepto());
		assertEquals(concepto, movOk.getmConcepto());
	}

	@Test
	void testSetmConcepto() throws LongitudStringInvalidaException {
		//Pruebo a cambiar el valor del dato y compruebo que se ha cambiado 2 veces
		movOk.setmConcepto("Pruebita de setter desde el test");
		assertNotEquals(concepto, movOk.getmConcepto());
		movOk.setmConcepto(concepto);
		assertEquals(concepto, movOk.getmConcepto());
		//Compruebo que me da error cuando le paso concepto fuera de limites
		assertThrows(LongitudStringInvalidaException.class, () ->  movOk.setmConcepto(""),
				"Se ha tragado un concepto fuera de limites!!");
	}

	@Test
	void testGetmFecha() {
		//Compruebo que no pasa un nulo
		assertNotNull(movOk.getmFecha());
		//Compruebo que la fecha que coge el movimiento nunca sera una fecha del futuro
		if (movOk.getmFecha().compareTo(LocalDate.now()) > 0) {
			fail("La fecha del movimiento no puede ser una fecha por llegar!");
		}
	}

	@Test
	void testSetmFecha() {
		//Seteo la fecha para que sea la actual de hoy
		movOk.setmFecha();
		//Compruebo que efectivamente es la actual de hoy
		if (movOk.getmFecha().compareTo(LocalDate.now()) != 0) {
			fail("La fecha tiene que ser la actual en el momento de crear el movimiento!");
		}
	}

	@Test
	void testGetmImporte() {
		//Compruebo que guarda y devuelve bien el dato
		assertEquals(importe, movOk.getmImporte());
	}

	@Test
	void testSetmImporte() {
		//Compruebo que no traga importes negativos como pide el ejercicio
		assertThrows(NullPointerException.class, () -> movOk.setmImporte(-1450.60),
				"Se ha tragado un importe negativo!!");
	}

	@Test
	void testGetIdMovimiento() throws LongitudStringInvalidaException {
		//Creo dos objetos y compruebo que su id itera.
		assertEquals(1, movOk.getIdMovimiento());
		movOk = new Movimiento("Otro concepto igual de valido que el otro.", 1005);
		assertEquals(2, movOk.getIdMovimiento());
	}

	@Test
	void testGetmTipoMovimiento() {
		//Compruebo que no devuelva un nulo y que tiene el valor vacio por defecto
		assertNotNull(movOk.getmTipoMovimiento());
		assertEquals("", movOk.getmTipoMovimiento());
	}

	@Test
	void testSetmTipoMovimiento() {
		//Compruebo que guarda y devuelve bien el dato
		movOk.setmTipoMovimiento("ingreso");
		assertEquals("ingreso", movOk.getmTipoMovimiento());
		//Compruebo que si recibe un nulo lo deja con valor vacio
		movOk.setmTipoMovimiento(null);
		assertEquals("", movOk.getmTipoMovimiento());
	}

	@Test
	void testToString() {
		//Compruebo que el toString no devuelva nulo.
		assertNotNull(movOk.toString());
	}

}
