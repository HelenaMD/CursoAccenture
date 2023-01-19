package ejerciciosJava3DatosVariablesYConstantes;

public class Ejercicio2 {

	/**
	 * Metodo Main para ejecutar el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array con los dias del mes
		int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//Array con dos dimensiones (matriz)
		int arrayDosDimensiones[][] = new int[5][7];
		
		//Version corta:--------------------------------------------------------
		//Contador para rellenar matriz
		int contador = 1;
		
		//Bucles para rellenar matriz
		for (int i = 0; i < arrayDosDimensiones.length; i++) {
			for (int j = 0; j < arrayDosDimensiones[i].length; j++) {
				//Introduce numeros hasta llegar al 31, el resto lo deja a 0.
				if (contador <= 31) {
					arrayDosDimensiones[i][j] = contador;
					contador++;
				}
			}
		}
		
		//Bucles foreach para recorrerme la matriz y mostrarla por consola. Use foreach para no duplicar codigo.
		for (int[] firstD : arrayDosDimensiones) {
			for (int number : firstD) {
				System.out.println(number);
			}
		}
		
		//Version larga --------------------------------------------------
		/*arrayDosDimensiones[0][0] = 1;
		arrayDosDimensiones[0][1] = 2;
		arrayDosDimensiones[0][2] = 3;
		arrayDosDimensiones[0][3] = 4;
		arrayDosDimensiones[0][4] = 5;
		arrayDosDimensiones[0][5] = 6;
		arrayDosDimensiones[0][6] = 7;
		arrayDosDimensiones[1][0] = 8;
		arrayDosDimensiones[1][1] = 9;
		arrayDosDimensiones[1][2] = 10;
		arrayDosDimensiones[1][3] = 11;
		arrayDosDimensiones[1][4] = 12;
		arrayDosDimensiones[1][5] = 13;
		arrayDosDimensiones[1][6] = 14;
		arrayDosDimensiones[2][0] = 15;
		arrayDosDimensiones[2][1] = 16;
		arrayDosDimensiones[2][2] = 17;
		arrayDosDimensiones[2][3] = 18;
		arrayDosDimensiones[2][4] = 19;
		arrayDosDimensiones[2][5] = 20;
		arrayDosDimensiones[2][6] = 21;
		
		//Bucles foreach para recorrerme la matriz y mostrarla por consola. Use foreach para no duplicar codigo.
		for (int[] firstD : arrayDosDimensiones) {
			for (int number : firstD) {
				System.out.println(number);
			}
		}*/
		
		
	}

}
