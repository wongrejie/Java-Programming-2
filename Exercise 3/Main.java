package exercise3;

public class Main {

	public static void main(String[] args) {
		Laptop Asus = new Laptop();
		
		System.out.println("\n~~~~~~~~ Asus Laptop ~~~~~~~~");
		System.out.println("Brand: "+Asus.brand);
		System.out.println("Model: "+Asus.model);
		System.out.println("Colour: "+Asus.colour);
		System.out.println("Operating System: "+Asus.os);
		System.out.println("Ram size: "+Asus.ramSize+" gb");
		System.out.println("Weight: "+Asus.weight+" kg");
		System.out.println("Price: "+Asus.price);
		
		
	
		Laptop Acer = new Laptop("Acer","Nitro 5","Black","Window 10",8,2.7,2855.0);
		
		System.out.println("\n~~~~~~~~ Acer Laptop ~~~~~~~~");
		System.out.println("Brand: "+Acer.brand);
		System.out.println("Model: "+Acer.model);
		System.out.println("Colour: "+Acer.colour);
		System.out.println("Operating System: "+Acer.os);
		System.out.println("Ram size: "+Acer.ramSize);
		System.out.println("Weight: "+Acer.weight);
		System.out.println("Price: "+Acer.price);

	}

}
