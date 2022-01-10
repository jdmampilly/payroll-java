package exception;

public class DataNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -8236324227560165645L;
	
	public DataNotFoundException (String message) {
		super(message);
	}

}
