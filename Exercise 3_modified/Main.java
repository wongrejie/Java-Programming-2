package exercise3_modified;



public class Main {

	public static void main(String[] args) {
		Laptop Asus = new Laptop();
		
		System.out.println("\n~~~~~~~~ Asus Laptop ~~~~~~~~");
		System.out.println("Brand: "+Asus.getBrand());
		System.out.println("Model: "+Asus.getModel());
		System.out.println("Colour: "+Asus.getColour());
		System.out.println("Operating System: "+Asus.getOs());
		System.out.println("Ram size: "+Asus.getRamSize()+" gb");
		System.out.println("Weight: "+Asus.getWeight()+" kg");
		System.out.println("Price: "+Asus.getPrice());
		
		
	
		Laptop Acer = new Laptop("Acer","Nitro 5","Black","Window 10",8,2.7,2855.0);
		
		System.out.println("\n~~~~~~~~ Acer Laptop ~~~~~~~~");
		System.out.println("Brand: "+Acer.getBrand());
		System.out.println("Model: "+Acer.getModel());
		System.out.println("Colour: "+Acer.getColour());
		System.out.println("Operating System: "+Acer.getOs());
		System.out.println("Ram size: "+Acer.getRamSize()+" gb");
		System.out.println("Weight: "+Acer.getWeight()+" kg");
		System.out.println("Price: "+Acer.getPrice());

	

	}

}
