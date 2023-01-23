package ejercicioDiapositivasHerencia.herenciaVehiculos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo objetos
		Camion camion1 = new Camion(5, 90, 1234, 6, 1000, 30000);
		Coche coche1 = new Coche(6, 200, 9876, 4, "Rojo", 4);
		Moto moto1 = new Moto(6, 200, 6543, 2, 50);
		
		//Muestro su info por consola
		System.out.println(camion1.toString());
		System.out.println(coche1.toString());
		System.out.println(moto1.toString());
		
		//Uso este metodo para probarlo
		coche1.activarReductora(true);
		
		//Muestro info por consola
		System.out.println(coche1.toString());
	}

}
