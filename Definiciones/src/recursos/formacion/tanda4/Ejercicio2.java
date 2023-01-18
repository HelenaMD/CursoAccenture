package recursos.formacion.tanda4;

public class Ejercicio2 {
	
	private static final double IVA = 21;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad;
		int unidades;
		double precio;
		double importe; //cantidad * unidades * precio
		int total;
		double ivaCalculado;
		
		cantidad = 3;
		unidades = 12;
		precio = 5.4;
		
		importe = (cantidad * unidades) * precio;
		ivaCalculado = importe * (IVA/100);
		total = (int)(importe + ivaCalculado);
		
		System.out.println("Cantidad =\t" + cantidad);	
		System.out.println("Unidades =\t" + unidades);	
		System.out.println("Precio =\t" + precio);
		System.out.println("Importe =\t" + importe);	
		System.out.println("Iva =\t" + ivaCalculado);	
		System.out.println("Total =\t" + total);	
		System.out.println("Deberia ser =\t" + (importe + ivaCalculado));	
		
	}

}
