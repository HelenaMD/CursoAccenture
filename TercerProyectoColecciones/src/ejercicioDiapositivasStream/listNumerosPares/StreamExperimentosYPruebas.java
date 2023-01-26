package ejercicioDiapositivasStream.listNumerosPares;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import clasesFiltros.Filtro;

public class StreamExperimentosYPruebas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Creando desde Colecciones hacia arrays de objetos
		List<Integer> listaNumeros = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		Integer[] numerosPares = listaNumeros.stream()
				.filter(i -> i%2 == 0)
				.toArray(Integer[]::new);
		
		//Desde colecciones hacia otra coleccion
		listaNumeros = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		List<Integer> numerosPares3 = listaNumeros.stream()
				.filter(i -> i%2 == 0)
				.collect(Collectors.toList());
		
		//Creando desde y hacia arrays de tipos primitivos
		int[] listaNumeros2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] numerosPares2 = Arrays.stream(listaNumeros2)
				.filter(i -> i%2 == 0)
				.toArray();
		
		//Mostrando desde arrays primitivos y de objetos
		Arrays.stream(numerosPares).forEach(System.out::println);
		Arrays.stream(numerosPares2).forEach(System.out::println);
		
		//Mostrando desde colecciones
		numerosPares3.stream().forEach(System.out::println);
		
		System.out.println("------------------------");
		
		//Ver diapositiva de iterate
		Stream.iterate(0, n -> n + 1).limit(10).forEach(x -> System.out.println(x));
		
		Random rand = new Random();
		
		System.out.println("------------------------");
		
		//Ver diapositiva de generate
		Stream.generate(() -> rand.nextInt(100)).limit(20).forEach(System.out::println);
		
		//Ejemplo de stream con ficheros
		/*Stream ficheros = Files.walk(Paths.get("C:\\Users\\helena.martinez.duro\\OneDrive - Accenture\\Documents\\CursoAccenture\\TercerProyectoColecciones"));
		ficheros.filter(f -> f.toString().contains(".java")).forEach(System.out::println);*/
		
		/*DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yy");
		
		LocalDate fechita = LocalDate.parse("23/01/24", format);

		//DateTimeParseException
		System.out.println(fechita.format(format));
		
		System.out.println(Filtro.fechaCorrecta("23-11-2025"));
		System.out.println(Filtro.fechaCorrecta("23/11/2025"));
		System.out.println(Filtro.fechaCorrecta("23 11 2025"));*/
	}

}
