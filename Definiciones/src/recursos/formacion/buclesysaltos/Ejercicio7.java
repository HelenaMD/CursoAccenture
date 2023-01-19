package recursos.formacion.buclesysaltos;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Numero del que queremos sacar los multiplos
		int num = 5;
		//Veces que queremos sacar los multiplos
		int contador = 10;
		//Num para comprobar si es multiplo
		int indice = 0;
		
		//Total suma de multiplos
		int total = 0;
		
		//Mientras contador no llegue a 0
		while (contador > 0) {
			//Si el indice es multiplo del numero
			if (++indice%num == 0) {
				//Restamos uno al contador
				--contador;
				//Sumamos el multiplo al total
				total += indice;
				//Mostramos el multiplo
				System.out.println(indice);
			}
		}
		
		//Mostramos el total
		System.out.println("El total es: " + total);
	}

}
