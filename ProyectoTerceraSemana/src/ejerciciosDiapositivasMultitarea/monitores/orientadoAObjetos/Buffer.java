package ejerciciosDiapositivasMultitarea.monitores.orientadoAObjetos;

public class Buffer {
	
	private static boolean disponibleRecoger;
	private static int numero;
	
	public Buffer() {
		setDisponibleRecoger(false);
	}
	
	public synchronized void setNumero(int numero) {
		while (isDisponibleRecoger()) {
			System.out.println("Esperando espacio...");
			try {
				this.wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		this.numero = numero;
		setDisponibleRecoger(true);
		this.notifyAll();
	}
	
	public synchronized int getNumero() {
		while (!isDisponibleRecoger()) {
			System.out.println("Esperando numero...");
			try {
				this.wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		setDisponibleRecoger(false);
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
		
		this.notifyAll();
		return this.numero;
	}

	public synchronized boolean isDisponibleRecoger() {
		return disponibleRecoger;
	}

	public synchronized void setDisponibleRecoger(boolean disponible) {
		this.disponibleRecoger = disponible;
	}
	
}
