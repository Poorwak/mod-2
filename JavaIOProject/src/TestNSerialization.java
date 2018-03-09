import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class TestNSerialization 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp Id: ");
		int empId=sc.nextInt();
		
		System.out.println("Enter Emp Name: ");
		String empName=sc.next();

		System.out.println("Enter Emp Salary: ");
		float empSal=sc.nextFloat();
		
		Emp e1=new Emp(empId, empName, empSal);
		FileOutputStream fos;
		
		try
		{
			fos=new FileOutputStream("EmpData.obj");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(e1);
			System.out.println("Emp Object is written in a file");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}


