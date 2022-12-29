/* WAP take a input of age from the user if the age is above 18 print 'You are eligible to vote'
else throw an Exception That 'Age is not Correct'
*/

package labsession2912022;

import java.util.Scanner;

public class EligibleVote {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt(); 
        sc.close();

        if(age < 18)
        { 
        	throw new ArithmeticException("Age is incorrect, you are not eligible to vote!"); 
        }
        else 
        {
        	System.out.println("you are eligible to vote");
        }       

	}
}
