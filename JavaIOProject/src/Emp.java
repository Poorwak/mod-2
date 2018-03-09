import java.io.Serializable;
public class Emp implements Serializable, Comparable<Emp>

{
	private int empId;
	private String empName;
	private float empSal;
	
	public Emp() 
	{
		super();
		
	}
	public Emp(int empId, String empName, float empSal) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public int getEmpId() {
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
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal="
				+ empSal + "]";
	}
	@Override
	public boolean equals(Object obj)
	{
		Emp emp=(Emp)obj;
		if(this.empId==emp.empId)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public int hashCode()
	{
		return empId;
	}
	
	@Override
	public int compareTo(Emp obj)
	{
		if(this.empId<obj.empId)
		{
			return -1;
		}
		else if(this.empId==obj.empId)
		{
			return 0;
		}
		else
		{
			return +1;
		}
	}
}
