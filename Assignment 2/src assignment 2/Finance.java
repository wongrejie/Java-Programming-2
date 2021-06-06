package gaming;

import java.util.*; 
import java.text.DecimalFormat;
public class Finance extends Employee{ // 2.1 inheritance, Finance extends employee

	static DecimalFormat df=new DecimalFormat("#.##");
	
	Scanner sc = new Scanner(System.in); 
	
	Discount d = new WeekendDiscountRate();
	Payment p=new PriceRate();
	
	private int pQWeekdays,pQWeekend;	
	private double utilityFee, prize, advertisementFee, registrationFee;

	public Finance(String n, String l, String c, String o ,int noEm,String department,int id,String EmployeeName, double salary) {	
		
		super(n,l,c,o,noEm,department,id,EmployeeName,salary);
		
		System.out.println("Enter the details of Finance: ");
		System.out.println("=====================================================================");
		
		System.out.println("Total Quantity of participant paid in weekdays (sun-thurs): ");
		this.pQWeekdays = sc.nextInt();

		System.out.println("Total Quantity of participant paid in weekend (fri-sat): ");
		this.pQWeekend = sc.nextInt();

		System.out.println("Prize amount (RM): ");
		this.prize = sc.nextDouble();

		System.out.println("Utility Fee (RM): ");
		this.utilityFee = sc.nextDouble();

		System.out.println("Advertisement Fee (RM): ");
		this.advertisementFee = sc.nextDouble();
	
	}
	
	public Finance(String n, String l, String c, String o ,int noEm,String department,int id,String EmployeeName, double salary,
					int pQWeekdays,int pQWeekend,double prize,double utilityFee,double advertisementFee) {
		
		super(n,l,c,o,noEm,department,id,EmployeeName,salary);
		
		this.pQWeekdays=pQWeekdays;
		this.pQWeekend=pQWeekend;
		this.prize=prize;
		this.utilityFee=utilityFee;
		this.advertisementFee=advertisementFee;
		
	}
	
	public int getParticipantWeekdays() { //2.3 encapsulation, using getter method
		return pQWeekdays;
	}
	
	public int getParticipantWeekend() { 
		return pQWeekend;
	}

	public double getRegistrationFeePaid() { 
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
		
	public double totalSalary() { 	//calculate the total salary for employee from super class
		return super.getNoOfEmployee()*super.getSalary();
	}
	
	public double totalIncome() { 	/*calculate the total income which is total registration fees that participant paid,
					total number of participant paid in weekdays plus total number of participant paid in weekend with discount 
					are our income*/
		
		return (pQWeekdays*p.totalPrice())+(pQWeekend*p.totalPrice(d.discountRate()));
	}
	
	public double totalBudget() {  //calculate the total budget of the event
		return totalSalary()+getPrize()+getUtilityFee()+getAdvertisementFee();
	}
	
	public double calcNetProfit() {  //calculate the net profit of the event
		return totalIncome()-totalBudget();
	}
	
	
	public String printInfo() { //2.2 Polymorphism, method printInfo() in all class
		return 	"\n=====================================================================" + 
				"\n Finance Details" +
				"\n=====================================================================" + 
				"\n Employee Quantity\t\t\t\t= " + super.getNoOfEmployee() + 
				"\n Quantity of Participant registered in weekdays\t= " + pQWeekdays +
				"\n Quantity of Participant registered in weekend\t= " + pQWeekend +
				"\n Total Salary paid\t\t\t\t= RM " + totalSalary() +
				"\n Total Registration Fee\t\t\t\t= RM " + df.format(totalIncome()) +
				"\n Prize up to \t\t\t\t\t= RM " + prize +
				"\n Utility Fee \t\t\t\t\t= RM " + utilityFee +
				"\n Advertisement Fee \t\t\t\t= RM " + advertisementFee + 
				"\n=====================================================================" + 
				"\n Total Budget \t\t\t\t\t= RM " + df.format(totalBudget()) +
				"\n Total Income\t\t\t\t\t= RM "+ df.format(totalIncome())+
				"\n=====================================================================" + 
				"\n Net Profit\t\t\t\t\t= RM "+ df.format(calcNetProfit())+
				"\n=====================================================================";
	}


}
