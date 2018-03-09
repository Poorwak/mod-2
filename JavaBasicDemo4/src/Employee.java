
public class Employee 
{
	private int empId;
	private String empName;
	private float empSal;
	Date empDOJ;
	
	public Employee()
	{
		empId=0;
		empName="Unknown";
		empSal=0.0F;
		empDOJ=new Date();
	}

	public Employee(int empId, String empName, float empSal, Date empDOJ) 
	{
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDOJ = empDOJ;
	}
	
	public String dispEmpInfo() 
	{
		return "Employee [empId=" + empId + 
				", empName=" + empName
				+ ", empSal=" + empSal + 
				", empDOJ=" + empDOJ.dispDate() + "]";
	}
	
}
