package Main;

public class Main {


public static void main(String[] args) {
		Bird Eagle= new Bird(); 
		Bird Ostrich= new Bird();
		Bird HummingBird= new Bird();
		Bird Parrot= new Bird();
		
		System.out.println("====================================");
		System.out.println("Eagle characteristics");
		System.out.println("====================================");
		Eagle.printChar("Bald eagle","Medium","Yes",20,2,6.3,0.9);
		Eagle.printCalWeight(6.3, 5);
		Eagle.printCalHeight(0.9, 5);
		Eagle.printCalFoodExpenses(56, 8,3);
		
		System.out.println("====================================");
		System.out.println("Ostrich characteristics");
		System.out.println("====================================");
		Ostrich.printChar("Southern Ostrich","Big","Yes",45,2,140,2.8);
		Ostrich.printCalWeight(140, 2);
		Ostrich.printCalHeight(2.8, 2);
		Ostrich.printCalFoodExpenses(100,6,2);
		
		System.out.println("====================================");
		System.out.println("HummingBird characteristics");
		System.out.println("====================================");
		HummingBird.printChar("Rufous HummingBird","Small","Yes",5,2,0.003,0.7);
		HummingBird.printCalWeight(0.003, 25);
		HummingBird.printCalHeight(0.7, 25);
		HummingBird.printCalFoodExpenses(1,9,4);
		
		
		System.out.println("====================================");
		System.out.println("Parrot characteristics");
		System.out.println("====================================");
		Parrot.printChar("Cockatoo","Medium","Yes",15,2,0.12,0.6);
		Parrot.printCalWeight(0.12, 14);
		Parrot.printCalHeight(0.6, 14);
		Parrot.printCalFoodExpenses(40,7,5);
			
	}
}
