package fruitOverLoading;

public class Watermelon extends Fruits{	//sub class of Fruits
	protected double weight;
	protected double price;
	protected String size;
	

	public Watermelon(String n,String s,double w,double p) {//constructor sub class with argument
		super(n);	//inherit data from superclass with passing parameter
		size=s;
		weight=w;
		price=p;
		  
		toString();//call overriding method
		totalPrice();//call overloading method with no parameter
		totalPrice(price);//call overloading method with 1 parameter
		totalPrice(weight,price); //call overloading method with 2 parameter	
	
	}	
	
	public String totalPrice() {	 //overloading method with no parameter
		
		 return "This Watermelon is RM"+this.price+" per KG.";
		
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
	
	
	
	
	
	
	public String toString() {  //overriding method
	    return super.toString()+"\nSize = "+size+"\nWeight (kg) = "+weight;
	        
	     }
	
}	//end for Watermelon extends Fruits
