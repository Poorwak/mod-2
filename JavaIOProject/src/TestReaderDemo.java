import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;


public class TestReaderDemo 
{

	public static void main(String[] args) 
	{
		FileReader fr=null;
		FileWriter fw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try 
		{
			fr=new FileReader("MyDate.java");
			br=new BufferedReader(fr);
			fw=new FileWriter("Poorwa.txt");
			bw=new BufferedWriter(fw);
			
			String line=br.readLine();
			while(line!=null)
			{
				bw.write(line);
				bw.newLine();
				bw.flush();
				
				line=br.readLine();
			}
			System.out.println(" All data written line by line in the file");
		} 
		catch (Exception e) 
		{			
			e.printStackTrace();
		}

	}

}
