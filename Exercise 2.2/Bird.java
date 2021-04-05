package Main;

public class Bird {
	
	String Type,Size,Feathers;
	int NumOfLegs,LifeSpan;
	double Weight,Height;
	
	void printChar(String t,String s,String f,int Ls, int l,double w,double h) {
		System.out.println("Type: "+ t);
		System.out.println("Size: "+ s);
		System.out.println("Feathers: "+ f);
		System.out.println("Lifespan: up to "+ Ls+" years");
		System.out.println("Number of legs: "+ l);
		System.out.println("Weight: up to "+ w+" kg");
		System.out.println("Height: up to "+ h+" m");
		
	}
	
	void printCalWeight(double w,int n) {
		double TotalWeight= w*n;
		System.out.println("Total weight for "+n+" bird of this type can weight up to "+TotalWeight+"kg");
	}
	 
	void printCalHeight(double h, int n) {
		double TotalHeight= h*n;
		System.out.println("Total height for "+n+" bird of this type's height can increase up to "+TotalHeight+"m\n");
	}
	
	void BirdBehaviour(String t) {
			System.out.println(t+" eats, sleeps and lay eggs.\n");
	}
}
