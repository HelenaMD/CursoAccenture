package ejerciciosJava5BuclesYSaltos;

public class Ejercicio5 {

	/**
	 * Metodo Main para ejecutar el programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Defino un array de ints con la longitud de args
		int numerosCuadrados[] = new int[args.length];
		
		//Recorro args
		for (int i = 0; i < args.length; i++) {
			//Guardo en el array de ints los cuadrados del numero que toca y lo muestro
			numerosCuadrados[i] = (int) Math.pow(Integer.valueOf(args[i]), 2);
			System.out.println("Cuadrado de " + args[i] + " = " + numerosCuadrados[i]);
		}
	}

}
