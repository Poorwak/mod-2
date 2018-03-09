package com.capgemini.contact.service;

import com.capgemini.contact.bean.ApplicantBean;
import com.capgemini.contact.exception.ApplicantException;


public interface ApplyService 
{
	public int addApplicantDetails(ApplicantBean applicant) throws ApplicantException;
	public ApplicantBean getApplicantDetails(long applicantID) throws ApplicantException;
	
	public boolean isValidContactNo(long phnNo) throws ApplicantException;
	public boolean validatefName(String fName) throws ApplicantException;
	public boolean validatelName(String lName) throws ApplicantException;
	public boolean validateMailID(String mailId) throws ApplicantException;
	//public boolean validatestream(String stream) throws ApplicantException;
}
