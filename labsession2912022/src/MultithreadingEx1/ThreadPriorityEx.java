package MultithreadingEx1;

public class ThreadPriorityEx {

	public void run()
	{
		try
		{
		for(int i=0;i<=5;i++);
			System.out.println("Main Thraed");
		}
		finally
		{
			System.out.println("Child Thread");
		}
	}
}
