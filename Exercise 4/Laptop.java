package laptopInherite;

import java.util.Scanner;

public class Laptop {
	private String brand,model,colour,os;
	private double weight, price;
	
	Scanner s = new Scanner(System.in);
	//default constructor
	public Laptop() {
		
		System.out.print("Enter the brand: ");
		this.brand = s.nextLine();
		
		System.out.print("Enter the model: ");
		this.model = s.nextLine();
		
		System.out.print("Enter the colour: ");
		this.colour = s.nextLine();
		
		System.out.print("Enter the operating system: ");
		this.os = s.nextLine();
		
		System.out.print("Enter the weight og the laptop(kg): ");
		this.weight = s.nextDouble();
		
		System.out.print("Enter the price the laptop: RM ");
		this.price = s.nextDouble();
		
	}
	//Parameterized constructor
	public Laptop(String b, String m, String c, String o, double w, double p) {
		
		this.brand=b;
		this.model=m;
		this.colour=c;
		this.os=o;
		this.weight=w;
		this.price=p;
	}
	
	
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public String getOs() {
		return this.os;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public String toString() {
	     return "\nBrand= "+brand+"\nModel= "+model+"\nColour= "+colour+"\nOperating System= "+os+
	    		 "\nWeight= "+weight+" kg"+"\nPrice= RM "+price;
	   }
}
