package clasesFiltros;

import java.time.LocalDate;

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
}
