package fruitAbstract;

public class Strawberry extends Fruits { //sub class of Fruits
	protected String type,colour,growthRate;
	protected double price,weight,discount;
		
	
	public Strawberry(String n,String t, String c,String g,double p,double w) {//constructor sub class with argument
		super(n);  //inherit data from superclass with passing parameter
		type=t;
		colour=c;
		growthRate=g;
		price=p;
		weight=w;
		
		TotalPrice tps= new StrawberryTotalPrice();		//create an object of totalprice for strawberry
		
		if (weight<1) {
			
			System.out.println("Weight LESS than 1 KG, Total price: RM" + this.weight*this.price);
		}
		
		else if (weight>1&&weight<5) {
			
			System.out.println("Weight MORE than 1 KG AND LESS than 5 KG, Total price: RM" + tps.calTotalPrice(weight));
		
		} 
		
		else {
			Discount ds= new DiscountStrawberry();	//create an object of discount for strawberry
			System.out.println("Weight MORE than 5, Discount " + ds.discountRate()*100+" %");
			discount=ds.discountRate();
			
			System.out.println("Total price: RM" + tps.calTotalPrice(weight, discount));
		}
		
	}	
	
	public String Benefits() {	 //overriding method from Fruits with no parameter
		
		return "Strawberry can helps to lower blood pressure and \n"
				+ "packed with high levels of antioxidants.";
	}	
	
	public String toString() { //overriding method
	        return "\nFruit Name = "+name+"\nType = "+type+"\nColour = "+colour+"\nGrowth Rate = "+growthRate+
	        		"\nWeight (kg) = "+weight;
	        
	     }
} //end for Strawberry extends Fruits
