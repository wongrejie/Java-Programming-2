package fruitAbstract;

//Discount for Apple
 class DiscountApple implements Discount {
		//method implementation
		public double discountRate() {
			return 0.15;
		}
		
 
}
//Discount for Green Apple
class DiscountGreenApple implements Discount {
		//method implementation
		public double discountRate() {
		return 0.20;
	}
//Discount for Red Apple
class DiscountRedApple implements Discount {
		//method implementation
		public double discountRate() {
			return 0.30;
		}
}
}
