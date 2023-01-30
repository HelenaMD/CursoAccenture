package ejerciciosDiapositivasFilesPath.copiarYMover;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class CopiarYMoverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Path pathSource = Paths.get("C:\\Users\\helena.martinez.duro\\OneDrive - Accenture\\Documents\\CursoWK\\ProyectoTerceraSemana\\src\\ejericiciosDiapositivasFilesPath\\copiarYMover\\prueba.txt");
			Path destPath1 = Paths.get("C:\\Users\\helena.martinez.duro\\OneDrive - Accenture\\Documents\\CursoWK\\ProyectoTerceraSemana\\src\\ejericiciosDiapositivasFilesPath\\copiarYMover\\pruebaCopia.txt");
			Files.createFile(pathSource);
			Path target = Files.copy(pathSource, destPath1, StandardCopyOption.REPLACE_EXISTING);
			System.out.println(target.getFileName());
			
			Path origen = Paths.get("C:\\Users\\helena.martinez.duro\\OneDrive - Accenture\\Documents\\CursoWK\\ProyectoTerceraSemana\\src\\ejericiciosDiapositivasFilesPath\\copiarYMover\\prueba.txt");
			Path destino = Paths.get("..\\pruebaMovida.txt");
			Files.move(origen, destino, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
