package laptopInherite;

public class Asus extends Laptop{
	
	private double price,totalPrice,monthlyPayment,downPayment;
	private int quantity,paymentPeriod;
	
	public Asus(String b,String m, String c, String o,double w, double p, int q,int pp) {
		super(b,m,c,o,w);
		
		price=p;
		quantity=q;
		paymentPeriod=pp;
		
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public int getPaymentPeriod() {
		return this.paymentPeriod;
	}
	
	public double getTotalPrice() {
		totalPrice=price*quantity;
		return this.totalPrice;
	}
	
	public double getDownPayment() {
		downPayment=totalPrice*0.1;
		return this.downPayment;
	}
	
	
	public double getMonthlyPayment() {
		monthlyPayment=(totalPrice-downPayment)/paymentPeriod;
		return this.monthlyPayment;
	}
	
	
	
	
	public String toString() {
        return super.toString()+"\nQuantity = " + quantity+"\nPrice = RM" + price+"\nPayment Period(months) = " +paymentPeriod;
     }

}
