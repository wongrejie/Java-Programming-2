package gaming;

public abstract class GamingCenter { //2.4 abstraction, define super class as abstract
	
	protected String centerName;
	protected String location;
	protected String contact;
	protected String operatingHour;
	protected int noOfEmployee;
	
	
	public GamingCenter(String n, String l, String c, String o, int noEm){ 
		this.centerName=n;
		this.location=l;
		this.contact=c;
		this.operatingHour=o;
		this.noOfEmployee=noEm;
		
	}
	
	public String getCenterName() {	//2.3 encapsulation, setter getter methods
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
	
	public int getNoOfEmployee() {
		return noOfEmployee;
	}
	
	public void setCenterName(String n) {
		this.centerName=n;
	}

	public void setLocation(String l) {
		this.location=l;
	}
	
	public void setContact(String c) {
		this.contact=c;
	}
	
	public void setOperatingHour(String o) {
		this.operatingHour=o;
	}
	
	public void setNoOfEmployee(int noEm) {
		this.noOfEmployee=noEm;
	}
	
	public String printInfo() { //2.2 Polymorphism, method printInfo() in all class
		return  "\n====================================================================="+
				"\n Gaming Center Information"+
				"\n====================================================================="+
				"\n Gaming center Name \t= " + centerName +
				"\n Location \t\t= " + location + 
				"\n Contact Number \t= " + contact+
				"\n Operating hour \t= "+ operatingHour+
				"\n Number of Employee \t= "+ noOfEmployee+ " pax";
	}
}
