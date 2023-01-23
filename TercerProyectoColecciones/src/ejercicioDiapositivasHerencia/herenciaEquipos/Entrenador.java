package ejercicioDiapositivasHerencia.herenciaEquipos;

/**
 * Clase Entrenador que hereda de Persona
 * @author helena.martinez.duro
 */
public class Entrenador extends Persona {

	/**
	 * Atributos de la clase
	 */
	private String idFederacion;
	
	/**
	 * Constructor principal de la clase
	 * @param id int
	 * @param nombre String
	 * @param apellidos String
	 * @param edad int
	 * @param idFederacion String
	 */
	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
		setIdFederacion(idFederacion);
	}

	/**
	 * Getter del atributo idFederacion
	 * @return String
	 */
	public String getIdFederacion() {
		return idFederacion;
	}

	/**
	 * Setter del atributo idFederacion
	 * @param idFederacion
	 */
	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	/**
	 * Metodo que muestra por consola que el entrenador esta dirigiendo un partido
	 */
	public void dirigirPartido() {
		System.out.println("El entrenador " + getNombre() + " " + getApellidos() + " perteneciente a la federacion " + getIdFederacion() + " esta dirigiendo un partido.");
	}
	
	/**
	 * Metodo que muestra por consola que el entrenador esta dirigiendo un entrenamiento
	 */
	public void dirigirEntrenamiento() {
		System.out.println("El entrenador " + getNombre() + " " + getApellidos() + " perteneciente a la federacion " + getIdFederacion() + " esta dirigiendo un entrenamiento.");
	}
}
