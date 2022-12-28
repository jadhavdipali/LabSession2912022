package pack2;

public class ExceptionPropagationEx {
	
	public static void main(String args[]) {
		firstmethod(null);
		System.out.println("Main Method");
	}

	static void firstmethod(String s) 
	{try {
		secondmethod(s);
	}
	catch(NullPointerException e)	
	{
		System.out.println(e);
	}
	System.out.println("First Method");
	}
	static void secondmethod(String s)
	{
		thirdmethod(s);
		System.out.println("Second Method");
	}
	static void thirdmethod(String s)
	{
		System.out.println(s.toUpperCase());
			System.out.println("Third Method");
	}
}
