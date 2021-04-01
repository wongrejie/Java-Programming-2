package Main;

public class Fish {
	
	String Type[]={"Salmon","Whale","Sardine"};
	String Size[]={"Small","Medium","Large"};
	String Blood[]={"Warm-Blooded","Cold-Blooded"};
	int NumOfFins[]= {8,4,5};
	
	void FishBehavior(int FishType) {
		System.out.println(Type[FishType]+" eats.");
		System.out.println(Type[FishType]+" swims.");
		System.out.println(Type[FishType]+" Breaths.");
	}
	
}
