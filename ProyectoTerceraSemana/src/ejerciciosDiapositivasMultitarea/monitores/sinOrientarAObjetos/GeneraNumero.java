package ejerciciosDiapositivasMultitarea.monitores.sinOrientarAObjetos;

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
			synchronized (buf) {
				while (buf.isDisponibleRecoger()) {
					//System.out.println("Esperando espacio...");
					try {
						buf.wait();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
				buf.setNumero(num.nextInt(1000));
				buf.setDisponibleRecoger(true);
				/*try {
					Thread.sleep(500);
					System.out.print(".");
					Thread.sleep(500);
					System.out.print(".");
					Thread.sleep(500);
					System.out.print(".\n");
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				buf.notifyAll();
			}
		}
	}

}
