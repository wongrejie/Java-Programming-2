package fruitAbstract;

public class Apple extends Fruits { //sub class
	protected double weight;
	protected double price;
	protected double discount;
		
	public Apple(String n,double w,double p) {	//constructor with 3 arguments
		super(n);
		this.weight=w;
		this.price=p;
		
		
		if (weight<1) {
			totalPrice(); //overloading with no arguments because price and weight no changes
			System.out.println("Weight LESS than 1 KG, Total price: RM" + totalPrice());
		}
		else if (weight>1&&weight<5) {
			price=10.00;
			totalPrice(price);//call overloading method with 1 parameter
			System.out.println("Weight MORE than 1 KG AND LESS than 5 KG, Total price: RM" + totalPrice(price));
		
		} 
		else if (weight>5) {
			
			switch(name) {
			
			
			case "Apple":{
				NewPrice na= new NewPriceApple();
				price= na.newPrice();
				Discount dc= new DiscountApple();
				System.out.println("Weight MORE than 5, Discount " + dc.discountRate()*100+" %");
				discount=dc.discountRate();
				
			} break;
			
			case "Green Apple":{
				NewPrice ng= new NewPriceGreenApple();
				price= ng.newPrice();
				Discount dd= new DiscountGreenApple();
				System.out.println("Weight MORE than 5, Discount " + dd.discountRate()*100+" %");
				discount=dd.discountRate();
				
			}break;
			
			case "Red Apple":{
				NewPrice nr= new NewPriceRedApple();
				price= nr.newPrice();
				Discount de= new DiscountGreenApple();
				System.out.println("Weight MORE than 5, Discount " + de.discountRate()*100+" %");
				discount=de.discountRate();
				
			}break;
			
			default :{
				System.out.println("Invalid Discount.");
			} break;
			
			}
			
			totalPrice(discount,price); //call overloading method with 2 parameter
			System.out.println("Total price: RM" + totalPrice(discount,price));
		}
		
	
	}
	
	public String Benefits() {	 //overriding method from Fruits with no parameter
		
		return "Apple contains substances that may help to prevent cancer\n"
				+ "and also compounds that help to fight Asthma.";
	}
	
	public double totalPrice() {	 //overloading method with no parameter
		
		 return this.price*this.weight;
		
}

	public double totalPrice(double price) {	 //overloading method with 1 parameter
		
		return weight*price;	
}
	
	public double totalPrice(double discount,double price) {	 //overloading method with 2 parameter
		return (price*weight)-(price*weight*discount);
		
}
	
	public String toString() { //overriding method
	        return "\nFruit Name = "+name+"\nWeight (kg) = "+weight;
	        
	     }
	
}	//end of Apple class
