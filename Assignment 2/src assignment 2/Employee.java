package gaming;

import java.util.*; 

public class Employee extends GamingCenter{ //2.1 Inheritance, Employee extends GamingCenter

	Scanner sc = new Scanner(System.in); 

	private String department, employeeName; 
	private int id;
	protected double salary;

	public Employee(String n, String l, String c, String o ,int noEm) { 
		super(n,l,c,o,noEm);
		System.out.println("=====================================================================");
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
	
	public Employee(String n, String l, String c, String o ,int noEm,String department,int id,String EmployeeName, double salary) { 
		super(n,l,c,o,noEm);
		
		this.department=department;
		this.id=id;
		this.employeeName=EmployeeName;
		this.salary=salary;
	}
	
	

	public String getDepartment() { //2.3 encapsulation, using getter method
		return department;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeID() {
		return id;
	}

	public double getSalary() {
		return salary;
	}


	public String printInfo() { //2.2 Polymorphism, method printInfo() in all class
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
