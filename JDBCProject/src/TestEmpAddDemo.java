import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestEmpAddDemo 
{

	public static void main(String[] args) 
	{
		//Load oracle type 4 driver in memory 
				Connection conn=null;
				Statement st=null;
				ResultSet rs=null;
				try 
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE", "system","Capgemini123");
	
					String insertQry="INSERT INTO emp_142763("+" emp_id,emp_name,emp_sal)" + " VALUES(666, 'Kavita', 80000)";
					st=conn.createStatement();
					int data =st.executeUpdate(insertQry);
					System.out.println(" data inserted in table:"+data);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
	}			
}
