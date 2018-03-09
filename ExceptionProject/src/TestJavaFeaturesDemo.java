import static java.lang.Math.*;

class Parent
{
	public void print()
	{
		System.out.println(" Parent : ");
	}
	public int add(int ...numbers)
	{
		int sum=0;
		for(int j=0;j<numbers.length;j++)
		{
			sum = sum + numbers[j];
		}
		
		return sum;
	}
}

class Child extends Parent
{
	@Override
	public void print()
	{
		System.out.println(" Child : ");
	}
}

public class TestJavaFeaturesDemo 
{
	public static void main(String[] args) 
	{
		System.out.println(" PI = "+PI);
		System.out.println(" Cube of 2 = "+pow(2,3));
		
		Parent pp=new Parent();
		System.out.println("Addition of 2 numbers is : "+pp.add(9,80));
		System.out.println("Addition of 3 numbers is : "+pp.add(9,80,90));
		System.out.println("Addition of n numbers is : "+pp.add(9,80,90,34));
		
		System.out.println("******** Enhance For Loop");
		int marks[]=new int[3];
		marks[0]=90;
		marks[1]=10;
		marks[2]=80;
		
		String cityList[]={"Pune", "Mumbai", "Noida", "Sahibabad"};
		for(int tempMarks:marks)
		{
			System.out.println(" "+tempMarks);
		}
		for(String city:cityList)
		{
			System.out.println(" "+city);
		}
	}

}
