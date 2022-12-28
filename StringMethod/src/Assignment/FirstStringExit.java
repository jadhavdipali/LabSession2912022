package Assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FirstStringExit {
	public static void main(String args[])
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String d1,d2;
			System.out.println("Enter the First name:");
			d1=br.readLine();
			System.out.println("Enter the Second name:");
			d2=br.readLine();
			System.out.println("First String:"+d1);
			System.out.println("Second String:"+d2);
			if(d1.contains(d2))
			{
				System.out.println("yes,Fist String exists in another");
				
			}
			else
			{
				System.out.println("No,First String exists in another");
			}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
				
			

   }
	
	}
