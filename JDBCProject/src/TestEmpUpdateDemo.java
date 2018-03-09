import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class TestEmpUpdateDemo 
{

	public static void main(String[] args) 
	{
		Connection conn=null;
		Statement st=null;
		PreparedStatement pst;
		
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE", "system","Capgemini123");
			
			String updateQry="UPDATE emp_142763 SET emp_sal=emp_sal+10000 WHERE emp_sal<20000";
			pst=conn.prepareStatement(updateQry);
			
			int dataUpdated =pst.executeUpdate(updateQry);
			System.out.println("Details updated");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
