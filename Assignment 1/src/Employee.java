package gaming;

import java.util.*; //1.2 pre-define class for import scanner class

public class Employee { // 1.3 user define class for employee class

	Scanner sc = new Scanner(System.in); 

	private String department, employeeName; 
	private int id;
	private double salary;

	public Employee() { //1.4 constructor with no argument
		
		System.out.println("Employee Details: ");
		System.out.println("=====================================================================");
		
		System.out.print("Department : ");
		this.department = sc.nextLine();
		
		System.out.print("Employee ID : ");
		this.id = sc.nextInt();
		
		System.out.print("Employee Name : ");
		this.employeeName = sc.next();	
		
		System.out.print("Salary : RM ");
		this.salary = sc.nextDouble();	

	}


	public Employee(String department, int id, String EmName) { //1.4 constructor with 3 argument
		this.department = department;
		this.id = id;
		this.employeeName = EmName;
	}

	public String getDepartment() {
		return department;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeID() {
		return id;
	}

	public double getSalaryPerHour() {
		return salary;
	}


	@Override
	public String toString() {
		return  "\n====================================================================="+
				"\n Employee Details" + 
				"\n====================================================================="+
				"\n Department\t\t\t= " + department + 
				"\n Name\t\t\t\t= " + employeeName + 
				"\n Employee ID\t\t\t= "+ id +
				"\n Salary \t\t\t= RM "+salary+
				"\n=====================================================================";
	}
}
