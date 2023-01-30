package bancoClases;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bancoClases.Movimiento;
import excepcionesClases.LongitudStringInvalidaException;

/**
 * Clase para probar Movimiento
 * @author helena.martinez.duro
 *
 */
class MovimientoTest {
	
	/*Un objeto movimiento y unas finales con un concepto y un importe para comparar*/
	static Movimiento movOk;
	static final String[] CONCEPTO = {"Concepto que se acepta y pasa el filtro.", "Otro concepto igual de valido que el otro.", "Pruebita de setter desde el test"};
	static final String CONCEPTO_INCORRECTO = "";
	static final double[] IMPORTE = {1450.60, 1005};
	static final String[] ERROR_MESSAGE = {"Se ha tragado el concepto sin letras!!!", "Se ha tragado un concepto fuera de limites!!", "La fecha del movimiento no puede ser una fecha por llegar!", "La fecha tiene que ser la actual en el momento de crear el movimiento!", "Se ha tragado un importe negativo!!"};
	static final String TIPO_MOVIMIENTO = "ingreso";
	
	
	//Voy con el objeto creado antes de cada metodo
	@BeforeEach
	void crearMovimiento() throws LongitudStringInvalidaException {
		movOk = new Movimiento(CONCEPTO[0], IMPORTE[0]);
	}

	@Test
	void testMovimiento() throws LongitudStringInvalidaException {
		//Creo otro objeto auxiliar con los mismos valores
		Movimiento movAux = new Movimiento(CONCEPTO[0], IMPORTE[0]);
		//Compruebo que no es un nulo
		assertNotNull(movAux);
		//Comparo datos para ver si se asignaron
		assertEquals(CONCEPTO[0], movAux.getmConcepto());
		assertEquals(IMPORTE[0], movAux.getmImporte());
	}
	
	
	@Test
	void testMovimientoE() {
		//Compruebo que no se pueden crear movimientos sin concepto valido
		Movimiento movAux;
		assertThrows(LongitudStringInvalidaException.class, () -> new Movimiento(CONCEPTO_INCORRECTO, IMPORTE[0]),
	            ERROR_MESSAGE[0]);
	}

	@Test
	void testGetmConcepto() {
		//Compruebo que no es nulo y que me devuelve el dato correcto
		assertNotNull(movOk.getmConcepto());
		assertEquals(CONCEPTO[0], movOk.getmConcepto());
	}

	@Test
	void testSetmConcepto() throws LongitudStringInvalidaException {
		//Pruebo a cambiar el valor del dato y compruebo que se ha cambiado 2 veces
		movOk.setmConcepto(CONCEPTO[2]);
		assertNotEquals(CONCEPTO[0], movOk.getmConcepto());
		movOk.setmConcepto(CONCEPTO[0]);
		assertEquals(CONCEPTO[0], movOk.getmConcepto());
		//Compruebo que me da error cuando le paso concepto fuera de limites
		assertThrows(LongitudStringInvalidaException.class, () ->  movOk.setmConcepto(CONCEPTO_INCORRECTO),
				ERROR_MESSAGE[1]);
	}

	@Test
	void testGetmFecha() {
		//Compruebo que no pasa un nulo
		assertNotNull(movOk.getmFecha());
		//Compruebo que la fecha que coge el movimiento nunca sera una fecha del futuro
		if (movOk.getmFecha().compareTo(LocalDate.now()) > 0) {
			fail(ERROR_MESSAGE[2]);
		}
	}

	@Test
	void testSetmFecha() {
		//Seteo la fecha para que sea la actual de hoy
		movOk.setmFecha();
		//Compruebo que efectivamente es la actual de hoy
		if (movOk.getmFecha().compareTo(LocalDate.now()) != 0) {
			fail(ERROR_MESSAGE[3]);
		}
	}

	@Test
	void testGetmImporte() {
		//Compruebo que guarda y devuelve bien el dato
		assertEquals(IMPORTE[0], movOk.getmImporte());
	}

	@Test
	void testSetmImporte() {
		//Compruebo que no traga importes negativos como pide el ejercicio
		assertThrows(NullPointerException.class, () -> movOk.setmImporte(-IMPORTE[0]),
				ERROR_MESSAGE[4]);
	}

	@Test
	void testGetIdMovimiento() throws LongitudStringInvalidaException {
		//Creo dos objetos y compruebo que su id itera.
		assertEquals(1, movOk.getIdMovimiento());
		movOk = new Movimiento(CONCEPTO[1], IMPORTE[1]);
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
		movOk.setmTipoMovimiento(TIPO_MOVIMIENTO);
		assertEquals(TIPO_MOVIMIENTO, movOk.getmTipoMovimiento());
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
