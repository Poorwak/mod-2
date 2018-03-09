package com.cg.empmgm.dao;

import java.util.ArrayList;
import com.cg.empmgm.bean.Employee;
import com.cg.empmgm.exception.EmployeeException;

public interface EmpDao 
{
	public int addEmp(Employee emp) throws EmployeeException;
	public ArrayList<Employee> getAllEmp() throws EmployeeException;
	public int generateEmpId() throws EmployeeException;
	public int DelEmp(int eid) throws EmployeeException;
}
