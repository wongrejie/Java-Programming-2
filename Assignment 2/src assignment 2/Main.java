package gaming;
import java.util.*;
public class Main {
	

	public static void main(String[] args) {
		boolean login=true;
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Welcome to Ultimate Gamer Center!");
		
//		GamingCenter game=new GamingCenter();
		
		EventDetails ed=new EventDetails("Ultimate Gamer Center","Kuala Terengganu City Center","012-9988564",
				"10.00 AM ~10.00 PM",10 ,"ULTIMATE GAMERS EVENT TORNAMENT","E-Sport Tornament mix gender",95.0);
					
		//display gaming center's info and event details 
		System.out.println(ed.printInfo());
		
		while(login) { //while user enter wrong type of user, it will keep looping
			
		System.out.println("\nPlease Login to access the system.");
		System.out.println("\n1.Participant."
							+ "\n2.Admin.");
		System.out.println("\nType of user: ");   //user can select the type of user which is participant or admin
		int user = sc.nextInt();
	 
		if (user==1) { 	//user has to login to access the system
		System.out.println("\nPlease Enter the login ID and password.");
		System.out.println("Login ID : ");	
		sc.nextLine();
		String participant = sc.nextLine();
		System.out.println("Password : ");	
		String password = sc.nextLine();
		
		if (participant.equals("participant")&&password.equals("12345")) {
			//if user id and password are correct, display log in successful
			
			System.out.println("\nLog in successful!");   		
			
		System.out.println("\nEnter the gaming event information you wish to learn more : "
				+ "\n A. FPS game Info"
				+ "\n B. MOBA game Info"
				+ "\n C. RTS game Info");
		
		System.out.printf("\nPick you choice: ");	//user can select game information they wish to know
		String info = sc.nextLine();
		
		if (info.equals("a")||info.equals("A")) {
			System.out.println(ed.printFpsInfo());
		}
		else if (info.equals("b")||info.equals("B")) {
			System.out.println(ed.printMobaInfo());
		}
		else if (info.equals("c")||info.equals("C")) {
			System.out.println(ed.printRtsInfo());
		}
		
		Marketing mk=new Marketing(ed.getCenterName(),ed.getLocation(),ed.getContact(),ed.getOperatingHour(),ed.getNoOfEmployee(),
				ed.getEventName(),ed.getCategory(),ed.getRegistrationFee(),999,"Friday");
		
		mk.AdvertisementInfo();  			//display advertisement and marketing info
		System.out.println(mk.printInfo());
		
		Participant pt= new Participant(ed.getCenterName(),ed.getLocation(),ed.getContact(),ed.getOperatingHour(),ed.getNoOfEmployee(),
										ed.getEventName(),ed.getCategory(),ed.getRegistrationFee());
		
		System.out.println(pt.printInfo());		//display participant info
		
		login=false;		
			}
		else {
			System.out.println("Invalid login!");  //if user id or password is wrong, display invalid login
			
				}
		}else if (user==2){
			System.out.println("\nPlease Enter the login ID and password.");
			
			System.out.println("Login ID : ");
			sc.nextLine();
			String admin = sc.nextLine();
			System.out.println("Password : ");	
			String password = sc.nextLine();
			
		if (admin.equals("admin")&&password.equals("54321")) {
			//if user id and password are correct, display log in successful
			
		System.out.println("\nLog in successful!\n");
		
		Employee eM= new Employee(ed.getCenterName(),ed.getLocation(),ed.getContact(),ed.getOperatingHour(),ed.getNoOfEmployee());
		
		System.out.println(eM.printInfo());		//display employee details
		
		Finance f=new Finance(ed.getCenterName(),ed.getLocation(),ed.getContact(),ed.getOperatingHour(),ed.getNoOfEmployee(),
								eM.getDepartment(),eM.getEmployeeID(),eM.getEmployeeName(),eM.getSalary());
		
		System.out.println(f.printInfo());		//display finance details
		
		login=false;
			}
		else {
			System.out.println("Invalid login!");  //if user id or password is wrong, display invalid login
				}
		}
		else {
			 	System.out.println("\nInvalid user!");	//if user enter wrong type of user, display invalid user	
		}
		
		}
	}

}
