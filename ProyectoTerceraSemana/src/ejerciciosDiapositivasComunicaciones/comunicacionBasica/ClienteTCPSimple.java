package ejerciciosDiapositivasComunicaciones.comunicacionBasica;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class ClienteTCPSimple {
	
	public static final int PUERTO = 6000;
	public static final String DIRECCION = "localhost";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Conectando a " + DIRECCION + " por puerto " + PUERTO);
			Socket client = new Socket(DIRECCION, PUERTO);
			System.out.println("Conectado a " + client.getRemoteSocketAddress());
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			out.writeUTF("Saluditos desde " + client.getLocalSocketAddress());
			DataInputStream in = new DataInputStream(client.getInputStream());
			System.out.println("Me han contestado:\n" + in.readUTF());
			client.close();
		} catch (SocketTimeoutException ste) {
			System.out.println("Socket timed out!!");
			ste.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
