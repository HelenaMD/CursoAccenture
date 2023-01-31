package ejerciciosMiguel.reparteBaraja;

import java.util.HashSet;

/**
 * Clase que contiene los datos de un jugador
 * @author helena.martinez.duro
 *
 */
public class Jugador {
	
	/**
	 * Atributos de la clase
	 */
	private String nombre;
	private int edad;
	private HashSet<Carta> mano;

	/**
	 * Constructor principal
	 * @param nombre String
	 * @param edad int
	 * @param mano HashSet<Carta>
	 */
	public Jugador(String nombre, int edad) {
		setNombre(nombre);
		setEdad(edad);
		setMano(new HashSet<Carta>());
	}
	
	/**
	 * Getter de nombre
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Setter de nombre. Si se le pasa un nulo lanza IllegalArgumentException
	 * @param nombre String
	 * @throws IllegalArgumentException
	 */
	public void setNombre(String nombre) {
		if (nombre != null) {
			this.nombre = nombre;
		} else {
			throw new IllegalArgumentException("El nombre no puede estar vacío!!!");
		}
		
	}
	/**
	 * Getter de edad
	 * @return int
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Setter de edad. Comprueba que la edad está entre 18 y 105
	 * 105 siendo una edad bastante mayor en la que suponemos que ya no juega nadie
	 * Si la edad no encaja lanza IllegalArgumentException
	 * @param edad int
	 * @throws IllegalArgumentException
	 */
	public void setEdad(int edad) {
		if (edad >= 18 && edad <= 105) {
			this.edad = edad;
		} else {
			throw new IllegalArgumentException("Con esta edad, o eres menor o estas muerto.");
		}
		
	}
	
	/**
	 * Getter de mano
	 * @return HashSet<Carta>
	 */
	public HashSet<Carta> getMano() {
		return mano;
	}
	
	/**
	 * Setter de mano. Si se le pasa un nulo lanza IllegalArgumentException
	 * @param mano HashSet<Carta>
	 * @throws IllegalArgumentException
	 */
	public void setMano(HashSet<Carta> mano) {
		if (mano != null) {
			this.mano = new HashSet<Carta>(mano);
		} else {
			throw new IllegalArgumentException("La mano no puede estar vacía!!!");
		}
		
	}
	
	/**
	 * Metodo que retorna un String con formato con los datos de la mano del jugador.
	 * @return String
	 */
	public String verMano() {
		int total = 0;
		String ret = "";
		for (Carta c : getMano()) {
			ret += "\t" + c.getNumero() + " de " + c.getPalo() + "\n";
			total++;
		}
		ret += "En total tiene " + total + " cartas en la mano.\n";
		return ret;
	}
	
	/**
	 * Metodo que muestra los datos de la instancia
	 * @return
	 */
	@Override
	public String toString() {
		return "El jugador " + nombre + " de edad " + edad + " anios tiene las siguientes cartas:\n" + verMano();
	}
	
}
