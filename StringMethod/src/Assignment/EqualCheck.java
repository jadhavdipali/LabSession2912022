package Assignment;

public class EqualCheck {

	public static void main(String[] args) {
		String a="Dipali";
		String b="DIPALI";
		if(a.equals(b))
		{
			System.out.println("Both Strings are same");
		}
		else
		{
			System.out.println("Both Strings are not same");
			
		}
		if(b.equalsIgnoreCase(a))
		{
			System.out.println("Both Strings are same");
		}
		else
		{
			System.out.println("Both Strings are not same");	
		}

	}

}
		
