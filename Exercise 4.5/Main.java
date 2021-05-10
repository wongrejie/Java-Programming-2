package fruitAbstract;

public class Main {

	public static void main(String[] args) {

//		Fruits objFruit= new Fruits("Fruit");    //universal
//		System.out.println(objFruit.toString());
//		System.out.println(objFruit.Benefits());
//		System.out.println("---------------------------------------------------------");
		
		Apple objApple= new Apple("Apple",6,5);
		System.out.println(objApple.toString());
		System.out.println(objApple.Benefits());
		System.out.println("---------------------------------------------------------");
		
		GreenApple objGreenApple= new GreenApple("Green Apple","Sour",7,6,10);
		System.out.println(objGreenApple.toString());
		System.out.println(objGreenApple.Benefits());
		System.out.println("---------------------------------------------------------");
		
		RedApple objRedApple= new RedApple("Red Apple","Sweet",6,8,8);
		System.out.println(objRedApple.toString());
		System.out.println(objRedApple.Benefits());
		System.out.println("---------------------------------------------------------");
		
		Watermelon objMelon= new Watermelon("Watermelon","Big",8,9);
		System.out.println(objMelon.toString());
		System.out.println(objMelon.Benefits());
		System.out.println("---------------------------------------------------------");
		
		Strawberry objStrBerry= new Strawberry("Strawberry","Honeoye","Bright Red","medium",35,0.2);
		System.out.println(objStrBerry.toString());
		System.out.println(objStrBerry.Benefits());
		System.out.println("---------------------------------------------------------");
		
	}

	
}
