package ejercicioDiapositivasExcepciones.cuentasYTarjetas;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import clasesExcepciones.FechaInvalidaException;
import clasesExcepciones.LongitudStringInvalidaException;

/**
 * Clase Credito que hereda de Tarjeta
 * @author helena.martinez.duro
 *
 */
public class Credito extends Tarjeta {

	/**
	 * Atributos de la clase
	 */
	//Una tarjeta de Credito debe tener su propio deposito que es lo que nos prestan mensualmente
	private double mCredito;
	private Set<Movimiento> mMovimientos;
	private final double PORCENTAJE_INTERES;

	/**
	 * Constructor principal de la clase
	 * @param mFechaDeCaducidad LocalDate
	 * @param mNumero String
	 * @param mTitular String
	 * @throws FechaInvalidaException 
	 */
	public Credito(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) throws FechaInvalidaException {
		super(mFechaDeCaducidad, mNumero, mTitular);
		//Credito inicial a 0, no lo piden
		setmCredito(0);
		setmMovimientos(new HashSet<Movimiento>());
		//Porcentaje de interes, fijo para la tarjeta una vez contratada
		PORCENTAJE_INTERES = 5.0;
	}

	/**
	 * Getter de mCredito
	 * @return double
	 */
	public double getmCredito() {
		return mCredito;
	}

	/**
	 * Setter de mCredito
	 * @param mCredito double
	 */
	public void setmCredito(double mCredito) {
		this.mCredito = mCredito;
	}

	/**
	 * Getter de mMovimientos
	 * @return Set<Movimiento>
	 */
	public Set<Movimiento> getmMovimientos() {
		return mMovimientos;
	}

	/**
	 * Setter de mMovimiento
	 * @param mMovimientos Set<Movimiento>
	 */
	public void setmMovimientos(Set<Movimiento> mMovimientos) {
		this.mMovimientos = new HashSet<Movimiento>(mMovimientos);
	}

	/**
	 * Metodo heredado sobreescrito que devuelve el total de los movimientos de la tarjeta de credito
	 * del mes actual
	 * @return double
	 */
	@Override
	public double getmSaldo() {
		// TODO Auto-generated method stub
		//Variable que almacena el resultado final
		double resultado = 0;
		int mesActual = LocalDate.now().getMonthValue();
				
		//Recorro el HashSet de movimientos de la cuenta
		for (Movimiento m : getmMovimientos()) {
			if (m.getmFecha().getMonthValue() == mesActual) {
				//Si el movimiento es de tipo "ingreso" suma el importe al total.
				if (m.getmTipoMovimiento().equalsIgnoreCase("ingreso")) {
					resultado += m.getmImporte();
				//Si el movimiento es de tipo "retirada" resta el importe al total.
				} else if (m.getmTipoMovimiento().equalsIgnoreCase("retirada")){
					resultado -= m.getmImporte();
				//Si por error no se ha definido el tipo de movimiento lanza exepcion.
				/*Lanza NullPointerException por comodidad, no podia poner un mensaje
				personalizado si usaba Exception ya que se acababan mezclando y fallaba
				en compilacion*/
				} else {
					throw new NullPointerException("Tipo de movimiento desconocido.");
				}
			}
		}
		return resultado;
		/*if (getmCuentaAsociada() == null) {
			throw new NullPointerException(
					"No ha asociado una cuenta a la tarjeta de credito con numero " + getmNumero());
		} else {
			return getmCuentaAsociada().getmSaldo();
		}*/
	}

	/**
	 * Metodo heredado sobreescrito que ingresa un importe en la cuenta asociada
	 * a la tarjeta de credito
	 * @param importe double
	 * @throws LongitudStringInvalidaException 
	 */
	@Override
	public void ingresar(double importe) throws LongitudStringInvalidaException {
		// TODO Auto-generated method stub
		Set<Movimiento> aux = getmMovimientos();
		Movimiento m = new Movimiento("Ingreso en cuenta asociada (cajero automatico)", importe);
		m.setmTipoMovimiento("ingreso");
		aux.add(m);
		setmMovimientos(aux);
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
		//Si el credito disponible es menor o igual a lo que llevamos gastado del mes
		// no deja comprar
		double auxSaldo = getmSaldo();
		if (getmSaldo() < 0) {
			auxSaldo = -getmSaldo();
		}
		if (auxSaldo >= getmCredito()) {
			throw new NullPointerException("No te queda credito para retirar.");
		} else {
			Set<Movimiento> aux = getmMovimientos();
			Movimiento m = new Movimiento(datos, importe);
			m.setmTipoMovimiento("retirada");
			aux.add(m);
			setmMovimientos(aux);
		}
	}

	/**
	 * Metodo heredado sobreescrito que retira un importe en la cuenta asociada
	 * a la tarjeta de credito y cobra una comision minima de 3€
	 * @param importe double
	 * @throws LongitudStringInvalidaException 
	 */
	@Override
	public void retirar(double importe) throws LongitudStringInvalidaException {
		// TODO Auto-generated method stub
		//Calculo la comision que me da con el importe recibido
		double comision = importe*(PORCENTAJE_INTERES/100);
		//Compruebo si me queda Credito para retirar dinero de la tarjeta
		double auxSaldo = getmSaldo();
		if (getmSaldo() < 0) {
			auxSaldo = -getmSaldo();
		}
		if (auxSaldo >= getmCredito()) {
			throw new NullPointerException("No te queda credito para retirar.");
		} else {
			Set<Movimiento> aux = getmMovimientos();
			//Si la comision es menor de 3 lo iguala a 3€.
			if (comision < 3) {
				comision = 3;
			}
			Movimiento m = new Movimiento("Retirada en cuenta asociada (cajero automatico)", importe + comision);
			m.setmTipoMovimiento("retirada");
			aux.add(m);
			setmMovimientos(aux);
		}
	}

	/**
	 * Metodo que calcula el importe total de los movimientos de todo un mes 
	 * recibido por parametro, borra dichos movimientos y aniade un movimiento a la
	 * cuenta asociada con ese importe resultante
	 * @param mes int
	 * @param anio int
	 * @throws LongitudStringInvalidaException 
	 */
	public void liquidar(int mes, int anio) throws LongitudStringInvalidaException {
		
		//Creo un HashSet auxiliar que me guardara los movimientos del mes seleccionado aparte
		Set<Movimiento> selectedMovements = new HashSet<Movimiento>();
		//Un HashSet auxiliar para resetear el que ya tengo al final del proceso
		Set<Movimiento> aux;
		//Un Movimiento auxiliar para acceder a datos y poder comparar
		Movimiento mAux;

		//Creo un iterador para poder ir borrando segun voy recogiendo los movimientos
		// que me interesan
		for (Iterator<Movimiento> it = getmMovimientos().iterator(); it.hasNext();) {
			//Guardo el Movimiento en el que me encuentro con el iterador en mAux para
			// poder acceder a sus datos
			mAux = it.next();
			//Compruebo el mes y el anio del movimiento en el que estoy
			if (mAux.getmFecha().getMonthValue() == mes && mAux.getmFecha().getYear() == anio) {
				//Si coincide el mes y anio, lo aniado al HashSet auxiliar "selectedMovements"
				selectedMovements.add(mAux);
				//Lo elimino del HashSet original de la clase
				// Recordemos que el iterador esta actuando sobre getmMovimientos() que contiene el HashSet original de la clase
				it.remove();
			}
		}
		
		//Variable que almacenara el resultado final de sumar los movimientos de un mes
		double resultado = 0;

		//Recorro "selectedMovements"
		for (Movimiento m : selectedMovements) {
			//Si el movimiento es un ingreso se suma al total
			if (m.getmTipoMovimiento().equalsIgnoreCase("ingreso")) {
				resultado += m.getmImporte();
			} else if (m.getmTipoMovimiento().equalsIgnoreCase("retirada")) {
				//Si el movimiento es una retirada se resta al total.
				resultado -= m.getmImporte();
			} else {
				//Si no se sabe que tipo es lanza excepcion
				throw new NullPointerException("Tipo de movimiento desconocido.");
			}
		}
		
		//Guardo en aux el HashSet de la cuenta asociada a la tarjeta Credito
		aux = new HashSet<Movimiento>(getmCuentaAsociada().getmMovimientos());
		//Si el resultado es negativo se hace un movimiento de retirada
		if(resultado < 0) {
			//Convierto negativo a positivo
			resultado = -resultado;
			//reutilizo la variable mAux de antes para crear el nuevo movimiento
			mAux = new Movimiento("Liquidacion tarjeta de Credito del " + mes + "/" + anio, resultado);
			mAux.setmTipoMovimiento("retirada");
		} else {
			mAux = new Movimiento("Liquidacion tarjeta de Credito del " + mes + "/" + anio, resultado);
			mAux.setmTipoMovimiento("ingreso");
		}
		
		//Aniado el movimiento al HashSet auxiliar
		aux.add(mAux);
		//Actualiza el HashSet a la cuenta.
		getmCuentaAsociada().setmMovimientos(aux);
	}
	
	/**
	 * Metodo que me muestra el contenido de los movimientos almacenados en el 
	 * HashSet con un formato
	 * @return String
	 */
	public String mostrarMovimientos() {
		String resultado = "\nListado de movimientos de la tarjeta de Credito " + getmNumero() + ":\n";
		for (Movimiento m : getmMovimientos()) {
			resultado += m.toString() + "\n";
		}
		return resultado;
	}

	/**
	 * Metodo que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		if (getmCuentaAsociada() == null) {
			throw new NullPointerException("No tienes cuenta asociada a la tarjeta de credito");
		} else {
			return "Credito " + super.toString() + "[mCredito=" + mCredito + "]" + mostrarMovimientos();
		}
	}
	
	

}
