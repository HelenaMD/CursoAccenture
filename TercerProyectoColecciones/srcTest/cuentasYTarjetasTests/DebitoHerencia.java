package cuentasYTarjetasTests;

import java.time.LocalDate;

import clasesExcepciones.FechaInvalidaException;
import clasesExcepciones.LongitudStringInvalidaException;
import ejercicioDiapositivasExcepciones.cuentasYTarjetas.Debito;

public class DebitoHerencia extends TarjetaHerencia {

	public DebitoHerencia(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) throws FechaInvalidaException, LongitudStringInvalidaException {
		super(mFechaDeCaducidad, mNumero, mTitular);
		// TODO Auto-generated constructor stub
	}
}
