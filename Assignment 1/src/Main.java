package gaming;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Ultimate Gamer Center!");
		GamingCenter gc=new GamingCenter("Ultimate Gamer Center","Kuala Terengganu City Center","012-9988564","10.00 AM ~10.00 PM");
		System.out.println(gc.toString());
		
		EventDetails ed=new EventDetails("ULTIMATE GAMERS EVENT TORNAMENT","E-Sport Tornament mix gender","Kuala Terengganu City Center","012-9988564",95.0);
	
		Marketing mk=new Marketing(1000, "Friday", 95.00);
		System.out.println(mk.toString());
		mk.AdvertisementInfo();
		
		Participant pt= new Participant();
		System.out.println(pt.toString());
		
		Employee em= new Employee();
		System.out.println(em.toString());
		
		Finance f=new Finance();
		System.out.println(f.toString());

	}

}
