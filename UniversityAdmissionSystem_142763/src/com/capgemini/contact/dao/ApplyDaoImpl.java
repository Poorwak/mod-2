package com.capgemini.contact.dao;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.capgemini.contact.bean.ApplicantBean;
import com.capgemini.contact.exception.ApplicantException;
import com.capgemini.contact.util.DBUtil;



public class ApplyDaoImpl implements ApplyDao
{
	Connection con =null;
	Statement st=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	Logger appLogger=null;
	
	public ApplyDaoImpl()
	{
		PropertyConfigurator.configure("resources/log4j.properties");
		appLogger=Logger.getLogger("ApplyDaoImpl.class");
	}
	
	@Override
	public int addApplicantDetails(ApplicantBean applicant) throws ApplicantException 
	{
		String insertQry="INSERT INTO Candidate_Detail VALUES(?,?,?,?,?,?,?)"; 
		int dataAdded=0;
		
		try 
		{
			con=DBUtil.getCon();
			pst=con.prepareStatement(insertQry);
			pst.setInt(1, generateapplyId());
			pst.setString(2, applicant.getfName());
			pst.setString(3, applicant.getlName());
			pst.setString(4, applicant.getEmail());
			pst.setLong(5, applicant.getContactNo());
			pst.setFloat(6, applicant.getAggregate());
			pst.setString(7, applicant.getStream());
			
			dataAdded=pst.executeUpdate();
			appLogger.info("Candidate Data Inserted");
		} 
		
		catch (Exception e) 
		{
			
			throw new ApplicantException(e.getMessage());
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
				appLogger.error("This is Exception"+e.getMessage());
				e.printStackTrace();
				throw new ApplicantException(e.getMessage());
			}
			
		}
		
		
		return dataAdded;
	}
/*******************************************************************/
	@Override
	public ApplicantBean getApplicantDetails(long applicantID) throws ApplicantException 
	{
		String selectQry= "SELECT * FROM Candidate_Detail WHERE applyId =?"+applicantID;
		ApplicantBean ab=null;
		
		try 
		{
			con=DBUtil.getCon();
			st=con.createStatement();
			rs=st.executeQuery(selectQry);
			while(rs.next())
			{
				ab=new ApplicantBean(rs.getLong(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getLong(5),rs.getString(6),rs.getFloat(7));
			}
			appLogger.info("Candidate Data Fetched");
		} 
		catch (Exception e) 
		{
			
			throw new ApplicantException(e.getMessage());
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
				appLogger.error("This is Exception"+e.getMessage());
				throw new ApplicantException(e.getMessage());
			}
		}
		
		return ab;
	}
/********************************************************************/
	@Override
	public int generateapplyId() throws ApplicantException 
	{
		String qry="SELECT apply_id_seq.NEXTVAL FROM DUAL";
		int generatedId;
		
		try 
		{
			con=DBUtil.getCon();
			st=con.createStatement();
			rs=st.executeQuery(qry);
			rs.next();
			generatedId=rs.getInt(1);
			appLogger.info("Candidate Id Generated");
		} 
		
		catch (Exception e) 
		{
			
			throw new ApplicantException(e.getMessage());
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
				appLogger.error("This is Exception"+e.getMessage());
				throw new ApplicantException(e.getMessage());
			}
		}
		return generatedId;
	}

}
