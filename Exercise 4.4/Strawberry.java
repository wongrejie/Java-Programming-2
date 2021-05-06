package fruitOverLoading;

public class Strawberry extends Fruits { //sub class of Fruits
	protected String type,colour,growthRate;
	protected double price,weight,discount;
		
	
	public Strawberry(String n,String t, String c,String g,double p,double w) {//constructor sub class with argument
		super(n);  //inherit data from superclass with passing parameter
		type=t;
		colour=c;
		growthRate=g;
		price=p;
		weight=w;
		
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
		
		return "Strawberry can helps to lower blood pressure and \n"
				+ "packed with high levels of antioxidants.";
	}	
	
	public double totalPrice() {	 //overloading method with no parameter
		
		 return this.price*this.weight;
		
}

	public double totalPrice(double p) {	 //overloading method with 1 parameter
		
		return weight*p;	
}
	
	public double totalPrice(double d,double p) {	 //overloading method with 2 parameter
		return (price*weight)-(price*weight*d);
		
}
	
	
	public String toString() { //overriding method
	        return super.toString()+"\nType = "+type+"\nColour = "+colour+"\nGrowth Rate = "+growthRate+
	        		"\nWeight (kg) = "+weight;
	        
	     }
} //end for Strawberry extends Fruits
