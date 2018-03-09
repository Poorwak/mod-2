import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestPatternDemo 
{

	public static void main(String[] args) 
	{
		String inputStr = "Test String";
		String pattern = "Test String";
		boolean patternMatched = Pattern.matches(pattern, inputStr);
		System.out.println(patternMatched);
		System.out.println("*******************************");
		
		String input = "Shop,Mop,Hopping,Chopping";
		Pattern pattern1 = Pattern.compile("hop");
		Matcher matcher = pattern1.matcher(input);
		while(matcher.find())
		{
			System.out.println(matcher.group() + " : " + matcher.start() + " : " + matcher.end());
		}

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Mobile Number : ");
		String mobile=sc.next();
		String mobilePattern="[7-9][0-9]{9}";
		
		if(Pattern.matches(mobilePattern, mobile))
		{
			System.out.println("valid mobile number");
		}
		else
		{
			System.out.println("Only 10 digits starts with 7 8 9 allowed");
		}
	}

}
