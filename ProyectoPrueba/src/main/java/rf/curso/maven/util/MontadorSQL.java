package rf.curso.maven.util;

public class MontadorSQL {
	
	public static String addSalida(String salida, String nombreCampo, 
			int valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, String.valueOf(valor), separador);
	}
	
	public static String addSalida(String salida, String nombreCampo, 
			double valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, String.valueOf(valor), separador);
	}
	
	public static String addSalida(String salida, String nombreCampo, 
			long valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, String.valueOf(valor), separador);
	}
	
	public static String addSalida(String salida, String nombreCampo, 
			String valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, "'"+valor+"'", separador);
	}
	
	public static String addSalidaSencilla(String salida, String nombreCampo, 
			String valor, String separador) {
		String res = salida;
		boolean sinCampo = false;
		if (salida.length() > 0) {
			res += " " + separador + " ";
		}
		
		if (nombreCampo != null && nombreCampo.length() > 0) {
			res += nombreCampo;
		} else {
			sinCampo = true;
		}
		
		if (valor != null && valor.replaceAll("'", "").length() > 0) {
			if (sinCampo) {
				res += valor;
			} else {
				res += " = " + valor;
			}
		}
		
		return res;
	}
	
}
