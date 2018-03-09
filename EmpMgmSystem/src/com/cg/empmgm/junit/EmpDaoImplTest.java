package com.cg.empmgm.junit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.empmgm.bean.Employee;
import com.cg.empmgm.dao.EmpDao;
import com.cg.empmgm.dao.EmpDaoImpl;
import com.cg.empmgm.exception.EmployeeException;

public class EmpDaoImplTest 
{
	static EmpDao empDao=null;
	static Employee ee=null;
	
	@BeforeClass
	public static void beforeClass() throws EmployeeException
	{
		empDao=new EmpDaoImpl();
		ee=new Employee(empDao.generateEmpId(),"AAA",1000);
	}
	
	@Test
	public void testAddEmp1() throws EmployeeException
	{
		Assert.assertEquals(1, empDao.addEmp(ee));
	}
	
	@Test(expected=Exception.class)
	public void testAddEmp2() throws EmployeeException
	{
		Assert.assertEquals(1, empDao.addEmp(ee));
	}
	
	@Test
	public void testAddEmp3() throws EmployeeException
	{
		Assert.assertNotNull(empDao.getAllEmp());
	}
	
}
