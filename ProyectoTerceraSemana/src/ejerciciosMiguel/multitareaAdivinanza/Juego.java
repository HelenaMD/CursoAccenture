package ejerciciosMiguel.multitareaAdivinanza;

import java.util.Random;

public class Juego {

	private Random r;
	private static int numeroAAdivinarMaq;
	//private int numeroIntroducido;
	private boolean turnoUsuario;
	
	private boolean finPartida;
	
	static {
	}
	
	public Juego() {
		this.r = new Random();
		setNumeroAAdivinarMaq(r.nextInt(20));
		setTurnoUsuario(true);
	}

	public static int getNumeroAAdivinarMaq() {
		return numeroAAdivinarMaq;
	}

	public static void setNumeroAAdivinarMaq(int numeroAAdivinar) {
		Juego.numeroAAdivinarMaq = numeroAAdivinar;
	}
	
	public boolean isTurnoUsuario() {
		return turnoUsuario;
	}

	public void setTurnoUsuario(boolean turnoUsuario) {
		this.turnoUsuario = turnoUsuario;
	}
	
	//EMpecé con una idea en la cabeza pero me he liado y he estado pensando con esquemas
	// pero no me aclaro
	public synchronized void turno(int numero) {
		String ret = "";
		while (isTurnoUsuario()) {
			System.out.println("Esperando turno...");
			try {
				this.wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		if (getNumeroAAdivinarMaq() > numero) {
			ret = "menor";
		} else if (getNumeroAAdivinarMaq() < numero) {
			ret = "mayor";
		} else {
			ret = "acierto";
		}
		//setTurnoUsuario(true);
		//this.notifyAll();
		
	}
	
	public synchronized void finalizaPartida(String estado) {
		if (estado.equalsIgnoreCase("acierto")) {
			
		}
	}
	
}
