package Main;

public class Bird {
	
	String Type,Size,Feathers;
	int NumOfLegs;
	double Weight,Height;
	
	void printChar(String t,String s,String f, int l,double w,double h) {
		System.out.println("Type: "+ t);
		System.out.println("Size: "+ s);
		System.out.println("Feathers: "+ f);
		System.out.println("Number of legs: "+ l);
		System.out.println("Weight: "+ w);
		System.out.println("Height: "+ h);
		
	}
	
	void printCalWeight(double w,int n) {
		double TotalWeight= w*n;
		System.out.println("Total weight for "+n+" bird of this type is "+TotalWeight+"kg");
	}
	 
	void printCalHeight(double h, int n) {
		double TotalHeight= h*n;
		System.out.println("Total height for "+n+" bird of this type is "+TotalHeight+"m");
	}
	
	void BirdBehaviour() {
			System.out.println("this animal eats, sleeps and lay eggs.");
	}
}
