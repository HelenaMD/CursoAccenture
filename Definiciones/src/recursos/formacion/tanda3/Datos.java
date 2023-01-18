package recursos.formacion.tanda3;

public class Datos {
	
	//Aunque sean private son visibles en los metodos de esta clase, que es lo que pide el ejercicio.
	private int dia = 10;
	private int nDni = 57433222;
	private double precio = 135.12;
	private final boolean ACTIVO = true;
	
	public void mostrarPorConsola() {
		System.out.println("Dia\t" + dia);
		System.out.println("Dni\t" + nDni);
		System.out.println("Precio\t" + precio);
		System.out.println("Activo?\t" + ACTIVO);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Esto es lo que tenia en la primera parte del ejercicio.
		/*int dia = 10;
		int nDni = 57433222;
		double precio = 135.12;
		final boolean ACTIVO = true;*/
		
		Datos d = new Datos();
		d.mostrarPorConsola();
	}

}
