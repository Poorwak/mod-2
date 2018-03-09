
public class Person 
{
	private String perName;
	private String panNo;
	private int personAge;
	
	public String getPerName() 
	{
		return perName;
	}
	public void setPerName(String perName) 
	{
		this.perName = perName;
	}
	public String getPanNo() 
	{
		return panNo;
	}
	public void setPanNo(String panNo) 
	{
		this.panNo = panNo;
	}
	public int getPersonAge() 
	{
		return personAge;
	}
	public void setPersonAge(int personAge) 
	{
		this.personAge = personAge;
	}
	
	public Person() 
	{
		super();
	}
	public Person(String perName, String panNo, int personAge) 
	{
		super();
		this.perName = perName;
		this.panNo = panNo;
		this.personAge = personAge;
	}
	@Override
	public String toString() 
	{
		return "Person [perName=" + perName + ", panNo=" + panNo
				+ ", personAge=" + personAge + "]";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Person tempPerson=(Person)obj;
		if(this.panNo==tempPerson.panNo)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public int hashCode()
	{
		return panNo.hashCode();
	}
}
