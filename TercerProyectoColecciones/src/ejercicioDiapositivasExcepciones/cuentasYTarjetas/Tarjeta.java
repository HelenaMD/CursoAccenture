package ejercicioDiapositivasExcepciones.cuentasYTarjetas;

import java.time.LocalDate;

import clasesExcepciones.FechaInvalidaException;
import clasesExcepciones.LongitudStringInvalidaException;
import clasesFiltros.Filtro;

/**
 * Clase padre abstracta Tarjeta
 * @author helena.martinez.duro
 *
 */
public abstract class Tarjeta {

	/**
	 * Atributos de la clase
	 */
	private Cuenta mCuentaAsociada;
	private LocalDate mFechaDeCaducidad;
	private String mNumero;
	private String mTitular;
	
	/**
	 * Constructor principal de la clase
	 * @param mFechaDeCaducidad LocalDate
	 * @param mNumero String
	 * @param mTitular String
	 * @throws FechaInvalidaException 
	 */
	public Tarjeta(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) throws FechaInvalidaException {
		/*Cuando creas la tarjeta no recibes los datos de la cuenta asociada
		 * por lo que he de inicializarlo con un null*/
		setmCuentaAsociada(null);
		if (Filtro.filtroFechaCaducidad(mFechaDeCaducidad)) {
			setmFechaDeCaducidad(mFechaDeCaducidad);
		} else {
			throw new FechaInvalidaException("La fecha de caducidad debe estar entre 3 y 5 anios en el futuro.");
		}
		
		setmNumero(mNumero);
		setmTitular(mTitular);
	}

	//Metodos abstractos para los hijos.
	public abstract double getmSaldo();
	
	public abstract void ingresar(double importe) throws LongitudStringInvalidaException;
	
	public abstract void pagoEnEstablecimiento(String datos, double importe) throws LongitudStringInvalidaException;
	
	public abstract void retirar(double importe) throws LongitudStringInvalidaException;
	
	/**
	 * Metodo que asocia un objeto Cuenta a la instancia hija de Tarjeta
	 * @param c
	 */
	public void setmCuentaAsociada(Cuenta c) {
		//Comprobacion de si nos pasan una cuenta nula, que va a ocurrir al instanciar una tarjeta de primeras
		if (c == null) {
			this.mCuentaAsociada = null;
		} else {
			/*Aqui me interesa que el puntero apunte al objeto recibido sin crear 
			 * copia ya que queremos precisamente que el saldo de este objeto lo 
			 * vayan modificando las clases que lo contienen.*/
			this.mCuentaAsociada = c;
		}
	}
	
	/**
	 * Getter de mCuentaAsociada
	 * @return Cuenta
	 */
	public Cuenta getmCuentaAsociada() {
		return this.mCuentaAsociada;
	}

	/**
	 * Getter de mFechaDeCaducidad
	 * @return LocalDate
	 */
	public LocalDate getmFechaDeCaducidad() {
		return mFechaDeCaducidad;
	}

	/**
	 * Setter de mFechaDeCaducidad
	 * @param mFechaDeCaducidad LocalDate
	 */
	public void setmFechaDeCaducidad(LocalDate mFechaDeCaducidad) {
		//Creo un LocalDate nuevo con los datos del LocalDate recibido para evitar problemas con el puntero
		this.mFechaDeCaducidad = LocalDate.of(mFechaDeCaducidad.getYear(), mFechaDeCaducidad.getMonth(), mFechaDeCaducidad.getDayOfMonth());
	}

	/**
	 * Getter de mNumero
	 * @return String
	 */
	public String getmNumero() {
		return mNumero;
	}

	/**
	 * Setter de mNumero
	 * @param mNumero String
	 */
	public void setmNumero(String mNumero) {
		this.mNumero = mNumero;
	}

	/**
	 * Getter de mTitular
	 * @return String
	 */
	public String getmTitular() {
		return mTitular;
	}

	/**
	 * Setter de mTitular
	 * @param mTitular String
	 */
	public void setmTitular(String mTitular) {
		this.mTitular = mTitular;
	}

	/**
	 * Metodo que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "[mCuentaAsociada=" + mCuentaAsociada.toString() + "mFechaDeCaducidad=" + mFechaDeCaducidad + ", mNumero="
				+ mNumero + ", mTitular=" + mTitular + "]";
	}
	
	
}
