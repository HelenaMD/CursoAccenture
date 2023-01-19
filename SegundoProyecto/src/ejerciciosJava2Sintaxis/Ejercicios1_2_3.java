package ejerciciosJava2Sintaxis;

public class Ejercicios1_2_3 {

	/**
	 * Metodo Main para ejecutar el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Correcto, aunque no se suele usar el dolar
		int $nombre;
		
		//No da error pero no sigue la norma de escritura, deberia ser pasaDo.
		int pasaDo;
		
		//Falta punto y coma
		int alcance;
		
		//Correcto, aunque es preferible usar CamelCase
		int _contador;
		_contador=25;
		 
		$nombre=_contador;
		
		//Estaba sin las mayusculas por lo tanto no lo compilaba por no estar declarado
		pasaDo=_contador;

		//Guarda 25 en _contador, después lo almacena en $nombre y en pasaDo, y luego lo muestra por consola con una barra en medio.
		System.out.println($nombre + " / " + _contador);
		
		//Mostramos la frase formateada como pide el ejercicio
		System.out.println("En \"Java\" puede\n que tengamos que utilizar\n caracteres especiales.");
	}

}
