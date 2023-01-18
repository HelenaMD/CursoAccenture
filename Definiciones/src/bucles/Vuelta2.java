package bucles;

public class Vuelta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Este ejercicio y el Vuelta3 no están bien hechos, cuando los hice por mi cuenta lo 
		 * planteé mal y luego me tuve que ir y no pude cambiarlos, lo tengo pendiente.*/
		String entrada = "";
		//Guardo la longitud de args[]
		int lg = args.length;
		//Guarda en la variable "entrada" los argumentos de args concatenados con un espacio entre argumentos
		for (int a = 0; a < lg; a++) {
			entrada += args[a] + " ";
		}
		//Fase 1
		System.out.println("Fase 1 Reversion palabras **************************");
		
		//Separo palabras
		String palabras[] = entrada.split(" ");
		String palabrasReves = "";
		
		//Revierto palabras
		for (int i = palabras.length - 1; i >= 0; i--) {
			palabrasReves += palabras[i] + " ";
		}
		
		System.out.println(palabrasReves);
		
		//Booleana para controlar la salida del bucle
		boolean control = false;
		//Contador para acceder a posiciones de args[]
		int contador = 0;
		
		//Aqui comence a hacer cambios, se quedó a medias
		String delimitador = String.valueOf(entrada.charAt(0));
		
		//Bucle while que recorrera args[] hasta que se encuentre el caracter especial "$"
		while (!control) {
			//Si la ultima posicion es un $ o contiene un $ pasamos control a true y no entrara mas al bucle. omito $ para que no aparezca en la frase
			if (args[contador].equals(delimitador) || args[contador].contains(delimitador)) {
				control = true;
				entrada += args[contador].replace(delimitador, "");
			} else {
				//Formo la frase
				entrada += args[contador] + " ";
			}
			//Incremento el contador
			contador++;
		}
		
		//Muestro la frase
		System.out.println("fase - 1 - " + entrada);
		//Guardo la longitud del String formado
		int longitud = entrada.length();
		int a;
		String fraseReves = "";
		//Comienza recorriendo el string desde su ultima posicion
		for(a = longitud - 1; a >= 0; a--) {
			//Escribe la frase caracter a caracter al reves.
			//System.out.println(entrada.charAt(a));
			
			//Intercambio el caracter con un numero y lo va concatenando a "fraseReves".
			switch (entrada.charAt(a)) {
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
			default:
				fraseReves += entrada.charAt(a);
				break;
			}
		}
		System.out.println(fraseReves);
	}

}
