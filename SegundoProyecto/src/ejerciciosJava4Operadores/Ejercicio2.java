package ejerciciosJava4Operadores;

public class Ejercicio2 {
	
	/**
	 * Atributo que contiene la constante del porcentaje del IVA
	 */
	private static final double IVA = 21;

	/**
	 * Metodo Main para ejecutar el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables que pide el ejercicio
		int cantidad;
		int unidades;
		double precio;
		double importe; //cantidad * unidades * precio
		int total;
		double ivaCalculado;
		
		//Cargo valores
		cantidad = 3;
		unidades = 12;
		precio = 5.4;
		
		//Calculo operaciones que me pide el ejercicio
		importe = (cantidad * unidades) * precio;
		ivaCalculado = importe * (IVA/100);
		total = (int)(importe + ivaCalculado);
		
		//Lo muestro por consola
		System.out.println("Cantidad =\t" + cantidad);	
		System.out.println("Unidades =\t" + unidades);	
		System.out.println("Precio =\t" + precio);
		System.out.println("Importe =\t" + importe);	
		System.out.println("Iva =\t" + ivaCalculado);	
		System.out.println("Total =\t" + total);	
		System.out.println("Deberia ser =\t" + (importe + ivaCalculado));	
		
	}

}
