package resources;

import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dto.EmpLoanSummaryDto;
import entities.Employee;
//import entities.EmployeeLoanSummaryView;
import entities.LeaveTransaction;
import entities.LoanMaster;
import entities.LoanTransaction;
import entities.LoanTransactionView;
import entities.Month;
import entities.MonthEndTransaction;
import entities.OtTable;
import repositories.PayrollRepository;
import services.EmployeeService;
import services.SalaryService;

@Path("v1")
public class PayrollResources {
	public static String X_TOTAL_COUNT = "X-Total-Count";
	@EJB
	PayrollRepository repo;
	@EJB
	SalaryService salServ;
	@EJB
	EmployeeService empServ;

	@GET
	@Path("echo")
	public Response echo() {
		return Response.ok("hello").build();
	}
	@GET
	@Path("/otRates")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getOTRates() throws Exception {
		OtTable ot = repo.getById(OtTable.class, 1);
		return Response.ok(ot).build();
	}
	@GET
	@Path("/employee/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeById(@PathParam("id") int id) throws Exception {
		Employee employee = repo.getById(Employee.class, id);
		return Response.ok(employee).build();
	}

	@GET
	@Path("/test/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getTestById(@PathParam("id") Integer id) {
		return repo.getById(Employee.class, id);
	}

	@GET
	@Path("/employees")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllEmployee() {
		List<Employee> l = repo.getAll(Employee.class);
		return Response.ok(l.toArray(new Employee[l.size()])).build();
	}

	@POST
	@Path("/employee/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Employee entity) {
		repo.save(entity);
		return Response.ok(entity).build();
	}

	@PUT
	@Path("/employee/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(Employee entity) {
		repo.update(entity);
		return Response.ok(entity).build();
	}
// Month end transactions
// All salary list
	@GET
	@Path("/employee/met")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllEmployeeSalaryList() {
		List<MonthEndTransaction> l = salServ.getAllEmployeeSalaryList(MonthEndTransaction.class);
		return Response.ok(l.toArray(new MonthEndTransaction[l.size()])).build();
	}
// Employee salary calculation
	@GET
	@Path("/employee/met/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeSalary(@PathParam("id") int id) {
		MonthEndTransaction m = salServ.getEmployeeSalary(id);
		return Response.ok(m).build();
	}
// Employee salary save	
	@POST
	@Path("/employee/met/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(MonthEndTransaction entity) {
		System.out.println("saving employee month end transactions");
		try {
			salServ.save(entity, entity.getOtherAllowances(), entity.getOtherDeductions());
		} catch (NotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.ok(entity).build();
	}
	
// Leaves
	@GET
	@Path("/leaveTransactions")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllLeaveTrans() {
		List<LeaveTransaction> l = repo.getAll(LeaveTransaction.class);
		return Response.ok(l.toArray(new LeaveTransaction[l.size()])).build();
	}
	@GET
	@Path("/employee/leaves/{empCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeLeaveAllRecords(@PathParam("empCode") String empCode) {
		List<LeaveTransaction> l = repo.getEmployeeLeaveAllRecords(Integer.parseInt(empCode));
		return Response.ok(l.toArray(new LeaveTransaction[l.size()])).build();
	}

	@GET
	@Path("/employee/leaves/{empCode}/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeLeaveRecord(@PathParam("empCode") int empCode, @PathParam("id") int id) {
		LeaveTransaction x = null;
		x = repo.getEmployeeLeaveRecord(empCode, id);
		return Response.ok(x).build();
	}
	
	//to do
//	@POST
//	@Path("/employee/leaves")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response save( entity) {
//		
//	}
// Employee Loans
// All Loan Transactions
	@GET
	@Path("/loanTransactions")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllLoanTrans() {
		List<LoanTransactionView> l = repo.getAll(LoanTransactionView.class);
		return Response.ok(l.toArray(new LoanTransactionView[l.size()])).build();
	}

// all loan transaction for the employee
	@GET
	@Path("/employee/loantransactions/{empCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeLoanAllRecords(@PathParam("empCode") int empCode) {
		List<LoanTransaction> l = repo.getEmployeeLoanAllRecords(empCode);
		return Response.ok(l.toArray(new LoanTransaction[l.size()])).build();
	}

//  employee loan transaction record
	@GET
	@Path("/employee/loans/{empCode}/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeLoanRecord(@PathParam("empCode") int empCode, @PathParam("id") int id) {
		LoanTransaction x = null;
		x = repo.getEmployeeLoanRecord(empCode, id);
		return Response.ok(x).build();
	}
//  employee loan summary in loan master
	@GET
	@Path("/employee/loan/{empCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public LoanMaster getEmployeeLoanBalance(@PathParam("empCode") int empCode) {
		return repo.getByKey(LoanMaster.class,"empCode", empCode);
	}
	@GET
	@Path("/employee/loan/summary/{empCode}")
	public EmpLoanSummaryDto getEmployeeLoanSumary(@PathParam("empCode") int empCode) {
		System.out.println("empCode in loan summary:" + empCode);
		return empServ.calculateEmpLoanInfo(empCode);
		
	}
	
	@POST
	@Path("/employee/loan/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(LoanTransaction entity) {
		repo.save(entity);
		repo.updateLoanMaster(entity.getEmpCode(), entity);
		return Response.ok(entity).build();
	}
	
	//Month
	@GET
	@Path("/month/active")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getActiveSalaryMonth() {
		return Response.ok(repo.getByKey(Month.class, "status", "A")).build();
	}
	
// testing
	@GET
	@Path("/testInt/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getTestByInt(@PathParam("id") int id) {
		return repo.getByKey(Employee.class,"id", id);
	}
	
	@GET
	@Path("/testString/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getTestByString(@PathParam("id") String id) {
		return repo.getByKey(Employee.class,"cprNo", id);
	}
	
//search or filter

	@POST
	@Path("filter/{start}/{maxR}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response fetchByEmployeeFilters(@PathParam("start") int start, @PathParam("maxR") int maxR, String jsonData) {
		return getByFilters(Employee.class, start, maxR, jsonData);

	}
	
	@POST
	@Path("/filterLoanTransactions/{start}/{maxR}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response fetchByLoanTransactionFilters(@PathParam("start") int start, @PathParam("maxR") int maxR, String jsonData) {
		System.out.println("jsonData:" + jsonData);
		return getByFilters(LoanTransactionView.class, start, maxR, jsonData);

	}
	
	@POST
	@Path("/filterLeaveTransactions/{start}/{maxR}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response fetchByLeaveTransactionFilters(@PathParam("start") int start, @PathParam("maxR") int maxR, String jsonData) {
		System.out.println("jsonData:" + jsonData);
		return getByFilters(LeaveTransaction.class, start, maxR, jsonData);

	}


//utility
	private <T> Response getByFilters(Class<T> tClass, int start, int maxR, String jsonData) {

		System.out.println("jsonData:" + jsonData.toString());
		StringReader reader = new StringReader(jsonData);
		JsonReader jsonReader = Json.createReader(reader);
		JsonObject mainJsonObject = jsonReader.readObject();

		JsonObject sortingObject = mainJsonObject.getJsonObject("sorting");

		String sortFieldName = sortingObject.getString("fieldName");
		System.out.println("SortfieldName:" + sortFieldName);
		boolean isASC = sortingObject.getString("Sort").equalsIgnoreCase("ASC");

		JsonArray jsonArray = mainJsonObject.getJsonArray("filter");
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < jsonArray.size(); i++) {
			JsonObject jsonObject = jsonArray.getJsonObject(i);
			map.put(jsonObject.getString("fieldName"), jsonObject.getString("value"));
		}
		List<T> a = repo.<T>getAllRecords(tClass, map, start, maxR, sortFieldName, isASC);
		long l = repo.<T>getSize(tClass, map);
		X_TOTAL_COUNT = String.valueOf(l);
		System.out.println("--------------- received:" + a.size());
		@SuppressWarnings("unchecked")
		T[] array = (T[]) Array.newInstance(tClass, a.size());
		System.out.println("a.toArray(array):" + a.toArray(array));
		return Response.ok(a.toArray(array)).header("Access-Control-Expose-Headers", "*")
				.header("X_TOTAL_COUNT", X_TOTAL_COUNT).build();
	}

}
