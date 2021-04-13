package exercise24;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AquaticAnimal Dolphin= new AquaticAnimal();
		
		Dolphin.setFishType("Bottlenose Dolphin.");
		Dolphin.setColour("Grey.");
		Dolphin.setFinNum(5);
		Dolphin.setBlood("warm-blooded");
		Dolphin.setWeight(150.9);
		Dolphin.setLifespan(40);
		Dolphin.setFoodExpenses(200);
		
		
		System.out.println("Type : " + Dolphin.getFishType());
		System.out.println("Colour: "+ Dolphin.getColour());
		System.out.println("Number of fins: "+ Dolphin.getFinNum());
		System.out.println("Bloodtype: "+ Dolphin.getBlood());
		System.out.println("Weight(kg): "+Dolphin.getWeight());
		System.out.println("Lifespan for this animal is about " + Dolphin.getLifespan()+" years");
		System.out.println("Monthly food expenses: RM"+Dolphin.getFoodExpenses());
		
		Dolphin.ocean();
		
	}

}
