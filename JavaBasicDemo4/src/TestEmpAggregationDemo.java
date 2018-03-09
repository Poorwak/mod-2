import java.util.Scanner;
public class TestEmpAggregationDemo 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Employee emps[]=new Employee[3];
		Date dt[]=new Date[3];
				
		int empId = 0;
		String empname;
		float empSal=0.0F;
		int day;
		int mon;
		int year;
		
		for(int i=0; i<emps.length;i++) 
		{
			System.out.println("Enter Employee Id: ");
			empId=sc.nextInt();
			
			System.out.println("Enter Employee Name: ");
			empname=sc.next();
			
			System.out.println("Enter Employee Salary: ");
			empSal=sc.nextFloat();
			
			System.out.println("Enter Day: ");
			day=sc.nextInt();
			
			System.out.println("Enter Month: ");
			mon=sc.nextInt();
			
			System.out.println("Enter Year: ");
			year=sc.nextInt();
			
			dt[i]=new Date(day,mon,year);
			emps[i]=new Employee(empId, empname, empSal, dt[i]);
			
		}
		
		for(int j=0;j<emps.length; j++)
		{
			System.out.println("Employee Details: "  +emps[j].dispEmpInfo());
		}
		
		
		
		/*Date pooDOJ=new Date(13,12,2017);
		Date namDOJ=new Date(13,12,2017);
		
		Employee poorwa=new Employee(142763, "Poorwa K",9000.0F,pooDOJ);
		Employee namrata=new Employee(142735, "Namrata M",9500.0F,namDOJ);
		
		System.out.println(poorwa.dispEmpInfo());
		System.out.println(namrata.dispEmpInfo());*/
	}
}
