class StudentEx 
{
	int roll_no;
	String name;
	StudentEx()  //no-arg constructor
	{
		this(10,"a");//calling the parametarized constructor
		System.out.println("I am no-arg constructor");
	}
	public StudentEx(int r, String n)  //parametarized constructor
	{     //this();  //calling the constructor of this class
		System.out.println("I am Parametarized constructor");
	}
	

}

public class ConstExample{
	public static void main(String args[]) {
		StudentEx s1=new StudentEx();
	}
}
