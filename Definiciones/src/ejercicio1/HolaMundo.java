package ejercicio1;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Imprime Hola Mundo en consola
		System.out.println("HOLA MUNDO");
		//Imprime "PRuebas de tipos" en consola
		System.out.println("Pruebas de tipos");
		
		//Declara variables de distintos tipos
		char c = 'A';
		double precio = 23.4;
		double iva = 0.16;
		double importeTotal;
		
		//Calcula un importe total con una operacion matematica
		importeTotal = precio*iva+precio;
		
		//Muestra una "c"
		System.out.println("Caracter: " + c);
		
		//Muestra el dígito unicode que pertenece a la A
		System.out.println("Equivalencia Unicode: " + (int)c);
		
		//Muestra el resultado de la operacion de importe Total
		System.out.println("importe Total: " + importeTotal);
		
		//Muestra las estaciones en una linea cada una
		System.out.println("Primavera\nVerano\nOtono\nInvierno");
		
		//Muestra los días con un tabulado en medio de cada una
		System.out.println("Lun\tMar\tMie\tJue\tVie");
		
		//Muestra los días con una barra en medio de cada una
		System.out.println("Lun\\Mar\\Mie\\Jue\\Vie");
		
		//Muestra "Cocodrilo" por consola incluyendo comillas.
		System.out.println("\"Cocodrilo\"");
		
		
	}

}
