package fruitOverLoading;

public class Fruits { //super class
		protected String name;
		
		public Fruits(String n) {	//constructor with arguments
			name=n;
			System.out.println("---------------------------------------");
			System.out.println("\n"+n+" constructor is invoked");
		}
		
		public String toString() {	//overriding method
		     return "\nFruit Name = "+name;
		   }
	
}
