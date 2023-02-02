package ejerciciosMiguel.reparteBaraja;

/**
 * Clase que contiene la informacion de una Carta de la baraja.
 * @author helena.martinez.duro
 *
 */
public class Carta implements Comparable<Carta>{
	
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
		if (numero <= 13 && numero >= 1) {
			this.numero = numero;
		} else {
			throw new IllegalArgumentException("El numero introducido no existe en la baraja.");
		}
	}
	
	/**
	 * Metodo que compara un objeto pasado por parametro para saber si es igual que la instancia actual
	 */
	@Override
	public boolean equals(Object o) {
		//Si el objeto que recibe y esta instancia estan referenciados en el mismo
		// lugar de la memoria significa que estamos comparando una instancia
		// consigo misma y por lo tanto son iguales
		if (this == o) {
			return true;
		}
		//Si es un objeto distinto, comprobamos que sea instancia de Carta
		if (this instanceof Carta) {
			//Si lo es hacemos Casteo
			Carta c = (Carta)o;
			//Comprobamos el valor de los atributos de la instancia actual
			// con los atributos del objeto recibido
			// Si son iguales, concluimos que los dos objetos son iguales en el
			// sentido que sus valores son identicos
			if (this.palo.equalsIgnoreCase(c.getPalo()) && this.numero == c.getNumero()) {
				return true;
			}
		}
		//Si algun check falla, no se trata de dos objetos iguales.
		return false;
	}
	
	/**
	 * Metodo que muestra los datos de la instancia por consola
	 * @return String
	 */
	@Override
	public String toString() {
		return "Carta " +  getNumero() + " de " + getPalo();
	}

	/**
	 * Metodo que sirve para comparar cartas entre si segun el numero para poder
	 * ordenarlas mas adelante
	 */
	@Override
	public int compareTo(Carta c) {
		// TODO Auto-generated method stub
		return Integer.compare(this.numero, c.getNumero());
	}
	
}
