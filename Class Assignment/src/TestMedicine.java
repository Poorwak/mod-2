import java.util.Scanner;
public class TestMedicine 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("How Many Medicines?");
		int medCount=sc.nextInt();
		Medicine medArr[]=new Medicine[medCount];
		String medName=null;
		String compName=null;
		String expDate=null;
		float price=0.0F;
		for(int i=0;i<medArr.length;i++)
		{
						
			System.out.println("What type of Medicine you want?: "+ "1:Tablet\t2:Ointment\t3:Syrup");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: 
			   						   		
			   			System.out.println("Enter medicine name: ");
						medName=sc.next();
				
						System.out.println("Enter company name: ");
						compName=sc.next();
				
						System.out.println("Enter expiry date: ");
						expDate=sc.next();
				
						System.out.println("Enter price of medicine: ");
						price=sc.nextFloat();
			   			
						medArr[i]=new Tablet(medName,compName,expDate,price);
			   			break;
			   			
				case 2: 
			   		
	   					System.out.println("Enter medicine name: ");
	   					medName=sc.next();
		
	   					System.out.println("Enter company name: ");
	   					compName=sc.next();
		
	   					System.out.println("Enter expiry date: ");
	   					expDate=sc.next();
		
	   					System.out.println("Enter price of medicine: ");
	   					price=sc.nextFloat();
	   			
	   					medArr[i]=new Ointment(medName,compName,expDate,price);
	   					break;	
	   					
			
				default: 
		   		
						 System.out.println("Enter medicine name: ");
						 medName=sc.next();

						 System.out.println("Enter company name: ");
						 compName=sc.next();

						 System.out.println("Enter expiry date: ");
						 expDate=sc.next();

						 System.out.println("Enter price of medicine: ");
						 price=sc.nextFloat();
	
						 medArr[i]=new Syrup(medName,compName,expDate,price);
						 break;		
			}
		}
		
		System.out.println("*******************************");
		for(int j=0; j<medArr.length;j++)
		{
			if(medArr[j] instanceof Tablet)
			{
				System.out.println("Tablet "+medArr[j].dispMedInfo());
			}
			
			else if(medArr[j] instanceof Ointment)
			{
				System.out.println("Ointment "+medArr[j].dispMedInfo());
			}
			
			else
			{
				System.out.println("Syrup "+medArr[j].dispMedInfo());
			}
		}	
	}

}
