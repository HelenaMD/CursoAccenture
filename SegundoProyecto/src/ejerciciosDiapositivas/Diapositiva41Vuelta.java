package ejerciciosDiapositivas;

public class Diapositiva41Vuelta {

	/**
	 * Metodo Main para ejecutar el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaro variables
		String entrada;
		String palabras[];
		String palabrasReves;
		int longitudArgs;
		int longitudFraseEntrada;
		//Variable para el for
		int a;
		//variable que contendrá la frase invertida completamente
		String fraseReves;
		
		//Guardo la longitud de args[]
		longitudArgs = args.length;
		entrada = "";
		//Guarda en la variable "entrada" los argumentos de args concatenados con un espacio entre argumentos
		for (int i = 0; i < longitudArgs; i++) {
			entrada += args[i] + " ";
		}
		
		//Fase 1
		System.out.println("Fase 1 Reversion palabras **************************");
		
		//Separo palabras
		palabras = entrada.split(" ");
		palabrasReves = "";
		
		//Revierto palabras
		for (int i = palabras.length - 1; i >= 0; i--) {
			palabrasReves += palabras[i] + " ";
		}
		
		//Muestro la frase con las palabras invertidas
		System.out.println(palabrasReves);
		
		System.out.println("Fase 2 Reversion de letras con sustitucion de numeros***************************************");
		
		//Guardo la longitud de la frase inicial formada
		longitudFraseEntrada = entrada.length();
		
		fraseReves = "";
		//Comienza recorriendo el string desde su ultima posicion
		for(a = longitudFraseEntrada - 1; a >= 0; a--) {
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
		//Muestro la frase por consola
		System.out.println(fraseReves);
	}

}
