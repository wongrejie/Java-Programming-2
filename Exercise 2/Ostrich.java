package Bird;

public class Ostrich {
	
	String Type="Ostrich";
	Boolean Feathers= true;
	String Size="Big";
	int NumOfLegs=2;
	
	void PrintEat() {
		System.out.println("Ostrich eats.");
	}
	
	void PrintSleeps() {
		System.out.println("Ostrich sleeps.");
	}
	
	void PrintLayEggs() {
		System.out.println("Ostrich lay eggs.");
	}
	public static void countdown(int n) {
	    if (n == 0) {
	        System.out.println("Blastoff!");
	    } else {
	        System.out.println(n);
	        countdown(n - 1);
	    }
	}
}

