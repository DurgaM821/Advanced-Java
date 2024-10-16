package ConstructorHandsOn;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		System.out.println("hello world");
		
		// create an object --constructor chaining  wrapper class
		
		Customer cus1=new Customer(44,"Durga","chennai");
		Customer cus2=new Customer();
		
		System.out.println(cus1.gettingName());
		System.out.println(cus1.gettingCity());
	}

}
