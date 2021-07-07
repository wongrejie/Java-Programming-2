package BowlingCentre;

public interface TotalPayment {
	
	//method with no body
	double totalPrice(); //with no argument
	
	double totalPrice(double disc); //with one argument
	
	double totalPrice(String day, double disc); //with two arguments
	
}
