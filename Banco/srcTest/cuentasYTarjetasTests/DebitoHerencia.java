package cuentasYTarjetasTests;

import java.time.LocalDate;

import bancoClases.Debito;
import excepcionesClases.FechaInvalidaException;
import excepcionesClases.LongitudStringInvalidaException;

public class DebitoHerencia extends TarjetaHerencia {

	public DebitoHerencia(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) throws FechaInvalidaException, LongitudStringInvalidaException {
		super(mFechaDeCaducidad, mNumero, mTitular);
		// TODO Auto-generated constructor stub
	}
}
