package ejerciciosDiapositivasMultitarea.monitores.sinOrientarAObjetos;

public class Buffer {
	
	private static boolean disponibleRecoger;
	private static int numero;
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}

	public boolean isDisponibleRecoger() {
		return disponibleRecoger;
	}

	public void setDisponibleRecoger(boolean disponible) {
		this.disponibleRecoger = disponible;
	}
	
}
