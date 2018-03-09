package com.cg.empmgm.dao;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.empmgm.bean.Employee;
import com.cg.empmgm.exception.EmployeeException;
import com.cg.empmgm.util.DBUtil;

public class EmpDaoImpl implements EmpDao
{
	Connection con =null;			//declaration of instance variable
	Statement st=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	Logger empLogger=null;
	
	public EmpDaoImpl()
	{
		PropertyConfigurator.configure("resources/log4j.properties");
		empLogger=Logger.getLogger("EmpDaoImpl.class");
	}
	@Override
	public int addEmp(Employee emp) throws EmployeeException 
	{
		String insertQry="INSERT INTO emp_142763(emp_id, emp_name, emp_sal) VALUES(?,?,?)"; 
		int dataAdded=0;
		try 
		{
			con=DBUtil.getCon();
			pst=con.prepareStatement(insertQry);
			pst.setInt(1, generateEmpId());
			pst.setString(2, emp.getEmpName());
			pst.setFloat(3, emp.getEmpSal());
			dataAdded=pst.executeUpdate();
			empLogger.log(Level.INFO, "Emp Inserted: "+emp);
		} 
		catch (Exception e) 
		{
			throw new EmployeeException(e.getMessage());
			
		} 
		finally
		{
			try 
			{
				pst.close();
				con.close();
			} 
			
			catch (SQLException e) 
			{
				empLogger.error("This is Exception"+e.getMessage());
				throw new EmployeeException(e.getMessage());
			}
			
		}
		return dataAdded;
	}

	@Override
	public ArrayList<Employee> getAllEmp() throws EmployeeException
	{
		ArrayList<Employee> empList= new ArrayList<Employee>();
		String selectQry= "SELECT * FROM emp_142763";
		Employee ee=null;
		try 
		{
			con=DBUtil.getCon();
			st=con.createStatement();
			rs=st.executeQuery(selectQry);
			while(rs.next())
			{
				ee=new Employee(rs.getInt("emp_id"),rs.getString("emp_name"),rs.getFloat("emp_sal"));
				empList.add(ee);
			}
		} 
		catch (Exception e) 
		{
			throw new EmployeeException(e.getMessage());
		} 
		finally
		{
			try 
			{
				st.close();
				con.close();
			} 
			catch (SQLException e) 
			{
				throw new EmployeeException(e.getMessage());
			}
		}
		return empList;
	}

	@Override
	public int generateEmpId() throws EmployeeException			//generates EmpId (used in addEmpId class)
	{
		String qry="SELECT emp_seq.NEXTVAL FROM DUAL";
		int generatedVal;
		try 
		{
			con=DBUtil.getCon();
			st=con.createStatement();
			rs=st.executeQuery(qry);
			rs.next();
			generatedVal=rs.getInt(1);
		} 
		catch (Exception e) 
		{
			throw new EmployeeException(e.getMessage());
		} 
		finally
		{
			try 
			{
				rs.close();
				st.close();
				con.close();
			} 
			catch (SQLException e) 
			{
				throw new EmployeeException(e.getMessage());
			}
		}
		return generatedVal;
	}
	
	@Override
	public int DelEmp(int eid) throws EmployeeException 
	{
		String deleteQry="DELETE FROM emp_142763 WHERE emp_id=?";
		int dataDeleted=0;
		
		try 
		{
			con=DBUtil.getCon();
			pst=con.prepareStatement(deleteQry);
			pst.setInt(1, eid);
			dataDeleted=pst.executeUpdate();
		} 
		catch (Exception e) 
		{
			throw new EmployeeException(e.getMessage());
			
		} 
		finally
		{
			try 
			{
				pst.close();
				con.close();
			} 
			
			catch (SQLException e) 
			{
				throw new EmployeeException(e.getMessage());
			}
			
		}
		return dataDeleted;
	}
	
}
