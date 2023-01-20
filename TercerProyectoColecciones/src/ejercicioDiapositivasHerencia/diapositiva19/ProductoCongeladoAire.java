package ejercicioDiapositivasHerencia.diapositiva19;

/**
 * Clase ProductoCongeladoAire que hereda de ProductoCongelado
 * @author helena.martinez.duro
 */
public class ProductoCongeladoAire extends ProductoCongelado {

	/**
	 * Atributos de la clase
	 */
	private int porcentajeComposicionAire[];
	
	/**
	 * Constructor principal de la clase
	 * @param fechaCaducidad String
	 * @param numeroLote int
	 * @param tempCongRecomendada int
	 * @param porcentajeComposicionAire int[]
	 */
	public ProductoCongeladoAire(String fechaCaducidad, int numeroLote, int tempCongRecomendada, int[] porcentajeComposicionAire) {
		super(fechaCaducidad, numeroLote, tempCongRecomendada);
		setPorcentajeComposicionAire(porcentajeComposicionAire);
	}

	/**
	 * Getter del atributo porcentajeComposicionAire
	 * @return int[]
	 */
	public int[] getPorcentajeComposicionAire() {
		return porcentajeComposicionAire;
	}
	
	/**
	 * Metodo que muestra el atributo PorcentajeComposicionAire con toda la info necesaria y formateado
	 * @return
	 */
	public String mostrarArrayFormateado() {
		String resultado = "\n";
		String keys[] = {"% Nitrogeno", "% O2", "% CO2", "% Vapor de Agua"};
		for (int i = 0; i < getPorcentajeComposicionAire().length; i++) {
			resultado += getPorcentajeComposicionAire()[i] + keys[i] + "\n";
		}
		return resultado;
	}

	/**
	 * Setter del atributo porcentajeComposicionAire
	 * @param porcentajeComposicionAire int[]
	 */
	public void setPorcentajeComposicionAire(int[] porcentajeComposicionAire) {
		this.porcentajeComposicionAire = new int[porcentajeComposicionAire.length];
		for (int i = 0; i < porcentajeComposicionAire.length; i++) {
			this.porcentajeComposicionAire[i] = porcentajeComposicionAire[i];
		}
	}

	/**
	 * Metodo toString para mostrar los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "ProductoCongeladoAire " + super.toString() + "\n[porcentajeComposicionAire=" + mostrarArrayFormateado() + "]";
	}
}
