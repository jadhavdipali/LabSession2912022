package ExceptionHandlingEx;

public class FinalExample {
	public static void main(String args[])
	{
		int i=20,j=10;
		
		System.out.println("I am before Calculation");
		try {
			System.out.println(i/j);
		}
		catch(Exception e)
		{
			System.out.println("Exception is Fired");
		}
		finally {
			System.out.println("I am before Calculation");
		}
	}

}
