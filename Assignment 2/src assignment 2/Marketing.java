package gaming;

import java.text.DecimalFormat;
import java.util.*; 

public class Marketing extends EventDetails { // 2.1 inheritance, Marketing extends from EventDetails

	static DecimalFormat df = new DecimalFormat("#.##");

	Scanner sc = new Scanner(System.in);

	Discount dw = new WeekendDiscountRate();  
	Payment wp = new PriceRate();

	private double prize;
	private String day;

	
	public Marketing(String n, String l, String c, String o, int noEm, String eventName, String category,
			double registrationFee, double prize, String day) { 
		super(n, l, c, o, noEm, eventName, category, registrationFee);
		this.prize = prize;
		this.day = day;

	}
	
	public void setPrize(double prize) { //2.3 encapsulation, setter getter methods
		this.prize=prize;
	}
	
	public void setDay(String day) {
		this.day=day;
	}

	public double getPrize() {
		return prize;
	}

	public String getDay() {
		return day;
	}


	public void AdvertisementInfo() {
		System.out.println("=====================================================================");
		System.out.println("Advertisement");
		System.out.println("=====================================================================");
		System.out.println("Skilled gamer? finding a place to unleash your skills to defeat your opponents?"
				+ "\nULTIMATE GAMERS EVENT TORNAMENT IS COMING SOON!");
		System.out.println("\nThe total winning prizes are up to RM "+ getPrize()+"!");
		System.out.println("\nThe registration fee is RM "+ super.getRegistrationFee()+" for each participants!"
				+ "\nSPECIAL WEEKEND PRICE (15% off) for participant that register at FRIDAY/SATURDAY."
				+ "\nHurry up and grab the chance to win the prize by defeating your opponent!");
		System.out.println("\nKindly contact 012-9988564 for registrations and more details.");
		System.out.println("\n=====================================================================");
	}

	public String printInfo() { //2.2 Polymorphism, method printInfo() in all class

		return 	"\n====================================================================="+
				"\nPrize and Fees Details" + 
				"\n====================================================================="
				+ "\nPrize up to\t\t= RM " + this.prize + "\nDay\t\t\t= " + this.day + "\nRegistration Fee\t= RM "
				+ df.format(wp.totalPrice(day, dw.discountRate()));

	}
}
