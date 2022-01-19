
public class Employee {
	
	int employeeId;
	String employeeName;
	double employeeSal;
	String employeeDept;
	
	void initializeVariables(int id, String name, double sal, String dept) {
		
		employeeId = id;
		employeeName = name;
		employeeSal = sal;
		employeeDept = dept;
	}
	
	void displayMethod() {
		
		System.out.println("The details of the employee are: "+"ID: "+employeeId+ 
				" ,Name: "+employeeName+ " ,Salary: "+employeeSal+ " ,Department: "+employeeDept);
		
		
		}
	Employee(int id, String name, double sal, String dept){
		
		employeeId = id;
		employeeName = name;
		employeeSal = sal;
		employeeDept = dept;
		
	}		
	
	Employee(){
		
	}

	

}
