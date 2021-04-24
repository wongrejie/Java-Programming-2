package fruitInheritence;

public class Apple extends Fruits { //sub class
	protected double weight;
	private double price;
	
	
	public Apple(String n,double w,double p) {
		super(n);
		this.weight=w;
		this.price=p;
		
		
	}	
	
	public double getTotalPrice() {
		return this.weight*this.price;
	}
	
	
	
	public String toString() {
	        return super.toString()+"\nWeight (kg) = "+weight+"\nPrice per Kg = RM"+price+"\nTotal Price= RM"+getTotalPrice();
	        
	     }
	
}
