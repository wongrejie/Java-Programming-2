package fruitInheritence;

public class Strawberry extends Fruits { //sub class of Fruits
	protected String type,colour,growthRate;
	protected double price,weight;
	
	public Strawberry() {	//constructor sub class with no argument
		super();	//inherit data,method from super class (constructor with no argument)
		type=null;
		colour=null;
		growthRate=null;
		price=0;
		weight=0;
		
	}	
	
	public Strawberry(String n,String t, String c,String g,double p,double w) {//constructor sub class with argument
		super(n);  //inherit data from superclass with passing parameter
		type=t;
		colour=c;
		growthRate=g;
		price=p;
		weight=w;
		
		setInfo(n,t,c,g,p,w); //method for overloading
		
	}	
	
public void setInfo(String n,String t, String c,String g,double p,double w) {	 //overloading method with 6 parameter
		
	if(n.equals(null))
		n = null;
	else
		name = n;
	
		if(t.equals(null))
			t = null;
		else
			type = t;
		
		if(c.equals(null))
			c = null;
		else
			colour = c;
		
		if(g=="slow"||g=="medium"||g=="fast")
			
			growthRate=g;
		else
			g = null;
		
		if(p >= 0)
			price = p;
		else
			price = 0;
		
		if(w >= 0)
			weight = w;
		else
			weight = 0;
		
		
	}
	
	public double getTotalPrice() {
		return this.weight*this.price;
	}
	
	
	public String toString() { //overriding method
	        return super.toString()+"\nType = "+type+"\nColour = "+colour+"\nGrowth Rate = "+growthRate+
	        		"\nWeight (kg) = "+weight+"\nPrice per Kg = RM"+price+"\nTotal Price= RM"+getTotalPrice();
	        
	     }
} //end for Strawberry extends Fruits
