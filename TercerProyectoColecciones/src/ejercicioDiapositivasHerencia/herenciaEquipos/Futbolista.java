package ejercicioDiapositivasHerencia.herenciaEquipos;

/**
 * Clase Futbolista que hereda de Persona
 * @author helena.martinez.duro
 *
 */
public class Futbolista extends Persona {
	
	/**
	 * Atributos de la clase
	 */
	private int dorsal;
	private String demarcacion;

	/**
	 * Constructor principal de la clase
	 * @param id int
	 * @param nombre String
	 * @param apellidos String
	 * @param edad int
	 * @param dorsal int
	 * @param demarcacion String
	 */
	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		setDorsal(dorsal);
		setDemarcacion(demarcacion);
	}

	/**
	 * Getter del atributo dorsal
	 * @return int
	 */
	public int getDorsal() {
		return dorsal;
	}

	/**
	 * Setter del atributo dorsal
	 * @param dorsal int
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	/**
	 * Getter del atributo demarcacion
	 * @return String
	 */
	public String getDemarcacion() {
		return demarcacion;
	}

	/**
	 * Setter del atributo demarcacion
	 * @param demarcacion String
	 */
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
	/**
	 * Metodo que muestra los datos del futbolista que esta jugando el partido
	 */
	public void jugarPartido() {
		System.out.println("El Futbolista " + getNombre() + " " + getApellidos() + " está jugando un partido con la dorsal " + getDorsal() + " y la demarcacion " + getDemarcacion());
	}
	
	/**
	 * Metodo que muestra que el futbolista esta entrenando.
	 */
	public void entrenar() {
		System.out.println("El Futbolista " + getNombre() + " " + getApellidos() + " está entrenando con la dorsal " + getDorsal() + " y la demarcacion " + getDemarcacion());
	}
}
