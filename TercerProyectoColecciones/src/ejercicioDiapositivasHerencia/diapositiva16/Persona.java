package ejercicioDiapositivasHerencia.diapositiva16;

/**
 * Clase abstracta padre del ejercicio de la diapositiva 16
 * @author helena.martinez.duro
 */
public abstract class Persona {

	/**
	 * Atributos de la clase
	 */
	private String nombre;
	private String direccion;
	private String correoElectronico;
	
	/**
	 * Constructor principal de la clase
	 * @param nombre String
	 * @param direccion String
	 * @param correoElectronico String
	 */
	public Persona(String nombre, String direccion, String correoElectronico) {
		super();
		setNombre(nombre);
		setDireccion(direccion);
		setCorreoElectronico(correoElectronico);
	}
	
	/**
	 * Getter del atributo nombre
	 * @return nombre String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Setter del atributo nombre
	 * @param nombre String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Getter del atributo direccion
	 * @return direccion String
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Setter del atributo direccion
	 * @param direccion String
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * Getter del atributo correo electronico
	 * @return correo electronico String
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	
	/**
	 * Setter del atributo correo electronico
	 * @param direccion String
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	/**
	 * Metodo que (de momento) crea un correo electronico (a falta de especificar su funcion)
	 * @return boolean true
	 */
	public boolean crear() {
		setCorreoElectronico(getNombre() + "@" + "accenture.com");
		return true;
	}
	
	/**
	 * Metodo que (de momento) borra el correo electronico (a falta de especificar su funcion)
	 * @return boolean true
	 */
	public boolean borrar() {
		setCorreoElectronico("");
		return true;
	}
	
	/**
	 * Metodo que envia un mensaje por consola indicando el destinatario
	 * @param msj String
	 * @return String
	 */
	public String enviarMensaje(String msj) {
		return getCorreoElectronico() + " envía: \"" + msj + "\"";
	}
	
	/**
	 * Metodo abstracto que se usará para mostrar info (similar a toString)
	 * @return String
	 */
	public abstract String aString();
	
}
