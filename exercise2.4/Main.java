package exercise24;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish Salmon= new Fish();
		

		
		Salmon.setFishType("Atlantic Salmon.");
		Salmon.setColour("Silver.");
		Salmon.setFinNum(8);
		Salmon.setBlood("cold-blooded");
		Salmon.setWeight(26.5);
		Salmon.setLifespan(7);
		Salmon.setFoodExpenses(1000);
		
		
		System.out.println("Type : " + Salmon.getFishType());
		System.out.println("Colour: "+ Salmon.getColour());
		System.out.println("Number of fins: "+ Salmon.getFinNum());
		System.out.println("Bloodtype: "+ Salmon.getBlood());
		System.out.println("Weight(kg): "+Salmon.getWeight());
		System.out.println("Lifespan for this animal is about " + Salmon.getLifespan()+" years");
		System.out.println("Monthly food expenses: RM"+Salmon.getFoodExpenses());
		
		
		
	}

}
