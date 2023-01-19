package ejerciciosJava5BuclesYSaltos;

public class Ejercicio4 {
	
	/**
	 * Atributos que tienen la info necesaria para montar el numero
	 */
	private static String decenas[] = {"", "Diez", "Veinte" , "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta", "Noventa"};
	private static String primerosQuince[] = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "Diez", "Once", "Doce", "Trece", "Catorce", "Quince"};
	private static int decena;
	private static int unidad;
	
	/**
	 * Método que recibe un numero y dependiendo de su valor lo formatea para pasarlo a escrito
	 * @param numero de tipo int
	 */
	public static void escribirNumero(int numero) {
		
		//Divido el numero entre diez para tener la decena y calculo su mod 10 para tener las unidades
		decena = numero/10;
		unidad = numero%10;
		
		//Si el numero está entre los primeros 15 es irregular y lo cogemos del array de datos
		if (numero < 16) {
			System.out.println(primerosQuince[numero]);
		//Si el numero está entre 16 y 19 hay que formarlo con "Dieci"
		} else if (numero >= 16 && numero < 20) {
			System.out.println("Dieci" + primerosQuince[unidad]);
		//Si el numero está entre 21 y 29 hay que formarlo con "Venti"
		} else if (numero > 20 && numero <= 29) {
			System.out.println("Venti" + primerosQuince[unidad]);
		//Si el numero es una decena exacta saca el numero del array de decenas
		} else if (unidad == 0){
			System.out.println(decenas[decena]);
		} else {
			//Si es cualquier otro numero coge su decena y concatena con su unidad
			System.out.println(decenas[decena] + " y " + primerosQuince[unidad]);
		}
	}
	
	/**
	 * Metodo Main para ejecutar el programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe los numeros del 0 al 100.
		for (int i = 0; i < 100; i++) {
			//System.out.println(i);
			escribirNumero(i);
		}
	}

}
