package fruitAbstract;

  class AppleTotalPrice implements TotalPrice{
	 
	
	  	public double calTotalPrice(double quantity) {	//overloading method with 1 parameter
			double price=1.5;
			return quantity*price;	
		}
		
		
		public double calTotalPrice(double quantity, double discount) {	//overloading method with 2 parameter
			double price=1;
			return (price*quantity)-(price*quantity*discount);
		}
		
}	
  
  class StrawberryTotalPrice implements TotalPrice{
		 
		
	  	public double calTotalPrice(double weight) {	//overloading method with 1 parameter
			double price=40.00;
			return weight*price;	
		}
		
		
		public double calTotalPrice(double weight, double discount) {	//overloading method with 2 parameter
			double price=90.00;
			return (price*weight)-(price*weight*discount);
		}
		
}
  
  class WatermelonTotalPrice implements TotalPrice{
		 
		
	  	public double calTotalPrice(double weight) {	//overloading method with 1 parameter
			double price=15.00;
			return weight*price;	
		}
		
		
		public double calTotalPrice(double weight, double discount) {	//overloading method with 2 parameter
			double price=20.00;
			return (price*weight)-(price*weight*discount);
		}
		
}
