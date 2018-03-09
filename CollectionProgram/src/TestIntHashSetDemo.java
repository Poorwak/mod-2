import java.util.HashSet;


public class TestIntHashSetDemo 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> intSet=new HashSet<Integer>();
		
		Integer i1=new Integer(10);       //Converting 10 in a object. This is boxing
		Integer i2=new Integer(5);
		Integer i3=new Integer(50);
		Integer i4=new Integer(34);
		Integer i5=new Integer(5);
		
		intSet.add(i1);
		intSet.add(i2);
		intSet.add(i3);
		intSet.add(i4);
		intSet.add(i5);
		
		System.out.println("*******Without Iteration********");
		System.out.println(intSet);

	}

}
