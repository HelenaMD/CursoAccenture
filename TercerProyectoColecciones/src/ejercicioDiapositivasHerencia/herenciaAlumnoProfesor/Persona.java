package ejercicioDiapositivasHerencia.herenciaAlumnoProfesor;

/**
 * Clase abstracta padre Persona
 * @author helena.martinez.duro
 */
public abstract class Persona {

	/**
	 * Atributos de la clase
	 */
	private String nombre;
	private int edad;
	private String telContacto;
	
	/**
	 * Constructor principal de la clase
	 * @param nombre String
	 * @param edad int
	 * @param telContacto String
	 */
	public Persona(String nombre, int edad, String telContacto) {
		setNombre(nombre);
		setEdad(edad);
		setTelContacto(telContacto);
	}
	
	/**
	 * Getter de nombre
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Setter de nombre
	 * @param nombre String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Getter de edad
	 * @return int
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Setter de edad
	 * @param edad int
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Getter de telContacto
	 * @return String
	 */
	public String getTelContacto() {
		return telContacto;
	}
	
	/**
	 * Setter de telContacto
	 * @param telContacto
	 */
	public void setTelContacto(String telContacto) {
		this.telContacto = telContacto;
	}

	/**
	 * Metodo que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "[nombre=" + nombre + ", edad=" + edad + ", telContacto=" + telContacto + "]";
	}
	
	
}
