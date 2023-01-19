package recursos.formacion.buclesysaltos;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Numero a calcular y donde guardare el resultado
		int num = 8;
		int resultado = 1;
		
		//Recorro desde el num hasta 1
		for (int i = num; i > 0; i--) {
			//Multiplico el numero anterior y se guarda
			resultado = resultado * i;
			
		}
		
		//Lo muestro
		System.out.println("Factorial de " + num + " = " + resultado);
	}

}
