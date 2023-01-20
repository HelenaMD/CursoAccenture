package ejercicioDiapositivasHerencia.diapositiva19;

/**
 * Clase ProductoFresco que hereda de Producto
 * @author helena.martinez.duro
 *
 */
public class ProductoFresco extends Producto {

	/**
	 * Atributos de la clase
	 */
	private String fechaEnvasado;
	private String paisOrigen;
	
	/**
	 * Constructor principal de la clase
	 * @param fechaCaducidad String
	 * @param numeroLote int
	 * @param fechaEnvasado String
	 * @param paisOrigen String
	 */
	public ProductoFresco(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numeroLote);
		setFechaEnvasado(fechaEnvasado);
		setPaisOrigen(paisOrigen);
	}

	/**
	 * Getter del atributo fechaEnvasado
	 * @return String
	 */
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	/**
	 * Setter del atributo fechaEnvasado
	 * @param fechaEnvasado String
	 */
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	/**
	 * Getter del atributo paisOrigen
	 * @return String
	 */
	public String getPaisOrigen() {
		return paisOrigen;
	}

	/**
	 * Setter del atributo paisOrigen
	 * @param paisOrigen String
	 */
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	/**
	 * Metodo toString para mostrar los datos de la instancia por consola
	 */
	@Override
	public String toString() {
		return "ProductoFresco " + super.toString() + "[fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + "]";
	}

	
}
