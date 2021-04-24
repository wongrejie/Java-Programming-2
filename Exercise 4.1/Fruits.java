package fruitInheritence;

public class Fruits { //super class
		private String name;
		
		public Fruits(String n) {
			this.name=n;
			System.out.println("---------------------------------------");
			System.out.println("\n"+n+" constructor is invoked");
		}
		
		public String getName() {
			return this.name;
		}
		
		public String toString() {
		     return "\nFruit Name = "+name;
		   }
	
}
