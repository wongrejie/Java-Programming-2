package fruitOverLoading;

public class RedApple extends Apple { //sub class of Apple
	private int quantity;
	private String taste;
	
	
	public RedApple(String n,String t,double w,double p,int q) {	//constructor sub class with argument
		super(n, w, p);		//inherit data from superclass with passing parameter
		this.taste=t;
		this.quantity=q;
	}	
	
public String Benefits() {	 //overriding method  with no parameter
		
		return "Red apples contain high level of antioxidant flavonoids \n"
				+ "which help repair cellular damage.";
}
	
	public double getWeightPerApple() {	
		return super.weight/this.quantity;
	}
	
	public String toString() { //overriding method
	        return super.toString()+"\n"+"Taste = "+this.taste+"\n"+"Quantity = "+this.quantity+"\n"+"Average Weight per Apple (kg) = "+getWeightPerApple();
	        
	     }

}
