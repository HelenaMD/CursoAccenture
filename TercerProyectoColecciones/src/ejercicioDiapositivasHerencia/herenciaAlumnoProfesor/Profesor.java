package ejercicioDiapositivasHerencia.herenciaAlumnoProfesor;

/**
 * Clase que hereda de Persona
 * @author helena.martinez.duro
 */
public class Profesor extends Persona {

	/**
	 * Atributos de la clase
	 */
	private String fecContratacion;
	private float salario;
	
	/**
	 * Constructor principal de la clase
	 * @param nombre String
	 * @param edad int
	 * @param telContacto String
	 * @param fecContratacion String
	 * @param salario float
	 */
	public Profesor(String nombre, int edad, String telContacto, String fecContratacion, float salario) {
		super(nombre, edad, telContacto);
		setFecContratacion(fecContratacion);
		setSalario(salario);
	}

	/**
	 * Getter de fecContratacion
	 * @return String
	 */
	public String getFecContratacion() {
		return fecContratacion;
	}

	/**
	 * Setter fecContratacion
	 * @param fecContratacion String
	 */
	public void setFecContratacion(String fecContratacion) {
		this.fecContratacion = fecContratacion;
	}

	/**
	 * Getter de salario
	 * @return float
	 */
	public float getSalario() {
		return salario;
	}

	/**
	 * Setter de salario
	 * @param salario float
	 */
	public void setSalario(float salario) {
		this.salario = salario;
	}

	/**
	 * Metodo que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "Profesor " + super.toString() + "[fecContratacion=" + fecContratacion + ", salario=" + salario + "]";
	}
}
