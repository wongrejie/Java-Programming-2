package Main;


public class Main {


public static void main(String[] args) {
		
		Bird Eagle= new Bird(); 
		Bird Ostrich= new Bird();
		Bird HummingBird= new Bird();
		Bird Parrot= new Bird();
		
		System.out.println("Information for Eagle");
		Eagle.birdInfo();
		Eagle.printWeight();
		Eagle.birdBehavior();
		Eagle.printYearOfBorn();
		Eagle.printCalFoodExpenses();
		
		System.out.println("\n\nInformation for Ostrich");
		Ostrich.birdInfo();
		Ostrich.printWeight();
		Ostrich.birdBehavior();
		Ostrich.printYearOfBorn();
		Ostrich.printCalFoodExpenses();	
		
		System.out.println("\n\nInformation for Hummingbird");
		HummingBird.birdInfo();
		HummingBird.printWeight();
		HummingBird.birdBehavior();
		HummingBird.printYearOfBorn();
		HummingBird.printCalFoodExpenses();	
		
		System.out.println("\n\nInformation for Parrot");
		Parrot.birdInfo();
		Parrot.printWeight();
		Parrot.birdBehavior();
		Parrot.printYearOfBorn();
		Parrot.printCalFoodExpenses();
			
			
	}
}
