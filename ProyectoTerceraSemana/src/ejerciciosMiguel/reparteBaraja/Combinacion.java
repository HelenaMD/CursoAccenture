package ejerciciosMiguel.reparteBaraja;

public class Combinacion {
	
	private String nombreCombinacion;
	//+ alto = + prioridad, min 0 max 8
	private int prioridad;
	
	public Combinacion(String nombreCombinacion, int prioridad) {
		setNombreCombinacion(nombreCombinacion);
		setPrioridad(prioridad);
	}
	
	public Combinacion(Combinacion c) {
		setNombreCombinacion(c.getNombreCombinacion());
		setPrioridad(c.getPrioridad());
	}
	
	public String getNombreCombinacion() {
		return nombreCombinacion;
	}
	public void setNombreCombinacion(String nombreCombinacion) {
		if (nombreCombinacion != null) {
			this.nombreCombinacion = nombreCombinacion;
		} else {
			throw new IllegalArgumentException("El nombre de la combinacion no puede ser nulo.");
		}
		
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		if (prioridad > 0 && prioridad < 9) {
			this.prioridad = prioridad;
		} else {
			this.prioridad = 0;
		}
	}
}
