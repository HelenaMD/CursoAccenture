package ejerciciosMiguel.partidaContraMaquina;

import java.util.Random;
import java.util.Scanner;

public class JuegoContraMaquina {
	
	/*Atributos*/
	private static Scanner teclado = new Scanner(System.in);
	private static Random r = new Random();
	private static int numMaq = r.nextInt(9999);
	private static int topeInf = 0;
	private static int topeSup = 9999;
	private static int numActualMaq = r.nextInt(9999);
	
	private static int puntosUsuario = 0;
	private static int puntosMaquina = 0;
	
	private static boolean finPartida = false;
	private static boolean finJuego = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable que usare para una respuesta de usuario
		String resp = "";
		//Mientras queramos jugar
		while (!finJuego) {
			//Mientras estemos en partida
			while (!finPartida) {
				//Primero juega el usuario
				turnoUsuario();
				if (!finPartida) {
					//Y luego a la maquina
					turnoMaquina();
				}
			}
			//Muestro resultado hasta ahora
			System.out.println("Hemos quedado:\nUsuario: " + puntosUsuario + " Maquina: " + puntosMaquina);
			System.out.println("¿Quieres echarte otra partida? (Y/N)");
			resp = teclado.nextLine();
			//Si queremos parar saldra del bucle principal
			if (resp.equalsIgnoreCase("n")) {
				finJuego = true;
			} else { //Si queremos seguir reseteo valores
				finPartida = false;
				numMaq = r.nextInt(9999);
				numActualMaq = r.nextInt(9999);
				topeInf = 0;
				topeSup = 0;
			}
		}
	}
	
	/*Metodo que le das un numero y te responde si es mayor, menor o igual al de la maquina.*/
	public static void turnoUsuario() {
		System.out.println("Dame un numero: ");
		int i = Integer.valueOf(teclado.nextLine());
		if (numMaq > i) {
			System.out.println("Tu numero es menor");
		} else if (numMaq < i) {
			System.out.println("Tu numero es mayor");
		} else {
			System.out.println("Has adivinado el numero!"); //Si adivino sumo punto y para la partida.
			puntosUsuario++;
			finPartida = true;
		}
	}
	
	/*Metodo que da un numero al usuario y espera que le digas si es mayor o menor*/
	public static void turnoMaquina() {
		//Variable para respuesta
		String respuesta = "";
		System.out.println("Yo te doy el numero " + numActualMaq);
		System.out.println("Introduce \"Ma\" para Mayor que, \"Me\" para Menor que, \"Y\" para CORRECTO");
		respuesta = teclado.nextLine();//recojo respuesta
		if (respuesta.equalsIgnoreCase("ma")) {
			topeSup = numActualMaq; //fijo limites segun me dicen si es mayor o menor
		} else if (respuesta.equalsIgnoreCase("me")) {
			topeInf = numActualMaq;
		} else {
			System.out.println("He ganado!!!");
			finPartida = true;
			puntosMaquina++;
		}
		numActualMaq = (topeSup + topeInf)/2;
		
	}

}
