package ejerciciosJava5BuclesYSaltos;

public class Ejercicio1 {

	/**
	 * Metodo Main para ejecutar el programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DEclaro e inicializo variables que me pide el ejercicio
		int numA = 10;
		int numB = 20;
		
		//Comparo si uno es mayor que otro o si son iguales
		if (numA > numB) {
			System.out.println("numA es mayor que numB");
		} else if (numA == numB){
			System.out.println("Los numeros son iguales");
		} else {
			System.out.println("numA es menor que numB");
		}
		
		//Comparo si uno es multiplo de otro
		if (numA % numB == 0) {
			System.out.println("numA es multiplo de numB");
		} else if (numB % numA == 0) {
			System.out.println("numB es multiplo de numA");
		} else {
			System.out.println("Ni numA ni numB son multiplos entre si.");
		}
	}

}
