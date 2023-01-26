package cuentasYTarjetasTests;

import java.time.LocalDate;

import clasesExcepciones.FechaInvalidaException;
import clasesExcepciones.LongitudStringInvalidaException;
import ejercicioDiapositivasExcepciones.cuentasYTarjetas.Tarjeta;

public class TarjetaHerencia extends Tarjeta {

	public TarjetaHerencia(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) throws FechaInvalidaException, LongitudStringInvalidaException {
		super(mFechaDeCaducidad, mNumero, mTitular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getmSaldo() {
		// TODO Auto-generated method stub
		return 1200.50;
	}

	@Override
	public void ingresar(double importe) throws LongitudStringInvalidaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double importe) throws LongitudStringInvalidaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirar(double importe) throws LongitudStringInvalidaException {
		// TODO Auto-generated method stub
		
	}

}
