package ejercicioDiapositivasHerencia.diapositiva17;

/**
 * Clase Cliente Exportacion que hereda de la clase Cliente (Diapositiva 17)
 * @author helena.martinez.duro
 *
 */
public class ClienteExportacion extends Cliente {

	/**
	 * Atributos de la clase
	 */
	private String vat;
	private String email;
	
	/**
	 * Constructor principal de la clase Cliente Exportacion
	 * @param nombre String
	 * @param direccion String
	 * @param vat String
	 * @param email String
	 */
	public ClienteExportacion(String nombre, String direccion, String vat, String email) {
		super(nombre, direccion);
		if (nombre.equalsIgnoreCase("") || direccion.equalsIgnoreCase("") || vat.equalsIgnoreCase("") || email.equalsIgnoreCase("")) {
			System.out.println("Has introducido uno o más datos vacíos!!"); //Aqui lanzaría excepcion
			//Los pongo para que no se queden sin nada y no me pete
			setVat(vat);
			setEmail(email);
		} else {
			//Aqui se inicializarian bien
			setVat(vat);
			setEmail(email);
		}
		
	}

	/**
	 * Getter del atributo vat
	 * @return String
	 */
	public String getVat() {
		return vat;
	}

	/**
	 * Setter del atributo vat
	 * @param vat String
	 */
	public void setVat(String vat) {
		this.vat = vat;
	}
	
	/**
	 * Getter del atributo email
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter del atributo email
	 * @param email String
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Metodo toString para mostrar los datos de la instancia
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + " ClienteExportacion [vat=" + vat + ", email=" + email + "]";
	}
}
