import java.util.Scanner;
public class TestInheritenceGenericDemo 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("How Many Employee?");
		int empCount=sc.nextInt();
		Employee empArr[]=new Employee[empCount];
		int eid=0; String enm=null; int noofHrs=0; int ratePerHrs=0; float esl=0.0F;
		for(int i=0;i<empArr.length;i++)
		{
			System.out.println("Enter emp ID: ");
			eid=sc.nextInt();
			System.out.println("Enter emp name: ");
			enm=sc.next();
			System.out.println("Enter emp sal: ");
			esl=sc.nextFloat();
			System.out.println("What type of Emp you want?: "+ "1:Emp\t2:WageEmp\t3:SalesManager");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: empArr[i]=new Employee(eid,enm,esl);
				   break;
			case 2: System.out.println("Enter No of Hrs you worked: ");
				   noofHrs=sc.nextInt();
				   System.out.println("Enter rate per hr: ");
				   ratePerHrs=sc.nextInt();
				   empArr[i]=new WageEmp(eid,enm,esl,noofHrs,ratePerHrs);
				   break;
			default: 
				   System.out.println("Enter No of Hrs you worked: ");
				   noofHrs=sc.nextInt();
				   System.out.println("Enter rate per hr: ");
				   ratePerHrs=sc.nextInt();	
				   
				   System.out.println("Enter you have: ");
				   int sales=sc.nextInt();
				   System.out.println("Enter commission rate: ");
				   float comm=sc.nextFloat();
				   empArr[i]=new SalesManager(eid,enm,esl,noofHrs,ratePerHrs,sales,comm);
				   break;
			}
		}
		System.out.println("*******************************");
		for(int j=0; j<empArr.length;j++)
		{
			if(empArr[j] instanceof SalesManager)
			{
				System.out.println("SalesManager: "+empArr[j].dispEmpInfo()+"\n Monthly Basic Sal:"+empArr[j].calcEmpBasicSal() + 
									"\n Annual Salary: "+empArr[j].calcEmpAnnualSal());
			}
			else if(empArr[j] instanceof WageEmp)
			{
				System.out.println("WageEmp: "+empArr[j].dispEmpInfo()+"\n Monthly Basic Sal:"+empArr[j].calcEmpBasicSal() + 
						"\n Annual Salary: "+empArr[j].calcEmpAnnualSal());
			}
			else
			{
				System.out.println("Employee: "+empArr[j].dispEmpInfo()+"\n Monthly Basic Sal:"+empArr[j].calcEmpBasicSal() + 
						"\n Annual Salary: "+empArr[j].calcEmpAnnualSal());
			}
		}
	}
}
