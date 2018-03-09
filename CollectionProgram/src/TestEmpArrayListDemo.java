import java.util.ArrayList;
import java.util.Iterator;


public class TestEmpArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Emp> empList= new ArrayList<Emp>();
		
		Emp e1=new Emp(333, "Poorwa", 4000.0F);
		Emp e2=new Emp(111, "Namrata", 2000.0F);
		Emp e3=new Emp(222, "Shweta", 3000.0F);
		Emp e4=new Emp(444, "Rishita", 9000.0F);
		Emp e5=new Emp(333, "Poorwa", 4000.0F);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		System.out.println("**********Print Without Iterator*************");
		System.out.println(empList);
		
		System.out.println("**********Print using Iterator*************");
		
		Iterator<Emp> empListIt=empList.iterator();
		while(empListIt.hasNext())
		{
			Emp tempEmp=empListIt.next();
			System.out.println(" ID : "+tempEmp.getEmpId());
			System.out.println(" Name : "+tempEmp.getEmpName());
			System.out.println(" Salary : "+tempEmp.getEmpSal());
			System.out.println("----------------------------");
		}
	}

}
