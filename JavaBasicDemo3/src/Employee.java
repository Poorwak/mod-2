
public class Employee 
{
	private int empId;
	private String empName;
	private float empSalary;
	private char Gender;
	
	public Employee()
	{
		empId = 0;
		empName = "UNKNOWN";
		empSalary = 0.0F;
		Gender =' ' ;
	}
	public Employee(int eid, String ename, float sal, char gen)
	{
		empId = eid;
		empName = ename;
		empSalary = sal;
		Gender = gen;
	}
	public String dispEmployee()
	{
		return "\n" + "EmpId= " + empId + "\n" +
				 "EmpName= " + empName + "\n" +
				 "EmpSalary= " + empSalary + "\n" +
				 "Gender= " + Gender;		 
	}
	public float calcBasicSal()
	{
		return empSalary;
	}
	
}

