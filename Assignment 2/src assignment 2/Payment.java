package gaming;

public interface Payment {	//2.5 Interface for Payment
	
	//method with no body
	double totalPrice(); 
	double totalPrice(double discount); 
	double totalPrice(String day,double discount); 
}

class PriceRate implements Payment { //implementation of interface Payment

	//calculate price with no discount
	public double totalPrice() { //overloading with no argument
		double fee=95.0;
		return fee;
	}

	//calculate price with discount
	public double totalPrice(double discount) { //overloading with 1 argument
		double fee=95.0;
		return fee*(1-discount);
	}

	//calculate price with discount base on day, discount price for weekend
	public double totalPrice(String day, double discount) { //overloading with 2 argument
		if (day.equals("friday")||day.equals("saturday")) {
			return totalPrice(discount);
	} 
		else {
			return totalPrice();
		}
	}
}