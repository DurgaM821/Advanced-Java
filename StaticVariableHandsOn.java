package ConstructorHandsOn;

public class StaticVariableHandsOn {

	//  static variable example
	
	String carName;
	int horsePower;
	String color;
	/*   the static keyword where the values of the variable will be used by all the instance/object of the class,
	 eventhough there are all possiblity to change the value of the NoOFwheels..so if we don't want to change the value of the static variable
	and reminds constant we can use a constant varaible ie ..using a final keyword
	HERE WE USED THE SNAKECASE FOR COSNTANT VARIABLE
 
 	reference -->https://www.scaler.com/topics/java/static-variable-in-java/ 
	
*/
	static final int NO_OF_WHEELS=10;
	
	public StaticVariableHandsOn() {
		
	}
	
	public StaticVariableHandsOn(String carname, int Power, String colour) {
		
		this.carName=carname;
		this.horsePower=Power;
		this.color=colour;
	//this.NoOfWheels=NoOfWheels;
		
		
	}
	
	public String getCarName() {
		return carName;
	}
	public int gethorsePower() {
		return horsePower;
	}
	public int getNoOfWheels() {
		return NO_OF_WHEELS;
	}
}
