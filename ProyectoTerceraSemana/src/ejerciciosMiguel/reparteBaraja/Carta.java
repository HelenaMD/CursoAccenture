package ejerciciosMiguel.reparteBaraja;

/**
 * Clase que contiene la informacion de una Carta de la baraja.
 * @author helena.martinez.duro
 *
 */
public class Carta {
	
	/**
	 * Atributos de la clase
	 */
	private String palo;
	private int numero;
	
	/**
	 * Constructor principal
	 * @param palo String
	 * @param numero int
	 */
	public Carta(String palo, int numero) {
		setPalo(palo);
		setNumero(numero);
	}
	
	/**
	 * Getter de palo
	 * @return String
	 */
	public String getPalo() {
		return this.palo;
	}
	/**
	 * Setter de palo
	 * @param palo String
	 */
	public void setPalo(String palo) {
		if (palo != null) {
			this.palo = palo;
		} else {
			throw new IllegalArgumentException("El palo introducido no existe.");
		}
	}
	
	/**
	 * Getter de numero
	 * @return int
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * Setter de numero. Comprueba si el numero esta entre 1 y 12, pues son las cartas
	 * que existen.
	 * @param numero int
	 */
	public void setNumero(int numero) {
		if (numero <= 12 && numero >= 1) {
			this.numero = numero;
		} else {
			throw new IllegalArgumentException("El numero introducido no existe en la baraja.");
		}
	}
	
	/**
	 * Metodo que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "Carta " +  getNumero() + " de " + getPalo();
	}
	
}
