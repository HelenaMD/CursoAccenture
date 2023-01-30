package ejerciciosDiapositivasScanner.systemIn;

import java.util.Scanner;

public class MainSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int n1;
		int n2;

		System.out.println("Introduce un numero:");

		n1 = teclado.nextInt();

		System.out.println("Introduce otro numero:");

		n2 = teclado.nextInt();

		System.out.println("Los numeros introducidos son: " + n1 + " y " + n2);
	}

}
