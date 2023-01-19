package ejerciciosJava6TrabajandoConCadenas;

public class Ejercicio1 {

	/**
	 * Metodo Main para ejecutar el programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables que voy a necesitar
		String cadena = "Siempre se puede aprender Java";
		String cadenaAux = "";
		String palabras[] = cadena.split(" ");
		int contadorLetra = 0;
		
		//Guardo la frase sin espacios en blanco
		cadenaAux = cadena.replaceAll(" ", "");
		
		//Muestro la cantidad de letras que tiene la frase
		System.out.println("La frase \"" + cadena + "\" tiene " + cadenaAux.length() + " caracteres.");
		
		//Muestro la cantidad de palabras que tiene la frase
		System.out.println("La frase \"" + cadena + "\" tiene " + palabras.length + " palabras.");
		
		//Recorro la cadena caracter a caracter y cuento las veces que aparece la letra 'a'.
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a') {
				contadorLetra++;
			}
		}
		
		//Muestro la cantidad de veces que aparece la letra 'a'
		System.out.println("La frase \"" + cadena + "\" tiene " + contadorLetra + " letras \'a\'.");
		
		//Muestro las palabras invertidas
		for (int i = palabras.length-1; i >= 0; i--) {
			System.out.print(palabras[i] + " ");
		}
		//meto salto de linea
		System.out.println();
		
		//Muestro las letras invertidas
		for (int i = cadena.length()-1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}
	}

}
