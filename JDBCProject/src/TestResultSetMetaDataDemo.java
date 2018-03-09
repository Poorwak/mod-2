import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class TestResultSetMetaDataDemo 
{

	public static void main(String[] args) 
	{
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		ResultSetMetaData rsmd=null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE", "system","Capgemini123");
			st=conn.createStatement();
			rs=st.executeQuery("SELECT * FROM emp_142763");
			rsmd=rs.getMetaData();
			int columnCount=rsmd.getColumnCount();
			
			System.out.println(" No of Columns : "+columnCount);
			for(int i=1;i<columnCount;i++)
			{
				System.out.println(i+ " Column Name: "+rsmd.getColumnName(i));
				System.out.println(i+ " Column Type: "+rsmd.getColumnType(i));
				System.out.println(i+ " Column Type Name: "+rsmd.getColumnTypeName(i));
				System.out.println(i+ " Column Label: "+rsmd.getColumnLabel(i));
				System.out.println("****************************************");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
