
public class TestEmployeeDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee poorwa=null;
		poorwa=new Employee(142763, "Poorwa", 9000, 'F');
		System.out.println("Poorwa Details : "+poorwa.dispEmployee());
		
		Employee namrata=new Employee(142735, "Namrata", 9000, 'F');
		System.out.println("Namrata Details : "+namrata.dispEmployee());
		

		Employee unknownPerson=new Employee();
		System.out.println("Unknown person Details : "+unknownPerson.dispEmployee());
	}

}
