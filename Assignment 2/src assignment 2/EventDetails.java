package gaming;

import java.util.*; 

public class EventDetails extends GamingCenter{	//2.1 Inheritance, EventDetails extends GamingCenter.

	Scanner sc = new Scanner(System.in); 

	protected String eventName, category;
	protected double registrationFee;

	public EventDetails(String n, String l, String c, String o,int noEm, String eventName, String category, double registrationFee){ 
		super(n,l,c,o,noEm);																									
		this.eventName = eventName;
		this.category = category;
		this.registrationFee = registrationFee;
		

	}

	public String getEventName() { //2.3 encapsulation, setter getter methods
		return eventName;
	}

	public String getCategory() {
		return category;
	}
	
	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setEventName(String eventName) {
		this.eventName=eventName;
	}
	
	public void setCategory(String category) {
		this.category=category;
	}
	
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee=registrationFee;
	}
	
	public String printInfo() {	//2.2 Polymorphism, method printInfo() in all class
		
		return  super.printInfo()+
				"\n====================================================================="+
				"\n Event Details"+
				"\n====================================================================="+
				"\n Event Name\t\t= " + eventName + 
				"\n Category\t\t= " + category +  
				"\n Registration Fee(1pax) = RM " + registrationFee+
				"\n=====================================================================";
	}

	public String printFpsInfo() {
		return "\n====================================================================="+
				"\nA. First Person Shooter game Tornament (FPS) Game Event Info " + 
				"\n====================================================================="
				+ "\n1. First-person shooter (FPS) is a sub-genre of shooter video games centered on gun "
				+ "\n   and other weapon-based combat in a first-person perspective"
				+ "\n2. The FPS game in this event is Counter Strike: Global Offensive, published by Valve."
				+ "\n3. It is a Team based game. Team up to join the event!"
				+ "\n4. Players must know the objectives to win the game."
				+ "\n5. Counter Strike: Global Offensive is a 5 versus 5 game."
				+"\n=====================================================================";
	}

	public String printMobaInfo() {
		return "\n====================================================================="+
				"\nB. Multiplayer online battle arena (MOBA) Game Event Info " + 
				"\n====================================================================="
				+ "\n1. Multiplayer online battle arena Info(MOBA) is a subgenre of strategy video games "
				+ "\n   in which two teams of players compete against each other on a predefined battlefield."
				+ "\n2. The MOBA game in this event is League Of Legends, published by Riot Games."
				+ "\n3. It is a Team based game. Team up to join the event!"
				+ "\n4. Each player controls a single character with a set of unique abilities that improve over the course of a game "
				+ "\n   and which contribute to the team's overall strategy."
				+ "\n5. League Of Legends is a 5 versus 5 game"
				+"\n=====================================================================";
	}

	public String printRtsInfo() {
		return "\n====================================================================="+
				"\nC. Real Time Strategy (RTS) Game Event Info	" + 
				"\n====================================================================="
				+ "\n1. Real Time Strategy (RTS) games have the characteristics of"
				+ "\n   huge state space, imperfect information, sparse rewards and various strategies."
				+ "\n2. The RTS game in this event is Clash Royale, published by Supercell."
				+ "\n3. It can be played in 1 versus 1 or multiplayer, participant can either team up "
				+ "\n    or solo to defeat opponents in this event!"
				+ "\n4. The objective of the game is to destroy the other player’s King’s Tower (middle building) while protecting your own."
				+ "\n5. If the participant destroy the opponent's King’s Tower, the participant will win immediately."
				+"\n=====================================================================";
	}
}