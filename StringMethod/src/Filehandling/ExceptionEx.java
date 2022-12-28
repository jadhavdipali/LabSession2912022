package Filehandling;

public class ExceptionEx {
	public static void main(String args[])
	{
	  int i=0;
	  int j=20;
	  System.out.println("Code before calculation");
	  try {
		  System.out.println(i/j);
	      }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	        System.out.println("Code after Calculation");  
	}

}
