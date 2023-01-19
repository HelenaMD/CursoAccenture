package ejerciciosJava4Operadores;

public class Ejercicio1 {

	/**
	 * Metodo Main para ejecutar el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaro e inicializo variable
		int valor = 0;
		//Doy valor a la variable
		valor = 23;
		
		//Sigue un numero de modificaciones con comentarios de lo que debería valer la variable en cada linea
		valor += 10; //33
		System.out.println("Resultado de a = " + --valor); //32
		System.out.println("Resultado de b = " + ++valor); //33
		System.out.println("Resultado de c = " + valor++); //33
		System.out.println("Resultado de d = " + valor--); //34
		System.out.println("Resultado de e = " + valor); //33
	}

}
