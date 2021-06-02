package gaming;

import java.util.*; //1.2 pre-define class for import scanner class

public class Marketing { // 1.3 user define class for Marketing

	Scanner sc = new Scanner(System.in);

	private double prize, registrationFee;
	private String day;

	public Marketing(double prize, String day, double registrationFee) {
		// 1.4 constructor with 3 arguments

		this.prize = prize;
		this.day = day;
		this.registrationFee = registrationFee;
		

	}

	public Marketing() { // 1.4 constructor with no argument

		System.out.println("Enter the total prize: RM");
		this.prize = sc.nextDouble();
		System.out.println("Enter the day of register (sunday-saturday): ");
		this.day = sc.nextLine();
		System.out.println("Enter the registration fee: RM");
		this.registrationFee = sc.nextDouble();

	}
	

	public double getPrize() {
		return prize;
	}

	public String getDay() {
		return day;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public double totalPrice() {
		return registrationFee;
	}

	public double totalPrice(double discount) {
		return registrationFee * (1 - discount);
	}

	public double totalPrice(String day, double discount) { //if weekend(friday or saturday), 10% off for registration fee.

		if (day.equals("friday") || day.equals("saturday")) {
			return totalPrice(discount);
		} else {
			return totalPrice();
		}
	}

	public void AdvertisementInfo() {
		System.out.println("=====================================================================");
		System.out.println("Advertisement");
		System.out.println("=====================================================================");
		System.out.println("Skilled gamer? finding a place to unleash your skills to defeat your opponents?"
				+ "\nULTIMATE GAMERS EVENT TORNAMENT IS COMING SOON!");
		System.out.println("\nThe total winning prizes are up to RM " + getPrize() + " !");
		System.out.println("\nThe registration fee is RM" + getRegistrationFee() + " for each participants!"
				+ "\nSPECIAL WEEKEND PRICE (10% off) for participant that register at FRIDAY/SATURDAY."
				+ "\nHurry up and grab the chance to win the prize by defeating your opponent!");
		System.out.println("\nKindly contact 012-9988564 for registrations and more details.");
		System.out.println("\n=====================================================================");
	}
	
	public String toString() {
		
		return "\nPrize and Fees Details" +
			   "\n=====================================================================" +
			   "\nPrize up to\t\t= RM " + this.prize +
			   "\nDay\t\t\t= " + this.day +
			   "\nRegistration Fee\t= RM " + this.registrationFee +
			   "\nWeekend Promotion price (Fri~Sat) = RM " + totalPrice("friday", 0.1);
		
	}
}
