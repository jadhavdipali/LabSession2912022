package Assignment;

import java.util.Scanner;

public class StringReverse {
	public static void main(String args[])
	{
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Please Enter Your Name");
		     String d=sc.nextLine();
		     
		     StringBuilder sb=new StringBuilder(d);
		     sb.reverse();
		     String result=sb.toString();
		     
		     System.out.println("Reverse String is : "+result);
		     System.out.println("The UpperCase is : "+d.toUpperCase());
		   }

}


