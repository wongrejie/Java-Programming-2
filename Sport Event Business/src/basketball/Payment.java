package basketball;

public interface Payment { 
	
	double totalPrice(); 
	double totalPrice(double disc); 
	double totalPrice(String day, double disc); 
}
