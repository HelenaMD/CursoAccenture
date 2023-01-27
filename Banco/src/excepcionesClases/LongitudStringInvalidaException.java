package excepcionesClases;

/**
 * Clase con mi propia excepcion
 * @author helena.martinez.duro
 *
 */
public class LongitudStringInvalidaException extends Exception {

	//Constructores por defecto
	public LongitudStringInvalidaException() {};
	
	public LongitudStringInvalidaException(String message) {
		super(message);
	}
}
