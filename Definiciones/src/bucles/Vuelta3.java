package bucles;

public class Vuelta3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada = "";
		
		//Booleana para controlar la salida del bucle
		boolean control = false;
		//Contador para acceder a posiciones de args[]
		int contador = 0;
		
		String delimitador = "$";
		
		//Bucle while que recorrera args[] hasta que se encuentre el caracter especial "$"
		while (!control) {
			//Si la ultima posicion es un $ o contiene un $ pasamos control a true y no entrara mas al bucle. omito $ para que no aparezca en la frase
			if (args[contador].equals(delimitador) || args[contador].contains(delimitador)) {
				control = true;
			}
			//Formo la frase
			entrada += args[contador] + " ";
			
			//Incremento el contador
			contador++;
		}
		
		//Muestro la frase
		System.out.println("fase - 1 - " + entrada);
		
		//El contador comienza desde la posicion del ultimo delimitador
		int cont = entrada.lastIndexOf(delimitador);
		
		String fraseReves = "";
		//Entra al bucle hasta que no quedan mas posiciones de String (posicion menor que 0)
		while (cont >= 0) {
			////Intercambio el caracter con un numero.
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
			
			//Decremento el contador.
			cont--;
		}
		System.out.println(fraseReves);
	}

}
