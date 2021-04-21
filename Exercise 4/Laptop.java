package laptopInherite;

import java.util.Scanner;

public class Laptop {
	private String brand,model,colour,os;
	private double weight;
	
	Scanner s = new Scanner(System.in);
	
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
		
	}
	
	public Laptop(String b, String m, String c, String o, double w) {
		
		this.brand=b;
		this.model=m;
		this.colour=c;
		this.os=o;
		this.weight=w;
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
	
	public String toString() {
	     return "Brand= "+brand+"\nModel= "+model+"\nColour= "+colour+"\nOperating System= "+os+"\nWeight= "+weight+" kg";
	   }
}
