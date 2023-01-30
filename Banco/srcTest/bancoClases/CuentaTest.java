package bancoClases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bancoClases.Cuenta;
import bancoClases.Movimiento;
import excepcionesClases.LongitudStringInvalidaException;

/**
 * Clase que prueba la clase Cuenta a traves de una clase hija CuentaHerencia por
 * motivos que se aclaran mas adelante
 * @author helena.martinez.duro
 *
 */
class CuentaTest {
	
	/*Datos con los que voy a probar*/
	static Set<Movimiento> setMov;
	static CuentaHerencia c;
	static final String NUMERO_CUENTA = "IBAN-0011-2233-4455-6677";
	static final String[] TITULAR_CUENTA = {"Helena Martinez Duro", "Alvaro Martin Ramoss"};
	static final String TITULAR_INCORRECTO = "UwU";
	static final String PRUEBA_NUM_CUENTA = "ESTO ES UNA PRUEBA DE NUMERO DE CUENTA";
	static final String[] CONCEPTOS = {"Primer Mov con Concepto que se acepta y pasa el filtro.", "Segundo Mov con Concepto que se acepta y pasa el filtro.", "Tercer Mov con Concepto que se acepta y pasa el filtro.", "Cuarto Mov con Concepto que se acepta y pasa el filtro.", "Ingreso a cuenta bancaria desde cajero automatico", "Retirada de cuenta bancaria desde cajero automatico"};
	static final double[] IMPORTES = {1450.60, 2900.99, 2900.99, 400.70, 1000};
	static final String[] TIPO_MOVIMIENTO = {"ingreso", "retirada"};
	static final String ERROR_MESSAGE = "Se ha tragado un titular fuera de limites!!";
	
	/*Preparo una tanda de Movimientos por defecto*/
	@BeforeAll
	static void setMovimientos() throws LongitudStringInvalidaException {
		setMov = new HashSet<Movimiento>();
		setMov.add(prepare(new Movimiento(CONCEPTOS[0], IMPORTES[0])));
		setMov.add(prepare(new Movimiento(CONCEPTOS[1], IMPORTES[1])));
		setMov.add(prepare(new Movimiento(CONCEPTOS[2], IMPORTES[2])));
	}
	
	/*Uso interno para que los movimientos se puedan contabilizar despues*/
	static Movimiento prepare(Movimiento m) {
		m.setmTipoMovimiento(TIPO_MOVIMIENTO[0]);
		return m;
	}
	
	/*Creo un objeto antes de testear cada metodo*/
	@BeforeEach
	void crearCuenta() throws LongitudStringInvalidaException {
		c = new CuentaHerencia(NUMERO_CUENTA, TITULAR_CUENTA[0]);
		c.setmMovimientos(setMov);
	}

	
	@Test
	void testCuentaStringString() throws LongitudStringInvalidaException {
		//Creo otro objeto auxiliar con los mismos valores
		Cuenta cAux = new Cuenta(NUMERO_CUENTA, TITULAR_CUENTA[0]);
		//Compruebo que no es un nulo
		assertNotNull(cAux);
		//Comparo datos para ver si se asignaron
		assertEquals(NUMERO_CUENTA, cAux.getmNumero());
		assertEquals(TITULAR_CUENTA[0], cAux.getmTitular());
	}

	@Test
	void testCuentaCuenta() throws LongitudStringInvalidaException {
		//Creo otro objeto auxiliar con los mismos valores
		Cuenta cAux = new Cuenta(c);
		//Compruebo que no es un nulo
		assertNotNull(cAux);
		//Comparo datos para ver si se asignaron
		assertEquals(NUMERO_CUENTA, cAux.getmNumero());
		assertEquals(TITULAR_CUENTA[0], cAux.getmTitular());
	}

	@Test
	void testGetmMovimientos() {
		//Compruebo que no me da datos null
		assertNotNull(c.getmMovimientos());
		//Compruebo que contiene los 3 elementos aniadidos
		assertEquals(3, c.getmMovimientos().size());
	}

	@Test
	void testSetmMovimientos() {
		//Compruebo que guarda lo que le paso
		c.setmMovimientos(new HashSet<Movimiento>());
		assertNotNull(c.getmMovimientos());
		//Y que esta vacio porque le pasé uno vacío
		assertEquals(0, c.getmMovimientos().size());
		//Si le pasamos nulo sigue teniendo un HashSet vacio
		c.setmMovimientos(null);
		assertNotNull(c.getmMovimientos());
	}

	@Test
	void testGetmNumero() {
		//Compruebo que no es nulo y que me devuelve el dato correcto
		assertNotNull(c.getmNumero());
		assertEquals(NUMERO_CUENTA, c.getmNumero());
	}

	@Test
	void testSetmNumero() {
		//Compruebo que guarda lo que le paso
		c.setmNumero(PRUEBA_NUM_CUENTA);;
		assertNotNull(c.getmMovimientos());
		assertNotEquals(NUMERO_CUENTA, c.getmNumero());
		//Lo vuelvo a comprobar
		c.setmNumero(NUMERO_CUENTA);
		assertEquals(NUMERO_CUENTA, c.getmNumero());
		//Si le pasamos nulo sigue teniendo un String vacio
		c.setmNumero(null);
		assertNotNull(c.getmNumero());
	}

	@Test
	void testGetmTitular() {
		//Compruebo que no es nulo y que me devuelve el dato correcto
		assertNotNull(c.getmTitular());
		assertEquals(TITULAR_CUENTA[0], c.getmTitular());
	}

	@Test
	void testSetmTitular() throws LongitudStringInvalidaException {
		//Pruebo a cambiar el valor del dato y compruebo que se ha cambiado 2 veces
		c.setmTitular(TITULAR_CUENTA[1]);
		assertNotEquals(TITULAR_CUENTA[0], c.getmTitular());
		c.setmTitular(TITULAR_CUENTA[0]);
		assertEquals(TITULAR_CUENTA[0], c.getmTitular());
		//Compruebo que me da error cuando le paso concepto fuera de limites
		assertThrows(LongitudStringInvalidaException.class, () ->  c.setmTitular(TITULAR_INCORRECTO),
				ERROR_MESSAGE);
	}

	@Test
	void testAddMovimiento() throws LongitudStringInvalidaException {
		//Compruebo que se aniade un movimiento, pasan a ser 4 elementos
		c.addMovimiento(new Movimiento(CONCEPTOS[3], IMPORTES[3]));
		assertEquals(4, c.getmMovimientos().size());
	}

	@Test
	void testIngresarStringDouble() throws LongitudStringInvalidaException {
		/*Llamo al metodo modificado de ingresar para que me devuelva el Movimiento
		 * que acabo de aniadir (con Set no es posible llamar al ultimo elemento, no
		 * tiene orden) para comprobar que internamente se le aniadio el tipo
		 * de movimiento "ingreso"*/
		Movimiento mLast;
		mLast = c.ingresarH(CONCEPTOS[3], IMPORTES[3]);
		assertEquals(4, c.getmMovimientos().size());
		assertEquals(CONCEPTOS[3], mLast.getmConcepto());
		assertEquals(IMPORTES[3], mLast.getmImporte());
		assertEquals(TIPO_MOVIMIENTO[0], mLast.getmTipoMovimiento());
	}

	@Test
	void testIngresarDouble() throws LongitudStringInvalidaException {
		/*Llamo al metodo modificado de ingresar para que me devuelva el Movimiento
		 * que acabo de aniadir (con Set no es posible llamar al ultimo elemento, no
		 * tiene orden) para comprobar que internamente se le aniadio el tipo
		 * de movimiento "ingreso" y el concepto por defecto*/
		Movimiento mLast;
		mLast = c.ingresarH(IMPORTES[3]);
		assertEquals(4, c.getmMovimientos().size());
		assertEquals(CONCEPTOS[4], mLast.getmConcepto());
		assertEquals(IMPORTES[3], mLast.getmImporte());
		assertEquals(TIPO_MOVIMIENTO[0], mLast.getmTipoMovimiento());
	}

	@Test
	void testRetirarStringDouble() throws LongitudStringInvalidaException {
		/*Llamo al metodo modificado de ingresar para que me devuelva el Movimiento
		 * que acabo de aniadir (con Set no es posible llamar al ultimo elemento, no
		 * tiene orden) para comprobar que internamente se le aniadio el tipo
		 * de movimiento "retirada"*/
		Movimiento mLast;
		mLast = c.retirarH(CONCEPTOS[3], IMPORTES[3]);
		assertEquals(4, c.getmMovimientos().size());
		assertEquals(CONCEPTOS[3], mLast.getmConcepto());
		assertEquals(IMPORTES[3], mLast.getmImporte());
		assertEquals(TIPO_MOVIMIENTO[1], mLast.getmTipoMovimiento());
	}

	@Test
	void testRetirarDouble() throws LongitudStringInvalidaException {
		/*Llamo al metodo modificado de ingresar para que me devuelva el Movimiento
		 * que acabo de aniadir (con Set no es posible llamar al ultimo elemento, no
		 * tiene orden) para comprobar que internamente se le aniadio el tipo
		 * de movimiento "retirada" y el concepto por defecto*/
		Movimiento mLast;
		mLast = c.retirarH(IMPORTES[3]);
		assertEquals(4, c.getmMovimientos().size());
		assertEquals(CONCEPTOS[5], mLast.getmConcepto());
		assertEquals(IMPORTES[3], mLast.getmImporte());
		assertEquals(TIPO_MOVIMIENTO[1], mLast.getmTipoMovimiento());
	}

	@Test
	void testGetmSaldo() throws LongitudStringInvalidaException {
		/*Compruebo que suma los valores de los movimientos de ingreso
		 * y que resta los valores de los movimientos retirada*/
		assertEquals(IMPORTES[0] + IMPORTES[1] + IMPORTES[2], c.getmSaldo());
		c.retirar(IMPORTES[4]);
		assertEquals(IMPORTES[0] + IMPORTES[1] + IMPORTES[2] - IMPORTES[4], c.getmSaldo());
	}

	@Test
	void testMostrarMovimientos() {
		//Esto no tiene mucho mas, muestra un string asi que compruebo que no sea nulo
		assertNotNull(c.mostrarMovimientos());
	}

	@Test
	void testToString() {
		//Esto no tiene mucho mas, muestra un string asi que compruebo que no sea nulo
		assertNotNull(c.toString());
	}

}
