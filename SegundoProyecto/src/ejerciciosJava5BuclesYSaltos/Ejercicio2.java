package ejerciciosJava5BuclesYSaltos;

public class Ejercicio2 {

	/**
	 * Metodo Main para ejecutar el programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaro e inicializo variable que pide el ejercicio
		int nota = 6;
		
		//Switch para que muestre según la nota
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("INSUFICIENTE");
			break;
		case 5:
			System.out.println("SUFICIENTE");
			break;
		case 6:
			System.out.println("BIEN");
			break;
		case 7:
		case 8:
			System.out.println("NOTABLE");
			break;
		case 9:
			System.out.println("SOBRESALIENTE");
			break;
		case 10:
			System.out.println("MATRICULA");
			break;
		default:
			System.out.println("ERROR");
			break;
		}
	}

}
