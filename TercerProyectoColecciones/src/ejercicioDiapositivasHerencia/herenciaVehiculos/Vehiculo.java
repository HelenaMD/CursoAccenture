package ejercicioDiapositivasHerencia.herenciaVehiculos;

/**
 * Clase padre Vehiculo
 * @author helena.martinez.duro
 */
public class Vehiculo implements Abd {
	
	/**
	 * Atributos de la clase
	 */
	private int numeroMarchas;
	private int velocidadMaxima;
	private int numeroChasis;
	private int numeroRuedas;
	private String matricula;
	
	/**
	 * Atributos static
	 */
	static int contador;
	
	//Inicializo los atributos static
	static {
		contador = 0;
	}
	
	/**
	 * Cosntructor principal de la clase
	 * @param numeroMarchas int
	 * @param velocidadMaxima int
	 * @param numeroChasis int
	 * @param numeroRuedas int
	 */
	public Vehiculo(int numeroMarchas, int velocidadMaxima, int numeroChasis, int numeroRuedas) {
		setNumeroMarchas(numeroMarchas);
		setVelocidadMaxima(velocidadMaxima);
		setNumeroChasis(numeroChasis);
		setNumeroRuedas(numeroRuedas);
		setMatricula(contador++);
		//Acceso a bbdd con interfaces
		AccesoABD dao = new AccesoABD();
		dao.accesoGrabacion(this);
	}
	
	/**
	 * Getter del atributo numeroMarchas
	 * @return int
	 */
	public int getNumeroMarchas() {
		return numeroMarchas;
	}
	
	/**
	 * Setter del atributo numeroMarchas
	 * @param numeroMarchas int
	 */
	public void setNumeroMarchas(int numeroMarchas) {
		this.numeroMarchas = numeroMarchas;
	}
	
	/**
	 * Getter del atributo velocidadMaxima
	 * @return int
	 */
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	/**
	 * Setter del atributo velocidadMaxima
	 * @param velocidadMaxima int
	 */
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	/**
	 * Getter del atributo numeroChasis
	 * @return int
	 */
	public int getNumeroChasis() {
		return numeroChasis;
	}
	
	/**
	 * Setter del atributo numeroChasis
	 * @param numeroChasis int
	 */
	public void setNumeroChasis(int numeroChasis) {
		this.numeroChasis = numeroChasis;
	}
	
	/**
	 * Getter del atributo numeroRuedas
	 * @return int
	 */
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	
	/**
	 * Setter del atributo numeroRuedas
	 * @param numeroRuedas int
	 */
	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	
	/**
	 * Getter del atributo matricula
	 * @return String
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Setter del atributo matricula
	 * @param codigoNumerico int
	 */
	public void setMatricula(int codigoNumerico) {
		this.matricula = "B-" + codigoNumerico;
	}

	/**
	 * MEtodo para mostrar por consola los datos de la instancia
	 * @return String
	 */
	@Override
	public String toString() {
		return "[numeroMarchas=" + numeroMarchas + ", velocidadMaxima=" + velocidadMaxima + ", numeroChasis="
				+ numeroChasis + ", numeroRuedas=" + numeroRuedas + " matricula=" + getMatricula() + "]";
	}

	/**
	 * Metodo implementado de Abd sin funcionalidad de momento
	 */
	@Override
	public void leer() {
		//Codigo
		
	}

	/**
	 * Metodo implementado de Abd sin funcionalidad de momento
	 */
	@Override
	public void grabar() {
		//Codigo
		
	}
	
}
