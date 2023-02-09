pakage StringMethod;

import java.util.Scanner;

public class StaticFinal {
	
	
		//pi*r*r
		//double r;
		static final double PI=3.14;
		
		public static void main(String args[])
		{
			int r;
			//r = radius of Circle;
			int r1=6,radius;
			double pi=3.14,area;
			print("Enter radius of Circle:");
			Scanner s;
			r1=s.nextInt();
			area=pi*r1*r1;
			System.out.println("Area of Circle:"+area);
		
	}

		private static void print(String string) 
		{
			System.out.print("Area of Circle");// TODO Auto-generated method stub
			
		}
}
