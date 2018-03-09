
import java.util.Scanner;

public class TestEmployeeDemo
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Employee emps[]=new Employee[3];
		
		int empId = 0;
		String empname;
		float empSalary=0.0F;
		String gender;
		
		for(int i=0; i<emps.length;i++) 
		{
			System.out.println("Enter Employee Id: ");
			empId=sc.nextInt();
			
			System.out.println("Enter Employee Name: ");
			empname=sc.next();
			
			System.out.println("Enter Employee Salary: ");
			empSalary=sc.nextFloat();
			
			System.out.println("Enter Employee Gender: ");
			gender=sc.next();
			
			emps[i]=new Employee(empId, empname, empSalary, gender.charAt(0));
		}
		
		for(int j=0;j<emps.length; j++)
		{
			System.out.println("Employee Details: "  +emps[j].dispEmployee());
		}
	}
}	