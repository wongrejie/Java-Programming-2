package Main;

public class Main {
public static void main(String[] args) {
		
		Bird Eagle= new Bird(); 
		Bird Ostrich= new Bird();
		Bird HummingBird= new Bird();
		
		Fish Salmon= new Fish();
		Fish Whale= new Fish();
		Fish Sardine= new Fish();
		
		System.out.println("Bird type: "+Eagle.Type[0]);
		System.out.println("Bird Size: "+Eagle.Size[1]);
		System.out.println("Feathers: "+Eagle.Feathers);
		System.out.println("Number of legs: "+Eagle.NumOfLegs);
		System.out.println();
		
		Eagle.BirdBehavior(0);
		System.out.println();
		
		System.out.println("Bird type: "+Ostrich.Type[1]);
		System.out.println("Bird Size: "+Ostrich.Size[2]);
		System.out.println("Feathers: "+Ostrich.Feathers);
		System.out.println("Number of legs: "+Ostrich.NumOfLegs);
		System.out.println();
		
		Ostrich.BirdBehavior(1);
		System.out.println();
		
		System.out.println("Bird type: "+HummingBird.Type[2]);
		System.out.println("Bird Size: "+HummingBird.Size[0]);
		System.out.println("Feathers: "+HummingBird.Feathers);
		System.out.println("Number of legs: "+HummingBird.NumOfLegs);
		System.out.println();
		
		HummingBird.BirdBehavior(2);
		System.out.println();
		
		 
		
		System.out.println("Fish type: "+Salmon.Type[0]);
		System.out.println("Fish Size: "+Salmon.Size[1]);
		System.out.println("Blood: "+Salmon.Blood[1]);
		System.out.println("Number of fins: "+Salmon.NumOfFins[0]);
		System.out.println();
		
		Salmon.FishBehavior(0);
		System.out.println();
		
		System.out.println("Fish type: "+Whale.Type[1]);
		System.out.println("Fish Size: "+Whale.Size[2]);
		System.out.println("Blood: "+Whale.Blood[0]);
		System.out.println("Number of fins: "+Whale.NumOfFins[1]);
		System.out.println();
		
		Whale.FishBehavior(1);
		System.out.println();
		
		System.out.println("Fish type: "+Sardine.Type[2]);
		System.out.println("Fish Size: "+Sardine.Size[0]);
		System.out.println("Blood: "+Sardine.Blood[1]);
		System.out.println("Number of fins: "+Sardine.NumOfFins[2]);
		System.out.println();
		
		Sardine.FishBehavior(2);
		System.out.println();
		
		
		
	}
}
