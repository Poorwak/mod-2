public class TestSwitchDemo 
{
	public static void main(String[] args)
	{
		int day = Integer.parseInt(args[0]);
		switch (day)
		{
			case 6: 
					System.out.println("Its Saturday");
					break;
			case 7:
					System.out.println("Its Sunday");
					break;
			default:
					System.out.println("Its a Weekday");
		}
	}
}
