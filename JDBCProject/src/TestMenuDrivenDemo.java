import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class TestMenuDrivenDemo 
{

	public static void main(String[] args) 
	{
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		PreparedStatement pst=null;
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE", "system","Capgemini123");
	
			System.out.println("Select: " + "\n" + "1.SELECT \t 2.INSERT \t 3.DELETE \t 4.UPDATE \t 5.SELECT PARTICULAR");
			System.out.println(" Enter your choice ");
			int choice=sc.nextInt();
			
						
			switch(choice)
			{
			case 1: 
				st=conn.createStatement();
				String selQry="SELECT emp_id, emp_name, emp_sal FROM emp_142763";
				rs=st.executeQuery(selQry);
				System.out.println(" ID \t NAME \t SALARY");
				while(rs.next())
				{	
					System.out.println(rs.getInt("emp_id") + "\t" +rs.getString("emp_name") + "\t" +rs.getInt("emp_sal"));
				}
				break;
				
			case 2:
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
				break;
				
			case 3:
				System.out.println(" Enter Id which is to be deleted: ");
				int empId=sc.nextInt();
							
				String delQry="DELETE FROM emp_142763 WHERE emp_id=?";
				pst=conn.prepareStatement(delQry);
				pst.setInt(1, empId);
				pst.executeUpdate();
				System.out.println("Delete completed");
				break;
				
			case 4:
				String updateQry="UPDATE emp_142763 SET emp_sal=emp_sal+10000 WHERE emp_sal<20000";
				pst=conn.prepareStatement(updateQry);
				
				int dataUpdated =pst.executeUpdate(updateQry);
				System.out.println("Details updated");
				break;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}			
}	


