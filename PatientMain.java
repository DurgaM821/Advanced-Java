package ConstructorHandsOn;
import java.util.*;
public class PatientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello world");
        
        // object is created by using a new Keyword
        
        Patient patient=new Patient();
        System.out.println(patient.FirstName);
        System.out.println(patient.LastName);
        System.out.println(patient.age);
        System.out.println(patient.Gender);
	}

}
