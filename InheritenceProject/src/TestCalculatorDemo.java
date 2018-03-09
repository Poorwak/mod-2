class Calculator
{
	public void add(int a, int b)
	{
		System.out.println("Addition of 2 integers :" +(a+b));
	}
	public void add(int a, int b, int c)
	{
		System.out.println("Addition of 3 integers :" +(a+b+c));
	}
	public void add(byte a, byte b)
	{
		System.out.println("Byte Addition :" +(a+b));
	}
	public void add(float a, float b)
	{
		System.out.println("Float Addition  :" +(a+b));
	}
	public void add(double a, double b)
	{
		System.out.println("Double Addition  :" +(a+b));
	}
	public void add(String a, String b)
	{
		System.out.println("String Addition  :" +(a+b));
	}
	public void add(Integer a, Integer b)
	{
		System.out.println("Addition of 2 integers :" +(a+b));
	}
}
public class TestCalculatorDemo 
{
	public static void main(String[] args)
	{
		Calculator calc=new Calculator();
		calc.add(10,20);
		calc.add(10,20,30);
		calc.add("Poorwa"," Kumbhaj");
		calc.add((byte)30,(byte)20);
		calc.add(10.0F,20.0F);
		calc.add(10.0,20.0);
	}
}
