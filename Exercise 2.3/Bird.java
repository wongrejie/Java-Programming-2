package Main;

import java.util.Scanner;


public class Bird {	//declare variables in class.
	
	 String type,size,colour,fly,swim;
	 int lifespan,quantity,age,YearOfBorn,MonthlyExp,MonthQuantity,BirdQuantity,EstimateTimeLeft;
	 double weight,totalKilo,totalPound, totalFoodExpenses,FoodExpensesDaily,height;
	
	 Scanner s = new Scanner(System.in); //create a scanner object.
	
	void birdInfo() {
		System.out.println("Bird type: ");
		type =s.nextLine();
		
		System.out.println("Size (big/medium/small): ");
		size =s.nextLine();
		 
		System.out.println("Colour: ");
		colour =s.nextLine();
		
		System.out.println("Enter Height of the bird(meter): ");
		height =s.nextDouble();
		
		System.out.println("\nBird type: "+ type);
		System.out.println("Size: "+size);
		System.out.println("Colour: "+colour);
		System.out.println("the height of this bird is about "+height+" meter\n");
				
	}
	
	
	void printWeight() {
		
		System.out.println("Enter the weight of this bird:");
		 weight =s.nextDouble();
		System.out.println("Enter the quantity of this bird:");
		quantity =s.nextInt();
		
		totalKilo= weight*quantity;
		totalPound= totalKilo*2.205;
		
		System.out.printf("Total kilogram for "+quantity+" bird of this type can weight up to %.2f",totalKilo);
		System.out.print(" kg\n");
		System.out.printf("Total pound for "+quantity+" bird of this type can weight up to %.2f",totalPound);
		System.out.print(" pound\n");
	}
	
	void birdBehavior() {
		
		 System.out.println("\nCan this bird fly?(yes/no)");
		 s.nextLine();
		 fly =s.nextLine();
		 System.out.println("Can this bird swim?(yes/no)");
		 swim =s.nextLine();
		
		switch(fly) {
		case "yes" : System.out.println("\nthis bird can travel by flying.\n");
						break;
		case "no" : System.out.println("this bird cannot fly and it can only move on ground.\\n");
						break;
		default : 	System.out.println("Please choose only yes and no.\n");
						break;
					}
		
		switch(swim) {
		case "yes" : System.out.println("this bird can hunt their prey underwater.\n");
						break;
		case "no" : System.out.println("this bird cannot swim.\n");
						break;
		default : 	System.out.println("Please choose only yes and no./n");
						break;
					}
		}
	
	 
	void printYearOfBorn() {
		
		System.out.println("\nEnter the age of the bird(year's old):");
		age =s.nextInt();
		System.out.println("Enter the Lifespan (Years) for this type of bird:");
		lifespan =s.nextInt();
		
		YearOfBorn = 2021-age;
		EstimateTimeLeft=lifespan-age;
		
		System.out.println("\nThe year of born for this bird is "+YearOfBorn);
		System.out.println("The estimated time left for this bird to live is about "+EstimateTimeLeft+" years.");
	}
	
	void printCalFoodExpenses() {
		
		 System.out.println("\nEnter the monthly food expenses for ONE bird(RM):");
		 MonthlyExp =s.nextInt();
		
		System.out.println("Enter how many months for the expenses:");
		MonthQuantity =s.nextInt();
		
		System.out.println("Enter the quantity of birds:");
		BirdQuantity =s.nextInt();

		
		totalFoodExpenses= (MonthlyExp*MonthQuantity)*BirdQuantity;
		FoodExpensesDaily= totalFoodExpenses/30;
		 		
			System.out.println("\nThe food expenses for "+BirdQuantity+" bird of this type can cost up to "+" RM"+
								totalFoodExpenses+" for "+MonthQuantity+" months.");
			System.out.printf("And up to RM %.2f",FoodExpensesDaily);
			System.out.print(" for each day.");
	}
	
}
