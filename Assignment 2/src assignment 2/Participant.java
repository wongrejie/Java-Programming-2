package gaming;

import java.text.DecimalFormat;
import java.util.*; 

public class Participant extends EventDetails{ // 2.1 Inheritance, Participant extends EventDetails
	
	 static DecimalFormat df=new DecimalFormat("#.##");
	
	Scanner sc = new Scanner(System.in); 

	private String name, gender, teamName; 
	private int age, numOfParticipant;

	
	public Participant(String n, String l, String c, String o, int noEm, String eventName, String category, double registrationFee) {
		
		super(n,l,c,o,noEm,eventName,category,registrationFee);		
		System.out.println("=====================================================================");
		System.out.println("Participant Details: ");
		System.out.println("=====================================================================");
		System.out.println("\nEnter the name of participant: ");
		this.name = sc.nextLine();

		System.out.println("Enter the gender of participant: ");
		this.gender = sc.nextLine();

		System.out.println("Enter the age of participant: ");
		this.age = sc.nextInt();

		System.out.println("Enter the team name: ");
		sc.nextLine();
		this.teamName = sc.nextLine();
		
		System.out.println("Enter the number of participant in team: ");
		this.numOfParticipant = sc.nextInt();


	}
	public Participant(String n, String l, String c, String o, int noEm, String eventName, String category, double registrationFee, 
			String name, String gender,int age, String teamName, int numOfParticipant) { //1.4 constructor with no argument
		
		super(n,l,c,o,noEm,eventName,category,registrationFee);
		
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.numOfParticipant=numOfParticipant;
		this.teamName=teamName;
		
	}


	public String getName() { //2.3 encapsulation using getter method
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public int getNumOfParticippant() {
		return numOfParticipant;
	}

	public String getTeamName() {
		return teamName;
	}
	
	public double TotalRegistrationFee() {
		return super.registrationFee*numOfParticipant;
		
	}
	

	
	public String printInfo() { //2.2 Polymorphism, method printInfo() in all class
		
		return 	"\n=====================================================================" + 
				"\n Participant Details" + 
				"\n====================================================================="+
				"\n Name\t\t\t\t= " + name +
				"\n Gender\t\t\t\t= " + gender + 
				"\n Age\t\t\t\t= " + age+
				"\n Team Name\t\t\t= " + teamName+
				"\n Number of participant in team\t= " + numOfParticipant + 
				"\n total Registration Fee\t\t= RM " + df.format(TotalRegistrationFee())+
				"\n=====================================================================";
		
	}
}
