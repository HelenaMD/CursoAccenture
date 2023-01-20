package ejercicioDiapositivasHerencia.diapositiva16;

/**
 * Clase Usuario que hereda de la clase Persona e implementa Salvable
 * @author helena.martinez.duro
 *
 */
public class Usuario extends Persona implements Salvable{
	
	/**
	 * Atributos de la clase
	 */
	private int codigoUsuario;

	/**
	 * Constructor de la clase
	 * @param nombre String
	 * @param direccion String
	 * @param correoElectronico String
	 * @param codUsuario int
	 */
	public Usuario(String nombre, String direccion, String correoElectronico, int codUsuario) {
		super(nombre, direccion, correoElectronico);
		// TODO Auto-generated constructor stub
		setCodigoUsuario(codUsuario);
	}
	
	/**
	 * Getter del atributo codigoUsuario
	 * @return int
	 */
	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	/**
	 * Setter del atributo codigoUsuario
	 * @param codigoUsuario int
	 */
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	
	/**
	 * Metodo pedido en el diagrama UML sin especificar funcion
	 * @return boolean true
	 */
	public boolean autorizar() {
		return true;
	}
	
	/**
	 * Metodo pedido en el diagrama UML sin especificar funcion
	 * Sobreescribe el metodo de la clase Persona
	 * @return boolean true
	 */
	@Override
	public boolean crear() {
		return true;
	}

	/**
	 * Metodo heredado que se usará para mostrar info (similar a toString)
	 * @return String
	 */
	@Override
	public String aString() {
		// TODO Auto-generated method stub
		return "Nombre del Usuario: " + super.getNombre() + " | Direccion: " + super.getDireccion() + " | Email: " + super.getCorreoElectronico() + " | Codigo de usuario: " + getCodigoUsuario();
	}

	/**
	 * Metodo implementado que muestra por consola "Salvo Usuario"
	 */
	@Override
	public void salvar() {
		// TODO Auto-generated method stub
		System.out.println("Salvo Usuario");
	}

	/**
	 * Metodo implementado que muestra por consola "Leo Usuario"
	 */
	@Override
	public void leer() {
		// TODO Auto-generated method stub
		System.out.println("Leo Usuario");
	}

}
