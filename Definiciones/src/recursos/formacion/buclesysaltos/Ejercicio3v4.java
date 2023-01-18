package recursos.formacion.buclesysaltos;

public class Ejercicio3v4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia = 31;
		int mes = 7;
		int anio = 2015;
		
		//Array que guarda dias de los mes
		int diaMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//Comprueba si el mes es valido
		if (mes >= 1 && mes <= 12) {
			//Comprueba si el año es valido (no negativo)
			if (anio >= 0) {
				//Si el año es bisiesto sustituye el limite de dias del mes de febrero a 29.
				if ((anio%4==0 && anio%100!=0) || anio%400 == 0) {
					diaMes[1] = 29;
				}
				//Si el dia encaja en el limite del mes forma la fecha
				if (dia > 0 && dia <= diaMes[mes-1]) {
					System.out.println("Fecha correcta");
					System.out.println("Fecha formada: " + dia + "/" + mes + "/" + anio);
				} else {
					System.out.println("Dia incorrecto");
				}
			} else {
				System.out.println("Año incorrecto");
			}
		} else {
			System.out.println("Mes incorrecto");
		}
	}

}
