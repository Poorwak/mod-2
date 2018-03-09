import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class TestFileReadDataDemo 
{
	public static void main(String[] args)
	{
		/*************Which File?****************/
		File myFile=new File
		("D:/JAVA Work Space/JavaBAsicDemo2/src/Date.java");
		FileOutputStream fos=null;
				
		try 
		{
			FileInputStream fis=new
					FileInputStream(myFile);
			fos=new 
			FileOutputStream("MyDate.java");		
			int data=fis.read();
			while(data!=-1)
			{
				fos.write(data);
				fos.flush();
				data=fis.read();
			}
			System.out.println(" All Data is written");
		}	
		catch (FileNotFoundException e) 
		{			
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
			
		 
		
	}
}
