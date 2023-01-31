package ejerciciosMiguel.lecturaYEscrituraFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaDatos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fichero = null;
		FileReader fr = null;
		BufferedReader bfr = null;
		try {
			String linea;
			String[] splitted;
			fichero = new File("C:\\Users\\helena.martinez.duro\\OneDrive - Accenture\\Documents\\CursoAccenture\\ProyectoTerceraSemana\\src\\ejerciciosMiguel\\lecturaYEscrituraFicheros\\prueba.txt");
			fr = new FileReader(fichero);
			bfr = new BufferedReader(fr);
			String nombre = "";
			String apellido = "";
			
			while ((linea = bfr.readLine()) != null) {
				splitted = linea.split("=");
				if (splitted[0].equalsIgnoreCase("nombre")) {
					nombre = splitted[1];
				}
				if (splitted[0].equalsIgnoreCase("apellido")) {
					apellido = splitted[1];
				}
			}
			
			System.out.print(nombre + " " + apellido);
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bfr != null && fr != null) {
				bfr.close();
				fr.close();
			}
		}
	}

}
