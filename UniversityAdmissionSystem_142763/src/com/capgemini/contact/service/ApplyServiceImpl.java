package com.capgemini.contact.service;



import java.util.regex.Pattern;

import com.capgemini.contact.bean.ApplicantBean;
import com.capgemini.contact.dao.ApplyDao;
import com.capgemini.contact.dao.ApplyDaoImpl;
import com.capgemini.contact.exception.ApplicantException;




public class ApplyServiceImpl implements ApplyService
{
	ApplyDao applyDao=null;
	public ApplyServiceImpl()
	{
		applyDao=new ApplyDaoImpl();
	}
	
	@Override
	public int addApplicantDetails(ApplicantBean applicant)
			throws ApplicantException 
	{
		return applyDao.addApplicantDetails(applicant);
	}
	
	@Override
	public ApplicantBean getApplicantDetails(long applicantID)
			throws ApplicantException 
	{
		
		return applyDao.getApplicantDetails(applicantID);
	}

	

	@Override
	public boolean isValidContactNo(long phnNo)
			throws ApplicantException 
	{
		String numPattern="[7-9][0-9]{9}";
		if(Pattern.matches(numPattern, new Long (phnNo).toString()))
		{
			return true;
		}
		else
		{
			throw new ApplicantException("Enter a valid Mobile Number starting with 7,8,9");
		}
	}

	@Override
	public boolean validatefName(String fName) throws ApplicantException 
	{
		String namePattern="[A-Z][a-z]{1,19}";
		if(Pattern.matches(namePattern, fName))
		{
			return true;
		}
		else
		{
			throw new ApplicantException("Only Characters allowed and starts with UPPERCASE e.g Poorwa");
		}
				
	}

	@Override
	public boolean validatelName(String lName) throws ApplicantException 
	{
		String namePattern="[A-Z][a-z]{1,19}";
		if(Pattern.matches(namePattern, lName))
		{
			return true;
		}
		else
		{
			throw new ApplicantException("Only Characters allowed and starts with UPPERCASE e.g Poorwa");
		}
		
	}

	@Override
	public boolean validateMailID(String mailId)
			throws ApplicantException 
	{
		
		String namePattern="[A-Za-z0-9+_.-]+@(.+)$";
		if(Pattern.matches(namePattern, mailId))
		{
			return true;
		}
		else
		{
			throw new ApplicantException("Enter a valid Mail ID e.g xyz@gmail.com");
		}
	}

	

	
}	

	

