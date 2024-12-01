/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		 String message = "Java is fun!";
        System.out.println(message.charAt(11));
        
         
        String text = "Hello, Java!";
        String emptyString = "";
     
     System.out.println(text.isEmpty());       // false
     System.out.println(emptyString.isEmpty()); // true
     System.out.println("".equals(emptyString)); // true
     System.out.println(emptyString.length()==0); // true
     
     
     String present=null;
     System.out.println("".equals(present));  // false has it contains nulls
     
     String emptyspace="    ";
     System.out.println(emptyspace.isBlank()); // true
     
     
     
	}
}
