package ejerciciosJava5BuclesYSaltos;

public class Ejercicio3v1 {

	/**
	 * Metodo Main para ejecutar el programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaro e inicializo variables que pide el ejercicio
		int dia = 20;
		int mes = 8;
		int anio = 2015;
		
		//Hago las comprobaciones que pide el ejercicio y si todo esta correcto muestro la fecha
		//Si el dia del mes NO esta entre el 1 y el 30 es erroneo
		if (dia < 1 || dia > 30) {
			System.out.println("Fecha incorrecta: dia erroneo");
		//Si el mes no esta entre 1 y 12 es erroneo
		} else if (mes < 1 || mes > 12) {
			System.out.println("Fecha incorrecta: mes erroneo");
		//Si el año es negativo es erroneo
		} else if (anio < 0){
			System.out.println("Fecha incorrecta: año erroneo");
		} else {
			System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + anio);
		}
	}

}
