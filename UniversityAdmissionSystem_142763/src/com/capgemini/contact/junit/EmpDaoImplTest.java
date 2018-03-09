package com.capgemini.contact.junit;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.contact.dao.ApplyDao;
import com.capgemini.contact.dao.ApplyDaoImpl;
import com.capgemini.contact.exception.ApplicantException;



public class EmpDaoImplTest 
{
	static ApplyDao empDao=null;
	static Apply ap=null;
	
	@BeforeClass
	public static void beforeClass() throws ApplicantException
	{
		ApplyDao=new ApplyDaoImpl();
		ap=new Apply(appDao.generateEmpId(),"AAA",1000);
	}
	
	@Test
	public void testAddEmp1() throws ApplicantException
	{
		Assert.assertEquals(1, ApplyDao.addEmp(ap));
	}
	
	@Test(expected=Exception.class)
	public void testAddEmp2() throws ApplicantException
	{
		Assert.assertEquals(1, ApplyDao.addEmp(ap));
	}
	
	@Test
	public void testAddEmp3() throws ApplicantException
	{
		Assert.assertNotNull(ApplyDaoImpl.getAllEmp());
	}
	
}
