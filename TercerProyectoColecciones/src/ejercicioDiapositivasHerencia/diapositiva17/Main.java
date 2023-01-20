package ejercicioDiapositivasHerencia.diapositiva17;

public class Main {

	/**
	 * MEtodo main para ejecutar el programa
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo clientes base con y sin datos
		Cliente clienteBase1 = new Cliente();
		Cliente clienteBase2 = new Cliente("Alvaro", "C/ Pepa Flores");
		
		//Creo clientes nacionales con y sin datos
		ClienteNacional clienteNacional1 = new ClienteNacional();
		ClienteNacional clienteNacional2 = new ClienteNacional("Maria", "C/ Trinidad", "12345678J");
		
		//Aquí solo puedo crear cliente exportacion con datos, ya que no he creado constructor vacio. Si descomento la linea de abajo da error.
		//EjercicioDiapositiva17ClienteExportacion clienteExportacion1 = new EjercicioDiapositiva17ClienteExportacion();
		Cliente clienteExportacion2 = new ClienteExportacion("Pedro Smith", "C/ Bridgerton", "VAT0011233", "pedro@accenture.com");
		
		//Muestro los datos que contienen las instancias por consola
		System.out.println(clienteBase1.toString());
		System.out.println(clienteBase2.toString());
		System.out.println(clienteNacional1.toString());
		System.out.println(clienteNacional2.toString());
		System.out.println(clienteExportacion2.toString());
	}

}
