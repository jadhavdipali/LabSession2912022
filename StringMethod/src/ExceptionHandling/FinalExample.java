package ExceptionHandling;

public class FinalExample { 
	
	public static void main(String args[]) {
		try 
		{
			int i=300,j=3,a;
			a=i/j;
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("Eception is Fired");
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("I am in Finally Block");
		}
		
	}

}
