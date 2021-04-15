package quiz1;

public class Main {

	public static void main(String[] args) {
		Horse horse1 = new Horse();
		horse1.setHorseBreed();
		horse1.setColour();
		horse1. setWeight();
		horse1. setLifespan();
		horse1.setAge();
		horse1. setFoodExpenses();
		
		
		 System.out.println("\n~~~~~~~~ Horse 1 ~~~~~~~~ ");
		 System.out.println("Type: "+horse1.getHorseBreed());
		 System.out.println("Colour: "+horse1.getColour());
		 System.out.println("Weight: "+horse1.getWeight()+" kg");
		 System.out.println("Lifespan: "+horse1.getLifespan()+" years");
		 System.out.println("Age: " + horse1.getAge()+" year's old");
		 System.out.println("Estimated time to live is about: "+horse1.getTimeLeft()+" years");
		 System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~ ");
	
	    Horse Horse2 = new Horse();
		Horse2.setHorseBreed();
		Horse2.setColour();
		Horse2. setWeight();
		Horse2. setLifespan();
		Horse2.setAge();
		Horse2. setFoodExpenses();
			
			
			 System.out.println("\n~~~~~~~~ Horse 2 ~~~~~~~~ ");
			 System.out.println("Type: "+Horse2.getHorseBreed());
			 System.out.println("Colour: "+Horse2.getColour());
			 System.out.println("Weight: "+Horse2.getWeight()+" kg");
			 System.out.println("Lifespan: "+Horse2.getLifespan()+" years");
			 System.out.println("Age: " + Horse2.getAge()+" year's old");
			 System.out.println("Estimated time to live is about: "+Horse2.getTimeLeft()+" years");
			 System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~ ");
	}
}
