package clasesFiltros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase que contiene filtros para usar en nuestros programas
 * @author helena.martinez.duro
 */
public class Filtro {
	
	/**
	 * Metodo que comprueba si un String tiene un numero de caracteres dentro de un 
	 * rango especifico que se le pasa por parametros
	 * @param str String
	 * @param caracterMin int
	 * @param caracterMax int
	 * @return boolean
	 */
	public static boolean filtroString(String str, int caracterMin, int caracterMax) {
		if (str != null) {
			if (str.length() >= caracterMin && str.length() <= caracterMax) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Metodo que calcula si una fecha recibida por parametros se encuentra entre 3
	 * y 5 anios en el futuro comparando los anios de la fecha actual y la recibida.
	 * @param fechaCaducidad LocalDate
	 * @return boolean
	 */
	public static boolean filtroFechaCaducidad(LocalDate fechaCaducidad) {
		if (fechaCaducidad != null) {
			int anioActual = LocalDate.now().getYear();
			if ((fechaCaducidad.getYear() - anioActual) >= 3 && (fechaCaducidad.getYear() - anioActual) <= 5) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Metodo que utiliza el metodo filtroString() pero indicandole un limite prefijado
	 * @param nombreTitular String
	 * @return boolean
	 */
	public static boolean filtroNombreTitular(String nombreTitular) {
		return filtroString(nombreTitular, 20, 30);
	}
	
	/**
	 * Metodo que utiliza el metodo filtroString() pero indicandole un limite prefijado
	 * @param nombreTitular String
	 * @return boolean
	 */
	public static boolean filtroConceptoMovimiento(String concepto) {
		return filtroString(concepto, 10, 100);
	}
	
	/**
	 * Metodo que recibe una fecha y la devuelve en formato por defecto de
	 * "dd-MM-yyyy"
	 * @param fecha String
	 * @return
	 */
	public static LocalDate fechaCorrecta(String fecha) {
		//No he sido capaz de guardar los dos patrones en el mismo formatter
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//Por eso mismo he tenido que hacer dos comprobaciones distintas para
		// cada formato
		if (fecha.matches("[0-9]{2}-[0-9]{2}-[0-9]{4}")) {
			return LocalDate.parse(fecha, format1);
		} else if (fecha.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")){
			return LocalDate.parse(fecha, format2);
		} else {
			throw new IllegalArgumentException("La fecha que has pasado no esta bien escrita");
		}
	}
	
	
	/**
	 * Metodo que recibe una fecha en String junto con un patron de fecha
	 * y devuelve un LocalDate con la fecha formada
	 * @param fecha
	 * @param patron
	 * @return
	 */
	public static LocalDate fechaCorrecta(String fecha, String patron) {
		/*No hay forma de extraer un regexp de un patron que no conozco
		 * y no puedo hacer un matches() porque el patron de fecha no es un regexp
		 * y daria error.
		 * No tengo forma de comprobar si la fecha que pasa el usuario se ajusta
		 * al patron
		 * Y si hay forma, no la veo ahora.
		 * La idea es controlar el DateTimeParseException que puede dar desde un trycatch*/
		DateTimeFormatter format = DateTimeFormatter.ofPattern(patron);
		
		return LocalDate.parse(fecha, format);
	}
}
