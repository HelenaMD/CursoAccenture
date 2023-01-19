package ejerciciosDiapositivas;

public class Diapositiva42VueltaV3 {

	/**
	 * Metodo Main para ejecutar el programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaro variables
		String entrada;
		String palabras[];
		String palabrasReves;
		int longitudArgs;
		int longitudFraseEntrada;
		// Variable para el for
		int a;
		// variable que contendrá la frase invertida completamente
		String fraseReves;
		char caracterDelimitador;
		int contador;
		boolean esFinal;

		// Guardo el que será el caracter delimitador que se encuentra en la primera
		// letra de la frase
		entrada = args[0];
		caracterDelimitador = entrada.charAt(0);

		// Inicializo variables
		entrada = "";
		contador = 0;
		esFinal = false;

		// Recojo los args hasta que me encuentro con el caracter de cierre
		while (!esFinal) {
			entrada += args[contador] + " ";
			if (args[contador].contains(String.valueOf(caracterDelimitador))
					&& args[contador].indexOf(String.valueOf(caracterDelimitador)) != 0) {
				esFinal = true;
			}
			contador++;
		}

		System.out.println(entrada);

		// Guardo la longitud de args[]
		/*
		 * longitudArgs = args.length; entrada = ""; // Guarda en la variable "entrada"
		 * los argumentos de args concatenados con un // espacio entre argumentos for
		 * (int i = 0; i < longitudArgs; i++) { entrada += args[i] + " "; }
		 */

		// Fase 1
		System.out.println("Fase 1 Reversion palabras **************************");

		// Separo palabras
		palabras = entrada.split(" ");
		palabrasReves = "";

		// Revierto palabras
		for (int i = palabras.length - 1; i >= 0; i--) {
			palabrasReves += palabras[i] + " ";
		}

		// Muestro la frase con las palabras invertidas
		System.out.println(palabrasReves);

		System.out.println(
				"Fase 2 Reversion de letras con sustitucion de numeros***************************************");

		//Busco donde esta el ultimo caracter delimitador y lo uso para el contador.
		int cont = entrada.lastIndexOf(String.valueOf(caracterDelimitador));

		fraseReves = "";
		// Entra al bucle hasta que no quedan mas posiciones de String (posicion menor
		// que 0)
		while (cont >= 0) {
			//// Intercambio el caracter con un numero.
			switch (entrada.charAt(cont)) {
			case 'a':
				fraseReves += 4;
				break;
			case 'e':
				fraseReves += 3;
				break;
			case 'i':
				fraseReves += 1;
				break;
			case 'o':
				fraseReves += 0;
				break;
			case 'u':
				fraseReves += 9;
				break;
			case 'A':
				fraseReves += 4;
				break;
			case 'E':
				fraseReves += 3;
				break;
			case 'I':
				fraseReves += 1;
				break;
			case 'O':
				fraseReves += 0;
				break;
			case 'U':
				fraseReves += 9;
				break;
			case '$':
				fraseReves += "";
				break;
			default:
				fraseReves += entrada.charAt(cont);
				break;
			}

			// Decremento el contador.
			cont--;
		}
		System.out.println(fraseReves);
	}

}
