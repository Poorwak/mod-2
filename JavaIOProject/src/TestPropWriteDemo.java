import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;


public class TestPropWriteDemo 
{

	public static void main(String[] args) 
	{
		FileWriter fw=null;
		Properties pw=null;
		
		try 
		{
			fw=new FileWriter("dbInfo.properties");
			pw= new Properties();
			pw.setProperty("dbUrl", "jdbc:oracle:thin");
			pw.setProperty("dbUserName", "system");
			pw.setProperty("dbPwd", "root");
			pw.store(fw,  "This is Oracle DB creadialtis"); //store is used to write the data in fw 
			System.out.println(" Data written in prop file");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
