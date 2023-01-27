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
	static final String NUMERO_TARJETA = "ES00-1122-3344-5566-7788";
	static final String NOMBRE_TITULAR = "Helena Martinez Duro";
	static TarjetaHerencia t;
	
	/*Preparo una instancia de TarjetaHerencia (la clase original es abstracta pero
	 * para probar sus clases con codigo necesito instanciarla)*/
	@BeforeEach
	void crearTarjeta() throws FechaInvalidaException, LongitudStringInvalidaException {
		c = new CuentaHerencia("IBAN-0011-2233-4455-6677", "Helena Martinez Duro");
		t = new TarjetaHerencia(FECHA_CAD, NUMERO_TARJETA, NOMBRE_TITULAR);
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
		assertEquals("IBAN-0011-2233-4455-6677", t.getmCuentaAsociada().getmNumero());
		assertEquals("Helena Martinez Duro", t.getmCuentaAsociada().getmTitular());
		//Cambio directamente datos a la cuenta y compruebo que desde tarjeta
		// se ven los cambios
		c.setmNumero("9999999999999");
		c.setmTitular("ALVARO MARTIN RAMOSS");
		assertEquals("9999999999999", t.getmCuentaAsociada().getmNumero());
		assertEquals("ALVARO MARTIN RAMOSS", t.getmCuentaAsociada().getmTitular());
	}

	@Test
	void testGetmCuentaAsociada() {
		//Compruebo que no devuelve null y que los datos son los esperados
		assertNotNull(t.getmCuentaAsociada());
		assertEquals("IBAN-0011-2233-4455-6677", t.getmCuentaAsociada().getmNumero());
		assertEquals("Helena Martinez Duro", t.getmCuentaAsociada().getmTitular());
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
				"La tarjeta se ha tragado una fecha de caducidad nula!!");
		assertThrows(FechaInvalidaException.class, () -> t.setmFechaDeCaducidad(LocalDate.now()),
				"La tarjeta se ha tragado una fecha de caducidad fuera de limites!!");
		//Compruebo que si le pongo otra fecha valida la coge y es distinta a la que tenia
		t.setmFechaDeCaducidad(LocalDate.of(2028, 11, 8));
		assertNotEquals(0, aux.compareTo(t.getmFechaDeCaducidad()));
	}

	@Test
	void testGetmNumero() {
		//Compruebo que no devuelve nulo y que los datos son los esperados
		assertNotNull(t.getmNumero());
		assertEquals(NUMERO_TARJETA, t.getmNumero());
	}

	@Test
	void testSetmNumero() {
		//Compruebo que si mando nulo no devuelve nulo
		t.setmNumero(null);
		assertNotNull(t.getmNumero());
		//Compruebo que guarda los datos que le paso
		t.setmNumero("Pruebita de numero de tarjeta");
		assertEquals("Pruebita de numero de tarjeta", t.getmNumero());
	}

	@Test
	void testGetmTitular() {
		//Compruebo que no devuelve nulo y que los datos son los esperados
		assertNotNull(t.getmTitular());
		assertEquals(NOMBRE_TITULAR, t.getmTitular());
	}

	@Test
	void testSetmTitular() throws LongitudStringInvalidaException {
		//Pruebo a cambiar el valor del dato y compruebo que se ha cambiado 2 veces
		t.setmTitular("Alvaro Martin Ramoss");
		assertNotEquals(NOMBRE_TITULAR, t.getmTitular());
		t.setmTitular(NOMBRE_TITULAR);
		assertEquals(NOMBRE_TITULAR, t.getmTitular());
		//Compruebo que me da error cuando le paso concepto fuera de limites
		assertThrows(LongitudStringInvalidaException.class, () ->  t.setmTitular("UwU"),
				"Se ha tragado un titular fuera de limites!!");
	}

	@Test
	void testToString() {
		//Compruebo que no devuelve nulo
		assertNotNull(t.toString());
	}

}
