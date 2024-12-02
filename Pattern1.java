//  Question  --> https://bitbucket.org/yeshendraiitk33/dsa-for-faang/src/DSA-under-60-Days/assignments/09-patterns.md


import java.util.*;
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    */
		
		Scanner sc=new Scanner(System.in);
		
		/*int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+1);
			}
			System.out.println(" ");
		}
		*/

		
		/* ******************************* next pattern******************************************** */
		
		
	/*	int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<num-1;i++) {
			for(int j=1;j<num-i;j++) {
				System.out.print("8");
			}
			System.out.println();
		}
		*/
		/* pattern 3 with spaces
		 * */
		/*
		 *
        **
       ***
      ****
     *****
 
		 
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		*/
		
	/* pattern 4	
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
			//space
			 	System.out.print("/");
			}
			for(int j=0;j<n-i;j++) {
				System.out.print("8");
			}
			System.out.println(" ");
		}
		
		*/
		
		/*   pyramid problem */
		
		
		int n=sc.nextInt();
		for(int row=1;row<=n;row++) {
			for(int col=0;col<n-row;col++) {
				System.out.print("-");
			}
			for(int col=0;col<(2*row)-1;col++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
	
	
	/*	
	  *********
     *******
      *****
       ***
        *
      */  
		int no=sc.nextInt();
		
		for(int i=no;i>0;i--){ // np of rows
		    for(int s=0;s<no-i;s++){
		        System.out.print(" "); // space before the pyramid
		    }
		    
		    for(int col=1;col<=(2*i-1);col++){ // 2n-1 times the star should print
		      
		        System.out.print("*");
		    }
		    System.out.println(" ");
		    
		}
}
		

}
