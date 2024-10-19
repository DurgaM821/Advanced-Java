package ConstructorHandsOn;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariableHandsOn  sv1=new StaticVariableHandsOn ();
		StaticVariableHandsOn  sv2=new StaticVariableHandsOn ("Tata",17,"blue");
		StaticVariableHandsOn  sv3=new StaticVariableHandsOn ("Mahendra",25,"pink");
		
		System.out.println(sv2.getCarName());
		//Not a good practice to call with  the objects
		System.out.println(sv2.NO_OF_WHEELS);
		//good practice to call with the classname
		System.out.println(StaticVariableHandsOn.NO_OF_WHEELS);
		System.out.println(sv1.getNoOfWheels());

		

		
		
	}

}
