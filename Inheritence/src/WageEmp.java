
public class WageEmp extends Employee
{
	private int noofHrs;
	private int ratePerHrs;
	public WageEmp()
	{
		super();
	}
	
	public WageEmp(int empId, String empName, float empSal, int noofHrs, int ratePerHrs) 
	{
		super(empId, empName, empSal);
		this.noofHrs = noofHrs;
		this.ratePerHrs = ratePerHrs;
	}
	public float calcWageEmpBasicSal()
	{
		return super.calcEmpBasicSal()+(ratePerHrs*noofHrs*22);
	}
	public float calcWageEmpAnnualSal()
	{
		return calcEmpAnnualSal()*12;
	}
}
