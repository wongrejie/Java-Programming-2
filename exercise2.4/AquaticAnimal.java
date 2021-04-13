package exercise24;

public class AquaticAnimal {
	String Type,colour,blood;
	int finNum,lifespan;
	double weight,monthlyExp;
	
	
	// Create Setter Method
	  public void setFishType(String fishType) {
		  this.Type = fishType;
	  }
	  
	  public void setColour(String colour) {
		  this.colour = colour;
	  }
	  
	  public void setFinNum(int finNum) {
		  this.finNum = finNum;
	  }
	  
	  public void setWeight(double weight) {
		  this.weight=weight;
		
	  }
	  
	  public void setBlood(String blood) {
		  switch(blood) {
		  case "warm-blooded": this.blood= "Warm-blooded, this animal is a mammal, it does not lay eggs.";
		  		break;

		  case "cold-blooded": this.blood= "Cold-blooded, this animal is a normal fish, it lay eggs.";
		  		break;
		  }
	  }
		  
	  public void setLifespan(int lifespan) {
		  
		  this.lifespan=lifespan;
		  
			}
	  
	  public void setFoodExpenses(double monthlyExp) {
			
		  this.monthlyExp=monthlyExp;
	  }	
				
 
	  

	  // Create Getter Method
	  public Integer getFinNum() {
		  return this.finNum;
	  }
	  
	  public String getFishType() {
		  return this.Type;
	  }
	  
	  public String getColour() {
	 	  return this.colour;
 	  }
	  
	  public double getWeight() {
		  return this.weight;
	  }
	  
	  public String getBlood() {
		  return this.blood;
	  }
	  
	  public int getLifespan() {
		  return this.lifespan;
	  }
	  
	  public double getFoodExpenses() {
		  return this.monthlyExp;
	  }
	  
	  
	// Create a ocean() method
	public void ocean() {
		System.out.println("There are many type of creatures live inside the ocean!");
	}
	  
	 
	}
