
public class TestPersonDemo 
{

	public static void main(String[] args) 
	{
		Person p1=new Person("Poorwa","UYT456VBN",10);
		Person p2=new Person("Namrata","ASD164VFD",24);
		Person p3=new Person("Shweta","UYT456VBN",10);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		/*if(p1.equals(p3))
		{
			System.out.println("  Same");
		}
		else
		{
			System.out.println("  Not Same");
		}*/
		
		
		
		Integer i1=new Integer(20);
		Integer i2=new Integer(30);
		Integer i3=new Integer(20);
		
		System.out.println("i1= "+i1);
		System.out.println("i2= "+i2);
		System.out.println("i3= "+i3);
		
		if(i1.equals(i2))
		{
			System.out.println(" Hey we are Same");
		}
		else
		{
			System.out.println(" Hey we are Different");
		}
		
		System.out.println("Hashcode of p1 "+p1.hashCode());
		System.out.println("Hashcode of p2 "+p2.hashCode());
		System.out.println("Hashcode of p3 "+p3.hashCode());
		
		System.out.println("Hashcode of i1 "+i1.hashCode());
		System.out.println("Hashcode of i2 "+i2.hashCode());
		System.out.println("Hashcode of i3 "+i3.hashCode());
	}

}
