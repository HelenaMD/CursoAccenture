package ejercicioDiapositivasHerencia.herenciaViajes;

/**
 * Clase padre Viaje para el ejercicio de los Futbolistas
 * @author helena.martinez.duro
 *
 */
public class Viaje {

	/**
	 * Atributos de la clase
	 */
	private String origen;
	private String destino;
	private String horario;
	private double precio;
	
	/**
	 * Constructor principal de la clase
	 * @param origen String
	 * @param destino String
	 * @param horario String
	 * @param precio String
	 */
	public Viaje(String origen, String destino, String horario, double precio) {
		super();
		setOrigen(origen);
		setDestino(destino);
		setHorario(horario);
		setPrecio(precio);
	}
	/**
	 * Getter del atributo origen
	 * @return String
	 */
	public String getOrigen() {
		return origen;
	}
	/**
	 * Setter del atributo origen
	 * @param origen String
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	/**
	 * Getter del atributo destino
	 * @return String
	 */
	public String getDestino() {
		return destino;
	}
	/**
	 * Setter del atributo destino
	 * @param destino String
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	/**
	 * Getter del atributo horario
	 * @return String
	 */
	public String getHorario() {
		return horario;
	}
	/**
	 * Setter del atributo destino
	 * @param horario String
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}
	/**
	 * Getter del atributo precio
	 * @return double
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * Setter del atributo precio
	 * @param precio double
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/**
	 * Metodo toString para mostrar los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "[origen=" + origen + ", destino=" + destino + ", horario=" + horario + ", precio=" + precio + " €]";
	}
}
