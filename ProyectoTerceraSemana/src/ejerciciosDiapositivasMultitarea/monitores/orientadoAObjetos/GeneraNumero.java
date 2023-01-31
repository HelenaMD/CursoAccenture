package ejerciciosDiapositivasMultitarea.monitores.orientadoAObjetos;

import java.util.Random;

public class GeneraNumero implements Runnable {

	private Random num;
	private Buffer buf;
	
	public GeneraNumero() {
		num = new Random();
	}
	
	public void setBuffer(Buffer buf) {
		this.buf = buf;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			buf.setNumero(num.nextInt(1000));
		}
	}

}
