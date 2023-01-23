package ejercicioDiapositivasHerencia.herenciaEquipos;

public class Masajista extends Persona {

	/**
	 * Atributos de la clase
	 */
	private String titulacion;
	private int aniosExperiencia;
	
	/**
	 * Constructor principal de la clase
	 * @param id int
	 * @param nombre String
	 * @param apellidos String
	 * @param edad int
	 * @param titulacion String
	 * @param aniosExperiencia int
	 */
	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
		setTitulacion(titulacion);
		setAniosExperiencia(aniosExperiencia);
	}

	/**
	 * Getter del atributo titulacion
	 * @return String
	 */
	public String getTitulacion() {
		return titulacion;
	}

	/**
	 * Setter del atributo titulacion
	 * @param titulacion String
	 */
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	/**
	 * Getter del atributo aniosExperiencia
	 * @return
	 */
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	/**
	 * Setter del atributo aniosExperiencia
	 * @param aniosExperiencia
	 */
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	/**
	 * Metodo que muestra por consola que el masajista esta dando un masaje.
	 */
	public void darMasaje() {
		System.out.println("El masajista con titulo " + " " + getTitulacion() + " llamado " +  getNombre() + " " + getApellidos() + " esta dando un masaje.");
	}
}
