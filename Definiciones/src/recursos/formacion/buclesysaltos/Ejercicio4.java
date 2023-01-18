package recursos.formacion.buclesysaltos;

public class Ejercicio4 {
	
	private static String decenas[] = {"", "Diez", "Veinte" , "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta", "Noventa"};
	private static String primerosQuince[] = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "Diez", "Once", "Doce", "Trece", "Catorce", "Quince"};
	private static int decena;
	private static int unidad;
	
	public static void escribirNumero(int numero) {
		decena = numero/10;
		unidad = numero%10;
		
		if (numero < 16) {
			System.out.println(primerosQuince[numero]);
		} else if (numero >= 16 && numero < 20) {
			System.out.println("Dieci" + primerosQuince[unidad]);
		} else if (numero > 20 && numero <= 29) {
			System.out.println("Venti" + primerosQuince[unidad]);
		} else if (unidad == 0){
			System.out.println(decenas[decena]);
		} else {
			System.out.println(decenas[decena] + " y " + primerosQuince[unidad]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 100; i++) {
			//System.out.println(i);
			escribirNumero(i);
		}
	}

}
