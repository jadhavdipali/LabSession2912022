package MultithreadingEx1;

public class ThreadPriority  extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class useThreadPriority
{
	public static void main(String args[])
	{
		System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority());
		ThreadPriority t=new ThreadPriority();
		
		System.out.println("Child Thrad Priority:" +t.getPriority());
		t.setPriority(8);
		System.out.println("Child Thread Priority:" +t.getPriority());
		t.start();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Main Thraed");
		}
		
	}
}
