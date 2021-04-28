package fruitInheritence;

public class GreenApple extends Apple { //sub class of Apple
	protected int quantity;
	protected String taste;
	
	public GreenApple() { 	//constructor sub class with no argument
		super();	//inherit data,method from super class (constructor with no argument)
		taste=null;
		quantity=0;
	}
	
	public GreenApple(String n,String t,double w,double p,int q) {	//constructor sub class with argument
		super(n, w, p);	//inherit data from superclass with passing parameter
		taste=t;
		quantity=q;
		
		setInfo(n,t,w,p,q);	//call overloading method
		
	}	
	
	public void setInfo(String n,String t,double w,double p,int q) {	 //overloading method with 5 parameter
		
		if(n.equals(null))
			n = null;
		else
			name = n;
		
		if(t.equals(null))
			t = null;
		else
			taste = t;
		
		if(w >= 0)
			weight = w;
		else
			weight = 0;
		
		if(p >= 0)
			price = w;
		else
			price = 0;
		
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
	
	public String toString() {  //overriding method
	        return super.toString()+"\n"+"Taste = "+taste+"\n"+"Quantity = "+quantity+"\n"+"Average Weight per Apple (kg) = "+getWeightPerApple();
	        
	     }
}	//end for GreenApple extends Apple
