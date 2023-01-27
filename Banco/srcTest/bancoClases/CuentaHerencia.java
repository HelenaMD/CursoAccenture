package bancoClases;

import java.util.Set;

import bancoClases.Cuenta;
import bancoClases.Movimiento;
import excepcionesClases.LongitudStringInvalidaException;

/**
 * Clase creada especialmente para las pruebas JUnit al necesitar devolver
 * un Movimiento para comprobar datos. Hereda de Cuenta.
 * @author helena.martinez.duro
 *
 */
public class CuentaHerencia extends Cuenta {

	public CuentaHerencia(String mNumero, String mTitular) throws LongitudStringInvalidaException {
		super(mNumero, mTitular);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodo que aniade un movimiento de tipo "ingreso" con un concepto y un importe
	 * @param concepto String
	 * @param importe double
	 * @throws LongitudStringInvalidaException 
	 */
	public Movimiento ingresarH(String concepto, double importe) throws LongitudStringInvalidaException {
		//Mismo procedimiento que con el setter de mMovimientos
		Set<Movimiento> aux = getmMovimientos();
		//Unica diferencia es que creo un Movimiento auxiliar para poder definir
		// el tipo de movimiento
		Movimiento m = new Movimiento(concepto, importe);
		m.setmTipoMovimiento("ingreso");
		//Continuo con el procedimiento
		aux.add(m);
		setmMovimientos(aux);
		return m;
	}
	
	/**
	 * Metodo sobrecargado de ingresar sin concepto
	 * @param importe double
	 * @throws LongitudStringInvalidaException 
	 */
	public Movimiento ingresarH(double importe) throws LongitudStringInvalidaException {
		Set<Movimiento> aux = getmMovimientos();
		Movimiento m = new Movimiento("Ingreso a cuenta bancaria desde cajero automatico", importe);
		m.setmTipoMovimiento("ingreso");
		aux.add(m);
		setmMovimientos(aux);
		return m;
	}
	
	/**
	 * Metodo que aniade un movimiento de tipo "retirada" con un concepto y un importe
	 * @param concepto String
	 * @param importe double
	 * @throws LongitudStringInvalidaException 
	 */
	public Movimiento retirarH(String concepto, double importe) throws LongitudStringInvalidaException {
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
			return m;
		}
	}
	
	/**
	 * Metodo sobrecargado de retirar
	 * @param importe double
	 * @throws LongitudStringInvalidaException 
	 */
	public Movimiento retirarH(double importe) throws LongitudStringInvalidaException {
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
			return m;
		}
	}

}
