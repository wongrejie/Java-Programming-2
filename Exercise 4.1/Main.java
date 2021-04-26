package fruitInheritence;

public class Main {

	public static void main(String[] args) {

// 		Fruits objFruits= new Fruits("Grape");
// 		System.out.println(objFruits);
		
		Apple objApple= new Apple("Apple",3,5);
		System.out.println(objApple);
		
		GreenApple objGreenApple= new GreenApple("Green Apple","Sour",7,6,10);
		System.out.println(objGreenApple);
		
		RedApple objRedApple= new RedApple("Red Apple","Sweet",6,8,8);
		System.out.println(objRedApple);
		
		Watermelon objMelon= new Watermelon("Watermelon","Big",8,9);
		System.out.println(objMelon);
		
		Strawberry objStrBerry= new Strawberry("Strawberry","Honeoye","Bright Red","Medium",35,0.2);
		System.out.println(objStrBerry);
	
	}
}
