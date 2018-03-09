package com.cg.empmgm.service;
import java.util.ArrayList;
import java.util.regex.Pattern;

import com.cg.empmgm.bean.Employee;
import com.cg.empmgm.dao.EmpDao;
import com.cg.empmgm.dao.EmpDaoImpl;
import com.cg.empmgm.exception.EmployeeException;
public class EmpServiceImpl implements EmpService

{
	EmpDao empDao=null;
	public EmpServiceImpl()
	{
		empDao=new EmpDaoImpl();
	}
	
	@Override
	public int addEmp(Employee emp) throws EmployeeException 
	{
		return empDao.addEmp(emp);
	}
	
	@Override
	public int DelEmp(int eid) throws EmployeeException 
	{
		return empDao.DelEmp(eid);
	}
	
	@Override
	public ArrayList<Employee> getAllEmp() throws EmployeeException 
	{
		return empDao.getAllEmp();
	}

	@Override
	public int generateEmpId() throws EmployeeException 
	{
		return 0;
	}

	@Override
	public boolean validateDigit(int empId) throws EmployeeException 
	{
		String numPattern="[0-9]{4}";
		if(Pattern.matches(numPattern, new Integer(empId).toString()))
		{
			return true;
		}
		else 
		{
			throw new EmployeeException("Only Min 4 digits allowed in empid");
		}
	}

	@Override
	public boolean validateName(String empName) throws EmployeeException 
	{
		String namePattern="[A-Z][a-z]+";
		if(Pattern.matches(namePattern, empName))
		{
			return true;
		}
		else
		{
			throw new EmployeeException("Only Chars allowed and starts with Capital e.g Poorwa");
		}
	}
}
