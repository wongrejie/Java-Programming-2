package fruitOverLoading;

public class GreenApple extends Apple { //sub class of Apple
	private int quantity;
	private String taste;
	
	
	public GreenApple(String n,String t,double w,double p,int q) {	//constructor sub class with argument
		super(n, w, p);	//inherit data from superclass with passing parameter
		this.taste=t;
		this.quantity=q;
	}	
	
	public String totalPrice() {	 //overriding method from class Apple with no parameter
		
		return "This fruit is a type of Apple : Green Apple"+ 
				"\nIts price is RM"+this.price+" per KG.";
		
}
	public String Benefits() {	 //overriding method from Fruits with no parameter
		
		return "Green apples have less sugar,carbs\n"
				+ "and more fiber, protein, potassium";
}

	public double getWeightPerApple() {
		return super.weight/this.quantity;
	}
	
	public String toString() {  //overriding method
	        return super.toString()+"\n"+"Taste = "+this.taste+"\n"+"Quantity = "+this.quantity+"\n"+"Average Weight per Apple (kg) = "+getWeightPerApple();
	        
	     }
}
