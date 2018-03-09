public class PhoneNo 
{
	private String fName;
	private String lName;
	private String PhnNo;
	private char gender;
	private int age;
	private float weight;
	
	public PhoneNo()
	{
		fName = "UNKNOWN";
		lName = "UNKNOWN";
		PhnNo = " ";
		gender = ' ';
	}

	public PhoneNo(String fName, String lName, String PhnNo, char gender) 
	{
		
		this.fName = fName;
		this.lName = lName;
		this.PhnNo = PhnNo;
		this.gender = gender;
	}

	public String dispPerson() 
	{
		return "First Name=" + fName + 
				"\n" + "Last Name=" + lName + 
				"\n" + "Phone Number=" + PhnNo +
				"\n" + "Gender=" + gender;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPhnNo() {
		return PhnNo;
	}

	public void setPhnNo(String phnNo) {
		PhnNo = phnNo;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
		
}