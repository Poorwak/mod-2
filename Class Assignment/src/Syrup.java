
public class Syrup extends Medicine
{
	public Syrup()
	{
		super();
	}
	
	public Syrup (String medName, String compName, String expDate, float price) 
	{
		super(medName, compName, expDate, price);
	}

	public String dispMedInfo() 
	{
		return (super.dispMedInfo() + "\n" + "Shake Well before use");
	}
}
