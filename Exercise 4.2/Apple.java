package fruitInheritence;

public class Apple extends Fruits { //sub class
	protected double weight;
	protected double price;
	
	public Apple() {	//constructor with no arguments
		super();
		weight=0;	//declare weight=0, price=0
		price=0;
			
	}	
	
	public Apple(String n,double w,double p) {	//constructor with 3 arguments
		super(n);
		weight=w;
		price=p;
		
		setTotalPrice(n,w,p); //call overloading method
		
	}	
	
	public void setTotalPrice(String n,double w,double p) {	 //overloading method with 3 parameter
		
		if(n.equals(null))
			n = null;
		else
			name = n;
		
		if(w >= 0)
			weight = w;
		else
			weight = 0;
		
		if(p >= 0)
			price = p;
		else
			price = 0;
	}
	
	
	public double getTotalPrice() {
		return weight*price;
	}
	
	
	
	
	public String toString() { //overriding method
	        return super.toString()+"\nWeight (kg) = "+weight+"\nPrice per Kg = RM"+price+"\nTotal Price= RM"+getTotalPrice();
	        
	     }
	
}	//end of Apple class
