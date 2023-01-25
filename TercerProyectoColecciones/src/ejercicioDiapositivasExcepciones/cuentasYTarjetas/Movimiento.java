package ejercicioDiapositivasExcepciones.cuentasYTarjetas;

import java.time.LocalDate;

import clasesExcepciones.LongitudStringInvalidaException;
import clasesFiltros.Filtro;

/**
 * Clase Movimiento que contiene los datos de un movimiento bancario
 * @author helena.martinez.duro
 */
public class Movimiento {
	
	/**
	 * Atributos de la clase
	 */
	private String mConcepto;
	private LocalDate mFecha;
	private double mImporte;
	//Este atributo lo cree porque esta clase no permite almacenar importes negativos
	private String mTipoMovimiento;
	/*Este atributo lo cree para aniadir un atributo diferenciador junto con 
	idMovimiento en caso de tener que comparar movimientos*/
	private static int contador;
	private int idMovimiento;
	
	/**
	 * Inicializador de atributos estaticos
	 */
	static {
		contador = 0;
	}
	
	/**
	 * Constructor principal de la clase
	 * @param mConcepto String
	 * @param mImporte double	
	 * @throws LongitudStringInvalidaException 
	 */
	public Movimiento(String mConcepto, double mImporte) throws LongitudStringInvalidaException {
		setmConcepto(mConcepto);
		setmFecha();
		setmImporte(mImporte);
		setIdMovimiento(contador++);
		setmTipoMovimiento("");
	}
	
	/**
	 * Getter atributo mConcepto
	 * @return String
	 */
	public String getmConcepto() {
		return mConcepto;
	}
	
	/**
	 * Setter atributo mConcepto
	 * @param mConcepto String
	 * @throws LongitudStringInvalidaException 
	 */
	public void setmConcepto(String mConcepto) throws LongitudStringInvalidaException {
		if (Filtro.filtroConceptoMovimiento(mConcepto)) {
			this.mConcepto = mConcepto;
		} else {
			throw new LongitudStringInvalidaException("El concepto debe tener entre 10 y 100 caracteres.");
		}
	}
	
	/**
	 * Getter atributo mFecha
	 * @return Calendar
	 */
	public LocalDate getmFecha() {
		return mFecha;
	}
	
	/**
	 * Setter atributo mFecha
	 */
	public void setmFecha() {
		this.mFecha = LocalDate.now();
	}
	
	/**
	 * Getter atributo mImporte
	 * @return double
	 */
	public double getmImporte() {
		return mImporte;
	}
	
	/**
	 * Setter atributo mImporte
	 * @param mImporte double
	 */
	public void setmImporte(double mImporte) {
		//Controla a peticion del ejercicio que el importe no sea negativo
		if (mImporte >= 0) {
			this.mImporte = mImporte;
		} else {
			/*Lanza NullPointerException por comodidad, no podia poner un mensaje
					personalizado si usaba Exception ya que se acababan mezclando y fallaba
					en compilacion*/
			throw new NullPointerException("El importe no puede ser menor de 0."); 
		}	
	}
	
	/**
	 * Getter atributo idMovimiento
	 * @return int
	 */
	public int getIdMovimiento() {
		return idMovimiento;
	}
	
	/**
	 * Setter atributo idMovimiento
	 * @param idMovimiento int
	 */
	private void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	/**
	 * Getter del atributo mTipoMovimiento
	 * @return String
	 */
	public String getmTipoMovimiento() {
		return mTipoMovimiento;
	}

	/**
	 * Setter de mTipoMovimiento
	 * @param mTipoMovimiento String
	 */
	public void setmTipoMovimiento(String mTipoMovimiento) {
		if (mTipoMovimiento == null) {
			this.mTipoMovimiento = "";
		} else {
			this.mTipoMovimiento = mTipoMovimiento;
		}
	}

	
	/**
	 * Metodo que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "\tMovimiento [mConcepto=" + mConcepto + ", mFecha=" + mFecha + ", mImporte=" + mImporte
				+ ", idMovimiento=" + idMovimiento + ", mTipoMovimiento=" + mTipoMovimiento + "]";
	}
	
}
