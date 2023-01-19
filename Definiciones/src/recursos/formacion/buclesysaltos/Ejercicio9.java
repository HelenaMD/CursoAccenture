package recursos.formacion.buclesysaltos;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For que recorre las tablas
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla del " + i + ":\n------------------");
			//For que recorre los calculos
			for (int j = 1; j <= 10; j++) {
				//Muestro el resultado
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
	}

}
