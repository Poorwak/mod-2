enum Coin
{
	PENNY(1),NICKEL(5),DICE(10),QUARTER(25);
	private final int value;
	private Coin(int value)
	{
		this.value = value;
	}
	public int value()
	{
		return value;
	}
}
//***************************************
enum Gender
{
	M,F;
}
public class TestEnumDemo 
{
	public static void main(String[] args)
	{
		Gender empGen=Gender.M;
		System.out.println(" Emp gender is : "+empGen);
		
		Coin myCoin=Coin.NICKEL;
		System.out.println(" I have "+myCoin);
		System.out.println( myCoin+ " has a value of : "+myCoin.value() + " RS");
	}
}
