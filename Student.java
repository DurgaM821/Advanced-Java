import java.util.*;
public class Student {
	String name;
	int rollno;
	// TODO Auto-generated method stub
	// Concept of constructor
	
	// Its generally used to initialiaze the valsues in the Objects and 
	//whenever an object is instastiated JVM will calls the constructor where the constructor  intialiaze the values to the objects
	
	// I will create an constructor here for example.. A cosntructor name should be same has class name, and the constructor doesn't have a return type
	/* ***********************************Important point Constructor are determined in class level not in method level" */
	public Student(String name, int rollno) {
			this.name=name;
			this.rollno=rollno;
		}

	public static void main(String[] args) {
		
		
		//instance variable
		
		
		Student s1=new Student("Durga",101);
		  Student s2=new Student("Meena",102);
         System.out.println(s1.name);
         System.out.println(s2.name);
		  
		
		  
		
		
	  
			 
		  

	}

}
