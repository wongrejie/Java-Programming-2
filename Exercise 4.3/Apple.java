package fruitOverLoading;

public class Apple extends Fruits { //sub class
	protected double weight;
	protected double price;
	
		
	public Apple(String n,double w,double p) {	//constructor with 3 arguments
		super(n);
		this.weight=w;
		this.price=p;
		
		
		toString();			//call overriding method
		totalPrice();			//call overloading method with no parameter
		totalPrice(price);		//call overloading method with 1 parameter
		totalPrice(weight,price); 	//call overloading method with 2 parameter	
		Benefits();			//call overriding method
		
	}	
	
	public String Benefits() {	 //overriding method from Fruits with no parameter
		
		return "Apple contains substances that may help to prevent cancer\n"
				+ "and also compounds that help to fight Asthma.";
	}
	
	public String totalPrice() {	 //overloading method with no parameter
		
		 return "This Apple is RM"+this.price+" per KG.";
		
}

	public String totalPrice(double p) {	 //overloading method with 1 parameter
		
		
		if(p>0)
			return "Price is countable";
		else
			return "Invalid input, Please insert a correct price.";
		
		
}
	
	public double totalPrice(double w,double p) {	 //overloading method with 2 parameter
		
		return this.price*this.weight;
}
	
	public String toString() { //overriding method
	        return super.toString()+"\nWeight (kg) = "+weight;
	        
	     }
	
}	//end of Apple class
