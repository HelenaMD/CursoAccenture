package ejercicioDiapositivasHerencia.diapositiva19;

/**
 * Clase ProductoCongeladoAgua que hereda de ProductoCongelado
 * @author helena.martinez.duro
 *
 */
public class ProductoCongeladoAgua extends ProductoCongelado {

	/**
	 * Atributos de la clase
	 */
	private int gramosSalPorLAgua;
	
	/**
	 * Constructor principal de la clase
	 * @param fechaCaducidad String
	 * @param numeroLote int
	 * @param tempCongRecomendada int
	 * @param gramosSal int
	 */
	public ProductoCongeladoAgua(String fechaCaducidad, int numeroLote, int tempCongRecomendada, int gramosSal) {
		super(fechaCaducidad, numeroLote, tempCongRecomendada);
		setGramosSalPorLAgua(gramosSal);
	}

	/**
	 * Getter del atributo gramosSalPorLAgua
	 * @return
	 */
	public int getGramosSalPorLAgua() {
		return gramosSalPorLAgua;
	}

	/**
	 * Setter del atributo gramosSalPorLAgua
	 * @param gramosSalPorLAgua
	 */
	public void setGramosSalPorLAgua(int gramosSalPorLAgua) {
		this.gramosSalPorLAgua = gramosSalPorLAgua;
	}

	/**
	 * Metodo toString para mostrar los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "ProductoCongeladoAgua " + super.toString() + "[gramosSalPorLAgua=" + gramosSalPorLAgua + "]";
	}

}
