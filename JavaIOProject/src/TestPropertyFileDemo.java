import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class TestPropertyFileDemo 
{

	public static void main(String[] args) 
	{
		FileReader fr=null;
		Properties props=null; //props is used to read the file
		try 
		{
			fr=new FileReader("userInfo.properties");
			props=new Properties();  
			props.load(fr); //load(fr) is used to read only the contents of the file not the comments
			System.out.println(" ****all data****"+props.size());
			
			String unm=props.getProperty("username");
			String pwd=props.getProperty("password");
			String location=props.getProperty("location");
			String state=props.getProperty("state");
			
			System.out.println(" User Info: " + " \n " +unm + " \n " +pwd + " \n " +location + " \n " +state);
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
