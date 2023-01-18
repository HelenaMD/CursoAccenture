package recursos.formacion.buclesysaltos;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA = 10;
		int numB = 20;
		
		if (numA > numB) {
			System.out.println("numA es mayor que numB");
		} else if (numA == numB){
			System.out.println("Los numeros son iguales");
		} else {
			System.out.println("numA es menor que numB");
		}
		
		if (numA % numB == 0) {
			System.out.println("numA es multiplo de numB");
		} else if (numB % numA == 0) {
			System.out.println("numB es multiplo de numA");
		} else {
			System.out.println("Ni numA ni numB son multiplos entre si.");
		}
	}

}
