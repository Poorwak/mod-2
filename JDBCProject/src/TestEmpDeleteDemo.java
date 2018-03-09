import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class TestEmpDeleteDemo 
{

	public static void main(String[] args) 
	{
		//Load oracle type 4 driver in memory 
		Connection conn=null;
		Scanner sc=null;
		PreparedStatement pst=null;
		try 
		{
			sc=new Scanner(System.in);
					
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE", "system","Capgemini123");
			
			
			System.out.println(" Enter number of employees ");
			int empCount=sc.nextInt();
			
			for(int i=0;i<empCount;i++)
			{
				System.out.println(" Enter Id: ");
				int empId=sc.nextInt();
				System.out.println(" Enter Name: ");
				String empName=sc.next();
				System.out.println(" Enter Salary: ");
				float empSal=sc.nextFloat();
			
				String insertQry= "INSERT INTO emp_142763(emp_id,emp_name,emp_sal)VALUES(?,?,?)";     //ques marks bcz we dont know the values which are inserted
			
				pst=conn.prepareStatement(insertQry);
				pst.setInt(1,  empId);
				pst.setString(2, empName);
				pst.setFloat(3, empSal);
				int dataAdded=pst.executeUpdate();
				System.out.println(" Data is added.....");
				
			}
			System.out.println(" Enter Id which is to be deleted: ");
			int empId=sc.nextInt();
						
			String delQry="DELETE FROM emp_142763 WHERE emp_id=?";
			pst=conn.prepareStatement(delQry);
			pst.setInt(1, empId);
			pst.executeUpdate();
			System.out.println("Delete completed");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
