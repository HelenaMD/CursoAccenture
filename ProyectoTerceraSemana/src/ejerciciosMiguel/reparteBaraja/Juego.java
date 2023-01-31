package ejerciciosMiguel.reparteBaraja;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Clase que contiene los datos del juego
 * @author helena.martinez.duro
 *
 */
public class Juego {
	
	/**
	 * Atributos de la clase
	 */
	private Set<Jugador> jugadores;
	private Paquete baraja;
	private String juego;
	
	/**
	 * Constructor
	 * @param jugadores Set<Jugador>
	 * @param baraja Paquete
	 * @param juego String
	 */
	public Juego(Set<Jugador> jugadores, Paquete baraja, String juego) {
		setJugadores(jugadores);
		setBaraja(baraja);
		setJuego(juego);
	}

	/**
	 * Getter de jugadores
	 * @return Set<Jugador>
	 */
	public Set<Jugador> getJugadores() {
		return jugadores;
	}
	
	/**
	 * Setter de jugadores
	 * @param jugadores Set<Jugador>
	 */
	public void setJugadores(Set<Jugador> jugadores) {
		if (jugadores != null) {
			this.jugadores = new HashSet<Jugador>(jugadores);
		} else {
			this.jugadores = new HashSet<Jugador>();
		}
	}
	
	/**
	 * Getter de baraja
	 * @return Paquete
	 */
	public Paquete getBaraja() {
		return baraja;
	}
	
	/**
	 * Setter de baraja
	 * @param baraja
	 */
	public void setBaraja(Paquete baraja) {
		if (baraja != null) {
			this.baraja = new Paquete(baraja);
		} else {
			throw new IllegalArgumentException("Baraja vacia.");
		}
	}
	
	/**
	 * Getter de juego
	 * @return String
	 */
	public String getJuego() {
		return juego;
	}
	
	/**
	 * Setter de juego
	 * @param juego String
	 */
	public void setJuego(String juego) {
		if (juego != null) {
			this.juego = juego;
		} else {
			this.juego = "";
		}
	}
	
	/**
	 * Metodo que reparte las cartas de la baraja equitativamente a todos los jugadores
	 * actualmente participando.
	 * Las cartas que se reparten se quitan de la baraja y quedan las sobrantes.
	 */
	public void repartirCartas() {
		//Variables auxiliares
		int contador = 1;
		HashSet<Carta> manoAux;
		HashSet<Jugador> jugadorAux = new HashSet<Jugador>();
		
		//Numero de cartas a repartir
		int numCartasPorJugador = getBaraja().getBaraja().size() / getJugadores().size();
		
		//Iterador
		Iterator<Carta> it = getBaraja().getBaraja().iterator();
		
		//Por cada jugador
		for (Jugador j : getJugadores()) {
			//Reseteo Set de mano para este jugador
			manoAux = new HashSet<Carta>();
			//Aniado las cartas correspondientes
			while (contador <= numCartasPorJugador && it.hasNext()) {
				//Aniado la carta al set auxiliar de mano
				manoAux.add(it.next());
				//la elimino de la baraja
				it.remove();
				contador++;
			}
			//Aniado la mano nueva al jugador
			j.setMano(manoAux);
			//aniado el jugador con la mano nueva al set auxiliar
			jugadorAux.add(j);
			//Reseteo contador
			contador = 1;
		}
		//Una vez tengo todos los jugadores con mano actualizada los asigno de nuevo al juego
		setJugadores(jugadorAux);
	}
	
	/**
	 * Metodo que retorna un string formateado con los datos de los jugadores y su mano
	 * @return String
	 */
	public String mostrarJugadores() {
		String ret = "";
		for (Jugador j : getJugadores()) {
			ret += j.toString();
		}
		return ret;
	}

	/**
	 * Metodo que muestra por consola los datos de la instancia
	 * @return String
	 */
	@Override
	public String toString() {
		return "Juego: " + getJuego() + "\n-----------Participantes-----------\n" + mostrarJugadores();
	}
	
	
}
