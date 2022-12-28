package Threads;

public class ThreadDemoExtends {
	
	public static void main(String args[]) {
		MyThreads t=new MyThreads();
		t.start();     //3Threads
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Threads");
		}
		
	}

}
class MyThreads extends Thread

{
	public void run()    //overriding the run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}

