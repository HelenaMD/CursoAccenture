package ejercicioDiapositivasHerencia.herenciaVehiculos;

/**
 * Clase Moto que hereda de Vehiculo
 * @author helena.martinez.duro
 */
public class Moto extends Vehiculo {
	
	/**
	 * Atributos de la clase
	 */
	private int capacidadDeposito;
	
	/**
	 * Constructor principal de la clase
	 * @param numeroMarchas int
	 * @param velocidadMaxima int
	 * @param numeroChasis int
	 * @param numeroRuedas int
	 * @param capacidadDeposito int
	 */
	public Moto(int numeroMarchas, int velocidadMaxima, int numeroChasis, int numeroRuedas, int capacidadDeposito) {
		super(numeroMarchas, velocidadMaxima, numeroChasis, numeroRuedas);
		setCapacidadDeposito(capacidadDeposito);
	}

	/**
	 * Getter del atributo capacidadDeposito
	 * @return int
	 */
	public int getCapacidadDeposito() {
		return capacidadDeposito;
	}

	/**
	 * Setter del atributo capacidadDeposito
	 * @param capacidadDeposito int
	 */
	public void setCapacidadDeposito(int capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}

	/**
	 * Metodo que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "Moto " + super.toString() + "[capacidadDeposito=" + capacidadDeposito + "]";
	}

}
