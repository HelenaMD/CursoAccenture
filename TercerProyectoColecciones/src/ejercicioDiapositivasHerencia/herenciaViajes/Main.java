package ejercicioDiapositivasHerencia.herenciaViajes;

public class Main {

	/**
	 * Metodo main para ejecutar el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo objetos
		ViajeAvion vuelo1 = new ViajeAvion("Madrid", "Tokio", "12:00 - 23:45", 146.29, "MAD Barajas", "HAN Haneda");
		ViajeBarco crucero1 = new ViajeBarco("Barcelona", "Sicilia", "9:00 - 14:30", 283.10, "Puerto Camp Nou", "Porto Nova Sicilia");
		ViajeCoche ruta1 = new ViajeCoche("Madrid", "Toledo", "11:30 - 12:30", 10.50, 1, 50);
		
		//Los muestro por consola
		System.out.println(vuelo1.toString());
		System.out.println(crucero1.toString());
		System.out.println(ruta1.toString());
	}

}
