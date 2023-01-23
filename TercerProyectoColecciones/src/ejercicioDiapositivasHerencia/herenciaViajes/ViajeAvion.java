package ejercicioDiapositivasHerencia.herenciaViajes;

/**
 * Clase ViajeAvion que hereda de Viaje
 * @author helena.martinez.duro
 */
public class ViajeAvion extends Viaje {

	/**
	 * Atributos de la clase
	 */
	private String aeropuertoInicio;
	private String aeropuertoFin;
	
	/**
	 * Constructor principal de la clase
	 * @param origen String
	 * @param destino String
	 * @param horario String
	 * @param precio double
	 * @param aeropuertoInicio String
	 * @param aeropuertoFin String
	 */
	public ViajeAvion(String origen, String destino, String horario, double precio, String aeropuertoInicio, String aeropuertoFin) {
		super(origen, destino, horario, precio);
		// TODO Auto-generated constructor stub
		setAeropuertoInicio(aeropuertoInicio);
		setAeropuertoFin(aeropuertoFin);
	}

	/**
	 * Getter del atributo aeropuertoInicio
	 * @return String
	 */
	public String getAeropuertoInicio() {
		return aeropuertoInicio;
	}

	/**
	 * Setter del atributo aeropuertoInicio
	 * @param aeropuertoInicio String
	 */
	public void setAeropuertoInicio(String aeropuertoInicio) {
		this.aeropuertoInicio = aeropuertoInicio;
	}

	/**
	 * Getter del atributo aeropuertoFin
	 * @return String
	 */
	public String getAeropuertoFin() {
		return aeropuertoFin;
	}

	/**
	 * Setter del atributo aeropuertoFin
	 * @param aeropuertoFin String
	 */
	public void setAeropuertoFin(String aeropuertoFin) {
		this.aeropuertoFin = aeropuertoFin;
	}

	/**
	 * Metodo toString para mostrar los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "ViajeAvion " + super.toString() + "[aeropuertoInicio=" + aeropuertoInicio + ", aeropuertoFin=" + aeropuertoFin + "]";
	}

	
}
