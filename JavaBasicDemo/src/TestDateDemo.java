
public class TestDateDemo 
{
	public static void main(String[] args)
	{
		Date poorwaDOJ=null;
		poorwaDOJ=new Date(13, 12, 2017);
		//poorwaDOJ.setDate(13, 12, 2017);
		System.out.println("Poorwa DOJ is : "+poorwaDOJ.dispDate());
		
		Date namDOJ=new Date(03, 04, 2013);
		//namDOJ.setDate(03, 04, 2013);
		System.out.println("Namrata DOJ is : "+namDOJ.dispDate());
		

		Date unknownPerson=new Date();
		//unknownPerson.initDate();
		System.out.println("Unknown person DOJ is : "+unknownPerson.dispDate());
	}

}
