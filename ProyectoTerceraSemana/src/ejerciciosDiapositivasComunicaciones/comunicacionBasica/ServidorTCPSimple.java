package ejerciciosDiapositivasComunicaciones.comunicacionBasica;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class ServidorTCPSimple {
	
	public static final String SALUDO = "Servidor esperando en puerto ";
	public static final int TIMEOUT = 10000;
	public static final int PUERTO = 6000;
	
	private static ServerSocket serverSocket;
	
	static {
		try {
			serverSocket = new ServerSocket(PUERTO);
			serverSocket.setSoTimeout(TIMEOUT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			try {
				System.out.println(SALUDO + serverSocket.getLocalPort() + "...");
				Socket server = serverSocket.accept();
				System.out.println("Conexion desde " + server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("Gracias por conectarte a " + server.getLocalSocketAddress() + "\nAdios!!");
				server.close();
				break;
			} catch (SocketTimeoutException ste) {
				System.out.println("Socket timed out!!");
				ste.printStackTrace();
				break;
			} catch (IOException ioe) {
				ioe.printStackTrace();
				break;
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
		
	}

}
