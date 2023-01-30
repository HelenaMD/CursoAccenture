package ejerciciosDiapositivasPath.pathMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PathMethodsMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			
			Stream ficheros = Files.walk(Paths.get("C:\\Users\\helena.martinez.duro\\OneDrive - Accenture\\Documents\\CursoAccenture\\TercerProyectoColecciones"));
			List<Path> arrayPaths = new ArrayList<Path>();
			
			//El Stream me devuelve el List ya formado, y simplemente le asignamos la variable, por eso hay que hacer Cast
			arrayPaths = (List<Path>)ficheros.filter(f -> f.toString().contains(".java")).collect(Collectors.toList());
			
			for (Path p : arrayPaths) {
				/*System.out.println("Fichero ------------------------");
				System.out.println(p.getFileName());
				System.out.println(p.getName(0));
				System.out.println(p.getName(1));
				System.out.println(p.getNameCount());
				System.out.println(p.getRoot());*/
				System.out.println(p.toString());
			}
			
			/*Stream ficheros = Files.walk(Paths.get("C:\\Users\\helena.martinez.duro\\OneDrive - Accenture\\Documents\\CursoAccenture\\TercerProyectoColecciones"));
			ficheros.filter(f -> f.toString().contains(".java")).forEach(System.out::println);*/
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
