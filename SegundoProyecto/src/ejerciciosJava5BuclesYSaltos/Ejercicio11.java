package ejerciciosJava5BuclesYSaltos;

public class Ejercicio11 {

	/**
	 * Metodo Main para ejecutar el programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Booleana para controlar si es primo o no
		boolean esPrimo = true;
		int contador = 0;
		
		//Numero limite
		int num = 100;
		
		//Bucle que recorre del 1 al 100
		for (int i = 1; i <= num; i++) {
			//Bucle que recorre desde el 2 hasta el numero inferior al que estamos
			for (int j = 2; j < i; j++) {
				//Si alguna division por ese numero da resto 0, no es primo
				if (i%j == 0) {
					esPrimo = false;
				}
			}
			//Si el booleano sigue en true, es primo y lo muestro
			if (esPrimo) {
				System.out.println("El numero " + i + " es primo");
				contador++;
			}
			//Reseteo la variable.
			esPrimo = true;
		}
		
		System.out.println("En total del 1 al " + num + " hay " + contador + " numeros primos.");
	}

}
