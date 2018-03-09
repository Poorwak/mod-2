import java.util.*;
public class TestIntArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> intList=new ArrayList<Integer>();
		
		Integer i1=new Integer(10);       //Converting 10 in a object. This is boxing
		Integer i2=new Integer(5);
		Integer i3=new Integer(50);
		Integer i4=new Integer(34);
		Integer i5=new Integer(5);
		
		intList.add(i1);
		intList.add(i2);
		intList.add(i3);
		intList.add(i4);
		intList.add(i5);
		
		System.out.println("*******Without Iterator*******");
		System.out.println(intList);
		System.out.println("*********With Iterator*********");
		Iterator it=intList.iterator();
		while(it.hasNext())
		{
			System.out.println(  "  :  "  +it.next());
		}
			
	}

}
