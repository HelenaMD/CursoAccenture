package ejerciciosMiguel.reparteBaraja;

import java.util.HashSet;
import java.util.Iterator;

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
	private Combinacion combinacion;

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
	 * Getter de Combinacion
	 * @return Combinacion
	 */
	public Combinacion getCombinacion() {
		return combinacion;
	}

	/**
	 * Setter de combinacion
	 * @param combinacion Combinacion
	 */
	public void setCombinacion(Combinacion combinacion) {
		if (combinacion != null) {
			this.combinacion = new Combinacion(combinacion);
		} else {
			this.combinacion = new Combinacion("", 0);
		}
		
	}

	/**
	 * Metodo que busca la carta a descartar en la mano del jugador, la elimina de su
	 * mano y la devuelve. Si no existe la carta devuelve nulo.
	 * @param c Carta
	 * @return Carta
	 */
	public Carta descartarCartaDeLaMano(Carta c) {
		HashSet<Carta> auxMano = new HashSet<Carta>(getMano());
		Carta auxC = null;
		
		for (Iterator<Carta> it = auxMano.iterator(); it.hasNext();) {
			auxC = it.next();
			if (auxC.equals(c)) {
				it.remove();
			}
		}
		
		setMano(auxMano);
		
		return auxC;
	}
	
	/**
	 * Metodo que aniade una carta a la mano del jugador
	 * @param c Carta
	 */
	public void aniadirCarta(Carta c) {
		if (c != null) {
			HashSet<Carta> aux = new HashSet<Carta>(getMano());
			aux.add(c);
			setMano(aux);
		} else {
			throw new IllegalArgumentException("No va a aniadir una carta inexistente!");
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
