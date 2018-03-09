import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class TestDeserializationDemo 
{

	public static void main(String[] args) 
	{
		FileInputStream fis;
		ObjectInputStream ois;
		
		try
		{
			fis=new FileInputStream("EmpData.obj");
			ois=new ObjectInputStream(fis);
			Emp e1=(Emp)ois.readObject();
			System.out.println("Emp Object is read as follows: "+e1);
		}
		catch(IOException |ClassNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
