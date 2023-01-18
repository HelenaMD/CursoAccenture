package Pruebas;

public class UnaClaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaClase clase1 = new UnaClase("Helena", 23, true);
		
		System.out.format("%s\n", clase1.toString());
		
		clase1.setEdad(100);
		
		System.out.format("%s\n", "Ahora Helena es una abuela porque tiene " + clase1.getEdad() + " anios.");
		
		String prueba = "Esto es una prueba";
		
		char arrayChar[] = new char[prueba.length()];
		
		for (int i = 0; i < arrayChar.length; i++) {
			arrayChar[i] = prueba.charAt(i);
		}
		
		for (char c : arrayChar) {
			System.out.print(c + " ");
		}
	}

}
