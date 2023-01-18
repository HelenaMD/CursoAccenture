package recursos.formacion.buclesysaltos;

public class Ejercicio3v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia = 31;
		int mes = 7;
		int anio = 2015;
		boolean controlDia = false;
		boolean controlMes = false;
		
		switch (dia) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
		case 30:
			System.out.println("Dia correcto");
			controlDia = true;
			break;
		case 31:
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				System.out.println("Dia correcto");
				controlDia = true;
			} else {
				System.out.println("Dia incorrecto");
			}
			break;
		default:
			System.out.println("Dia incorrecto");
		}
		
		if (mes >= 1 && mes <= 12) {
			System.out.println("Mes correcto");
			controlMes = true;
		}
		
		if (controlDia && controlMes && anio >= 0) {
			System.out.println("Fecha formada: " + dia + "/" + mes + "/" + anio);
		}
	}

}
