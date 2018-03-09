import java.util.Scanner;

public class TestDateDemo
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Date allDojs[]=new Date[3];
		String name[]=new String[3];
		int day = 0, mon=0, year=0;
		
		for(int i=0; i<allDojs.length;i++) 
		{
			System.out.println("Enter your Name: ");
			name[i]=sc.next();
			
			System.out.println("Enter your Day: ");
			day=sc.nextInt();
			
			System.out.println("Enter Month of Joining: ");
			mon=sc.nextInt();
			
			System.out.println("Enter Year of Joining: ");
			year=sc.nextInt();
			
			allDojs[i]=new Date(day,mon,year);
		}
		
		for(int j=0;j<allDojs.length; j++)
		{
			System.out.println(name[j] + " DOJ: "+allDojs[j].dispDate());
		}
		
		/*System.out.println("Enter Number of Employees : ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{	
			//getting input from user
		
			System.out.println("Enter Day : ");
			int dayofDoj=sc.nextInt();
			
			System.out.println("Enter Month : ");
			int monofDoj=sc.nextInt();
		
			System.out.println("Enter Year : ");
			int yearofDoj=sc.nextInt();
		
			Date EmployeeDOJ= new Date(dayofDoj, monofDoj, yearofDoj);
			System.out.println("Employee["+i+"] DOJ : "+EmployeeDOJ.dispDate());
		}*/
		
		
		
		//Second Employee
		/*System.out.println("Enter Day : ");
		int DayofDoJ=sc.nextInt();
		
		System.out.println("Enter Month : ");
		int MonofDoJ=sc.nextInt();
		
		System.out.println("Enter Year : ");
		int YearofDoJ=sc.nextInt();
		
		Date namrataDOJ= new Date(DayofDoJ, MonofDoJ, YearofDoJ);
		System.out.println("Namrata DOJ : "+namrataDOJ.dispDate());*/
	}
}
