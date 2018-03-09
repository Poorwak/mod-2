import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestEmpFileDemo 
{

	public static void main(String[] args) 
	{
		try
		{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("Enter Emp Id: ");
			int eid=Integer.parseInt(br.readLine());
			
			System.out.println("Enter your Name: ");
			String enm=br.readLine();
			
			System.out.println("Enter Emp Salary: ");
			float esl=Float.parseFloat(br.readLine());
			
			System.out.println(eid + " " + enm + " " +esl);
			FileWriter fw=new FileWriter("EmpInfo.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			
			Integer eIdS=new Integer(eid); //boxing converting primitive type to object because of toString 
			Float eslS=new Float(esl);
			bw.write(eIdS.toString());
			bw.write(" ");
			bw.write(enm);
			bw.write(" ");
			bw.write(eslS.toString());
			bw.newLine();
			bw.flush();
			System.out.println(" Emp Info written in a file");
		}
		
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
	}
}