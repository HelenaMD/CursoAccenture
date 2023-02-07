package util;

@SuppressWarnings("serial")
public class DomainException extends Exception {
	
	//Constructores por defecto
	public DomainException() {};

	public DomainException(String message) {
		super(message);
	}
}
