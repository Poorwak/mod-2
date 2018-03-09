import java.util.Scanner;

public class TestPhoneNo 
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
		p.setGender('F');
		p.setPhnNo(ph);
		
		System.out.println(" Person Details: "+"\n");
		System.out.println(" ______________ "+"\n");
		System.out.println(" First Name: "+p.getfName());
		System.out.println(" Last Name: "+p.getlName());
		System.out.println(" Gender: "+p.getGender());
		System.out.println(" Phone Number: "+p.getPhnNo());
	}	
}	