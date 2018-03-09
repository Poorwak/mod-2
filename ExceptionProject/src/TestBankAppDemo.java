import java.util.Scanner;
public class TestBankAppDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int currentBalance=60000;
		
		System.out.println(" " + "Enter the withdraw Amount");
		int withdrawAmount=sc.nextInt();
		
		if(withdrawAmount < currentBalance)
		{
			System.out.println("OK you have sufficient balance, you can withdraw");
		}
		else
		{
			try 
			{
				throw new LowBalanceException("Please check balance of your account");
			} 
			catch (LowBalanceException e) 
			{
				System.out.println("Insufficient balance in your account");
				//e.printStackTrace();
			}
		}

	}

}
