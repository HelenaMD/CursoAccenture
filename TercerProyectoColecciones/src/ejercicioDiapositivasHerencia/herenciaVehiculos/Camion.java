package ejercicioDiapositivasHerencia.herenciaVehiculos;

/**
 * Clase Camion que hereda de Vehiculo
 * @author helena.martinez.duro
 */
public class Camion extends Vehiculo {
	
	/**
	 * Atributos de la clase
	 */
	private int pesoMaximo;
	private int precio;

	/**
	 * Constructor principal de la clase
	 * @param numeroMarchas int
	 * @param velocidadMaxima int
	 * @param numeroChasis int
	 * @param numeroRuedas int
	 * @param pesoMaximo int
	 * @param precio int
	 */
	public Camion(int numeroMarchas, int velocidadMaxima, int numeroChasis, int numeroRuedas, int pesoMaximo, int precio) {
		super(numeroMarchas, velocidadMaxima, numeroChasis, numeroRuedas);
		setPesoMaximo(pesoMaximo);
		setPrecio(precio);
	}

	/**
	 * Getter del atributo pesoMaximo
	 * @return int
	 */
	public int getPesoMaximo() {
		return pesoMaximo;
	}

	/**
	 * Setter del atributo pesoMaximo
	 * @param pesoMaximo int
	 */
	public void setPesoMaximo(int pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	/**
	 * Getter del atributo precio
	 * @return int
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Setter del atributo precio
	 * @param precio int
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * Metodo que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "Camion " + super.toString() + "[pesoMaximo=" + pesoMaximo + ", precio=" + precio + "]";
	}
	
	
}
