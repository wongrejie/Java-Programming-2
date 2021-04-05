package Main;

public class Main {


public static void main(String[] args) {
		
		Bird Eagle= new Bird(); 
		Bird Ostrich= new Bird();
		Bird HummingBird= new Bird();
		Bird Hornbill= new Bird();
		
		System.out.println("====================================");
		System.out.println("Eagle characteristics");
		System.out.println("====================================");
		Eagle.printChar("Bald eagle","Medium","Yes",2,6.3,0.9);
		Eagle.printCalWeight(6.3, 5);
		Eagle.printCalHeight(0.9, 5);
		Eagle.BirdBehaviour("Eagle");
		
		System.out.println("====================================");
		System.out.println("Ostrich characteristics");
		System.out.println("====================================");
		Ostrich.printChar("Southern Ostrich","Big","Yes",2,140,2.8);
		Ostrich.printCalWeight(140, 2);
		Ostrich.printCalHeight(2.8, 2);
		Ostrich.BirdBehaviour("Ostrich");
		
		System.out.println("====================================");
		System.out.println("HummingBird characteristics");
		System.out.println("====================================");
		HummingBird.printChar("Rufous HummingBird","Small","Yes",2,0.003,0.7);
		HummingBird.printCalWeight(0.003, 25);
		HummingBird.printCalHeight(0.7, 25);
		HummingBird.BirdBehaviour("HummingBird");
		
		
		System.out.println("====================================");
		System.out.println("Hornbill characteristics");
		System.out.println("====================================");
		Hornbill.printChar("Rhinoceros Hornbill","Medium","Yes",2,2.96,1.3);
		Hornbill.printCalWeight(2.96, 14);
		Hornbill.printCalHeight(1.3, 14);
		Hornbill.BirdBehaviour("Hornbill");
		
			
	}
}
