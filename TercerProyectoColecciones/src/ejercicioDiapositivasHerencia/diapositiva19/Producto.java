package ejercicioDiapositivasHerencia.diapositiva19;

/**
 * Clase padre Producto con datos en comun
 * @author helena.martinez.duro
 */
public class Producto {
	
	/**
	 * Atributos de la clase
	 */
	private String fechaCaducidad;
	private int numeroLote;
	
	/**
	 * Constructor principal de la clase Producto
	 * @param fechaCaducidad String
	 * @param numeroLote int
	 */
	public Producto(String fechaCaducidad, int numeroLote) {
		setFechaCaducidad(fechaCaducidad);
		setNumeroLote(numeroLote);
	}

	/**
	 * Getter del atributo fechaCaducidad
	 * @return String
	 */
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	/**
	 * Setter del atributo fechaCaducidad
	 * @param fechaCaducidad String
	 */
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	/**
	 * Getter del atributo numeroLote
	 * @return int
	 */
	public int getNumeroLote() {
		return numeroLote;
	}

	/**
	 * Setter del atributo numeroLote
	 * @param numeroLote int
	 */
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}

	/**
	 * Metodo toString para mostrar datos por consola
	 */
	@Override
	public String toString() {
		return "[fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + "]";
	}
	
}
