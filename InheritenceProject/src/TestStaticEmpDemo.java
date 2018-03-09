
public class TestStaticEmpDemo 
{
	static
	{
		System.out.println("This is TestStaticEmpDemo static block");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts here");
		Emp e1=new Emp(111,"Poorwa", 1000.0F);
		int id=e1.getEmpId();
		Emp e2=new Emp(222,"Namrata", 2000.0F);
		Emp e3=new Emp(333,"Rishita", 3000.0F);
		System.out.println(e1.dispEmpInfo());
		System.out.println(e2.dispEmpInfo());
		System.out.println(e3.dispEmpInfo());
		Emp.getCount();
		show();
	}
		public static void show()
		{
			System.out.println("show");
		}
}
