package ejerciciosMiguel.reparteBaraja;

import java.util.ArrayList;
import java.util.Collections;
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
	 * Metodo que elige cuantas cartas repartir a los jugadores dependiendo de si
	 * hay cartas suficientes.
	 * @param numeroCartasPorJugador int
	 */
	public void repartirCartas(int numeroCartasPorJugador) {
		int cartasPosiblesPorJugador = getBaraja().getBaraja().size() / getJugadores().size();
		if (numeroCartasPorJugador > cartasPosiblesPorJugador) {
			//repartirCartasReal(cartasPosiblesPorJugador);
			repartirCartasIndividual(cartasPosiblesPorJugador);
		} else {
			//repartirCartasReal(numeroCartasPorJugador);
			repartirCartasIndividual(numeroCartasPorJugador);
		}
	}
	
	/**
	 * Metodo que reparte las cartas de la baraja equitativamente a todos los jugadores
	 * actualmente participando.
	 * Las cartas que se reparten se quitan de la baraja y quedan las sobrantes.
	 * POR MODIFICAR
	 */
	/*public void repartirCartasReal(int cartasPorJugador) {
		//Variables auxiliares
		int contador = 1;
		HashSet<Carta> manoAux;
		HashSet<Jugador> jugadorAux = new HashSet<Jugador>();
		
		//Numero de cartas a repartir
		//int numCartasPorJugador = getBaraja().getBaraja().size() / getJugadores().size();
		
		//Iterador
		Iterator<Carta> it = getBaraja().getBaraja().iterator();
		
		//Por cada jugador
		for (Jugador j : getJugadores()) {
			//Reseteo Set de mano para este jugador
			manoAux = new HashSet<Carta>();
			//Aniado las cartas correspondientes
			while (contador <= cartasPorJugador && it.hasNext()) {
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
	}*/
	
	/**
	 * Metodo que reparte las cartas como en la vida real, dandolas de una en una a cada jugador.
	 * @param cartasPorJugador int
	 */
	public void repartirCartasIndividual(int cartasPorJugador) {
		/*Ahora el numero de cartas por jugador correspondera a la ronda de reparto, ya que 
		 * por ronda doy una carta a cada jugador*/
		int rondaReparto = 1;
		
		//Iterador de la baraja
		Iterator<Carta> it = getBaraja().getBaraja().iterator();
		
		//Mientras la ronda de reparto sea menor o igual a la cantidad de cartas que debe tener cada jugador
		// y existan cartas en la baraja
		while (rondaReparto <= cartasPorJugador && it.hasNext()) {
			//A cada jugador dale una carta y quitala de la baraja
			for (Jugador j : getJugadores()) {
				j.aniadirCarta(it.next());
				it.remove();
			}
			//Cuando hemos repartido una carta a cada jugador hemos terminado una ronda de reparto
			rondaReparto++;
		}
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
	
	public ArrayList<Carta> ordenarMano(HashSet<Carta> hsc) {
		ArrayList<Carta> arrAux = new ArrayList<Carta>();
		for (Carta c : hsc) {
			arrAux.add(c);
		}
		Collections.sort(arrAux);
		return arrAux;
	}
	
	public void revisarMano() {
		ArrayList<Carta> manoOrdenada;
		for (Jugador j : getJugadores()) {
			manoOrdenada = ordenarMano(j.getMano());
			switch (checkearPatrones(manoOrdenada)) {
			case 2:
				j.setCombinacion(new Combinacion("Pareja", 1));
				break;
			case 3:
				j.setCombinacion(new Combinacion("Trio", 3));
				break;
			case 4:
				j.setCombinacion(new Combinacion("Doble pareja", 2));
				break;
			case 5:
				j.setCombinacion(new Combinacion("Full House", 4));
				break;
			case 6:
				j.setCombinacion(new Combinacion("Poker", 6));
				break;
			case 0:
			default:
				//Checkear escaleras
				break;
			}
		}
	}
	
	public int checkearPatrones(ArrayList<Carta> arrCartaOrdenado) {
		int numAnterior = 0;
		int repAnterior = 0;
		int numActual = 0;
		int repActual = 0;
		
		int conteoVecesIgual = 0;
		boolean cambioPatron = false;
		
		for (Carta c : arrCartaOrdenado) {
			if (numAnterior == 0) {
				numAnterior = c.getNumero();
			} else {
				numActual = c.getNumero();
				if (numAnterior == numActual) {
					conteoVecesIgual++;
					switch (conteoVecesIgual) {
					case 1:
						repActual = 2;
						break;
					case 2:
						repActual = 3;
						break;
					case 3:
						repActual = 6;
						break;
					default:
						repActual = 0;
						break;
					}
				} else {
					cambioPatron = true;
				}
				numAnterior = numActual;
			}
			if (conteoVecesIgual != 0 && cambioPatron) {
				repAnterior = repActual;
				repActual = 0;
				cambioPatron = false;
			}
			
		}
		return repAnterior + repActual;
	}
	
	public int checkearEscaleras(ArrayList<Carta> arrCartaOrdenado) {
		int numActual = 0;
		boolean escalera = true;
		int[] escaleraReal = {1, 10, 11, 12, 13};
		boolean escaleraRealb = true;
		boolean mismoPalo = true;
		String thisPalo = "";
		int contador = 0;
		
		for (Carta c : arrCartaOrdenado) {
			if (escaleraRealb) {
				if (escaleraReal[contador] != c.getNumero()) {
					escaleraRealb = false;
				}
			}
			if (numActual == 0) {
				thisPalo = c.getPalo();
				numActual = c.getNumero();
			} else if (escalera){
				if (!(numActual+1 == c.getNumero())) {
					escalera = false;
				}
			}
			if (mismoPalo) {
				if (!(thisPalo.equalsIgnoreCase(c.getPalo()))) {
					mismoPalo = false;
				}
			}
			contador++;
		}
		//Sin acabar
		return 0;
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
