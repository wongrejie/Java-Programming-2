package fruitAbstract;

public class Apple extends Fruits { //sub class
	protected int quantity;
	protected double price,weight;
	protected double discount;
	
		
	public Apple(String n,int q,double p) {	//constructor with 3 arguments
		super(n);
		this.quantity=q;
		this.price=p;
		
		TotalPrice tpa= new AppleTotalPrice();	//create an object of totalprice for Apple
		
		if (this.quantity<10) {
			
			System.out.println("Quantity LESS than 10, Total price: RM" + this.price*this.quantity);
			
		}
		else if (this.quantity>10&&this.quantity<50) {
			
			System.out.println("Quantity MORE than 10 AND LESS than 50, Total price: RM" + tpa.calTotalPrice(quantity));
			
			}
			
	 
		else {
			
			switch(name) {
			
			
			case "Apple":{
				
				Discount dc= new DiscountApple();	//create an object of discount for apple
				System.out.println("Quantity MORE than 50, Discount " + dc.discountRate()*100+" %");
				discount=dc.discountRate(); 
				
			} break;
			
			case "Green Apple":{
				
				Discount dd= new DiscountGreenApple();	//create an object of discount for green apple
				System.out.println("Quantity MORE than 50, Discount " + dd.discountRate()*100+" %");
				discount=dd.discountRate();
				
			}break;
			
			case "Red Apple":{
			
				Discount de= new DiscountRedApple();	//create an object of discount for red apple
				System.out.println("Quantity MORE than 50, Discount " + de.discountRate()*100+" %");
				discount=de.discountRate();
				
			}break;
				
			default :{
				System.out.println("Invalid Discount.");
			} break;
			
			}
		
			System.out.println("Total price: RM" + tpa.calTotalPrice(quantity, discount));
		}	
		
	
	}
	
	public String Benefits() {	 //overriding method from Fruits with no parameter
		
		return "Apple contains substances that may help to prevent cancer\n"
				+ "and also compounds that help to fight Asthma.";
	}
	
	public String toString() { //overriding method
	        return "\nFruit Name = "+name+"\nQuantity = "+quantity;
	        
	     }
	
}	//end of Apple class
