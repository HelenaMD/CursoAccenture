package ejerciciosJava4Operadores;

public class Ejercicio3 {

	/**
	 * Metodo Main para ejecutar el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables que pide el ejercicio
		final double PI = Math.PI;
		int radio = 23;
		
		//Calculos que pide el ejercicio
		double area = PI * Math.pow(radio, 2);
		double longitud = PI * (radio*2);
		
		//Muestro los resultados por consola
		System.out.println("Area del circulo: " + area);
		System.out.println("Longitud de la circunferencia: " + longitud);
	}

}
