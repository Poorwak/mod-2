import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class Calculator
{
	int num1;
	int num2;
	public Calculator(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public int divide() throws ArithmeticException
	{
		int result=num1/num2;
		return result;
	}
}
public class TestCalculator 
{

	public static void main(String[] args) 
	{
		PropertyConfigurator.configure("resources/log4j.properties");
		Logger myLogger=Logger.getLogger("TestCalculator.class");
		Scanner sc=new Scanner(System.in);
		myLogger.debug("Main starts here: This is debug message");
		System.out.println("Enter Number 1: ");
		int n1=sc.nextInt();
		myLogger.info("This is Info message: "+n1);
		
		System.out.println("Enter Number 2: ");
		int n2=sc.nextInt();
		myLogger.warn("This is warn message: "+n2);
		Calculator cc=new Calculator(n1,n2);
		myLogger.fatal("This is fatal error");
		try
		{
			int res=cc.divide();
			System.out.println("Division is : "+res);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
			myLogger.error(ee.getMessage());
		}
	}
}
