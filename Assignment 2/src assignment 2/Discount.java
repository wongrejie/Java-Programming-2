package gaming;

public interface Discount {  //2.5 Interface, for discount rate
	
	float discountRate();
}

class WeekendDiscountRate implements Discount { //implementation of interface Discount
	
	public float discountRate() {
		return 0.15f;
	}
	
}	
	

