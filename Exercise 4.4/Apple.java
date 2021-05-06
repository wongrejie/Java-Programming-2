package fruitOverLoading;

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
		else {
			discount=0.15; //discount 15%
			totalPrice(discount,price); //call overloading method with 2 parameter
			System.out.println("Weight MORE than 5 KG, Total price: RM" + totalPrice(discount,price));
		}
		
	
	}
	
	public String Benefits() {	 //overriding method from Fruits with no parameter
		
		return "Apple contains substances that may help to prevent cancer\n"
				+ "and also compounds that help to fight Asthma.";
	}
	
	public double totalPrice() {	 //overloading method with no parameter
		
		 return this.price*this.weight;
		
}

	public double totalPrice(double p) {	 //overloading method with 1 parameter
		
		return weight*p;	
}
	
	public double totalPrice(double d,double p) {	 //overloading method with 2 parameter
		return (price*weight)-(price*d);
		
}
	
	public String toString() { //overriding method
	        return super.toString()+"\nWeight (kg) = "+weight;
	        
	     }
	
}	//end of Apple class
