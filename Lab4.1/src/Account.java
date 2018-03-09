
public class Account 
{
	private long accNum;
	private double balance;
	Person accHolder;
		
	public Account() 
	{
		super();
		
	}
	
	public long getAccNum() 
	{
		return accNum;
	}
	public void setAccNum(long accNum) 
	{
		this.accNum = accNum;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	public Person getAccHolder() 
	{
		return accHolder;
	}
	public void setAccHolder(Person accHolder) 
	{
		this.accHolder = accHolder;
	}
	public Account(long accNum, double balance, Person accHolder) 
	{
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public void deposit(double amount)
	{
		this.balance=this.balance + amount;
	}
	public void withdraw(double amount)
	{
		if(balance<500)
		{
			System.out.println("Minimum balance in Account is 500");
		}
		else
		{
			this.balance=this.balance - amount;
		}
		
	}

	
	public String toString() 
	{
		return "Account [accNum=" + accNum + ", balance=" + balance
				+ ", accHolder=" + accHolder + "]";
	}
	
	
}
