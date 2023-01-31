package ejerciciosDiapositivasMultitarea.sincronizacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoSincro s1 = new NoSincro();
		NoSincro s2 = new NoSincro();
		Sincro s3 = new Sincro();
		Sincro s4 = new Sincro();
		
		s1.setMensaje("Desde 1 ->");
		s2.setMensaje("Desde 2 ->");
		
		s3.setMensaje("Desde 1 ->");
		s4.setMensaje("Desde 2 ->");
		
		Thread th1 = new Thread(s1);
		Thread th2 = new Thread(s2);
		Thread th3 = new Thread(s3);
		Thread th4 = new Thread(s4);
		
		th3.start();
		th4.start();
	}

}
