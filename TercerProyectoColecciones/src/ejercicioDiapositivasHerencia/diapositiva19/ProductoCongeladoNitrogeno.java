package ejercicioDiapositivasHerencia.diapositiva19;

/**
 * Clase ProductoCongeladoNitrogeno que hereda de ProductoCongelado
 * @author helena.martinez.duro
 *
 */
public class ProductoCongeladoNitrogeno extends ProductoCongelado{

	/**
	 * Atributos de la clase
	 */
	private String metodoCongelacion;
	private int segundosExposicionNitrogeno;
	
	/**
	 * Constructor principal de la clase
	 * @param fechaCaducidad String
	 * @param numeroLote int
	 * @param tempCongRecomendada int
	 * @param metodo String
	 * @param segundosExpoNitrogeno int
	 */
	public ProductoCongeladoNitrogeno(String fechaCaducidad, int numeroLote, int tempCongRecomendada, String metodo, int segundosExpoNitrogeno) {
		super(fechaCaducidad, numeroLote, tempCongRecomendada);
		setMetodoCongelacion(metodo);
		setSegundosExposicionNitrogeno(segundosExpoNitrogeno);
	}

	/**
	 * Getter del atributo metodoCongelacion
	 * @return String
	 */
	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	/**
	 * Setter del atributo metodoCongelacion
	 * @param metodoCongelacion String
	 */
	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	/**
	 * Getter del atributo segundosExposicionNitrogeno
	 * @return int
	 */
	public int getSegundosExposicionNitrogeno() {
		return segundosExposicionNitrogeno;
	}

	/**
	 * Setter del atributo segundosExposicionNitrogeno
	 * @param segundosExposicionNitrogeno int
	 */
	public void setSegundosExposicionNitrogeno(int segundosExposicionNitrogeno) {
		this.segundosExposicionNitrogeno = segundosExposicionNitrogeno;
	}

	/**
	 * Metodo toString que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "ProductoCongeladoNitrogeno " + super.toString() + "[metodoCongelacion=" + metodoCongelacion + ", segundosExposicionNitrogeno="
				+ segundosExposicionNitrogeno + "]";
	}

}
