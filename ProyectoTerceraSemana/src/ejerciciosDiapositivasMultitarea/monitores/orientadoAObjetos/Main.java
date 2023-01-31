package ejerciciosDiapositivasMultitarea.monitores.orientadoAObjetos;

import ejerciciosDiapositivasMultitarea.sincronizacion.Sincro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffer buf = new Buffer();
		GeneraNumero g1 = new GeneraNumero();
		PresentaNumero p1 = new PresentaNumero();
		
		g1.setBuffer(buf);
		p1.setBuffer(buf);
		
		Thread thr1 = new Thread(g1);
		Thread thr2 = new Thread(p1);
		
		thr1.start();
		thr2.start();
	}

}
