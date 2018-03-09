import java.time.*;
import java.time.format.DateTimeFormatter;


public class TestDateDemo 
{

	public static void main(String[] args) 
	{
		LocalDate today=LocalDate.now();
		System.out.println(" Today's Date: "+today);
		
		System.out.println("*********************");
		LocalDate myDoj=LocalDate.of(2017, 12, 13);
		System.out.println(" My Date of Joining: "+myDoj);
		
		System.out.println("*********************");
		String ronakDoj = "13-Dec-2017";
		
		DateTimeFormatter myFormat= DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate ronakDojD=LocalDate.parse(ronakDoj, myFormat);
		System.out.println(" Ronak DOJ = "+ronakDojD);
		
		System.out.println("*********************");
		DateTimeFormatter secondFormat= DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		String urDOJ=ronakDojD.format(secondFormat);
		System.out.println("......."+urDOJ);
		
		System.out.println("*********************");
		System.out.println("Difference");
		Period period= Period.between(myDoj, today);
		int years=period.getYears();
		int month=period.getMonths();
		int day=period.getDays();
		
		System.out.println(" My experience in CG is : "+years + " Years " +month + " Months " +day + " Days " );
		
		
	}

}
