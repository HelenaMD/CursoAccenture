package ejercicioDiapositivasHerencia.diapositiva19;

public class Main {

	/**
	 * Metodo que ejecuta el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo un array para la composicion del aire de uno de los productos
		int composicionAire[] = {20, 30, 12, 8};
		
		//Creo los productos para probarlos
		ProductoFresco prodFresco1 = new ProductoFresco("20/01/2025", 1234, "20/01/2023", "Espana");
		ProductoRefrigerado prodRefri1 = new ProductoRefrigerado("20/02/2023", 1234, 9988);
		ProductoCongeladoAire prodCongAire1 = new ProductoCongeladoAire("20/12/2024", 1234, -8, composicionAire);
		ProductoCongeladoAgua prodCongAgua1 = new ProductoCongeladoAgua("20/02/2026", 1234, -10, 20);
		ProductoCongeladoNitrogeno prodCongNitrogeno1 = new ProductoCongeladoNitrogeno("20/01/2024", 1234, -35, "Vertido", 2);
		
		//Muestro los datos de las instancias por consola
		System.out.println(prodFresco1.toString());
		System.out.println(prodRefri1.toString());
		System.out.println(prodCongAire1.toString());
		System.out.println(prodCongAgua1.toString());
		System.out.println(prodCongNitrogeno1.toString());
	}

}
