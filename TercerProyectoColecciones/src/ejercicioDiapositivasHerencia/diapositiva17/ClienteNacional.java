package ejercicioDiapositivasHerencia.diapositiva17;

/**
 * Clase Cliente Nacional que hereda de Cliente (Diapositiva 17)
 * @author helena.martinez.duro
 *
 */
public class ClienteNacional extends Cliente {
	
	/**
	 * Atributos de la clase
	 */
	private String nif;

	/**
	 * Constructor principal de la clase Cliente NAcional
	 * @param nombre String
	 * @param direccion String
	 * @param nif String
	 */
	public ClienteNacional(String nombre, String direccion, String nif) {
		super(nombre, direccion);
		setNif(nif);
	}
	
	/**
	 * Constructor vacio para inicializar sin datos
	 */
	public ClienteNacional() {
		super();
		setNif("");
	}

	/**
	 * Getter del atributo nif
	 * @return String
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * Setter del atributo nif
	 * @param nif String
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * Metodo toString para mostrar los datos de la instancia
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + " ClienteNacional [nif=" + nif + "]";
	}

	
}
