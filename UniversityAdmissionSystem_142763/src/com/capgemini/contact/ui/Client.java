package com.capgemini.contact.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.contact.bean.ApplicantBean;
import com.capgemini.contact.exception.ApplicantException;
import com.capgemini.contact.service.ApplyService;
import com.capgemini.contact.service.ApplyServiceImpl;






public class Client 
{
	static Scanner sc=null;
	static ApplyService appSer=null;
	
	public static void main(String[] args)
	{
		appSer=new ApplyServiceImpl();
		sc=new Scanner(System.in);
		int choice=0;
		
		while(true)
		{
			
			System.out.println("***********Admission System**********");
			System.out.println("Select an operation");
			System.out.println("1.Enter Applicant Details \n2.View Details based on Applicant Id \n0.Exit ");
			System.out.println("*************************************");
			System.out.println(" Please enter a choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: addApplicantDetails();
					break;
					
//				case 2: viewApplicantDetails();
//					break;	
					
				default: System.exit(0);	
			}		
		}
	}
	
	
	
/***************************Main Ends Here****************************/		

	public static void addApplicantDetails()
	{
			
		System.out.println("Enter First Name : ");
		String fnm=sc.next();
		
		try
		{
			if(appSer.validatefName(fnm))
			{
				System.out.println("Enter Last Name : ");
				String lnm=sc.next();
				
				if(appSer.validatefName(lnm))
				{
					System.out.println("Enter Contact Number : ");
					long cnum=sc.nextLong();
					
					if(appSer.isValidContactNo(cnum))
					{
						System.out.println("Enter Email Id : ");
						String mailId=sc.next();
						
						if(appSer.validateMailID(mailId))
						{
							System.out.println("Enter Stream : ");
							String strm=sc.next();
							
							//if(appSer.validatefName(fnm))
							{
								System.out.println("Enter Aggregade in Qualifying Exam : ");
								float agg=sc.nextFloat();
								
								ApplicantBean ab=new ApplicantBean();
								ab.setfName(fnm);
								ab.setlName(lnm);
								ab.setContactNo(cnum);
								ab.setEmail(mailId);
								ab.setStream(strm);
								ab.setAggregate(agg);
								
								int dataAdded=appSer.addApplicantDetails(ab);
								if(dataAdded==1)
								{
									
									System.out.println("Candidate Details Added");
								}	
								else
								{
									System.out.println("May be some exception has occured while addition");
								}
							}
//							else
//							{
//								System.out.println("Details Not Available");
//							}
						}
					}
				}
			}
		}
		catch (ApplicantException e) 
		{
			System.out.println(e.getMessage());
		}
	}

/****************************************************************/
//	private static void viewApplicantDetails() 
//	{
//		System.out.println("Enter the Applicant Id : ");
//		String fnm=sc.next();
//		try 
//		{
//			ArrayList<Mobiles> mobList=purSer.getAllMob();
//			for(Mobiles mob:mobList)
//			{
//				System.out.println(mob);
//			}
//		} 
//		catch (MobileException e) 
//		{
//			System.out.println("Some Exception while fetching data");
//			e.printStackTrace();
//		}
//		
//	}

}
