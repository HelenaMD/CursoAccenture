package ejercicioDiapositivasHerencia.herenciaAlumnoProfesor;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase Alumno que hereda de Persona
 * @author helena.martinez.duro
 */
public class Alumno extends Persona {
	
	/**
	 * Atributos de la clase
	 */
	private int curso;
	private Set<String> asignaturas;

	/**
	 * Constructor principal de la clase
	 * @param nombre String
	 * @param edad int
	 * @param telContacto String
	 * @param curso int
	 * @param asignaturas Set<String>
	 */
	public Alumno(String nombre, int edad, String telContacto, int curso, Set<String> asignaturas) {
		super(nombre, edad, telContacto);
		setCurso(curso);
		setAsignaturas(asignaturas);
	}
	
	/**
	 * Constructor alternativo de la clase, para crearlo sin asignaturas e ir metiendo despues
	 * @param nombre String
	 * @param edad int
	 * @param telContacto String
	 * @param curso int
	 */
	public Alumno(String nombre, int edad, String telContacto, int curso) {
		super(nombre, edad, telContacto);
		setCurso(curso);
	}

	/**
	 * Getter de curso
	 * @return int
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * Setter de curso
	 * @param curso int
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * Getter de asignaturas
	 * @return Set<String>
	 */
	public Set<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Setter de asignaturas
	 * @param asignaturas Set<String>
	 */
	public void setAsignaturas(Set<String> asignaturas) {
		//Creo un nuevo HashSet para que realmente me almacene este HashSet y no 
		//un puntero hacia el HashSet que se esta recibiendo
		this.asignaturas = new HashSet<String>(asignaturas);
	}
	
	/**
	 * Metodo que permite aniadir una asignatura al listado del alumno
	 * @param asignatura String
	 */
	public void aniadirAsignatura(String asignatura) {
		/*Como hay que usar siempre getter y setter, he de almacenar el HashSet
		que me retorna getAsignaturas(), modificarlo y volverlo a setear, de nuevo
		para evitar problemas de almacenamiento de puntero en vez de almacenamiento
		en si del HashSet*/
		Set<String> aux = new HashSet<String>(getAsignaturas());
		aux.add(asignatura);
		setAsignaturas(aux);
	}
	
	/**
	 * Metodo que devuelve un String con el listado de asignaturas formateado
	 * @return String
	 */
	public String mostrarAsignaturas() {
		String resultado = "Listado de asignaturas: ";
		for (String s : getAsignaturas()) {
			resultado += s + ", ";
		}
		return resultado;
	}

	/**
	 * Metodo que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "Alumno " + super.toString() + "[curso=" + curso + ", asignaturas=" + mostrarAsignaturas() + "]";
	}

}
