package ejerciciosDiapositivas;

/**
 * Clase para probar la otra clase generica del ejercicio
 * @author helena.martinez.duro
 */
public class EjercicioDiapositivas1InversionPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo dos objetos de la clase generica para delimitar para cada uno un tipo distinto
		EjercicioDiapositivas1Inversion<String> prueba1 = new EjercicioDiapositivas1Inversion<String>("20", "30");
		EjercicioDiapositivas1Inversion<Integer> prueba2 = new EjercicioDiapositivas1Inversion<Integer>(20, 30);
		
		//Muestro el valor de los atributos antes del intercambio
		System.out.println("[PRUEBA1 STRING] Valor de a = " + prueba1.getA() + " y valor de b = " + prueba1.getB());
		System.out.println("[PRUEBA2 INTEGER] Valor de a = " + prueba2.getA() + " y valor de b = " + prueba1.getB());
		
		//Hago el intercambio
		prueba1.intercambiarAtributos();
		prueba2.intercambiarAtributos();
		
		//Muestro el valor de los atributos despues del intercambio
		System.out.println("[PRUEBA1 STRING] Valor de a = " + prueba1.getA() + " y valor de b = " + prueba1.getB());
		System.out.println("[PRUEBA2 INTEGER] Valor de a = " + prueba2.getA() + " y valor de b = " + prueba1.getB());
	}

}
