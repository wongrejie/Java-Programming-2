package fruitInheritence;

public class Watermelon extends Fruits{ //sub class for Fruits
	private double weight;
	private double price;
	private String size;

	public Watermelon(String n,String s,double w,double p) {
		super(n);
		this.size=s;
		this.weight=w;
		this.price=p;
		
		
	}	
	
	public String getSize() {
		return this.size;
	}
	
	public double getTotalPrice() {
		return this.weight*this.price;
	}
	
	
	
	public String toString() {
	        return super.toString()+"\nSize = "+size+"\nWeight (kg) = "+weight+"\nPrice= RM"+price+"\nTotal Price= RM"+getTotalPrice();
	        
	     }
}
