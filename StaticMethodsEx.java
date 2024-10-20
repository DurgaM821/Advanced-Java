package ConstructorHandsOn;

public class StaticMethodsEx {

	// Arithmetic operations
	
	double piValue=3.14;
	static final double PI_VALUE=3.14;
	
	public static void main(String args[]) {
		StaticMethodsEx sm=new StaticMethodsEx();
		
		System.out.println ("This is an example of a static mathod call without refering an object instead of className "+StaticMethodsEx.add(55, 40)); 
		int result=sm.sub(21,222);
		System.out.println( "this is the example of calling an instance method from a static method "+result);
	    System.out.println("this is a static variable called from a static method "+ StaticMethodsEx.PI_VALUE);
	    System.out.println("this is a nonstatic variable which can be accessed from the reference variable " +sm.piValue);

	}
	
	//static method
	
	public static int add(int num1,int num2) {
		int result=num1+num2;
		return result;
	}
	
	// instance method
	public int sub(int num1,int num2) {
		int result=num1-num2;
		return result;
	}
	
}
