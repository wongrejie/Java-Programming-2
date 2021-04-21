package laptopInherite;

public class Asus extends Laptop{
	
	private double totalPrice,monthlyPayment,downPayment;
	private int quantity,paymentPeriod;
	
	public Asus(String b,String m, String c, String o,double w, double p, int q,int pp) {
		super(b,m,c,o,w,p);
		
		quantity=q;
		paymentPeriod=pp;
		
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public int getPaymentPeriod() {
		return this.paymentPeriod;
	}
	
	public double getTotalPrice() {
		totalPrice=super.getPrice()*quantity;
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
        return super.toString()+"\nQuantity = " + quantity+"\nPayment Period(months) = " +paymentPeriod;
     }
}
