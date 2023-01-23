package ejercicioDiapositivasHerencia.herenciaEquipos;

/**
 * Clase padre Persona
 * @author helena.martinez.duro
 */
public class Persona {
	
	/**
	 * Atributos de la clase
	 */
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	
	/**
	 * Constructor principal de la clase
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	public Persona(int id, String nombre, String apellidos, int edad) {
		setId(id);
		setNombre(nombre);
		setApellidos(apellidos);
		setEdad(edad);
	}
	
	/**
	 * Getter del atributo id
	 * @return int
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Setter del atributo id
	 * @param id int
	 */
	public void setId(int id) {
		this.id = id;
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
	 * Getter del atributo apellidos
	 * @return String
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * Setter del atributo apellidos
	 * @param apellidos String
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * Getter del atributo edad
	 * @return int
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Setter del atributo edad
	 * @param edad int
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Metodo que indica que la persona está concentrandose por consola
	 */
	public void concentrarse() {
		System.out.println(getNombre() + " " + getApellidos() + " se está concentrando.");
	}
	
	/**
	 * Metodo que indica que la persona está viajando por consola
	 */
	public void viajar() {
		System.out.println(getNombre() + " " + getApellidos() + " está viajando.");
	}
	
}
