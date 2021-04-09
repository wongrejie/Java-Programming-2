package Main;


public class Main {


public static void main(String[] args) {
		
		Bird Eagle= new Bird(); 
		Bird Ostrich= new Bird();
		Bird HummingBird= new Bird();
		Bird Parrot= new Bird();
		
		System.out.println("Information for Eagle");
		Eagle.printChar();
		Eagle.printWeight();
		Eagle.BirdBehaviour();
		Eagle.printYearOfBorn();
		Eagle.printCalFoodExpenses();
		
		System.out.println("Information for Ostrich");
		Ostrich.printChar();
		Ostrich.printWeight();
		Ostrich.BirdBehaviour();
		Ostrich.printYearOfBorn();
		Ostrich.printCalFoodExpenses();	
		
		System.out.println("Information for Hummingbird");
		HummingBird.printChar();
		HummingBird.printWeight();
		HummingBird.BirdBehaviour();
		HummingBird.printYearOfBorn();
		HummingBird.printCalFoodExpenses();	
		
		System.out.println("Information for Parrot");
		Parrot.printChar();
		Parrot.printWeight();
		Parrot.BirdBehaviour();
		Parrot.printYearOfBorn();
		Parrot.printCalFoodExpenses();
			
	}
}
