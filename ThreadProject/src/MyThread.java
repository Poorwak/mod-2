
public class MyThread implements Runnable
{
	String msg;
	public MyThread(String msg)
	{
		this.msg=msg;
	}
	@Override
	public void run()
	{
		Thread currThread=Thread.currentThread();
		if(currThread==TestSleepDemo.t2)
		{
			try 
			{
				TestSleepDemo.t1.join();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		for(int j=0;j<3;j++)
		{
			System.out.println(currThread.getName() + " Says: "+msg);
		}
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	}
}
