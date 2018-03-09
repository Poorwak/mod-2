public class TestPersonMain 
{
	public static void main(String[] args)
	{
		PersonMain p=new PersonMain();
		p.setFirstName("Poorwa");
		p.setLastName("Kumbhaj");
		p.setGender('F');
		
		System.out.println(" Person Details: "+"\n");
		System.out.println(" ______________ "+"\n");
		System.out.println(" First Name: "+p.getFirstName());
		System.out.println(" Last Name: "+p.getLastName());
		System.out.println(" Gender: "+p.getGender());
	}	
}	
