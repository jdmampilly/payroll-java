package exception;

public class NoResultException extends RuntimeException {
	private static final long serialVersionUID = -3938261979463125859L;
	public NoResultException (String message) {
		super(message);
	}

}
