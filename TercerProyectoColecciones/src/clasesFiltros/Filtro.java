package clasesFiltros;

import java.time.LocalDate;

public class Filtro {
	
	public static boolean filtroString(String str, int caracterMin, int caracterMax) {
		if (str.length() >= caracterMin && str.length() <= caracterMax) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean filtroFechaCaducidad(LocalDate fechaCaducidad) {
		int anioActual = LocalDate.now().getYear();
		if ((fechaCaducidad.getYear() - anioActual) >= 3 && (fechaCaducidad.getYear() - anioActual) <= 5) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean filtroNombreTitular(String nombreTitular) {
		return filtroString(nombreTitular, 20, 30);
	}
	
	public static boolean filtroConceptoMovimiento(String concepto) {
		return filtroString(concepto, 10, 100);
	}
}
