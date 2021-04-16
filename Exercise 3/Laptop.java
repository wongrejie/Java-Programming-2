package exercise3;

import java.util.Scanner;

public class Laptop {
	
		String brand,model,colour,os;
		int ramSize;
		double weight,price;
		
		Scanner s = new Scanner(System.in);
		
		//default constructor
		//Laptop Asus = new Laptop();
		Laptop() {
			
			System.out.println("Enter Laptop brand: ");
			this.brand = s.nextLine();
			
			System.out.println("Enter Laptop model: ");
			this.model = s.nextLine();
					
			System.out.println("Enter Laptop Color: ");
			this.colour = s.nextLine();
			
			System.out.println("Enter Laptop operating system: ");
			this.os = s.nextLine();
			
			System.out.println("Enter Laptop ram size(gb): ");
			this.ramSize = s.nextInt();
			
			System.out.println("Enter Laptop weight(kg): ");
			this.weight = s.nextDouble();
			
			System.out.println("Enter Laptop price:RM ");
			this.price = s.nextDouble();
			
				
		}
		
		
		//Parameterized constructor
		Laptop(String brand, String model, String colour,String os,int ramSize,double weight,double price){
				this.brand=brand;
				this.model=model;
				this.colour=colour;
				this.os=os;
				this.ramSize=ramSize;
				this.weight=weight;
				this.price=price;
		}
}
