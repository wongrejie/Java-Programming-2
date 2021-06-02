package gaming;

public class GamingCenter { //1.3 user define class for super class Gaming Center

	private String centerName;
	private String location;
	private String contact;
	private String operatingHour;
	
	
	GamingCenter(String n, String l, String c, String o){ // 1.4 constructor with 3 arguments
		this.centerName=n;
		this.location=l;
		this.contact=c;
		this.operatingHour=o;
		
	}
	
	public String getCenterName() {
		return centerName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getContact() {
		return contact;
	}
	public String getOperatingHour() {
		return operatingHour;
	}
	
	
	
	@Override
	public String toString() {
		return  "\n====================================================================="+
				"\n Gaming Center Information"+
				"\n====================================================================="+
				"\n Gaming center Name \t= " + centerName +
				"\n Location \t\t= " + location + 
				"\n Contact Number \t= " + contact+
				"\n Operating hour \t= "+ operatingHour;
	}
}
