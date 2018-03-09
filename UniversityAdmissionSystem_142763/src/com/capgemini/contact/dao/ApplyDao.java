package com.capgemini.contact.dao;

import com.capgemini.contact.bean.ApplicantBean;
import com.capgemini.contact.exception.ApplicantException;


public interface ApplyDao 
{
	public int addApplicantDetails(ApplicantBean applicant) throws ApplicantException;
	public ApplicantBean getApplicantDetails(long applicantID) throws ApplicantException;
	public int generateapplyId() throws ApplicantException;
}
