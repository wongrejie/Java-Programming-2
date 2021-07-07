package basketball;

/*
public class PriceRate implements Payment{
	
		double regFee = 50; 

		public double totalPrice() {
			return regFee;
		}
		public double totalPrice(double disc) {
			return regFee * (1-disc);
		}
	
		public double totalPrice(String d, double disc) {
			
			if(d.equals("Friday") || d.equals("Saturday")) {
				return totalPrice(0.2);
			}
			else {
				System.out.println("There is no discount on that day!");
			}
			
			return totalPrice(0.2);
		}
		
	}
*/
public class PriceRate implements Payment{
	
	double regFee = 50; 
	double ttl;

	public double totalPrice() {
		return regFee;
	}
	public double totalPrice(double disc) {
		return regFee * (1-disc);
	}

	public double totalPrice(String d, double disc) {
		
		if(d.equals("Friday") || d.equals("Saturday")) {
			ttl = disc*regFee;
			return ttl;
		}
		else {
			System.out.println("There is no discount on that day!");
		}
		
		return totalPrice(0.2);
	}
	
}
