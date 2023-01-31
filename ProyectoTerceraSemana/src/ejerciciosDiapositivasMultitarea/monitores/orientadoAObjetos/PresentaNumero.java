package ejerciciosDiapositivasMultitarea.monitores.orientadoAObjetos;

import java.util.Random;

public class PresentaNumero implements Runnable {

	private Buffer buf;
	
	public void setBuffer(Buffer buf) {
		this.buf = buf;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(buf.getNumero());
		}
	}

}
