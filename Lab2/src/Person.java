public class Person 
{
	private String fName;
	private String lName;
	private char gender;
	private int age;
	private float weight;
	
	public Person()
	{
		fName = "UNKNOWN";
		lName = "UNKNOWN";
		gender = ' ';
		age = 0;
		weight = 0.0F;
	}

	public Person(String fName, String lName, char gender, int age, float weight) 
	{
		
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}

	public String dispPerson() 
	{
		return "First Name=" + fName + 
				"\n" + "Last Name=" + lName + 
				"\n" + "Gender=" + gender + 
				"\n" + "Age=" + age + 
				"\n" + "Weight=" + weight;
	}
	
}