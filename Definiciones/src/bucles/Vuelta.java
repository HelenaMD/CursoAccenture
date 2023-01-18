package bucles;

public class Vuelta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println("Fase 2 Reversion de letras ***************************************");
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
