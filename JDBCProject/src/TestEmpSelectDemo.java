import java.sql.*;


public class TestEmpSelectDemo
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
			st=conn.createStatement();
			String selQry="SELECT emp_id, emp_name, emp_sal FROM emp_142763";
			rs=st.executeQuery(selQry);
			
			System.out.println(" ID \t NAME \t SALARY");
			while(rs.next())
			{	
				System.out.println(rs.getInt("emp_id") + "\t" +rs.getString("emp_name") + "\t" +rs.getInt("emp_sal"));
			}	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
