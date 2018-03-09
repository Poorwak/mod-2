
public class TestInheritenceDemo 
{
	public static void main(String[] args)
	{
		Employee Poorwa=new Employee(111,"Poorwa K",20000.0F);
		WageEmp Namrata=new WageEmp(222,"Namrata M",5000.0F,400,5);
		System.out.println("Emp Info : "+Poorwa.dispEmpInfo());
		System.out.println("Emp Monthly Sal :"+Poorwa.calcEmpBasicSal());
		System.out.println("Emp Annual Sal :"+Poorwa.calcEmpAnnualSal());
		
		System.out.println("WageEmp Info: "+Namrata.dispEmpInfo());
		System.out.println("WageEmp Monthly Sal: "+Namrata.calcWageEmpBasicSal());
		System.out.println("WageEmp Annual Sal: "+Namrata.calcWageEmpAnnualSal());
		
		System.out.println();
		Employee Shweta=new WageEmp(444,"Shweta",5000.0F,7,500);
	}

}
