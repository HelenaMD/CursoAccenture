package ejercicioDiapositivasHerencia.herenciaVehiculos;

/**
 * Clase Coche que hereda de Vehiculo e implementa de ActivarReductora
 * @author helena.martinez.duro
 */
public class Coche extends Vehiculo implements ActivarReductora {

	/**
	 * Atributos de la clase
	 */
	private String color;
	private int numeroPuertas;
	private boolean situacion4x4;
	
	/**
	 * Constructor principal
	 * @param numeroMarchas int
	 * @param velocidadMaxima int
	 * @param numeroChasis int
	 * @param numeroRuedas int
	 * @param color String
	 * @param numeroPuertas int
	 */
	public Coche(int numeroMarchas, int velocidadMaxima, int numeroChasis, int numeroRuedas, String color, int numeroPuertas) {
		super(numeroMarchas, velocidadMaxima, numeroChasis, numeroRuedas);
		setColor(color);
		setNumeroPuertas(numeroPuertas);
		setSituacion4x4(false);
	}

	/**
	 * Getter del atributo color
	 * @return String
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Setter del atributo color
	 * @param color String
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Getter del atributo numeroPuertas
	 * @return int
	 */
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	/**
	 * Setter del atributo numeroPuertas
	 * @param numeroPuertas int
	 */
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	/**
	 * Setter del atributo situacion4x4
	 * @return boolean
	 */
	public boolean isSituacion4x4() {
		return situacion4x4;
	}

	/**
	 * Setter del atributo situacion4x4
	 * @param situacion4x4 boolean
	 */
	public void setSituacion4x4(boolean situacion4x4) {
		this.situacion4x4 = situacion4x4;
	}

	/**
	 * Metodo que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "Coche " + super.toString() + "[color=" + color + ", numeroPuertas=" + numeroPuertas + " Situacion 4x4=" + isSituacion4x4() + "]";
	}

	/**
	 * Metodo que cambia el valor del atributo situacion4x4 (similar al setter)
	 * @param activar boolean
	 */
	@Override
	public void activarReductora(boolean activar) {
		// TODO Auto-generated method stub
		setSituacion4x4(activar);
	}
}
