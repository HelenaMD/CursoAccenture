package ejerciciosDiapositivasFiles.fileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try {
			fichero = new FileWriter("C:\\Users\\helena.martinez.duro\\OneDrive - Accenture\\Documents\\CursoWK\\ProyectoTerceraSemana\\src\\ejerciciosDiapositivasFiles\\fileWriter\\prueba.txt");
			pw = new PrintWriter(fichero);
			
			for (int i = 0; i < 10; i++) {
				pw.println("Linea " + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fichero != null) {
				fichero.close();
			}
		}
	}

}
