package com.cg.empmgm.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.empmgm.bean.Employee;
import com.cg.empmgm.exception.EmployeeException;
import com.cg.empmgm.service.EmpService;
import com.cg.empmgm.service.EmpServiceImpl;

public class EmpClient 
{
	static Scanner sc=null;
	static EmpService empSer=null;
	public static void main(String[] args)
	{
		empSer=new EmpServiceImpl();
		sc=new Scanner(System.in);
		int choice=0;
		while(true)
		{
			
			System.out.println("What do you want to do?");
			System.out.println("1.Add EMP \t 2.Fetch All Emp \t 3.Delete Emp \t 4.Update Emp \t 5.Exit");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1: insertEmp();
					break;
				case 2: fetchAllEmp();
					break;
				case 3: delEmp();
					break;
				case 4: updateEmp();
					break;
				default: System.exit(0);;
			}
		}
	}
	
	/********************main ends here************************/
	public static void insertEmp()
	{
		System.out.println("Enter employee name : ");
		String enm=sc.next();
		Float esl=null;
		try 
		{
			if(empSer.validateName(enm))
			{
				System.out.println("Enter Salary : ");
				esl=sc.nextFloat();
				Employee ee=new Employee();
				ee.setEmpName(enm);
				ee.setEmpSal(esl);
				int dataAdded=empSer.addEmp(ee);
				if(dataAdded==1)
				{
					
					System.out.println("Employee Data Added: ");
				}
				else
				{
					System.out.println("May be some exception has occured while addition");
				}
			}
		} 
		catch (EmployeeException e) 
		{
			
			System.out.println(e.getMessage());
		}
	}
	/*************************************************/
	public static void fetchAllEmp()
	{
		try 
		{
			ArrayList<Employee> empList=empSer.getAllEmp();
			for(Employee ee:empList)
			{
				System.out.println(ee);
			}
		} 
		catch (EmployeeException e) 
		{
			System.out.println("Some Exception while fetching data");
			e.printStackTrace();
		}
	}
	/*************************************************/
	public static void delEmp()
	{
		System.out.println("Enter employee id: ");
		int eid=sc.nextInt();
		
		try 
		{
			int dataDeleted=empSer.DelEmp(eid);
			if(dataDeleted==1)
			{
				System.out.println("Employee data deleted");
			}
			else
			{
				System.out.println("May be some exception has occured while deletion");
			}
		} 
		catch (EmployeeException e) 
		{
			
			e.printStackTrace();
		}
	}
	/**************************************************/
	public static void updateEmp()
	{
		
	}
	
}
