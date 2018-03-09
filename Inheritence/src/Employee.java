
public class Employee 
{
	private int empId;
	private String empName;
	private float empSal;
	public Employee(){}
	
	public Employee(int empId, String empName, float empSal) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	
	public String dispEmpInfo() 
	{
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + "]";
	}
	public float calcEmpBasicSal()
	{
		return empSal;
	}
	public float calcEmpAnnualSal()
	{
		return calcEmpBasicSal() * 12;
	}
}
