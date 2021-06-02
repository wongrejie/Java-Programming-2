package gaming;

import java.util.*; //1.2 pre-define class for import scanner class

public class Finance { //1.3 user define class for class finance

	Scanner sc = new Scanner(System.in); 

	private int employeeQuantity, participantQuantity;	
	private double utilityFee, prize, salary, advertisementFee, registrationFee;

	public Finance() {	//1.4 constructor with no argument

		System.out.println("Enter the details of Finance: ");
		System.out.println("=====================================================================");
		
		System.out.println("Total Participant Quantity: ");
		this.participantQuantity = sc.nextInt();

		System.out.println("Registration fee (RM): ");
		this.registrationFee = sc.nextDouble();

		System.out.println("Total employee Quantity: ");
		this.employeeQuantity = sc.nextInt();

		System.out.println("Employee salary (RM): ");
		this.salary = sc.nextDouble();

		System.out.println("Prize amount (RM): ");
		this.prize = sc.nextDouble();

		System.out.println("Utility Fee (RM): ");
		this.utilityFee = sc.nextDouble();

		System.out.println("Advertisement Fee (RM): ");
		this.advertisementFee = sc.nextDouble();

	}
	
	public Finance(int pQ, double rF, int eQ,double s, double p, double uF, double aF) {	
					//1.4 constructor with 7 arguments
		
		this.participantQuantity=pQ;
		this.registrationFee=rF;
		this.employeeQuantity=eQ;
		this.salary=s;
		this.prize=p;
		this.utilityFee=uF;
		this.advertisementFee=aF;
		

	}

	public int getEmployeeQuantity() { 
		return employeeQuantity;
	}

	public int getParticipantQuantity() { 
		return participantQuantity;
	}

	public double getSalary() {
		return salary;
	}

	public double getRegistrationFee() { 
		return registrationFee;
	}

	public double getPrize() { 
		return prize;
	}
	
	public double getUtilityFee() { 
		return utilityFee;
	}
	
	public double getAdvertisementFee() { 
		return advertisementFee;
	}

	public double totalSalary() { 
		return employeeQuantity*salary;
	}
	
	public double totalIncome() { 
		return participantQuantity*registrationFee;
	}
	
	public double totalBudget() { 
		return totalSalary()+getPrize()+getUtilityFee()+getAdvertisementFee();
	}
	
	public double calcNetProfit() { 
		return totalIncome()-totalBudget();
	}
	
	@Override
	public String toString() {
		return 	"\n=====================================================================" + 
				"\n Finance Details" +
				"\n=====================================================================" + 
				"\n Employee Quantity\t= " + employeeQuantity + 
				"\n Salary \t\t= RM " + salary +
				"\n Participant Quantity \t= " + participantQuantity +
				"\n Registration Fee \t= RM " + registrationFee +
				"\n Prize up to \t\t= RM " + prize +
				"\n Utility Fee \t\t= RM " + utilityFee +
				"\n Advertisement Fee \t= RM " + advertisementFee + 
				"\n=====================================================================" + 
				"\n Total Budget \t\t= RM " + totalBudget() +
				"\n Total Income\t\t= RM "+ totalIncome()+
				"\n=====================================================================" + 
				"\n Net Profit\t\t= RM "+ calcNetProfit()+
				"\n=====================================================================";
	}


}
