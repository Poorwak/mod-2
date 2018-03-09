
public class SalesManager extends WageEmp
{
	private int sales;
	private float comm=0.02F;
	public SalesManager() 
	{
		super();
	}
	public SalesManager(int empId, String empName, float empSal, int noofHrs, int ratePerHrs, int sales, float comm) 
	{
		super(empId, empName, empSal, noofHrs, ratePerHrs);
		this.sales = sales;
		this.comm = comm;
	}
	public float calcEmpBasicSal()
	{
		return super.calcEmpBasicSal()+(sales*comm);
	}
	public float calcEmpAnnualSal()
	{
		return super.calcEmpAnnualSal()*12;
	}
	
	
}
