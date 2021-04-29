package fruitInheritence;

public class Watermelon extends Fruits{	//sub class of Fruits
	protected double weight;
	protected double price;
	protected String size;
	
	public Watermelon() {	//constructor sub class with no argument
		super();	//inherit data,method from super class (constructor with no argument)
		size=null;
		weight=0;
		price=0;
		
		
	}	

	public Watermelon(String n,String s,double w,double p) {//constructor sub class with argument
		super(n);	//inherit data from superclass with passing parameter
		size=s;
		weight=w;
		price=p;
		
		setInfo(n,s,w,p);	 //method for overloading
	}	
	
public void setInfo(String n,String s,double w,double p) {	 //overloading method with 4 parameter
		
		if(n.equals(null))
			n = null;
		else
			name = n;
		
		if(s.equals(null))
			s = null;
		else
			size = s;
		
		if(w >= 0)
			weight = w;
		else
			weight = 0;
		
		if(p >= 0)
			price = w;
		else
			price = 0;
	
	}
	
	
	
	public double getTotalPrice() {
		return this.weight*this.price;
	}
	
	
	
	public String toString() {  //overriding method
	        return super.toString()+"\nSize = "+size+"\nWeight (kg) = "+weight+"\nPrice= RM"+price+"\nTotal Price= RM"+getTotalPrice();
	        
	     }
}	//end for Watermelon extends Fruits
