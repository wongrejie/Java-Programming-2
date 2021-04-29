package fruitOverLoading;

public class Strawberry extends Fruits { //sub class of Fruits
	protected String type,colour,growthRate;
	protected double price,weight;
		
	
	public Strawberry(String n,String t, String c,String g,double p,double w) {//constructor sub class with argument
		super(n);  //inherit data from superclass with passing parameter
		type=t;
		colour=c;
		growthRate=g;
		price=p;
		weight=w;
		
		toString();//call overriding method
		totalPrice();//call overloading method with no parameter
		totalPrice(price);//call overloading method with 1 parameter
		totalPrice(weight,price); //call overloading method with 2 parameter	
	
		
	}	
	
	public String totalPrice() {	 //overloading method with no parameter
		
		 return "This Strawberry is RM"+this.price+" per KG.";
		
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
	        return super.toString()+"\nType = "+type+"\nColour = "+colour+"\nGrowth Rate = "+growthRate+
	        		"\nWeight (kg) = "+weight;
	        
	     }
} //end for Strawberry extends Fruits
