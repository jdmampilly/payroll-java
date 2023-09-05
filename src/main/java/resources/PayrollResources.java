package resources;

import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import javax.json.JsonValue.ValueType;
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

import dto.EmpBasicAllowances;
import dto.EmpLoanSummaryDto;
import dto.EmpLoanSummaryListDto;
import dto.PayrollSummaryDto;
import entities.CurrentYear;
import entities.Department;
import entities.DepartmentView;
import entities.Division;
import entities.Employee;
import entities.EmployeeView;
import entities.LeaveSummary;
//import entities.EmployeeLoanSummaryView;
import entities.LeaveTransaction;
import entities.LeaveTransactionHistory;
import entities.LeaveTransactionView;
import entities.LoanMaster;
import entities.LoanTransaction;
import entities.LoanTransactionView;
import entities.Month;
import entities.MonthEndAllowance;
import entities.MonthEndDeduction;
import entities.MonthEndTransaction;
import entities.OtTable;
import entities.PayrollSummaryView;
import entities.Reports;
import entities.SalaryBankTransfer;
import entities.SalaryIncrement;
import repositories.LoansRepository;
import repositories.PayrollRepository;
import services.EmployeeService;
import services.PayrollService;
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
	@EJB
	PayrollService payrollServ;
	@EJB
	LoansRepository lrepo;



	@GET
	@Path("echo")
	public Response echo() {
		return Response.ok("hello").build();
	}
	@GET
	@Path("/rates")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getOTRates() throws Exception {
		OtTable ot = repo.getById(OtTable.class, 1);
		return Response.ok(ot).build();
	}

	@GET
	@Path("/department")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllDepartment() {
		List<Department> l = repo.getAllDepartment();
		return Response.ok(l.toArray(new Department[l.size()])).build();
	}

	@GET
	@Path("/departmentView")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllDepartmentView() {
		List<DepartmentView> l = repo.getAll(DepartmentView.class);
		return Response.ok(l.toArray(new DepartmentView[l.size()])).build();
	}

	@GET
	@Path("/departmentByDivision/{divisionCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllDepartmentByDivision(@PathParam("divisionCode") String divisionCode) {
		System.out.println("Division Code:"+ divisionCode);
		List<Department> l = repo.getAllDepartmentByDivision(divisionCode);

		return Response.ok(l.toArray(new Department[l.size()])).build();
	}

	@GET
	@Path("/department/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getdepartmentById(@PathParam("id") String id) throws Exception {
		Department department = repo.getById(Department.class, id);
		return Response.ok(department).build();
	}
	
	@GET
	@Path("/division/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getdivisionById(@PathParam("id") String id) throws Exception {
		Division division = repo.getById(Division.class, id);
		return Response.ok(division).build();
	}

	@GET
	@Path("/employee/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeById(@PathParam("id") int id) throws Exception {
		Employee employee = new Employee();
		try {
			employee = repo.getById(Employee.class, id);
		} catch (Exception e) {
			System.out.println("no employee found for id:" + id);
			e.printStackTrace();
		}
		return Response.ok(employee).build();
	}

	@GET
	@Path("/test/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getTestById(@PathParam("id") Integer id) {
		return repo.getById(Employee.class, id);
	}

	@GET
	@Path("/employee/allowance/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public EmpBasicAllowances getEmployeeEba(@PathParam("id") Integer id) {
		return salServ.getEmpBasicAllowances(id);
	}

	
	@GET
	@Path("/employees")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllEmployee() {
		List<Employee> l = repo.getAll(Employee.class);
//		return Response.ok(l.toArray(new Employee[l.size()])).build();
		long s= repo.<Employee>getSize(Employee.class );
		X_TOTAL_COUNT = String.valueOf(s);
		return Response.ok(l.toArray(new Employee[l.size()]))
		.header("Access-Control-Expose-Headers", "*")
		.header("X_TOTAL_COUNT", X_TOTAL_COUNT).build();
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

//Salary Increment
	@POST
	@Path("/salaryIncrement/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(SalaryIncrement entity) throws Exception {
		System.out.println("Salary increment ..");
		salServ.saveSalaryIncrement(entity);
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

	@GET
	@Path("/employee/mea/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeAllowance(@PathParam("id") int id) {
		System.out.println("get employee allowances");
		List<MonthEndAllowance> l = salServ.getEmployeeMea(id);
		return Response.ok(l.toArray(new MonthEndAllowance[l.size()])).build();
	}
	@GET
	@Path("/employee/med/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeDeduction(@PathParam("id") int id) {
		System.out.println("get employee allowances");
		List<MonthEndDeduction> l = salServ.getEmployeeMed(id);
		return Response.ok(l.toArray(new MonthEndDeduction[l.size()])).build();
	}

// Employee salary save
	@POST
	@Path("/employee/met/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(MonthEndTransaction entity) {
		System.out.println("saving employee month end transactions");
		try {
			System.out.println("other Allowance:" + entity.getOtherAllowances() );
			System.out.println("other Deductions:" + entity.getOtherDeductions() );
			System.out.println("other allowance total:"  + entity.getOtherAllowanceTotal());
			System.out.println("other deduction total:"  + entity.getOtherDeductionTotal());
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
	@GET
	@Path("/salaryFirstRecord")
	@Produces(MediaType.TEXT_PLAIN)
	public int getSalaryFirstRecord() {
		return salServ.getMonthEndTransactionFirstRecord();
	}
	@GET
	@Path("/salaryLastRecord")
	@Produces(MediaType.TEXT_PLAIN)
	public int getSalaryLastRecord() {
		return salServ.getMonthEndTransactionLastRecord();
	}

	@GET
	@Path("/salaryNextRecord/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public int getSalaryNextRecord(@PathParam("id") int id) {
		return salServ.getMonthEndTransactionNextRecord(id);
	}
	
	@GET
	@Path("/salaryPreviousRecord/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public int getSalaryPreviousRecord(@PathParam("id") int id) {
		return salServ.getMonthEndTransactionPreviousRecord(id);
	}

	@GET
	@Path("/salaryList")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSalaryList() {
		List<PayrollSummaryView> l = repo.getAll(PayrollSummaryView.class);
		Collections.sort(l, (o1, o2) -> o2.getId() - o1.getId());
		return Response.ok(l.toArray(new PayrollSummaryView[l.size()])).build();
	}

	@GET
	@Path("/salaryListTest1")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSalaryListTest1() {
		List<PayrollSummaryView> l = salServ.getSalaryList("0","0");
		Collections.sort(l, (o1, o2) -> o2.getId() - o1.getId());
		return Response.ok(l.toArray(new PayrollSummaryView[l.size()])).build();
	}

	@GET
	@Path("/salaryListTest")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSalaryListTest() {
		List<PayrollSummaryDto> l = repo.getSalaryList("0","0");
		Collections.sort(l, (o1, o2) -> o2.getId() - o1.getId());
		return Response.ok(l.toArray(new PayrollSummaryDto[l.size()])).build();
	}

	@GET
	@Path("/salaryList/{divisionCode}/{deptCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSalaryListFilter(@PathParam("divisionCode") String divisionCode, @PathParam("deptCode") String deptCode) {
		List<PayrollSummaryView> l = salServ.getSalaryList(divisionCode, deptCode);
		Collections.sort(l, (o1, o2) -> o2.getId() - o1.getId());
		return Response.ok(l.toArray(new PayrollSummaryView[l.size()])).build();
	}

// Bank transfer
	@GET
	@Path("/bankTransfer")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllBankTransfer() {
		List<SalaryBankTransfer> l = salServ.getSalaryBankTransfer();
		return Response.ok(l.toArray(new SalaryBankTransfer[l.size()])).build();
	}
	
//	@GET
//	@Path("/bankTransfer1")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response getAllBankTransfer1() {
//		List<SalaryBankTransfer> l = repo.getAll(SalaryBankTransfer.class);
//		return Response.ok(l.toArray(new SalaryBankTransfer[l.size()])).build();
//	}
	
//	@GET
//	@Path("/bankTransfer1")
//	@Produces(MediaType.TEXT_PLAIN)
//	public Response getAllBankTransfer1() {
//		List<SalaryBankTransfer> l = repo.getAll(SalaryBankTransfer.class);
//		return Response.ok(l.toArray(new SalaryBankTransfer[l.size()])).build();
//	}
	
// Month end closing

	@POST
	@Path("/monthEndClose")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response closeMonth() throws NotSupportedException {
		System.out.println("Closing Month");
		try {
			payrollServ.CloseMonth();
			return Response.ok().build();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return Response.status(500).entity("Error in close month procedure").build();
		}
	}

	@POST
	@Path("/updateGosi")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateGosi() throws NotSupportedException {
		System.out.println("Closing Month");
		try {
			payrollServ.updateGosi();
			return Response.ok().build();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return Response.status(500).entity("Error in close update gosi procedure").build();
		}
	}	
	
	
	
// Leaves
	@GET
	@Path("/leaveTransactions")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllLeaveTrans() {
		List<LeaveTransaction> l = repo.getAll(LeaveTransaction.class);
		Collections.sort(l, (o1, o2) -> o2.getId() - o1.getId());
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

	@GET
	@Path("/employee/leaveSummary")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLeaveSummary() {
		List<LeaveSummary> l = repo.getAll(LeaveSummary.class);
		return Response.ok(l.toArray(new LeaveSummary[l.size()])).build();
	}


	@GET
	@Path("/employee/leaveSummary/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getlsbyId(@PathParam("id") int id) throws Exception {
		LeaveSummary leaveSummary = repo.getById(LeaveSummary.class, id);
		return Response.ok(leaveSummary).build();
	}

	@POST
	@Path("/employee/saveLeaveTransaction")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveLeave(LeaveTransaction entity) throws NotSupportedException, SystemException {
		System.out.println("saving employee leave transactions");
		repo.CreateLeave(entity);
		return Response.ok(entity).build();
	}

//	@GET
//	@Path("/employee/leaveTransactionList/{id}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public LeaveTransactionHistory getltlistbyId(@PathParam("id") int id) throws Exception {
//		return repo.getByKey(LeaveTransactionHistory.class,"empCode", id);
//	}

	@GET
	@Path("/employee/leaveTransactionList/{empCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getltlistbyId(@PathParam("empCode") int empCode) throws Exception {
		List<LeaveTransactionHistory> l = repo.getListByKey(LeaveTransactionHistory.class, "empCode", empCode);
		Collections.sort(l, (o1, o2) -> o1.getDateFrom().compareTo(o2.getDateFrom()));
		return Response.ok(l.toArray(new LeaveTransactionHistory[l.size()])).build();
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

	@GET
	@Path("/loanSummary")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLoanSummary() {
//		List<LoanSummaryView> l = repo.getAll(LoanSummaryView.class);
		List<EmpLoanSummaryListDto> l = repo.getAllLoanSummary();
		return Response.ok(l.toArray(new Object[l.size()])).build();
	}

//	@GET
//	@Path("/loanSummary1")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response getLoanSummary1() {
//		LoanTransaction l = payrollServ.getLoanSummary();
//		 return Response.ok(l).build();
//	}

// all loan transaction for the employee
	@GET
	@Path("/employee/loantransactions/{empCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeLoanAllRecords(@PathParam("empCode") int empCode) {
		List<LoanTransaction> l = repo.getEmployeeLoanAllRecords(empCode);
		Collections.sort(l, (o1, o2) -> o1.getTrnDate().compareTo(o2.getTrnDate()));
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
	public EmpLoanSummaryDto getEmpLoanSumary(@PathParam("empCode") int empCode) {
		System.out.println("empCode in loan summary:" + empCode);
		return empServ.calculateEmpLoanInfo(empCode);

		//return empServ.getEmpLoanInfo(empCode);
//		return repo.getById(LoanSummaryView.class, empCode);
//		return  repo.getEmpLoanSummary(empCode);

	}

	@POST
	@Path("/employee/loan/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(LoanTransaction entity) {
		entity.setVoucherNo("test");
		System.out.println("Employee Loan: " + entity);
		repo.save(entity);
//		repo.updateLoanMaster(entity.getEmpCode(), entity);
		if (entity.getAdditionalInstallment() !=0) {
			repo.updateEmpMasterLoanInstallment(entity.getEmpCode(), entity.getAdditionalInstallment());
		}

		return Response.ok(entity).build();
	}

	//Month
	@GET
	@Path("/month/active")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getActiveSalaryMonth() {
		return Response.ok(repo.getByKey(Month.class, "status", "current")).build();
	}

	@GET
	@Path("/month")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMonth() throws Exception {
		List<Month> l = repo.getAll(Month.class);
		l.sort(Comparator.comparing(Month::getMonth));
		return Response.ok(l.toArray(new Month[l.size()])).build();

	}
	@POST
	@Path("/month")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(List<Month> entity) {
		System.out.println("Month update..");
		System.out.println("entity.size->" + entity.size());
		repo.updateMonth(entity);
		return Response.ok(entity).build();
	}
	
	@GET
	@Path("/currentYear")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCurrentYear() throws Exception {
		CurrentYear cy = repo.getById(CurrentYear.class, 1);
		return Response.ok(cy).build();
	}
	
	@POST
	@Path("/updateCurrentYear")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateCurrentYear(CurrentYear entity) throws NotSupportedException {
		System.out.println("New Financial Year" + entity);
		System.out.println("New Financial Year" + entity.getStartDate());
		try {
//			payrollServ.updateCurrentYear(entity.getStartDate(), entity.getEndDate(), entity.getCurrentYear());
			payrollServ.updateCurrentYear(entity);
			return Response.ok().build();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return Response.status(500).entity("Error in  update current year procedure").build();
		}
	}	

	@GET
	@Path("/reports")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getReportList() throws Exception {
		List<Reports> l = repo.getAll(Reports.class);
		return Response.ok(l.toArray(new Reports[l.size()])).build();

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
	@Path("filterEmployee/{start}/{maxR}")
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

//	@POST
//	@Path("/filterLeaveTransactions/{start}/{maxR}")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response fetchByLeaveTransactionFilters(@PathParam("start") int start, @PathParam("maxR") int maxR, String jsonData) {
//		System.out.println("jsonData:" + jsonData);
//		return getByFilters(LeaveTransaction.class, start, maxR, jsonData);
//
//	}

	@POST
	@Path("/filterLeaveTransactions/{start}/{maxR}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response fetchByLeaveTransactionFilters(@PathParam("start") int start, @PathParam("maxR") int maxR, String jsonData) {
		System.out.println("jsonData:" + jsonData);
		return getByFilters(LeaveTransactionView.class, start, maxR, jsonData);

	}

//	@POST
//	@Path("/filterLeaveSummary/{start}/{maxR}")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response fetchByLeaveSummaryFilters(@PathParam("start") int start, @PathParam("maxR") int maxR, String jsonData) {
//		System.out.println("jsonData:" + jsonData);
//		return getByFilters(LeaveSummary.class, start, maxR, jsonData);
//
//	}


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
		Map<String, Object> map = new HashMap<>();
		for (int i = 0; i < jsonArray.size(); i++) {
			JsonObject jsonObject = jsonArray.getJsonObject(i);
			JsonValue jsonValue = jsonObject.get("value");
			Object value = jsonValue.getValueType() == ValueType.NULL ? ""
					: jsonValue.getValueType() == ValueType.ARRAY ? getArray(jsonObject.getJsonArray("value"))
							: jsonValue.getValueType() == ValueType.NUMBER ? jsonObject.getJsonNumber("value")
									: (jsonValue.getValueType() == ValueType.TRUE
											|| jsonValue.getValueType() == ValueType.FALSE)
													? jsonObject.getBoolean("value")
													: jsonObject.getString("value");
			map.put(jsonObject.getString("fieldName"), value.getClass().isArray() ? value : value.toString());
		}
		List<T> a = repo.<T>getAllRecords(tClass, map, start, maxR, sortFieldName, isASC);

		long l = repo.<T>getSize(tClass, map);

		X_TOTAL_COUNT = String.valueOf(l);
		System.out.println("--------------- received:" + a.size());

		// ??

		@SuppressWarnings("unchecked")
		T[] array = (T[]) Array.newInstance(tClass, a.size());
//		System.out.println(tClass + ".isAssignableFrom(Mf1801.class)" + tClass.isAssignableFrom(Mf1801.class));
//		if(tClass.isAssignableFrom(Mf1801.class)) {
//			a.forEach(entity ->{
//				((Mf1801)entity).getCreatedByName();
//			});
//		}

		System.out.println("a.toArray(array):" + a.toArray(array));
		return Response.ok(a.toArray(array)).header("Access-Control-Expose-Headers", "*")
				.header("X_TOTAL_COUNT", X_TOTAL_COUNT).build();
	}

	private String[] getArray(JsonArray jsonArray) {
		String[] array = new String[jsonArray.size()];
		for (int i = 0; i < jsonArray.size(); i++) {
			array[i] = "'" + jsonArray.getString(i).toUpperCase() + "'";
		}
		return array;
	}
//	private <T> Response getByFilters1(Class<T> tClass, int start, int maxR, String jsonData) {
//
//		System.out.println("jsonData:" + jsonData.toString());
//		StringReader reader = new StringReader(jsonData);
//		JsonReader jsonReader = Json.createReader(reader);
//		JsonObject mainJsonObject = jsonReader.readObject();
//
//		JsonObject sortingObject = mainJsonObject.getJsonObject("sorting");
//
//		String sortFieldName = sortingObject.getString("fieldName");
//		System.out.println("SortfieldName:" + sortFieldName);
//		boolean isASC = sortingObject.getString("Sort").equalsIgnoreCase("ASC");
//
//		JsonArray jsonArray = mainJsonObject.getJsonArray("filter");
//		Map<String, String> map = new HashMap<String, String>();
//		for (int i = 0; i < jsonArray.size(); i++) {
//			JsonObject jsonObject = jsonArray.getJsonObject(i);
//			map.put(jsonObject.getString("fieldName"), jsonObject.getString("value"));
//		}
//		List<T> a = repo.<T>getAllRecords(tClass, map, start, maxR, sortFieldName, isASC);
//		long l = repo.<T>getSize(tClass, map);
//		X_TOTAL_COUNT = String.valueOf(l);
//		System.out.println("--------------- received:" + a.size());
//		@SuppressWarnings("unchecked")
//		T[] array = (T[]) Array.newInstance(tClass, a.size());
//		System.out.println("a.toArray(array):" + a.toArray(array));
//		return Response.ok(a.toArray(array)).header("Access-Control-Expose-Headers", "*")
//				.header("X_TOTAL_COUNT", X_TOTAL_COUNT).build();
//	}

}
