public class Emp 
{
	private int empId;
	private String empName;
	private float empSal;
	static int empCount;
	
	static
	{
		System.out.println("Emp Static Block :");
		empCount=5;
	}
	public int getEmpId() 
	{
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) 
	{
		this.empSal = empSal;
	}
	public Emp() 
	{
		
		// TODO Auto-generated constructor stub
	}
	public Emp(int empId, String empName, float empSal) 
	{
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		empCount++;
	
		
	}
	public String dispEmpInfo() 
	{
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal="
				+ empSal + "]";
	}
	
	public static void getCount()
	{
		System.out.println("Emp Count is :" +empCount);
	}
	
}
