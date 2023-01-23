package ejercicioDiapositivasHerencia.herenciaAlumnoProfesor;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

	/**
	 * Metodo para ejecutar el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo objetos
		Alumno alumno1 = new Alumno("Alvaro", 10, "666555444", 6, new HashSet<String>(Arrays.asList("Mates", "Lengua", "Conocimiento del medio", "Educacion Fisica")));
		Profesor profesor1 = new Profesor("Jose", 33, "678901234", "01-01-2023", 3000f);
		
		//Muestro datos de los objetos
		System.out.println(alumno1.toString());
		System.out.println(profesor1.toString());
		
		//Aniado una asignatura
		alumno1.aniadirAsignatura("Etica y comportamiento social");
		
		//Muestro datos
		System.out.println(alumno1.toString());
	}

}
