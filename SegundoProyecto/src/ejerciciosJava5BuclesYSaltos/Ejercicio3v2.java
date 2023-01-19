package ejerciciosJava5BuclesYSaltos;

public class Ejercicio3v2 {

	/**
	 * Metodo Main para ejecutar el programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables que pide el ejercicio
		int dia = 31;
		int mes = 7;
		int anio = 2015;
		boolean controlDia = false;
		boolean controlMes = false;
		
		//Nos impiden usar arrays, la opcion que queda es un switch muy largo con todos los dias del mes
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
			//Hasta el dia 28 todos son correctos.
			System.out.println("Dia correcto");
			controlDia = true;
			break;
		case 29:
		case 30:
			//Los dias 29 y 30 solo hay que comprobar que no sea febrero (no tenemos en cuenta bisiestos)
			if (mes != 2) {
				System.out.println("Dia correcto");
				controlDia = true;
			} else {
				System.out.println("Dia incorrecto");
			}
			break;
		case 31:
			//Comprobamos que el dia 31 pertenece a uno de los meses válidos
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
		
		//Comprobamos que el mes es un numero valido
		if (mes >= 1 && mes <= 12) {
			System.out.println("Mes correcto");
			controlMes = true;
		}
		
		//Si tanto dia como mes son validos formo fecha y la muestro.
		if (controlDia && controlMes && anio >= 0) {
			System.out.println("Fecha formada: " + dia + "/" + mes + "/" + anio);
		}
	}

}
