package ejerciciosColecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EjercicioPracticar1 {

	/**
	 * Metodo Main para ejecutar el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo un ArrayList a partir de un array basico en la misma creación del ArrayList
		List<String> arrayStrList = new ArrayList<String>(Arrays.asList("Helena", "Alvaro", "Jorge", "Sara", "Montse", "Jose", "Merche", "Antonio"));
		
		//Muestro los elementos del ArrayList
		for (String s : arrayStrList) {
			System.out.println(s);
		}
		
		//Si contiene el elemento pedido entra
		if (arrayStrList.contains("Alvaro")) {
			//Muestra la posicion del elemento
			System.out.println("Contiene el elemento pedido en la posicion " + arrayStrList.indexOf("Alvaro"));
		}
		
		//Creo en el mismo for el Iterator y luego recorremos con el el arrayList.
		//hasNext comprueba si tiene otro elemento en la siguiente posicion, next() avanza a la siguiente posicion
		for (Iterator<String> it = arrayStrList.iterator(); it.hasNext();) {
			System.out.println(it.next());
			//Introducir aqui la accion que quieras sobre el elemento actual.
		}
	}

}
