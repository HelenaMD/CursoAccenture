package ejercicioDiapositivasHerencia.diapositiva19;

/**
 * Clase ProductoRefrigerado que hereda de Producto
 * @author helena.martinez.duro
 */
public class ProductoRefrigerado extends Producto {

	/**
	 * Atributos de la clase
	 */
	private int codigoOrgAlimentaria;
	
	/**
	 * Constructor principal de la clase
	 * @param fechaCaducidad String
	 * @param numeroLote int
	 * @param codOrgAlimentaria int
	 */
	public ProductoRefrigerado(String fechaCaducidad, int numeroLote, int codOrgAlimentaria) {
		super(fechaCaducidad, numeroLote);
		setCodigoOrgAlimentaria(codOrgAlimentaria);
	}

	/**
	 * Getter del atributo codigoOrgAlimentaria
	 * @return int
	 */
	public int getCodigoOrgAlimentaria() {
		return codigoOrgAlimentaria;
	}

	/**
	 * Setter del atributo codigoOrgAlimentaria
	 * @param codigoOrgAlimentaria int
	 */
	public void setCodigoOrgAlimentaria(int codigoOrgAlimentaria) {
		this.codigoOrgAlimentaria = codigoOrgAlimentaria;
	}

	/**
	 * Metodo toString que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "ProductoRefrigerado " + super.toString() + "[codigoOrgAlimentaria=" + codigoOrgAlimentaria + "]";
	}
}
