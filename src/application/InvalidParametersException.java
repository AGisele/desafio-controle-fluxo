package application;

public class InvalidParametersException extends Exception{

	private static final long serialVersionUID = 1L;

	public InvalidParametersException(String message) {
		super(message);
	}
}
