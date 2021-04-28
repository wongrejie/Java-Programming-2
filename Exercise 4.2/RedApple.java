package fruitInheritence;

public class RedApple extends Apple { //sub class of Apple
	protected int quantity;
	protected String taste;
	
	public RedApple() {		//constructor sub class with no argument
		super();	//inherit data,method from super class (constructor with no argument)
		taste=null;
		quantity=0;
	}
	
	public RedApple(String n,String t,double w,double p,int q) {	//constructor sub class with argument
		super(n, w, p);		//inherit data from superclass with passing parameter
		taste=t;
		quantity=q;
		
		setInfo(n,t,w,p,q);	//call overloading method
	}	
	
public void setInfo(String n,String t,double w,double p,int q) {	 //overloading method with 5 parameter
		
		if(t.equals(null))
			t = null;
		else
			taste = t;
		
		if(q >= 0)
			quantity = q;
		else
			quantity = 0;
		
		
	}

	public String getTaste() {
		return taste;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getWeightPerApple() {
		return super.weight/quantity;
	}
	
	public String toString() { //overriding method
	        return super.toString()+"\n"+"Taste = "+taste+"\n"+"Quantity = "+quantity+"\n"+"Average Weight per Apple (kg) = "+getWeightPerApple();
	        
	     }

}	//end for RedApple extends Apple
