import java.util.Scanner;
public class TestPerson 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=0;
		System.out.println("Enter number of Employees: ");
		n=sc.nextInt();
		Person per[]=new Person[n];
						
		String fName = "UNKNOWN";
		String lName = "UNKNOWN";
		String gender= " ";
		int age = 0;
		Float weight = 0.0F;
		
		for(int i=0; i<n;i++) 
		{
			System.out.println("Enter Person's First Name: ");
			fName=sc.next();
			
			System.out.println("Enter Person's Last Name: ");
			lName=sc.next();
			
			System.out.println("Enter Person's Gender: ");
			gender=sc.next();
			
			System.out.println("Enter Person's age: ");
			age=sc.nextInt();
			
			System.out.println("Enter Person's weight: ");
			weight=sc.nextFloat();
			
			
			per[i]=new Person(fName, lName, gender.charAt(0), age, weight);
			
		}
		
		for(int j=0;j<per.length; j++)
		{
			System.out.println("Person Details: "  +per[j].dispPerson());
		}
	}
}
