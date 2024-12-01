// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	 int num=34;
	 boolean istrue=true;
	 
	 String str1=String.valueOf(num);
	 System.out.println(String.valueOf(istrue));
	 System.out.println(str1+8);
	 
	 String text="Hello, How are you?";
	 System.out.println(text.indexOf("?"));
	 
	 System.out.println(text.contains("Hello")); // true
	 System.out.println(text.contains("=")); // false
	 
	 System.out.println(text.startsWith("Hello")); // true
	 System.out.println(text.endsWith("?")); // true
	 System.out.println(text.endsWith("u?")); // true
	 
	 System.out.println(text.matches(".* How.*")); // true where the .* will have the Regex
	 
	 String str3="   \n  Hello World   ";
	 System.out.println(str3.trim());
	 System.out.println("Hello World".equals(str3.trim())); // true as it romves the space and escapesequence but not inbetween the string
	 
	 String messg="Hi, Aliens==";
	 System.out.println(messg.substring(2,12));// exclusive as it ignored the comma -- 
	// , Aliens==
	 
	 // replace method
	 
	 System.out.println(messg.replace('H','j')); // ji, Aliens==
	 //System.out.println(messg.replaceAll("Aliens==", "julien"));
	 System.out.println(messg.replaceAll("a|i|e","*")); //H*, Al**ns==
	 String fruits="Mango Apple orange guvava Mango";
	 System.out.println(fruits.replaceFirst("Mango","Annachi"));// here only first string alone changed
	 //o/p  Annachi Apple orange guvava Mango
	 
	}
}
