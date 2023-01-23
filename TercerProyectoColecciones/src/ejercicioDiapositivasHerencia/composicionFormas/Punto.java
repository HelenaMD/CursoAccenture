package ejercicioDiapositivasHerencia.composicionFormas;

/**
 * Clase Punto
 * @author helena.martinez.duro
 */
public class Punto {

	/**
	 * Atributos de la clase
	 */
	private int x;
	private int y;
	
	/**
	 * Constructor principal de la clase
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		setX(x);
		setY(y);
	}
	
	/**
	 * Constructor de copia
	 * @param p Punto
	 */
	public Punto(Punto p) {
		setX(p.getX());
		setY(p.getY());
	}
	
	/**
	 * Getter del atributo x
	 * @return int
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Setter del atributo x
	 * @param x int
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Getter atributo y
	 * @return int
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Setter atributo y
	 * @param y int
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Metodo que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "Punto X = " + x + ", Y = " + y + " .";
	}
}
