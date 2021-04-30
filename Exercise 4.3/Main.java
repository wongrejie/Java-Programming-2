package fruitOverLoading;

public class Main {

	public static void main(String[] args) {

		Fruits objFruit= new Fruits("Fruit");    //universal
		System.out.println(objFruit);
		System.out.println(objFruit.Benefits());
		System.out.println("---------------------------------------------------------");
		
		Apple objApple= new Apple("Apple",3,5);
		System.out.println(objApple.toString());		//display overriding method 
		System.out.println(objApple.totalPrice());		//display overloading method with no parameter
		System.out.println("Price status = "+
		objApple.totalPrice(objApple.price));				//display overloading method with 1 parameter
		System.out.println("Total Price = RM"+
		objApple.totalPrice(objApple.weight,objApple.price)); //display overloading method with 2 parameter	
		System.out.println(objApple.Benefits());		//display overriding method 
		System.out.println("---------------------------------------------------------");
		
		GreenApple objGreenApple= new GreenApple("Green Apple","Sour",7,6,10);
		
		System.out.println(objGreenApple.toString());		//display overriding method 
		System.out.println(objGreenApple.totalPrice());		//display overriding method  with no parameter
		System.out.println("Price status = "+
		objGreenApple.totalPrice(objGreenApple.price));				//display overloading method with 1 parameter
		System.out.println("Total Price = RM"+
		objGreenApple.totalPrice(objGreenApple.weight,objGreenApple.price)); //display overloading method with 2 parameter	
		System.out.println(objGreenApple.Benefits());		//display overriding method
		System.out.println("---------------------------------------------------------");
		
		RedApple objRedApple= new RedApple("Red Apple","Sweet",6,8,8);
		
		System.out.println(objRedApple.toString());		//display overriding method 
		System.out.println(objRedApple.totalPrice());		//display overriding method with no parameter
		System.out.println("Price status = "+
		objRedApple.totalPrice(objRedApple.price));				//display overloading method with 1 parameter
		System.out.println("Total Price = RM"+
		objRedApple.totalPrice(objRedApple.weight,objRedApple.price)); //display overloading method with 2 parameter
		System.out.println(objRedApple.Benefits());		//display overriding method
		System.out.println("---------------------------------------------------------");
		
		Watermelon objMelon= new Watermelon("Watermelon","Big",8,9);
		
		System.out.println(objMelon.toString());		//display overriding method 
		System.out.println(objMelon.totalPrice());		//display overloading method with no parameter
		System.out.println("Price status = "+
		objMelon.totalPrice(objMelon.price));				//display overloading method with 1 parameter
		System.out.println("Total Price = RM"+
		objMelon.totalPrice(objMelon.weight,objMelon.price)); //display overloading method with 2 parameter
		System.out.println(objMelon.Benefits());		//display overriding method from Fruits
		System.out.println("---------------------------------------------------------");
		
		Strawberry objStrBerry= new Strawberry("Strawberry","Honeoye","Bright Red","medium",35,0.2);
		
		System.out.println(objStrBerry.toString());		//display overriding method
		System.out.println(objStrBerry.totalPrice());		//display overloading method with no parameter
		System.out.println("Price status = "+
		objStrBerry.totalPrice(objStrBerry.price));				//display overloading method with 1 parameter
		System.out.println("Total Price = RM"+
		objStrBerry.totalPrice(objStrBerry.weight,objStrBerry.price)); //display overloading method with 2 parameter
		System.out.println(objStrBerry.Benefits());		//display overriding method 
		System.out.println("---------------------------------------------------------");
	}

	
}
