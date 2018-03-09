
public class Ointment extends Medicine
{
	public Ointment()
	{
		super();
	}
	
	public Ointment (String medName, String compName, String expDate, float price) 
	{
		super(medName, compName, expDate, price);
	}

	public String dispMedInfo() 
	{
		return (super.dispMedInfo() + "\n" + "For External use only");
	}
}
