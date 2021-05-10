package fruitAbstract;

//new price for Apple above 1kg below 5kg
 class PriceAbove1kg implements NewPrice {
	//method implementation
	public double newPrice() {
		return 15.00;
	}
 }
//new price for Apple above 5kg 
 class PriceAbove5kg implements NewPrice {
		//method implementation
		public double newPrice() {
			return 12.00;
		}
}

 

 

