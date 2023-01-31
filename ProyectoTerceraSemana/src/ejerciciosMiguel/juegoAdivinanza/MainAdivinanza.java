package ejerciciosMiguel.juegoAdivinanza;

import java.util.Random;
import java.util.Scanner;

public class MainAdivinanza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		Random r = new Random();
		
		int num1 = r.nextInt(20);
		int num2 = 0;
		String linea;
		boolean datoCorrecto = false;
		boolean acierto = false;
		
		do {
			while (!datoCorrecto) {
				System.out.println("Introduce el numero que crees correcto:");
				if ((linea = teclado.nextLine()).matches("[0-9]+")) {
					num2 = Integer.valueOf(linea);
					datoCorrecto = true;
				} else {
					System.out.println("No has introducido un dato correcto!");
				}
			}
			datoCorrecto = false;
			if (num1 > num2) {
				System.out.println("Tu numero es menor!");
			} else if (num1 < num2){
				System.out.println("Tu numero es mayor!");
			} else {
				acierto = true;
			}
		} while (!acierto);
		
		System.out.println("Acertaste!!");
	}

}
