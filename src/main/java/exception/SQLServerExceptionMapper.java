package exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import model.ErrorMessage;
@Provider
public class SQLServerExceptionMapper implements  ExceptionMapper<SQLServerException>{

	@Override
	public Response toResponse(SQLServerException ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(),500,"http://payroll/documentation.htm");
		ex.printStackTrace();
		return Response.status(Status.CONFLICT)
				.entity(errorMessage)
				.build();
	}

}
