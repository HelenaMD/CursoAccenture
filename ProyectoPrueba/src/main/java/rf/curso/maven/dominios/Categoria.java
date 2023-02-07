package rf.curso.maven.dominios;

import rf.curso.maven.exception.DomainException;
import rf.curso.maven.util.Validator;

/**
 * 
 * Nombre		Categoria
 * Descripcion	Lista de categorías
 * @author 		Helena Martinez
 * @version		2 de febrero de 2023
 *
 */
public class Categoria {
	
	//Si es autonumerico como pone en el excel tiene que ser static para poder
	// hacerlo autoincremental
	/**
	 * Id de la categoria. Autoincremental.
	 */
	private static int id_categoria;
	
	/**
	 * Nombre de la categoria. Alfanumerico entre 5 y 50 caracteres. Requerido.
	 */
	private String cat_nombre;
	
	/**
	 * Descripcion de la categoria. Alfanumerico hasta 200 caracteres. Opcional.
	 */
	private String cat_descripcion;
	
	static {
		id_categoria = 0;
	}
	
	/**
	 * Constructor principal
	 * @param catNombre
	 * @param catDescripcion
	 * @throws DomainException
	 */
	public Categoria(String catNombre, String catDescripcion) throws DomainException {
		id_categoria++;
		setCat_nombre(catNombre);
		setCat_descripcion(catDescripcion);
	}
	
	/**
	 * Segundo constructor
	 * @param catNombre
	 * @throws DomainException
	 */
	public Categoria(String catNombre) throws DomainException {
		id_categoria++;
		setCat_nombre(catNombre);
		setCat_descripcion(null);
	}
	
	/**
	 * Constructor vacio
	 * @param catNombre
	 * @throws DomainException
	 */
	public Categoria() throws DomainException {
		id_categoria++;
		setCat_nombre("Por Defecto");
		setCat_descripcion(null);
	}
	
	public boolean isValid(){	
		return !Validator.isVacio(cat_nombre) &&
				id_categoria > 0;
	}
	
	/**
	 * Getter para identificador de categoria
	 * @return Integer con el id de la categoria
	 */
	public int getId_categoria() {
		return id_categoria;
	}
	
	/**
	 * Setter para identificador de categoria
	 * 
	 */
	/*public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}*/
	
	/**
	 * Getter para el nombre de categoria
	 * @return cadena con el nombre de la categoria
	 */
	public String getCat_nombre() {
		return cat_nombre;
	}
	
	/**
	 * Setter para el nombre de categoria
	 * @throws DomainException 
	 * 
	 */
	public void setCat_nombre(String cat_nombre) throws DomainException {
		if (Validator.cumpleLongitud(cat_nombre, 5, 50) && Validator.isAlfanumeric(cat_nombre)) {
			this.cat_nombre = cat_nombre;
		} else {
			throw new DomainException("El nombre de la categoria debe ser alfanumerico y tener entre "
					+ "5 y 50 caracteres.");
		}
	}
	
	/**
	 * Getter para la descripcion de categoria
	 * @return cadena con la descripcion de la categoria
	 */
	public String getCat_descripcion() {
		return cat_descripcion;
	}
	
	/**
	 * setter para la descripcion de categoria
	 * @throws DomainException 
	 * 
	 */
	public void setCat_descripcion(String cat_descripcion) throws DomainException {
		if (Validator.cumpleLongitudMax(cat_descripcion, 200) && Validator.isAlfanumeric(cat_descripcion)) {
			this.cat_descripcion = cat_descripcion;
		} else if (cat_descripcion == null) {
			this.cat_descripcion = null;
		} else {
			throw new DomainException("La descripcion de la categoria debe ser alfanumerica y no puede "
					+ "superar los 200 caracteres.");
		}
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cat_descripcion == null) ? 0 : cat_descripcion.hashCode());
		result = prime * result + ((cat_nombre == null) ? 0 : cat_nombre.hashCode());
		result = prime * result + id_categoria;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (cat_descripcion == null) {
			if (other.cat_descripcion != null)
				return false;
		} else if (!cat_descripcion.equals(other.cat_descripcion))
			return false;
		if (cat_nombre == null) {
			if (other.cat_nombre != null)
				return false;
		} else if (!cat_nombre.equals(other.cat_nombre))
			return false;
		if (id_categoria != other.id_categoria)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Categoria [id_categoria=" + id_categoria + ", cat_nombre=" + cat_nombre + ", cat_descripcion="
				+ cat_descripcion + "]";
	}
	
	
}
