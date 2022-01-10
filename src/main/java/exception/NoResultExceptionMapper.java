package exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import model.ErrorMessage;

public class NoResultExceptionMapper implements ExceptionMapper<NoResultException> {

	@Override
	public Response toResponse(NoResultException ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(),404,"http://payroll/documentation.htm");
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}
}
