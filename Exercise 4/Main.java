package laptopInherite;

public class Main {

	

	public static void main(String[]a) {
		Laptop objLaptop= new Laptop();
		System.out.println(objLaptop+"\n");
		
		Asus objAsus= new Asus("Asus","TUF FX505","Black","Window 10",2.2, 4499, 15, 5);
		System.out.println(objAsus);
		System.out.printf("\nTotal Price: RM %.2f",objAsus.getTotalPrice());
		System.out.printf("\nDown Payment: RM %.2f",objAsus.getDownPayment());
		System.out.printf("\nMonthly Payment: RM %.2f",objAsus.getMonthlyPayment());
	}
	

}
