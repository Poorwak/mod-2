package com.cg.empmgm.service;

import java.util.ArrayList;

import com.cg.empmgm.bean.Employee;
import com.cg.empmgm.exception.EmployeeException;

public interface EmpService 
{
	public int addEmp(Employee emp) throws EmployeeException;
	public ArrayList<Employee> getAllEmp() throws EmployeeException;
	public int generateEmpId() throws EmployeeException;
	public boolean validateDigit(int empId) throws EmployeeException;
	public boolean validateName(String empName) throws EmployeeException;
	public int DelEmp(int eid) throws EmployeeException;
}
