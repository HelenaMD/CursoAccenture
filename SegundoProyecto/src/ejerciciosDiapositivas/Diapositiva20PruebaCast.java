package ejerciciosDiapositivas;

public class Diapositiva20PruebaCast {

	/**
	 * Metodo Main para ejecutar el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int variable1 = 64;
		char cVariable1;
		float fVariable1;
		double dVariable1;
		short sVariable1;
		byte bVariable1;
		
		//Hace falta un casteo y se pierde info, ya no ves el numero sino su caracter.
		cVariable1 = (char)variable1;
		System.out.println(cVariable1);
		
		//Implicito, no se pierde info
		fVariable1 = variable1;
		System.out.println(fVariable1);
		
		//Implicito, no se pierde info
		dVariable1 = variable1;
		System.out.println(dVariable1);
		
		//Casteo necesario, no se pierde info si hay suficiente memoria
		sVariable1 = (short)variable1;
		System.out.println(sVariable1);
		
		//Casteo necesario, no se pierde info si hay suficiente memoria
		bVariable1 = (byte)variable1;
		System.out.println(bVariable1);
		
		
	}

}
