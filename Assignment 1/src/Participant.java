package gaming;

import java.util.*; //1.2 pre-define class for import scanner class

public class Participant { // 1.2 user define class for participant

	Scanner sc = new Scanner(System.in); 

	private String name, gender, teamName; 
	private int age, numOfParticipant;

	public Participant() { // 1.4 constructor with no arguments
		
		System.out.println("Participant Details: ");
		System.out.println("=====================================================================");
		System.out.println("\nEnter the name of participant: ");
		this.name = sc.nextLine();

		System.out.println("Enter the gender of participant: ");
		this.gender = sc.nextLine();

		System.out.println("Enter the age of participant: ");
		this.age = sc.nextInt();

		System.out.println("Enter the number of participant: ");
		this.numOfParticipant = sc.nextInt();

		System.out.println("Enter the team name: ");
		sc.nextLine();
		this.teamName = sc.nextLine();
	}

	public Participant(String name, String newTeam) { // 1.4 constructor with 2 arguments
		this.teamName = newTeam;
		System.out.println("Participant " + name + ", Change team to " + this.teamName);

	}

	public Participant(String name, String gender, int age, int numOfParticipant,
			String team) {	 //1.4 constructor with 5 arguments
							 
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.numOfParticipant = numOfParticipant;
		this.teamName = team;

	}

	public String getName() {
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

	@Override
	public String toString() {
		return "\n=====================================================================" + 
				"\n Participant Details" + 
				"\n====================================================================="+
				 "\n Name\t\t\t= " + name +
				 "\n Gender\t\t\t= " + gender + 
				 "\n Age\t\t\t= " + age+
				 "\n Number of participant  = " + numOfParticipant + 
				 "\n Team Name\t\t= " + teamName+
				 "\n=====================================================================";
		
	}
}
