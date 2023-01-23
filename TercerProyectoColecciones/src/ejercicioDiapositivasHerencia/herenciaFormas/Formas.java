package ejercicioDiapositivasHerencia.herenciaFormas;

import ejercicioDiapositivasHerencia.composicionFormas.Punto;

/**
 * Clase padre que contiene los metodos necesarios para el resto.
 * @author helena.martinez.duro
 *
 */
public abstract class Formas {
	
	/**
	 * Atributos de la clase
	 */
	private int medidaBasica;
	private Punto puntoOrigen;
	
	/**
	 * Constructor principal de la clase
	 * @param medidaBasica int
	 * @param x int
	 * @param y int
	 */
	public Formas(int medidaBasica, int x, int y) {
		setMedidaBasica(medidaBasica);
		setPuntoOrigen(new Punto(x, y));
	}
	
	/**
	 * Constructor alternativo de la clase
	 * @param medidaBasica int
	 * @param p Punto
	 */
	public Formas(int medidaBasica, Punto p) {
		setMedidaBasica(medidaBasica);
		setPuntoOrigen(p);
	}

	/**
	 * Getter del atributo medidaBasica
	 * @return int
	 */
	public int getMedidaBasica() {
		return medidaBasica;
	}

	/**
	 * Setter del atributo medidaBasica
	 * @param medidaBasica int
	 */
	public void setMedidaBasica(int medidaBasica) {
		this.medidaBasica = medidaBasica;
	}
	
	/**
	 * Getter del atributo puntoOrigen
	 * @return Punto
	 */
	public Punto getPuntoOrigen() {
		return puntoOrigen;
	}

	/**
	 * Setter alternativo del atributo puntoOrigen que almacena un nuevo objeto Punto con los datos
	 * del objeto Punto que recibe
	 * @param puntoOrigen Punto
	 */
	public void setPuntoOrigen(Punto puntoOrigen) {
		this.puntoOrigen = new Punto(puntoOrigen);
	}
	
	/**
	 * Setter del atributo puntoOrigen al que se le pasan los datos de x e y para crear
	 * el objeto con el constructor principal.
	 * @param x
	 * @param y
	 */
	public void setPuntoOrigen(int x, int y) {
		this.puntoOrigen = new Punto(x, y);
	}

	/**
	 * Metodo dibujar que tendrá la info de los lados de cada forma geometrica
	 * @return String
	 */
	public abstract String dibujar();
	
	/**
	 * Metodo calcular area que calculará el area de la forma geometrica.
	 * @return double
	 */
	public abstract double calcularArea();
	
	/**
	 * Metodo que mostrara el valor de las coordenadas de inicio
	 */
	public abstract void mostrarPuntoOrigen();
}
