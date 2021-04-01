package Main;

public class Main {
public static void main(String[] args) {
		
		Bird Eagle= new Bird(); 
		Fish Salmon= new Fish();
	
		System.out.println("Bird type: "+Eagle.Type);
		System.out.println("Bird Size: "+Eagle.Size);
		System.out.println("Feathers: "+Eagle.Feathers);
		System.out.println("Number of legs: "+Eagle.NumOfLegs);
		System.out.println();
		
		Eagle.PrintEat();
		Eagle.PrintSleeps();
		Eagle.PrintLayEggs();
		System.out.println();
		
		System.out.println("Fish type: "+Salmon.Type);
		System.out.println("Fish Size: "+Salmon.Size);
		System.out.println("Blood: "+Salmon.Blood);
		System.out.println("Number of fins: "+Salmon.NumOfFins);
		System.out.println();
		
		Salmon.PrintEat();
		Salmon.PrintSwim();
		Salmon.PrintBreath();
		System.out.println();
		
	}
}
