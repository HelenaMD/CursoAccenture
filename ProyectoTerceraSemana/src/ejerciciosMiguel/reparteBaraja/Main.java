package ejerciciosMiguel.reparteBaraja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import ejerciciosMiguel.reparteBaraja.EnumsReparteBaraja.TipoPalo;

public class Main {
	
	public static Set<Jugador> jugadores() {
		HashSet<Jugador> jugadores = new HashSet<Jugador>();
		
		Jugador j1 = new Jugador("Alvaro", 24);
		Jugador j2 = new Jugador("Helena", 23);
		Jugador j3 = new Jugador("Sara", 20);
		Jugador j4 = new Jugador("Jorge", 27);
		Jugador j5 = new Jugador("Alberto", 45);
		
		
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		jugadores.add(j4);
		jugadores.add(j5);
		
		return jugadores;
	}

	public static void main(String[] args) {
		/**
		 * Se que va con test pero queria probar rapidito, luego lo cambio
		 */
		// TODO Auto-generated method stub
		Paquete p = new Paquete(TipoPalo.POKER);
		
		Juego j = new Juego(jugadores(), p, "Poker");
		
		System.out.println("Muestro baraja antes de repartir:----------------------");
		j.getBaraja().getBaraja().stream().forEach(System.out::println);
		ArrayList<Carta> auxCartas = new ArrayList<Carta>();
		
		for (Carta c : j.getBaraja().getBaraja()) {
			auxCartas.add(c);
		}
		
		System.out.println("Muestro baraja antes de ordenar:----------------------");
		
		auxCartas.stream().forEach(System.out::println);
		Collections.sort(auxCartas);
		
		System.out.println("Muestro baraja despues de ordenar:----------------------");
		auxCartas.stream().forEach(System.out::println);
		/*j.repartirCartas(7);
		
		System.out.println(j1.verMano());
		System.out.println(j2.verMano());
		System.out.println(j3.verMano());
		System.out.println(j4.verMano());
		System.out.println(j5.verMano());
		
		
		for (Jugador ju : j.getJugadores()) {
			
		}
		
		System.out.println("Muestro baraja despues de repartir:----------------------");
		j.getBaraja().getBaraja().stream().forEach(System.out::println);
		System.out.println(j.getBaraja().numeroCartas());
		
		System.out.println(j.toString());*/
	}

}
