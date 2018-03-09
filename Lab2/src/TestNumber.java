import java.util.Scanner;
public class TestNumber 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=0;
		System.out.println("Enter number: ");
		n=sc.nextInt();
		
		 if(n>0)
		 {
			System.out.println("Number is Positive.");
		 }	
		
		 else
		 {
			 System.out.println("Number is Negative.");
		 }
	}
}
