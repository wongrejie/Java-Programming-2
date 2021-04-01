package Main;

public class Bird {
	
	String Type[]={"Eagle","Ostrich","HummingBird"};
	Boolean Feathers= true;
	String Size[]={"Small","Medium","Large"};
	int NumOfLegs=2;
	
	void BirdBehavior(int BirdType) {
		System.out.println(Type[BirdType]+" eats.");
		System.out.println(Type[BirdType]+" sleeps.");
		System.out.println(Type[BirdType]+" lay eggs.");
	}
	
	
}
