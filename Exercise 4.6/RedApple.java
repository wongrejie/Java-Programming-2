package fruitAbstract;

public class RedApple extends Apple { //sub class of Apple
	private double weight;
	private String taste;
	
	
	public RedApple(String n,String t,double w,double p,int q) {	//constructor sub class with argument
		super(n, q, p);		//inherit data from superclass with passing parameter
		this.taste=t;
		this.weight=w;
	}	
	
public String Benefits() {	 //overriding method  with no parameter
		
		return "Red apples contain high level of antioxidant flavonoids \n"
				+ "which help repair cellular damage.";
}
	
	public double getWeightPerApple() {	
		return this.weight/super.quantity;
	}
	
	public String toString() { //overriding method
	        return super.toString()+"\n"+"Taste = "+this.taste+"\n"+"Weight = "+this.weight+"\n"+"Average Weight per Apple (kg) ="+ getWeightPerApple();
	        
	     }

}
