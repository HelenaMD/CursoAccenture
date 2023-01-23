package ejercicioDiapositivasHerencia.herenciaViajes;

/**
 * Clase ViajeBarco que hereda de Viaje
 * @author helena.martinez.duro
 */
public class ViajeBarco extends Viaje {

	/**
	 * Atributos de la clase
	 */
	private String nombrePuertoOrigen;
	private String nombrePuertoDestino;
	
	/**
	 * Constructor principal de la clase
	 * @param origen String
	 * @param destino String
	 * @param horario String
	 * @param precio double
	 * @param nombrePuertoOrigen String
	 * @param nombrePuertoDestino String
	 */
	public ViajeBarco(String origen, String destino, String horario, double precio, String nombrePuertoOrigen, String nombrePuertoDestino) {
		super(origen, destino, horario, precio);
		// TODO Auto-generated constructor stub
		setNombrePuertoOrigen(nombrePuertoOrigen);
		setNombrePuertoDestino(nombrePuertoDestino);
	}

	/**
	 * Getter del atributo nombrePuertoOrigen
	 * @return String
	 */
	public String getNombrePuertoOrigen() {
		return nombrePuertoOrigen;
	}

	/**
	 * Setter del atributo nombrePuertoOrigen
	 * @param nombrePuertoOrigen String
	 */
	public void setNombrePuertoOrigen(String nombrePuertoOrigen) {
		this.nombrePuertoOrigen = nombrePuertoOrigen;
	}

	/**
	 * Getter del atributo nombrePuertoDestino
	 * @return String
	 */
	public String getNombrePuertoDestino() {
		return nombrePuertoDestino;
	}

	/**
	 * Setter del atributo nombrePuertoDestino
	 * @param nombrePuertoDestino String
	 */
	public void setNombrePuertoDestino(String nombrePuertoDestino) {
		this.nombrePuertoDestino = nombrePuertoDestino;
	}

	/**
	 * Metodo toString para mostrar los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "ViajeBarco " + super.toString() + "[nombrePuertoOrigen=" + nombrePuertoOrigen + ", nombrePuertoDestino=" + nombrePuertoDestino
				+ "]";
	}
}
