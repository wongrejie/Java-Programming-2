package fruitInheritence;

public class Strawberry extends Fruits { //sub class for Fruits
	private String type,colour,growthRate;
	private double price,weight;
	
	public Strawberry(String n,String t, String c,String g,double p,double w) {
		super(n);
		type=t;
		colour=c;
		growthRate=g;
		price=p;
		weight=w;
		
	}	
	
	public String getType() {
		return this.type;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public String getGrowthRate() {
		return this.growthRate;
	}
	
	public double getTotalPrice() {
		return this.weight*this.price;
	}
	
	
	public String toString() {
	        return super.toString()+"\nType = "+type+"\nColour = "+colour+"\nGrowth Rate = "+growthRate+
	        		"\nWeight (kg) = "+weight+"\nPrice per Kg = RM"+price+"\nTotal Price= RM"+getTotalPrice();
	        
	     }
}
