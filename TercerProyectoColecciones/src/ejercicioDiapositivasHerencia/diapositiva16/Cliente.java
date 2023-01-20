package ejercicioDiapositivasHerencia.diapositiva16;

import java.util.Date;

/**
 * Clase Cliente que hereda de Persona e implementa Salvable
 * @author helena.martinez.duro
 *
 */
public class Cliente extends Persona implements Salvable {
	
	/**
	 * Atributos de la clase
	 */
	private int numeroCliente;
	private Date fechaAlta;

	/**
	 * Constructor de la clase
	 * @param nombre String
	 * @param direccion String
	 * @param correoElectronico String
	 * @param numCliente int
	 * @param fechaAlta Date
	 */
	public Cliente(String nombre, String direccion, String correoElectronico, int numCliente, Date fechaAlta) {
		super(nombre, direccion, correoElectronico);
		setNumeroCliente(numCliente);
		setFechaAlta(fechaAlta);
	}

	/**
	 * Getter del atributo numeroCliente
	 * @return int
	 */
	public int getNumeroCliente() {
		return numeroCliente;
	}

	/**
	 * Setter del atributo numeroCliente
	 * @param numeroCliente int
	 */
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	/**
	 * Getter del atributo fechaAlta
	 * @return Date
	 */
	public Date getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * Setter del atributo fechaAlta
	 * @param fechaAlta Date
	 */
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	/**
	 * Metodo que devuelve el valor del atributo fechaAlta en formato String
	 * @return String
	 */
	public String verFechaAlta() {
		return getFechaAlta().toString();
	}

	/**
	 * Metodo heredado que se usará para mostrar info (similar a toString)
	 * @return String
	 */
	@Override
	public String aString() {
		// TODO Auto-generated method stub
		return "Nombre del Cliente: " + super.getNombre() + " | Direccion: " + super.getDireccion() + " | Email: " + super.getCorreoElectronico() + " | Numero ID de Cliente: " + getNumeroCliente();
	}

	/**
	 * Metodo implementado que muestra por consola "Salvo Cliente"
	 */
	@Override
	public void salvar() {
		// TODO Auto-generated method stub
		System.out.println("Salvo Cliente");
	}

	/**
	 * Metodo implementado que muestra por consola "Leo Cliente"
	 */
	@Override
	public void leer() {
		// TODO Auto-generated method stub
		System.out.println("Leo Cliente");
	}

}
