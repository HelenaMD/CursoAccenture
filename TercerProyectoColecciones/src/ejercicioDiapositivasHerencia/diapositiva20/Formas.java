package ejercicioDiapositivasHerencia.diapositiva20;

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
	
	
	/**
	 * Constructor principal de la clase
	 * @param medidaBasica int
	 */
	public Formas(int medidaBasica) {
		setMedidaBasica(medidaBasica);
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
	 * Metodo dibujar que tendrá la info de los lados de cada forma geometrica
	 * @return String
	 */
	public abstract String dibujar();
	
	/**
	 * Metodo calcular area que calculará el area de la forma geometrica.
	 * @return double
	 */
	public abstract double calcularArea();
}
