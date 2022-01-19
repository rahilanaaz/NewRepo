
public class EmployeeMain {

	public static void main(String[] args) {
	
		Employee emp1 = new Employee();
		emp1.initializeVariables(101, "John", 45000.00, "Finance");
		emp1.displayMethod();
		
		Employee emp2 = new Employee();
		emp2.employeeId = 102;
		emp2.employeeName = "Mark";
		emp2.employeeSal = 55000.00;
		emp2.employeeDept = "Billing";
		
		emp2.displayMethod();
		
		Employee emp3 = new Employee(103, "Sam", 50000.00, "Marketing");
		emp3.displayMethod();

	}

}
