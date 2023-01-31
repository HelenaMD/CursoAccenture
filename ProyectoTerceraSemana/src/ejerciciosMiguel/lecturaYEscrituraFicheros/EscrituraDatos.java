package ejerciciosMiguel.lecturaYEscrituraFicheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EscrituraDatos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub.
		FileWriter ficheroPrueba = null;
		PrintWriter pw = null;
		
		try {
			Scanner input = new Scanner(System.in);
			
			String nombre;
			String apellido;
			
			System.out.println("Introduce un nombre:");
			
			nombre = input.nextLine();
			
			System.out.println("Introduce un apellido:");
			
			apellido = input.nextLine();
			
			//Tengo que investigar como usar rutas relativas, que no me funcionan
			Path pathSource = Paths.get("C:\\Users\\helena.martinez.duro\\OneDrive - Accenture\\Documents\\CursoAccenture\\ProyectoTerceraSemana\\src\\ejerciciosMiguel\\lecturaYEscrituraFicheros\\prueba.txt");
			Files.createFile(pathSource);
			
			ficheroPrueba = new FileWriter(pathSource.toString());
			pw = new PrintWriter(ficheroPrueba);
			
			pw.println("NOMBRE=" + nombre);
			pw.println("APELLIDO=" + apellido);
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (ficheroPrueba != null) {
				ficheroPrueba.close();
			}
		}
		
	}

}
