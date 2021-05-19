package fruitAbstract;

public class GreenApple extends Apple { //sub class of Apple
	protected double weight;
	protected String taste;
	
	
	public GreenApple(String n,String t,double w,double p,int q) {	//constructor sub class with argument
		
		super(n, q, p);	//inherit data from superclass with passing parameter
		this.taste=t;
		this.weight=w;
	}
	
	

		
	public String Benefits() {	 //overriding method from Fruits with no parameter
		
		return "Green apples have less sugar,carbs\n"
				+ "and more fiber, protein, potassium";
}

	public double getWeightPerApple() {
		return this.weight/super.quantity;
	}
	
	public String toString() {  //overriding method
	        return super.toString()+"\n"+"Taste = "+this.taste+"\n"+"Weight = "+this.weight+"\n"+"Average Weight per Apple (kg) = "+getWeightPerApple();
	        
	     }
}
