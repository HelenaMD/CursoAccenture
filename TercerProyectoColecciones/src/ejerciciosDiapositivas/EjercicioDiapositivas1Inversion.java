package ejerciciosDiapositivas;

/**
 * Clase generica
 * @author helena.martinez.duro
 *
 * @param <T>
 */
public class EjercicioDiapositivas1Inversion<T> {

	/**
	 * Atributos genericos que pide el ejercicio
	 */
	private T a;
	private T b;
	
	/**
	 * Constructor, pide los dos atributos genericos
	 * @param a T
	 * @param b T
	 */
	public EjercicioDiapositivas1Inversion(T a, T b) {
		setA(a);
		setB(b);
	}

	/**
	 * Getter del atributo "a"
	 * @return a T
	 */
	public T getA() {
		return a;
	}

	/**
	 * Setter del atributo "a"
	 * @param a T
	 */
	public void setA(T a) {
		this.a = a;
	}

	/**
	 * Getter del atributo "b"
	 * @return a T
	 */
	public T getB() {
		return b;
	}

	/**
	 * Setter del atributo "b"
	 * @param b T
	 */
	public void setB(T b) {
		this.b = b;
	}

	/**
	 * Método que intercambia los valores de los atributos a y b
	 */
	public void intercambiarAtributos() {
		T aux;
		aux = getA();
		setA(getB());
		setB(aux);
	}
	
}
