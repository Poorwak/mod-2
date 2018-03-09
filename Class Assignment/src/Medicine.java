
public class Medicine 
{
	private String medName;
	private String compName;
	private String expDate;
	private float price;
	public Medicine(){}
	
	public Medicine(String medName, String compName, String expDate, float price) 
	{
		this.medName = medName;
		this.compName = compName;
		this.expDate = expDate;
		this.price = price;
	}

	public String dispMedInfo() 
	{
		return "Medicine:" + "\n" + "medName=" + medName + 
						  "\n compName= " + compName + 
						  "\n expDate=" + expDate + 
						  "\n price=" + price;
	}
}
