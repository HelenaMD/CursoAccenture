package bancoClases;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bancoClases.Debito;
import excepcionesClases.FechaInvalidaException;
import excepcionesClases.LongitudStringInvalidaException;

/**
 * Clase para probar Debito
 * @author helena.martinez.duro
 *
 */
class DebitoTest {

	static final LocalDate FECHA_CAD = LocalDate.of(2026, 1, 26);
	static CuentaHerencia c;
	static final String NUMERO_TARJETA = "ES00-1122-3344-5566-7788";
	static final String NOMBRE_TITULAR = "Helena Martinez Duro";
	static Debito d;
	
	@BeforeEach
	void crearTarjeta() throws FechaInvalidaException, LongitudStringInvalidaException {
		d = new Debito(FECHA_CAD, NUMERO_TARJETA, NOMBRE_TITULAR);
		c = new CuentaHerencia("IBAN-0011-2233-4455-6677", "Helena Martinez Duro");
		//d.setmCuentaAsociada(c);
	}

	@Test
	void testIngresar() throws LongitudStringInvalidaException {
		assertThrows(NullPointerException.class, () -> d.ingresar(100.60),
				"Se ha tragado un ingreso sin cuenta asignada!!!");
		d.setmCuentaAsociada(c);
		d.ingresar(1560.10);
		assertEquals(1, d.getmCuentaAsociada().getmMovimientos().size());
	}

	@Test
	void testPagoEnEstablecimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testRetirar() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testDebito() {
		fail("Not yet implemented");
	}

}
