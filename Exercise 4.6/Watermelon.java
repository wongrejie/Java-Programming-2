package fruitAbstract;

public class Watermelon extends Fruits{	//sub class of Fruits
	protected double weight;
	protected double price,discount;
	protected String size;
	

	public Watermelon(String n,String s,double w,double p) {//constructor sub class with argument
		super(n);	//inherit data from superclass with passing parameter
		size=s;
		weight=w;
		price=p;
		  
		TotalPrice tpw= new WatermelonTotalPrice(); //create an object of totalprice for watermelon
		
		if (weight<1) {
			
			System.out.println("Weight LESS than 1 KG, Total price: RM" + this.price*this.weight);
		}
		
		else if (weight>1&&weight<5) {
			
			System.out.println("Weight MORE than 1 KG AND LESS than 5 KG, Total price: RM" + tpw.calTotalPrice(weight));
		
		} 
		else {
			
			Discount dw= new DiscountWatermelon();	//create an object of discount for watermelon
			System.out.println("Weight MORE than 5, Discount " + dw.discountRate()*100+" %");
			discount=dw.discountRate();
			
			System.out.println("Total price: RM" + tpw.calTotalPrice(weight, discount)); 
		}
		
	}	
	
	public String Benefits() {	 //overriding method from Fruits with no parameter
		
		return "Watermelon helps to lower inflammation \n"
				+ "and oxidative Stress.";
	}	
	
	
	public String toString() {  //overriding method
	    return "\nFruit Name = "+name+"\nSize = "+size+"\nWeight (kg) = "+weight;
	        
	     }
}	//end for Watermelon extends Fruits
