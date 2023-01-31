package ejerciciosDiapositivasMultitarea.threads;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Mensaje m1 = new Mensaje();
			Mensaje m2 = new Mensaje();
			
			m1.setMensaje("Este mensaje es desde 1");
			m2.setMensaje("Este mensaje es desde 2");
			
			m1.start();
			m2.start();
			
			//showMessageDialog(null, "This is even shorter");
			Thread.sleep(5000);
			m2.setMensaje("****************************");
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
