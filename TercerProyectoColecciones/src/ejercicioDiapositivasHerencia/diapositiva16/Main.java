package ejercicioDiapositivasHerencia.diapositiva16;

import java.util.Date;

/**
 * Clase con metodo Main para probar las clases de herencia de este ejercicio
 * @author helena.martinez.duro
 */
public class Main {

	/**
	 * MEtodo main para ejecutar el programa
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo un objeto de cada clase instanciable
		Usuario user1 = new Usuario("HelenaMD", "C/ Pepito Perez", "helena.martinez.duro@accenture.com", 1234);
		Cliente client1 = new Cliente("Alvaro Martin", "C/ Pepa Flores", "alvaro.martin@accenture.com", 9876, new Date(2023, 1, 20));
		
		//Llamo algunos metodos para probar
		System.out.println(user1.aString());
		System.out.println(client1.aString());
	}

}
