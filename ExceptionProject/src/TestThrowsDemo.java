import java.io.IOException;


public class TestThrowsDemo 
{

	public static void main(String[] args) 
	{
		ThrowsDemo tt=new ThrowsDemo();
		try
		{
			tt.method1();
		}
		catch(IOException e)
		{
			System.out.println("IO Exception coming in et1");
			e.printStackTrace();
		}

	}

}
