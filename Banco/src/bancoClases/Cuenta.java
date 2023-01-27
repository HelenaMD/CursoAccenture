package bancoClases;

import java.util.HashSet;
import java.util.Set;

import excepcionesClases.LongitudStringInvalidaException;
import filtroClases.Filtro;

/**
 * Clase Cuenta
 * @author helena.martinez.duro
 */
public class Cuenta {

	/**
	 * Atributos de la clase
	 */
	//Listado Set de movimientos
	private Set<Movimiento> mMovimientos;
	private String mNumero;
	private String mTitular;
	
	/**
	 * Constructor principal de la clase
	 * @param mNumero String
	 * @param mTitular String
	 * @throws LongitudStringInvalidaException 
	 */
	public Cuenta(String mNumero, String mTitular) throws LongitudStringInvalidaException {
		//Inicializo el HashSet con uno vacio para evitar NullPointers
		setmMovimientos(new HashSet<Movimiento>());
		setmNumero(mNumero);
		setmTitular(mTitular);
	}

	/**
	 * Constructor de copia de la clase, al final no conviene usarlo en este caso
	 * @param c Cuenta
	 * @throws LongitudStringInvalidaException 
	 */
	public Cuenta(Cuenta c) throws LongitudStringInvalidaException {
		setmMovimientos(c.getmMovimientos());
		setmNumero(c.getmNumero());
		setmTitular(c.getmTitular());
	}
	
	/**
	 * Getter de mMovimientos
	 * @return Set<Movimiento>
	 */
	public Set<Movimiento> getmMovimientos() {
		return mMovimientos;
	}
	
	/**
	 * Setter de mMovimientos
	 * @param mMovimientos Set<Movimiento>
	 */
	public void setmMovimientos(Set<Movimiento> mMovimientos) {
		//Creo un nuevo HashSet identico al que se recibe para evitar lios con el
		// pointer.
		if (mMovimientos == null) {
			this.mMovimientos = new HashSet<Movimiento>();
		} else {
			this.mMovimientos = new HashSet<Movimiento>(mMovimientos);
		}	
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
		if (mNumero == null) {
			this.mNumero = "";
		} else {
			this.mNumero = mNumero;
		}
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
	 * @throws LongitudStringInvalidaException 
	 */
	public void setmTitular(String mTitular) throws LongitudStringInvalidaException {
		if (Filtro.filtroNombreTitular(mTitular)) {
			this.mTitular = mTitular;
		} else {
			throw new LongitudStringInvalidaException("El nombre del titular debe tener entre 20 y 30 caracteres");
		}
	}
	
	/**
	 * Metodo que aniade un movimiento al HashSet de movimientos de esta clase
	 * @param m Movimiento
	 */
	public void addMovimiento(Movimiento m) {
		//Creo un HashSet auxiliar donde almaceno el HashSet actual
		Set<Movimiento> aux = getmMovimientos();
		//Aniado el nuevo Movimiento al auxiliar
		aux.add(m);
		//Sustituyo el HashSet que habia por el nuevo actualizado
		setmMovimientos(aux);
	}
	
	/**
	 * Metodo que aniade un movimiento de tipo "ingreso" con un concepto y un importe
	 * @param concepto String
	 * @param importe double
	 * @throws LongitudStringInvalidaException 
	 */
	public void ingresar(String concepto, double importe) throws LongitudStringInvalidaException {
		//Mismo procedimiento que con el setter de mMovimientos
		Set<Movimiento> aux = getmMovimientos();
		//Unica diferencia es que creo un Movimiento auxiliar para poder definir
		// el tipo de movimiento
		Movimiento m = new Movimiento(concepto, importe);
		m.setmTipoMovimiento("ingreso");
		//Continuo con el procedimiento
		aux.add(m);
		setmMovimientos(aux);
	}
	
	/**
	 * Metodo sobrecargado de ingresar sin concepto
	 * @param importe double
	 * @throws LongitudStringInvalidaException 
	 */
	public void ingresar(double importe) throws LongitudStringInvalidaException {
		Set<Movimiento> aux = getmMovimientos();
		Movimiento m = new Movimiento("Ingreso a cuenta bancaria desde cajero automatico", importe);
		m.setmTipoMovimiento("ingreso");
		aux.add(m);
		setmMovimientos(aux);
	}
	
	/**
	 * Metodo que aniade un movimiento de tipo "retirada" con un concepto y un importe
	 * @param concepto String
	 * @param importe double
	 * @throws LongitudStringInvalidaException 
	 */
	public void retirar(String concepto, double importe) throws LongitudStringInvalidaException {
		/*Si el saldo de la cuenta es menor o igual a 0 no se puede retirar
		Lanza NullPointerException por comodidad, no podia poner un mensaje
		personalizado si usaba Exception ya que se acababan mezclando y fallaba
		en compilacion*/
		if (getmSaldo() <= 0) {
			throw new NullPointerException("No te queda saldo para retirar.");
		} else {
			//Mismo procedimiento que en "ingresar"
			Set<Movimiento> aux = getmMovimientos();
			Movimiento m = new Movimiento(concepto, importe);
			m.setmTipoMovimiento("retirada");
			aux.add(m);
			setmMovimientos(aux);
		}
	}
	
	/**
	 * Metodo sobrecargado de retirar
	 * @param importe double
	 * @throws LongitudStringInvalidaException 
	 */
	public void retirar(double importe) throws LongitudStringInvalidaException {
		/*Si el saldo de la cuenta es menor o igual a 0 no se puede retirar
		Lanza NullPointerException por comodidad, no podia poner un mensaje
		personalizado si usaba Exception ya que se acababan mezclando y fallaba
		en compilacion*/
		if (getmSaldo() <= 0) {
			throw new NullPointerException("No te queda saldo para retirar.");
		} else {
			//Mismo procedimiento que en "ingresar"
			Set<Movimiento> aux = getmMovimientos();
			Movimiento m = new Movimiento("Retirada de cuenta bancaria desde cajero automatico", importe);
			m.setmTipoMovimiento("retirada");
			aux.add(m);
			setmMovimientos(aux);
		}
	}

	/**
	 * Metodo que suma o resta los importes de los movimientos existentes en la cuenta
	 * segun sean de ingreso o retirada y devuelve el resultado total.
	 * @return double
	 */
	public double getmSaldo() {
		//Variable que almacena el resultado final
		double resultado = 0;
		
		//Recorro el HashSet de movimientos de la cuenta
		for (Movimiento m : getmMovimientos()) {
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
		return resultado;
	}
	
	/**
	 * Metodo que me muestra el contenido de los movimientos almacenados en el 
	 * HashSet con un formato
	 * @return String
	 */
	public String mostrarMovimientos() {
		String resultado = "\nListado de movimientos de la Cuenta " + getmNumero() + ":\n";
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
		return "Cuenta [Saldo= " + getmSaldo() + ", mNumero=" + mNumero + ", mTitular=" + mTitular + mostrarMovimientos();
	}
}
