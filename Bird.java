package Bird;


public class Bird {

	public static void main(String[] args) {
		
		Eagle a= new Eagle(); 
		
		System.out.println("Bird type: "+a.Type);
		System.out.println("Bird Size: "+a.Size);
		System.out.println("Feathers: "+a.Feathers);
		System.out.println("Number of legs: "+a.NumOfLegs);
		System.out.println();
		
		a.PrintEat();
		a.PrintSleeps();
		a.PrintLayEggs();
		System.out.println();
		
		Ostrich b= new Ostrich(); 
		
		System.out.println("Bird type: "+b.Type);
		System.out.println("Bird Size: "+b.Size);
		System.out.println("Feathers: "+b.Feathers);
		System.out.println("Number of legs: "+b.NumOfLegs);
		System.out.println();
		
		b.PrintEat();
		b.PrintSleeps();
		b.PrintLayEggs();
		System.out.println();
		
	}

}
