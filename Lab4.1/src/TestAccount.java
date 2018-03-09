
public class TestAccount 
{

	public static void main(String[] args) 
	{
		Person p1=new Person("Smith",25);
		Person p2=new Person("kathy",24);

		Account a1=new Account(1234567,2000,p1);
		Account a2=new Account(7896541,3000,p2);
		
		a1.deposit(2000);
		a2.withdraw(2000);
		
		System.out.println("Smith Account Details : "+a1);
		System.out.println("Kathy Account Details : "+a2);
	}

}
