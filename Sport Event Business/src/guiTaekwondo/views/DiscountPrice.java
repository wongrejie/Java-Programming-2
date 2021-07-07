package guiTaekwondo.views;

public interface DiscountPrice {
	//0 argument method
	double totalPrice();
	
	//1 argument method
	double totalPrice(int noOfParticipant);
	
	//2 argument method
	double totalPrice(String day,int noOfParticipant);
}