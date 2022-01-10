package exception;

public class SQLServerException  extends RuntimeException{

	private static final long serialVersionUID = 1481958093729195954L;
	public SQLServerException (String message) {
		super(message);
	}

}
