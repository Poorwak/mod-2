
public class Tablet extends Medicine
{
	public Tablet()
	{
		super();
	}
	
	public Tablet (String medName, String compName, String expDate, float price) 
	{
		super(medName, compName, expDate, price);
	}

	public String dispMedInfo() 
	{
		return (super.dispMedInfo() + "\n" + "Store in cool and dry place");
	}
}
