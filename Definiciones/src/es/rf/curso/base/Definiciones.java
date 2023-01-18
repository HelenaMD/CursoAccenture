package es.rf.curso.base;

/**
 * @author helena.martinez.duro
 * Prueba de como definir variables
 */
public class Definiciones {
	
	private static boolean seguro = false;
	private static int importe = 0;
	private static double cantidad = 1;
	private static String descripcion = "\"Hola \n Mundo\"";
	private String valor;
	
	
	
	public Definiciones(String valor) {
		//super();
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * Metodo que muestra por consola
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.format("%s\n", descripcion);
		int separador = 123;
		System.out.format("%d\n", separador);
	}
	
	public static void valores() {
		importe = 123;
		cantidad = 500;
		char separador = '/';
	}

}
