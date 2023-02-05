package es.rf.tienda.dominio;

import java.time.LocalDate;

/**
 * Nombre		Usuario
 * Descripcion	Caracteristicas de un usuario
 * @author 		Helena Martinez
 * @version		5 de febrero de 2023
 */
public class Usuario {
	
	/**
	 * Id del usuario. Autoincremental.
	 */
	private int id_usuario;
	
	/**
	 * Nombre de usuario. Alfanumerico entre 5 y 100 caracteres. Requerido.
	 */
	private String user_nombre;
	
	/**
	 * Email del usuario. Alfanumerico entre 6 y 100 caracteres. Requerido.
	 */
	private String user_email;
	
	/**
	 * Contrasenia del usuario. Hidden. Entre 8 y 20 caracteres. Debe contener minimo 1 numero, 
	 * 1 letra y 1 carácter especial. Requerido.
	 */
	private String user_pass;
	
	/**
	 * Tipo de usuario. Valor numerico. Requerido.
	 */
	private int user_tipo;
	
	/**
	 * DNI del usuario. Alfanumerico de 12 caracteres. null por defecto. Opcional.
	 */
	private String user_dni;
	
	/**
	 * Fecha de alta del usuario. Null por defecto. Opcional.
	 */
	private LocalDate user_fecAlta;
	
	/**
	 * Fecha de confirmacion del usuario. Null por defecto. Opcional.
	 */
	private LocalDate user_fecConfirmacion;

	
	
	public int getId_usuario() {
		return id_usuario;
	}

	
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	
	public String getUser_nombre() {
		return user_nombre;
	}

	
	public void setUser_nombre(String user_nombre) {
		this.user_nombre = user_nombre;
	}

	
	public String getUser_email() {
		return user_email;
	}

	
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	
	public String getUser_pass() {
		return user_pass;
	}

	
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	
	public int getUser_tipo() {
		return user_tipo;
	}

	
	public void setUser_tipo(int user_tipo) {
		this.user_tipo = user_tipo;
	}

	
	public String getUser_dni() {
		return user_dni;
	}

	
	public void setUser_dni(String user_dni) {
		this.user_dni = user_dni;
	}

	public LocalDate getUser_fecAlta() {
		return user_fecAlta;
	}

	
	public void setUser_fecAlta(LocalDate user_fecAlta) {
		this.user_fecAlta = user_fecAlta;
	}
	

	public LocalDate getUser_fecConfirmacion() {
		return user_fecConfirmacion;
	}

	
	public void setUser_fecConfirmacion(LocalDate user_fecConfirmacion) {
		this.user_fecConfirmacion = user_fecConfirmacion;
	}
}
