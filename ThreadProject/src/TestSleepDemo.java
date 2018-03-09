
public class TestSleepDemo 
{
	static Thread t1,t2=null;
	public static void main(String[] args)
	{
		System.out.println("Main Thread Starts here");
		MyThread obj1=new MyThread(" Welcome");
		MyThread obj2=new MyThread(" Capgemini");
		
		t1= new Thread(obj1);
		t2= new Thread(obj2);
		
		t1.start();
		t2.start();
		try 
		{
			t1.join();
			t2.join();
		} 
		catch (InterruptedException e1) 
		{
			
			e1.printStackTrace();
		}
		
		Thread currThread=Thread.currentThread();     //currently executing thread
		String threadName=currThread.getName();
		int threadPriority=currThread.getPriority();
		for(int i=1;i<5;i++)
		{
			System.out.println(threadName + " has priority of : "+threadPriority+ "i= "+i);
			//System.out.println(" i = "+i);
			try 
			{
				Thread.sleep(1000);				//for delay
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		}
		System.out.println("Main ends here");
	}
}
