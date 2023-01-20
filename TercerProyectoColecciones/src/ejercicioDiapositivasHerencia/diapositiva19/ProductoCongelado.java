package ejercicioDiapositivasHerencia.diapositiva19;

/**
 * Clase ProductoCongelado que hereda de Producto y a su vez es padre de
 * ProductoCongeladoAire, ProductoCongeladoAgua y ProductoCongeladoNitrogeno
 * @author helena.martinez.duro
 */
public class ProductoCongelado extends Producto {

	/**
	 * Atributos de la clase
	 */
	private int tempCelsiusCongRecomendada;
	
	/**
	 * Constructor principal de la clase ProductoCongelado
	 * @param fechaCaducidad String
	 * @param numeroLote int
	 * @param tempCongRecomendada int
	 */
	public ProductoCongelado(String fechaCaducidad, int numeroLote, int tempCongRecomendada) {
		super(fechaCaducidad, numeroLote);
		setTempCelsiusCongRecomendada(tempCongRecomendada);
	}

	/**
	 * Getter del atributo tempCongelacionRecomendada
	 * @return int
	 */
	public int getTempCelsiusCongRecomendada() {
		return tempCelsiusCongRecomendada;
	}

	/**
	 * Setter del atributo tempCongelacionRecomendada
	 * @param tempCongelacionRecomendada int
	 */
	public void setTempCelsiusCongRecomendada(int tempCongelacionRecomendada) {
		this.tempCelsiusCongRecomendada = tempCongelacionRecomendada;
	}

	/**
	 * Metodo toString que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + "[tempCelsiusCongRecomendada=" + tempCelsiusCongRecomendada + "]";
	}
}
