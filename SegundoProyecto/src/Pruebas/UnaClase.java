package Pruebas;

//Parte de mi clase para experimentar
public class UnaClase {
	
	private String nombre;
	private int edad;
	private boolean mayorDeEdad;
	
	public UnaClase(String nombre, int edad, boolean mayorDeEdad) {
		this.nombre = nombre;
		this.edad = edad;
		this.mayorDeEdad = mayorDeEdad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isMayorDeEdad() {
		return mayorDeEdad;
	}

	public void setMayorDeEdad(boolean mayorDeEdad) {
		this.mayorDeEdad = mayorDeEdad;
	}

	@Override
	public String toString() {
		return "UnaClase [nombre=" + nombre + ", edad=" + edad + ", mayorDeEdad=" + mayorDeEdad + "]";
	}
	
	
}
