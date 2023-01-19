package recursos.formacion.trabajandoconcadenas;

public class Ejercicio2 {
	
	//Metodo que compara si dos cadenas String son iguales
	public static void compararCadenas(String a, String b) {
		if (a.equalsIgnoreCase(b)) {
			System.out.println("Las dos strings son iguales.");
		} else {
			System.out.println("Las dos strings no son iguales.");
		}
	}
	
	//Metodo que muestra la cantidad de caracteres de una cadena
	public static void verNumCaracteres(String s) {
		String aux = s.replaceAll(" ", "");
		System.out.println("La cadena " + s + " tiene " + aux.length() + " caracteres.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo las variables que me piden
		String a = "Esto es una cadena";
		String b = "Y esto tambien";
		String c = a + " " + b;
		String d = a + " " + b;
		
		//Comparamos cadenas
		compararCadenas(a, b);
		
		//Concatenamos
		System.out.println("La concatenacion de a y b da como resultado: " + c);
		
		//Comparamos mas cadenas
		compararCadenas(c, d);
		
		//Vemos los numeros de caracteres
		verNumCaracteres(a);
		verNumCaracteres(b);
		verNumCaracteres(c);
		verNumCaracteres(d);
		
		//Copio a en b
		b = a;
		
		//Modifico la e por x y muestro las dos cadenas.
		System.out.println(b.replace('e', 'x'));
		System.out.println(a);
	}

}
