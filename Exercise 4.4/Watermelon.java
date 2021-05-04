package fruitOverLoading;

public class Watermelon extends Fruits{	//sub class of Fruits
	protected double weight;
	protected double price,discount;
	protected String size;
	

	public Watermelon(String n,String s,double w,double p) {//constructor sub class with argument
		super(n);	//inherit data from superclass with passing parameter
		size=s;
		weight=w;
		price=p;
		  
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
		
		return "Watermelon helps to lower inflammation \n"
				+ "and oxidative Stress.";
	}	
	
	public double totalPrice() {	 //overloading method with no parameter
		
		 return this.price*this.weight;
		
}

	public double totalPrice(double p) {	 //overloading method with 1 parameter
		
		return weight*p;	
}
	
	public double totalPrice(double d,double p) {	 //overloading method with 2 parameter
		return price-(price*d);
		
}

	
	public String toString() {  //overriding method
	    return super.toString()+"\nSize = "+size+"\nWeight (kg) = "+weight;
	        
	     }
	
}	//end for Watermelon extends Fruits
