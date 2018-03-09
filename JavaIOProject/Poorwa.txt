public class Date 
{
	private int day;
	private int mon;
	private int year;
	
	public Date()
	{
		day = 0;
		mon = 0;
		year = 0;
	}
	public Date(int dd, int mm, int yy)
	{
		day = dd;
		mon = mm;
		year = yy;
	}
	public String dispDate()
	{
		return day+"-"+mon+"-"+year;
	}
}
