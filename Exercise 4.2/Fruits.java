package fruitInheritence;

public class Fruits { //super class
		protected String name;
		
		public Fruits(String n) {	//constructor with arguments
			name=n;
			System.out.println("---------------------------------------");
			System.out.println("\n"+n+" constructor is invoked");
		}
		
		public Fruits() {	//constructor with no arguments
			
			name=null;
			
		}
		
		public String getName() {
			return name;
		}
		
		public String toString() {	//overriding method
		     return "\nFruit Name = "+name;
		   }
	
}
