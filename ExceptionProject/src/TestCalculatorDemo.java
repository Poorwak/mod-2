import java.time.LocalDate;
import java.util.Scanner;

class Calculator
{
	int num1;
	int num2;
	int nums[]=new int[2];
	public Calculator(){}
	public Calculator(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
		nums[0]=num1;
		nums[1]=num2;
	}
	public int doDivision()
	{
		float result=0.0F;
		
		try
		{
			/*System.out.println("3rd location of : "+ " Nums" + " is"+nums[3]);*/
			result=nums[0]/nums[1];
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Please check the divisor"+ae.getMessage());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This block is always executed whether the exception occurs or do not ocuurs in the program");
		}
		return (int)result;
	}
}
public class TestCalculatorDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num1 : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter Num2 : ");
		int num2=sc.nextInt();
		
		Calculator cc=new Calculator(num1,num2);
		System.out.println("Division of 2 numbers is :"+cc.doDivision());
		LocalDate today=null;
		System.out.println("Today is : "+today.now());

	}

}
