package fruitAbstract;

 class DiscountApple implements Discount {

		public double discountRate() {
			return 0.15;
		}
		
 
}

class DiscountGreenApple implements Discount {

		public double discountRate() {
		return 0.20;
	}
	
class DiscountRedApple implements Discount {

		public double discountRate() {
			return 0.30;
		}
}
}