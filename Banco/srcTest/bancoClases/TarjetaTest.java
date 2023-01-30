package bancoClases;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import excepcionesClases.FechaInvalidaException;
import excepcionesClases.LongitudStringInvalidaException;

/**
 * Clase de prueba para probar la clase Tarjeta
 * @author helena.martinez.duro
 *
 */
class TarjetaTest {
	
	/*Datos correctos para probar, utilizo las clases creadas a propósito para pruebas
	 * de CuentaHerencia y TarjetaHerencia*/
	static final LocalDate FECHA_CAD = LocalDate.of(2026, 1, 26);
	static CuentaHerencia c;
	static final String[] NUMERO_TARJETA = {"ES00-1122-3344-5566-7788", "Pruebita de numero de tarjeta"};
	static final String[] NOMBRE_TITULAR = {"Helena Martinez Duro", "ALVARO MARTIN RAMOSS"};
	static final String[] NUMERO_CUENTA = {"IBAN-0011-2233-4455-6677", "9999999999999"};
	static final String TITULAR_INCORRECTO = "UwU";
	static final String[] ERROR_MESSAGE = {"La tarjeta se ha tragado una fecha de caducidad nula!!", "La tarjeta se ha tragado una fecha de caducidad fuera de limites!!", "Se ha tragado un titular fuera de limites!!"};
	static final LocalDate FECHA_CADUCIDAD = LocalDate.of(2028, 11, 8);
	static final LocalDate FECHA_ACTUAL = LocalDate.now();
	static TarjetaHerencia t;
	
	/*Preparo una instancia de TarjetaHerencia (la clase original es abstracta pero
	 * para probar sus clases con codigo necesito instanciarla)*/
	@BeforeEach
	void crearTarjeta() throws FechaInvalidaException, LongitudStringInvalidaException {
		c = new CuentaHerencia(NUMERO_CUENTA[0], NOMBRE_TITULAR[0]);
		t = new TarjetaHerencia(FECHA_CAD, NUMERO_TARJETA[0], NOMBRE_TITULAR[0]);
		t.setmCuentaAsociada(c);
	}

	
	@Test
	void testSetmCuentaAsociada() throws LongitudStringInvalidaException {
		//Compruebo que cuando paso un nulo no se queda nulo
		t.setmCuentaAsociada(null);
		assertNull(t.getmCuentaAsociada());
		//Le vuelvo a asignar la cuenta predefinida y compruebo que llegan los datos
		t.setmCuentaAsociada(c);
		assertNotNull(t.getmCuentaAsociada());
		assertEquals(NUMERO_CUENTA[0], t.getmCuentaAsociada().getmNumero());
		assertEquals(NOMBRE_TITULAR[0], t.getmCuentaAsociada().getmTitular());
		//Cambio directamente datos a la cuenta y compruebo que desde tarjeta
		// se ven los cambios
		c.setmNumero(NUMERO_CUENTA[1]);
		c.setmTitular(NOMBRE_TITULAR[1]);
		assertEquals(NUMERO_CUENTA[1], t.getmCuentaAsociada().getmNumero());
		assertEquals(NOMBRE_TITULAR[1], t.getmCuentaAsociada().getmTitular());
	}

	@Test
	void testGetmCuentaAsociada() {
		//Compruebo que no devuelve null y que los datos son los esperados
		assertNotNull(t.getmCuentaAsociada());
		assertEquals(NUMERO_CUENTA[0], t.getmCuentaAsociada().getmNumero());
		assertEquals(NOMBRE_TITULAR[0], t.getmCuentaAsociada().getmTitular());
	}

	@Test
	void testGetmFechaDeCaducidad() {
		//Compruebo que no devuelve nulo
		assertNotNull(t.getmFechaDeCaducidad());
	}

	@Test
	void testSetmFechaDeCaducidad() throws FechaInvalidaException {
		//Variable auxiliar
		LocalDate aux = t.getmFechaDeCaducidad();
		//Compruebo que si pasas null o fecha fuera de limites da excepcion
		assertThrows(FechaInvalidaException.class, () -> t.setmFechaDeCaducidad(null),
				ERROR_MESSAGE[0]);
		assertThrows(FechaInvalidaException.class, () -> t.setmFechaDeCaducidad(FECHA_ACTUAL),
				ERROR_MESSAGE[1]);
		//Compruebo que si le pongo otra fecha valida la coge y es distinta a la que tenia
		t.setmFechaDeCaducidad(FECHA_CADUCIDAD);
		assertNotEquals(0, aux.compareTo(t.getmFechaDeCaducidad()));
	}

	@Test
	void testGetmNumero() {
		//Compruebo que no devuelve nulo y que los datos son los esperados
		assertNotNull(t.getmNumero());
		assertEquals(NUMERO_TARJETA[0], t.getmNumero());
	}

	@Test
	void testSetmNumero() {
		//Compruebo que si mando nulo no devuelve nulo
		t.setmNumero(null);
		assertNotNull(t.getmNumero());
		//Compruebo que guarda los datos que le paso
		t.setmNumero(NUMERO_TARJETA[1]);
		assertEquals(NUMERO_TARJETA[1], t.getmNumero());
	}

	@Test
	void testGetmTitular() {
		//Compruebo que no devuelve nulo y que los datos son los esperados
		assertNotNull(t.getmTitular());
		assertEquals(NOMBRE_TITULAR[0], t.getmTitular());
	}

	@Test
	void testSetmTitular() throws LongitudStringInvalidaException {
		//Pruebo a cambiar el valor del dato y compruebo que se ha cambiado 2 veces
		t.setmTitular(NOMBRE_TITULAR[1]);
		assertNotEquals(NOMBRE_TITULAR[0], t.getmTitular());
		t.setmTitular(NOMBRE_TITULAR[0]);
		assertEquals(NOMBRE_TITULAR[0], t.getmTitular());
		//Compruebo que me da error cuando le paso concepto fuera de limites
		assertThrows(LongitudStringInvalidaException.class, () ->  t.setmTitular(TITULAR_INCORRECTO),
				ERROR_MESSAGE[2]);
	}

	@Test
	void testToString() {
		//Compruebo que no devuelve nulo
		assertNotNull(t.toString());
	}

}
