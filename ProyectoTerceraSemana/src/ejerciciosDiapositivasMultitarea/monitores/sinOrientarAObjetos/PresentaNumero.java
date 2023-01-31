package ejerciciosDiapositivasMultitarea.monitores.sinOrientarAObjetos;

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
			synchronized (buf) {
				while (!buf.isDisponibleRecoger()) {
					//System.out.println("Esperando numero...");
					try {
						buf.wait();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
				System.out.println(buf.getNumero());
				buf.setDisponibleRecoger(false);
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
