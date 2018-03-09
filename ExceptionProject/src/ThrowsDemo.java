import java.io.IOException;
public class ThrowsDemo 
{
	public void method1()throws IOException
	{
		System.out.println(" Inside method 1");
		method2();
		/*try 
		{
			method2();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}*/
	}
	
	public void method2()throws IOException
	{
		System.out.println(" Inside method 2");
		throw new IOException();
		/*try 
		{
			throw new IOException();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}*/
	}
	
}
