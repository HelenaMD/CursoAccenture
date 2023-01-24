package ejercicioDiapositivasExcepciones.cuentasYTarjetas;

import java.time.LocalDate;

import clasesExcepciones.FechaInvalidaException;
import clasesExcepciones.LongitudStringInvalidaException;

/**
 * Clase Debito que hereda de Tarjeta
 * @author helena.martinez.duro
 *
 */
public class Debito extends Tarjeta {

	/**
	 * Constructor principal de la clase
	 * @param mFechaDeCaducidad LocalDate
	 * @param mNumero String
	 * @param mTitular String
	 * @throws FechaInvalidaException 
	 */
	public Debito(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) throws FechaInvalidaException {
		super(mFechaDeCaducidad, mNumero, mTitular);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo heredado sobreescrito que consulta el saldo de la cuenta asociada
	 * a la tarjeta de debito
	 * @return double
	 */
	@Override
	public double getmSaldo() {
		// TODO Auto-generated method stub
		//Comprobamos que la cuenta no sea un null
		if (getmCuentaAsociada() == null) {
			throw new NullPointerException("No ha asociado una cuenta a la tarjeta de debito con numero " + getmNumero());
		} else {
			//Accedemos al saldo y lo devolvemos
			return getmCuentaAsociada().getmSaldo();
		}
	}

	/**
	 * Metodo heredado sobreescrito que ingresa un importe en la cuenta asociada
	 * a la tarjeta de debito
	 * @param importe double
	 * @throws LongitudStringInvalidaException 
	 */
	@Override
	public void ingresar(double importe) throws LongitudStringInvalidaException {
		// TODO Auto-generated method stub
		//Comprobamos que la cuenta no sea un null
		if (getmCuentaAsociada() == null) {
			throw new NullPointerException("No ha asociado una cuenta a la tarjeta de debito con numero " + getmNumero());
		} else {
			//Ingresamos
			getmCuentaAsociada().ingresar("Ingreso en cuenta asociada (cajero automatico)", importe);
		}
	}

	/**
	 * Metodo heredado sobreescrito que simula el pago en un establecimiento
	 * en cuanto a funcionalidad es lo mismo que retirar, pero con un concepto
	 * @param datos String
	 * @param importe double
	 * @throws LongitudStringInvalidaException 
	 */
	@Override
	public void pagoEnEstablecimiento(String datos, double importe) throws LongitudStringInvalidaException {
		// TODO Auto-generated method stub
		//Comprobamos que la cuenta no sea un null
		if (getmCuentaAsociada() == null) {
			throw new NullPointerException("No ha asociado una cuenta a la tarjeta de debito con numero " + getmNumero());
		} else {
			//REtiramos
			getmCuentaAsociada().retirar(datos, importe);
		}
	}

	/**
	 * Metodo heredado sobreescrito que retira un importe en la cuenta asociada
	 * a la tarjeta de debito
	 * @param importe double
	 * @throws LongitudStringInvalidaException 
	 */
	@Override
	public void retirar(double importe) throws LongitudStringInvalidaException {
		// TODO Auto-generated method stub
		//Comprobamos que la cuenta no sea un null
		if (getmCuentaAsociada() == null) {
			throw new NullPointerException("No ha asociado una cuenta a la tarjeta de debito con numero " + getmNumero());
		} else {
			//Retiramos
			getmCuentaAsociada().retirar("Retirada en cuenta asociada (cajero automatico)", importe);
		}
	}

	/**
	 * Metodo que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		if (getmCuentaAsociada() == null) {
			throw new NullPointerException("No tienes cuenta asociada a la tarjeta de debito");
		} else {
			return "Debito " + super.toString();
		}
	}

	
}
