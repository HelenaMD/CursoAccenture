package ejercicioDiapositivasHerencia.diapositiva17;

/**
 * Clase Cliente del ejercicio de la diapositiva 17
 * @author helena.martinez.duro
 *
 */
public class Cliente {

	/**
	 * Atributos de la clase
	 */
	private String nombre;
	private String direccion;
	
	/**
	 * Constructor principal de la clase
	 * @param nombre String
	 * @param direccion String
	 */
	public Cliente(String nombre, String direccion) {
		setNombre(nombre);
		setDireccion(direccion);
	}
	
	/**
	 * Constructor vacio para inicializar sin datos
	 */
	public Cliente() {
		setNombre("");
		setDireccion("");
	}

	/**
	 * Getter del atributo nombre
	 * @return String
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
	 * @return String
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
	 * Metodo toString para mostrar los datos de la instancia
	 * @return String
	 */
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
	
}
