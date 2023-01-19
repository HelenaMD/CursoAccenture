package ejerciciosJava3DatosVariablesYConstantes;

public class Ejercicio1 {
	
	/**
	 * Atributos que pide el ejercicio
	 */
	//Aunque sean private son visibles en los metodos de esta clase, que es lo que pide el ejercicio.
	private int dia = 10;
	private int nDni = 57433222;
	private double precio = 135.12;
	private final boolean ACTIVO = true;
	
	/**
	 * Metodo que muestra por consola los atributos de esta clase
	 */
	public void mostrarPorConsola() {
		System.out.println("Dia\t" + dia);
		System.out.println("Dni\t" + nDni);
		System.out.println("Precio\t" + precio);
		System.out.println("Activo?\t" + ACTIVO);
	}

	/**
	 * Metodo Main para ejecutar el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Esto es lo que tenia en la primera parte del ejercicio.
		/*int dia = 10;
		int nDni = 57433222;
		double precio = 135.12;
		final boolean ACTIVO = true;*/
		
		//Creo un objeto de esta clase y llamo al método.
		Ejercicio1 d = new Ejercicio1();
		d.mostrarPorConsola();
	}

}
