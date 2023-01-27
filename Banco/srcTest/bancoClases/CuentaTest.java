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
	static String numeroCuenta = "IBAN-0011-2233-4455-6677";
	static String titularCuenta = "Helena Martinez Duro";
	
	/*Preparo una tanda de Movimientos por defecto*/
	@BeforeAll
	static void setMovimientos() throws LongitudStringInvalidaException {
		setMov = new HashSet<Movimiento>();
		setMov.add(prepare(new Movimiento("Primer Mov con Concepto que se acepta y pasa el filtro.", 1450.60)));
		setMov.add(prepare(new Movimiento("Segundo Mov con Concepto que se acepta y pasa el filtro.", 2900.99)));
		setMov.add(prepare(new Movimiento("Tercer Mov con Concepto que se acepta y pasa el filtro.", 2900.99)));
	}
	
	/*Uso interno para que los movimientos se puedan contabilizar despues*/
	static Movimiento prepare(Movimiento m) {
		m.setmTipoMovimiento("ingreso");
		return m;
	}
	
	/*Creo un objeto antes de testear cada metodo*/
	@BeforeEach
	void crearCuenta() throws LongitudStringInvalidaException {
		c = new CuentaHerencia(numeroCuenta, titularCuenta);
		c.setmMovimientos(setMov);
	}

	
	@Test
	void testCuentaStringString() throws LongitudStringInvalidaException {
		//Creo otro objeto auxiliar con los mismos valores
		Cuenta cAux = new Cuenta(numeroCuenta, titularCuenta);
		//Compruebo que no es un nulo
		assertNotNull(cAux);
		//Comparo datos para ver si se asignaron
		assertEquals(numeroCuenta, cAux.getmNumero());
		assertEquals(titularCuenta, cAux.getmTitular());
	}

	@Test
	void testCuentaCuenta() throws LongitudStringInvalidaException {
		//Creo otro objeto auxiliar con los mismos valores
		Cuenta cAux = new Cuenta(c);
		//Compruebo que no es un nulo
		assertNotNull(cAux);
		//Comparo datos para ver si se asignaron
		assertEquals(numeroCuenta, cAux.getmNumero());
		assertEquals(titularCuenta, cAux.getmTitular());
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
		assertEquals(numeroCuenta, c.getmNumero());
	}

	@Test
	void testSetmNumero() {
		//Compruebo que guarda lo que le paso
		c.setmNumero("ESTO ES UNA PRUEBA DE NUMERO DE CUENTA");;
		assertNotNull(c.getmMovimientos());
		assertNotEquals(numeroCuenta, c.getmNumero());
		//Lo vuelvo a comprobar
		c.setmNumero(numeroCuenta);
		assertEquals(numeroCuenta, c.getmNumero());
		//Si le pasamos nulo sigue teniendo un String vacio
		c.setmNumero(null);
		assertNotNull(c.getmNumero());
	}

	@Test
	void testGetmTitular() {
		//Compruebo que no es nulo y que me devuelve el dato correcto
		assertNotNull(c.getmTitular());
		assertEquals(titularCuenta, c.getmTitular());
	}

	@Test
	void testSetmTitular() throws LongitudStringInvalidaException {
		//Pruebo a cambiar el valor del dato y compruebo que se ha cambiado 2 veces
		c.setmTitular("Alvaro Martin Ramoss");
		assertNotEquals(titularCuenta, c.getmTitular());
		c.setmTitular(titularCuenta);
		assertEquals(titularCuenta, c.getmTitular());
		//Compruebo que me da error cuando le paso concepto fuera de limites
		assertThrows(LongitudStringInvalidaException.class, () ->  c.setmTitular("UwU"),
				"Se ha tragado un titular fuera de limites!!");
	}

	@Test
	void testAddMovimiento() throws LongitudStringInvalidaException {
		//Compruebo que se aniade un movimiento, pasan a ser 4 elementos
		c.addMovimiento(new Movimiento("Cuarto Mov con Concepto que se acepta y pasa el filtro.", 400.70));
		assertEquals(4, c.getmMovimientos().size());
	}

	@Test
	void testIngresarStringDouble() throws LongitudStringInvalidaException {
		/*Llamo al metodo modificado de ingresar para que me devuelva el Movimiento
		 * que acabo de aniadir (con Set no es posible llamar al ultimo elemento, no
		 * tiene orden) para comprobar que internamente se le aniadio el tipo
		 * de movimiento "ingreso"*/
		Movimiento mLast;
		mLast = c.ingresarH("Cuarto Mov con Concepto que se acepta y pasa el filtro.", 400.70);
		assertEquals(4, c.getmMovimientos().size());
		assertEquals("Cuarto Mov con Concepto que se acepta y pasa el filtro.", mLast.getmConcepto());
		assertEquals(400.70, mLast.getmImporte());
		assertEquals("ingreso", mLast.getmTipoMovimiento());
	}

	@Test
	void testIngresarDouble() throws LongitudStringInvalidaException {
		/*Llamo al metodo modificado de ingresar para que me devuelva el Movimiento
		 * que acabo de aniadir (con Set no es posible llamar al ultimo elemento, no
		 * tiene orden) para comprobar que internamente se le aniadio el tipo
		 * de movimiento "ingreso" y el concepto por defecto*/
		Movimiento mLast;
		mLast = c.ingresarH(400.70);
		assertEquals(4, c.getmMovimientos().size());
		assertEquals("Ingreso a cuenta bancaria desde cajero automatico", mLast.getmConcepto());
		assertEquals(400.70, mLast.getmImporte());
		assertEquals("ingreso", mLast.getmTipoMovimiento());
	}

	@Test
	void testRetirarStringDouble() throws LongitudStringInvalidaException {
		/*Llamo al metodo modificado de ingresar para que me devuelva el Movimiento
		 * que acabo de aniadir (con Set no es posible llamar al ultimo elemento, no
		 * tiene orden) para comprobar que internamente se le aniadio el tipo
		 * de movimiento "retirada"*/
		Movimiento mLast;
		mLast = c.retirarH("Cuarto Mov con Concepto que se acepta y pasa el filtro.", 400.70);
		assertEquals(4, c.getmMovimientos().size());
		assertEquals("Cuarto Mov con Concepto que se acepta y pasa el filtro.", mLast.getmConcepto());
		assertEquals(400.70, mLast.getmImporte());
		assertEquals("retirada", mLast.getmTipoMovimiento());
	}

	@Test
	void testRetirarDouble() throws LongitudStringInvalidaException {
		/*Llamo al metodo modificado de ingresar para que me devuelva el Movimiento
		 * que acabo de aniadir (con Set no es posible llamar al ultimo elemento, no
		 * tiene orden) para comprobar que internamente se le aniadio el tipo
		 * de movimiento "retirada" y el concepto por defecto*/
		Movimiento mLast;
		mLast = c.retirarH(400.70);
		assertEquals(4, c.getmMovimientos().size());
		assertEquals("Retirada de cuenta bancaria desde cajero automatico", mLast.getmConcepto());
		assertEquals(400.70, mLast.getmImporte());
		assertEquals("retirada", mLast.getmTipoMovimiento());
	}

	@Test
	void testGetmSaldo() throws LongitudStringInvalidaException {
		/*Compruebo que suma los valores de los movimientos de ingreso
		 * y que resta los valores de los movimientos retirada*/
		assertEquals(1450.60 + 2900.99 + 2900.99, c.getmSaldo());
		c.retirar(1000);
		assertEquals(1450.60 + 2900.99 + 2900.99 - 1000, c.getmSaldo());
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
