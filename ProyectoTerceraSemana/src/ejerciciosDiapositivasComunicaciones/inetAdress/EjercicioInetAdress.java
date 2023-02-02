package ejerciciosDiapositivasComunicaciones.inetAdress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class EjercicioInetAdress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub UnknownHostException
		try {
			InetAddress ip = InetAddress.getByName("recursosformacion.com");
			InetAddress ipMio = InetAddress.getLocalHost();
			
			System.out.println("Host name: " + ip.getHostName());
			System.out.println("IP Address: " + ip.getHostAddress());
			
			System.out.println("Host name local: " + ipMio.getHostName());
			System.out.println("IP Address local: " + ipMio.getHostAddress());
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
