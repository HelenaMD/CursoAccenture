package ejerciciosDiapositivasComunicaciones.comunicacionURLs;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class ConexionURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://recursosformacion.com/wordpress");
			HttpsURLConnection huc = (HttpsURLConnection)url.openConnection();
			huc.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0");
			for (int i = 1; i <= 8; i++) {
				System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
			}
			huc.disconnect();
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
