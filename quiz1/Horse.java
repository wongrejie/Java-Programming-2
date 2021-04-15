package quiz1;
import java.util.Scanner;
public class Horse {

	String horseBreed,colour;
	int lifespan,age,estimateTimeLeft;
	double weight,monthlyExp;
	
		Scanner s = new Scanner(System.in);
	// Create Setter Method
	  public void setHorseBreed() {
		  
		  System.out.printf("Enter the horse type: ");
		  this.horseBreed=s.nextLine();
		  
	  }
	  
	  public void setColour() {
		  System.out.printf("Enter the colour of the breed: ");
			this.colour = s.nextLine();
	  }
	  
	  
	  
	  public void setWeight() {
		  System.out.printf("Enter the weight of this horse(kg): ");
		  this.weight = s.nextDouble();
		
	  }
	   
	  public void setLifespan() {
		  
		  System.out.printf("Enter the lifespan of this horse: ");
		  this.lifespan = s.nextInt();
		  
			}
	  
	  public void setAge() {
		  
		  System.out.printf("Enter the age of this horse: ");
		  this.age = s.nextInt();
		  
		}
 
	  public void setFoodExpenses() {
			
		  System.out.printf("Enter the monthly food expenses of this horse: RM");
		  this.monthlyExp = s.nextDouble();
	  }	
				
 
	  

	  // Create Getter Method
	 
	  
	  public String getHorseBreed() {
		  return this.horseBreed;
	  }
	  
	  public String getColour() {
	 	  return this.colour;
 	  }
	  
	  public double getWeight() {
		  return this.weight;
	  }
	  
	  public Integer getLifespan() {
		  return this.lifespan;
	  }
	  
	  public int getAge() {
		  return this.age;
	  }
	  
	  public double getFoodExpenses() {
		  return this.monthlyExp;
	  }
	  
	  
	  
	// Create a getTimeLeft() method
	public Integer getTimeLeft() {
		
		return estimateTimeLeft= this.lifespan-age;
		
	}
}
