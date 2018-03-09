import java.util.*;


public class TestEmpHashSetDemo 
{
	public static void main(String[] args)
	{
		HashSet<Emp> empSet=new HashSet<Emp>();
		
		Emp e1=new Emp(333, "Poorwa", 4000.0F);
		Emp e2=new Emp(111, "Namrata", 2000.0F);
		Emp e3=new Emp(222, "Shweta", 3000.0F);
		Emp e4=new Emp(444, "Rishita", 9000.0F);
		Emp e5=new Emp(333, "Poorwa", 4000.0F);
		
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		
		for(Emp tempE:empSet)
		{
			System.out.println(tempE);
		}
	}
}
