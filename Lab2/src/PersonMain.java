public class PersonMain 
{
	private String firstName;
	private String  lastName;
	private char gender;
	
	public PersonMain()
	{
		firstName="UNKNOWN";
		lastName="UNKNOWN";
		gender=' ';
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	
	public void setGender(char gender)
	{
		this.gender=gender;
	}
}
