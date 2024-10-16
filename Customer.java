package ConstructorHandsOn;

public class Customer {

	int CustomerId;
	String name;
	String city;
	
	public Customer() {
		// Default constructor
		//System.out.println("Default constructor");
		this(12,"Meena","Madurai"); 

                
              // *****************CONSTRUCTOR CHAINING *********************************
		
		// hERE THE ONE CONSTRUCTOR INVOKES THE OTHER CONSTRUCTOR IN THE SAME CLASS
		// STEPS TO ACHEIEVE
		
		// 1. USE THE THIS KEYWORD TO CALL THE OTHER CONSTRUCTOR 
		//2. CALL TO THE COSNTRUCTOR IS THE VERY FIRST THING IN THE CONSRTRUCTOR 
		//3. A CONSTRUCTOR CANNOT CALL ITSELF 
		// 4.A COSNTRUCTOR CANNOT CALL ITSLEF
		
		
		System.out.println("Default constructor");
		
		
	}
	
	// paramterized constructor
	
	public Customer(int customerId, String Name, String City) {
		this.CustomerId=customerId;
		this.name=Name;
		this.city=City;
		
		System.out.println("Parameterized constructor");
	}
	
	// method
	
	public String gettingName() {
		System.out.println("check point1");
		 return name;
	}
	public String gettingCity() {
		System.out.println("check point2");
		return city;
	}
}
