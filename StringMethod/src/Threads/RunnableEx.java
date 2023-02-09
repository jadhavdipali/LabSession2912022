package Threads;

public class RunnableEx {
	public static void main(String args[])
	{
	  MyRunnable r=new MyRunnable();
	  Thread t= new Thread(r);
	  Thread t1=new Thread();
	  t1.start();
	  for(int i=1;i<=5;i++)
	  {
		  System.out.println("Main Thread");
	  }
	  
	}

}
class MyRunnable implements Runnable
{
	public void run()   //overriding the run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
