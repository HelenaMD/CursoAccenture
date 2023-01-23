package ejercicioDiapositivasHerencia.herenciaViajes;

/**
 * Clase ViajeCoche que hereda de Viaje
 * @author helena.martinez.duro
 */
public class ViajeCoche extends Viaje {

	/**
	 * Atributos de la clase
	 */
	private int diasDeViaje;
	private int litrosCombustibleNecesario;
	
	/**
	 * Constructor principal de la clase
	 * @param origen String
	 * @param destino String
	 * @param horario String
	 * @param precio String
	 * @param diasDeViaje int
	 * @param litrosCombustibleNecesario int
	 */
	public ViajeCoche(String origen, String destino, String horario, double precio, int diasDeViaje, int litrosCombustibleNecesario) {
		super(origen, destino, horario, precio);
		// TODO Auto-generated constructor stub
		setDiasDeViaje(diasDeViaje);
		setLitrosCombustibleNecesario(litrosCombustibleNecesario);
	}

	/**
	 * Getter del atributo diasDeViaje
	 * @return int
	 */
	public int getDiasDeViaje() {
		return diasDeViaje;
	}

	/**
	 * Setter del atributo diasDeViaje
	 * @param diasDeViaje int
	 */
	public void setDiasDeViaje(int diasDeViaje) {
		this.diasDeViaje = diasDeViaje;
	}

	/**
	 * Getter del atributo litrosCombustibleNecesario
	 * @return int
	 */
	public int getLitrosCombustibleNecesario() {
		return litrosCombustibleNecesario;
	}

	/**
	 * Setter del atributo litrosCombustibleNecesario
	 * @param litrosCombustibleNecesario int
	 */
	public void setLitrosCombustibleNecesario(int litrosCombustibleNecesario) {
		this.litrosCombustibleNecesario = litrosCombustibleNecesario;
	}

	/**
	 * Metodo toString para mostrar los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "ViajeCoche " + super.toString() + "[diasDeViaje=" + diasDeViaje + ", litrosCombustibleNecesario=" + litrosCombustibleNecesario
				+ "]";
	}
}
