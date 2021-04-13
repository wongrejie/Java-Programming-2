package exercise24;

public class AquaticAnimal {
	String Type,colour,blood;
	int finNum,year,lifeSpan,age,animalQuantity;
	double weight,totalKilo,totalPound,totalFoodExp,monthlyExp;
	
	
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
	  
	  public void setWeight(double weight,int quantity,String weightType) {
		totalKilo= weight*quantity;
		totalPound= totalKilo*2.205;
		
		switch(weightType){
			case "kilogram": this.weight= totalKilo;
					break;
			case "pound": this.weight= totalPound;
		}
		
	  }
	  
	  public void setBlood(String blood) {
		  switch(blood) {
		  case "warm-blooded": this.blood= "Warm-blooded, this animal is a mammal, it does not lay eggs.";
		  		break;

		  case "cold-blooded": this.blood= "Cold-blooded, this animal is a normal fish, it lay eggs.";
		  		break;
		  }
	  }
		  
	  public void setTimeLeft(int age,int lifeSpan) {
		  
		  this.age= lifeSpan-age;
		  
			}
	  
	  public void setFoodExpenses(double monthlyExp,int monthQuantity) {
			
			
			totalFoodExp= (monthlyExp*monthQuantity)*animalQuantity;
			this.monthlyExp= totalFoodExp/30;
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
	  
	  public int getTimeLeft() {
		  return this.age;
	  }
	  
	  public double getFoodExpenses() {
		  return this.monthlyExp;
	  }
	  
	 
	}
