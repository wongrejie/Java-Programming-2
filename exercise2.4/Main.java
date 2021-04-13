package exercise24;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AquaticAnimal Dolphin= new AquaticAnimal();
		
		Dolphin.setFishType("Bottlenose Dolphin.");
		Dolphin.setColour("Grey.");
		Dolphin.setFinNum(5);
		Dolphin.setBlood("warm-blooded");
		Dolphin.setWeight(150.9,2,"kilogram");
		Dolphin.setTimeLeft(6,40);
		Dolphin.setFoodExpenses(200, 6);
		
		
		System.out.println("Type : " + Dolphin.getFishType());
		System.out.println("Colour: "+ Dolphin.getColour());
		System.out.println("Number of fins: "+ Dolphin.getFinNum());
		System.out.println("Bloodtype: "+ Dolphin.getBlood());
		System.out.printf("\nTotal weight(kg/pound): %.2f",Dolphin.getWeight());
		System.out.println("\nEstimated time for this animal to live is about " + Dolphin.getTimeLeft()+" years");
		
		
		
	}

}
