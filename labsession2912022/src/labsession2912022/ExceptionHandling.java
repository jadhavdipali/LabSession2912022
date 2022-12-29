/* WAP where you take input of Two numbers (i,j)
from the user and divide the first number with second number include Exception handaling mechanism.
*/

package labsession2912022;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the value");
	   int i=sc.nextInt();
	   int j=sc.nextInt();
	   int a;
	   try
	   {
		    a=i/j;
		   System.out.println("The Division Of two Number:"+a);
	   }
	   catch(Exception e)
	   {
		   System.out.println("The Exception is :"+e);
	   }

	}

}
