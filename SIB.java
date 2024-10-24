package ConstructorHandsOn;

public class SIBMain {

	// SIB
	
		static {
			
			byte principal=1;
			System.out.println("SIB invoked from the same class");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("main method called");
		StaticInitializerBlock sib=new StaticInitializerBlock();
		StaticInitializerBlock sib1=new StaticInitializerBlock(22,5);
        System.out.println(StaticInitializerBlock.principal);
		
	}

}
