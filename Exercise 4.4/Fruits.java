package fruitOverLoading;

public class Fruits { //super class
		protected String name;
		
		public Fruits(String n) {	//constructor with arguments
			name=n;
			System.out.println("---------------------------------------------------------");
			System.out.println("\n"+n+" constructor is invoked\n");
			
		}
		
		public String Benefits() {	 
			
			return "Fruits contain essential vitamins and minerals for our body.";
			
		}
		public String toString() {	//overriding method
		     return "\nFruit Name = "+name;
		   }
	
}
