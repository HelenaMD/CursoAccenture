package ejerciciosJava5BuclesYSaltos;

public class Ejercicio3v3 {

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
		
		//Array con los días del mes
		int diaMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//El mes esta dentro de los 12
		if (mes >= 1 && mes <= 12) {
			//Si no tenemos un año negativo
			if (anio > 0) {
				//Y el dia es menor o igual al limite de dias del mes que corresponde
				if (dia > 0 && dia <= diaMes[mes-1]) {
					System.out.println("Fecha correcta");
					//Formamos fecha
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
