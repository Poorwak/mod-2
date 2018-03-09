
public class Date 
{
	private int day;
	private int mon;
	private int year;
	public Date()
	{
		
	}
	public Date(int day, int mon, int year) {
		
		this.day = day;
		this.mon = mon;
		this.year = year;
	}
	public String dispDate() 
	{
		return "Date :" + day + "-" + mon + "-" + year;	
	}
	
	
}
