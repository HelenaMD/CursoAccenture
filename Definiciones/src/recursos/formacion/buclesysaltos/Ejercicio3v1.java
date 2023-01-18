package recursos.formacion.buclesysaltos;

public class Ejercicio3v1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia = 20;
		int mes = 8;
		int anio = 2015;
		
		if (dia < 1 || dia > 30) {
			System.out.println("Fecha incorrecta: dia erroneo");
		} else if (mes < 1 || mes > 12) {
			System.out.println("Fecha incorrecta: mes erroneo");
		} else if (anio < 0){
			System.out.println("Fecha incorrecta: año erroneo");
		} else {
			System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + anio);
		}
	}

}
