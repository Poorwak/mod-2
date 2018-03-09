import java.util.Scanner;

enum Gender
{
	M,F;
}
public class TestEnum 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String ph=" ";
		System.out.println("Enter Phone Number: ");
		ph=sc.next();
		
		
		PhoneNo p=new PhoneNo();
		p.setfName("Poorwa");
		p.setlName("Kumbhaj");
		p.setPhnNo(ph);
		Gender empGen=Gender.F;
		
		System.out.println(" Person Details: "+"\n");
		System.out.println(" ______________ "+"\n");
		System.out.println(" First Name: "+p.getfName());
		System.out.println(" Last Name: "+p.getlName());
		System.out.println(" Phone Number: "+p.getPhnNo());
		
		System.out.println(" Gender: "+empGen);
	}	

}
