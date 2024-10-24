package ConstructorHandsOn;

public class StaticInitializerBlock {

	int noOfStudents;
	int noOfTeachers;
	
	static byte principal;
	
	// SIB
	
	static {
		
		byte principal=1;
		System.out.println("SIB invoked from other class");
	}
	
	// IIB
	
	{
		System.out.println("IIB invoked from other class");

	}
	// default constructor
	
	public StaticInitializerBlock() {
		
	}
	// parameterized constructor
	public StaticInitializerBlock(int stu,int Teacher) {
		this.noOfStudents=stu;
		this.noOfTeachers=Teacher;
		System.out.println("Instance of the class is initialized");
	}
}



