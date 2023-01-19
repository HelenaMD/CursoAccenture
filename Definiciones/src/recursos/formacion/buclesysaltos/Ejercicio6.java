package recursos.formacion.buclesysaltos;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Entendí mal lo que pedía el ejercicio, hice lo que pide debajo.
		
		//Variables que necesito por fuera para guardar el valor
		int j = 100;
		int contador = 1;
		
		//Mientras que j no llegue a 0 se ejecuta
		while (j >= 0) {
			//Informo de la tanda de numeros
			System.out.println("\nTanda " + contador + ": ");
			//Muestro los numeros en pasadas de 23
			for (int i = 1; i <= 23 && j >= 0; i++) {
				System.out.print(j + " ");
				//Decremento j
				j--;
			}
			//Incremento tanda
			contador++;
		}
		
		//Esto es lo que realmente pediste
		for (int k = 100; k >= 0; k-=23) {
			System.out.print("\n" + k);
		}
	}

}
