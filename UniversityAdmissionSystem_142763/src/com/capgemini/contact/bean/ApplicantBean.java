package com.capgemini.contact.bean;

public class ApplicantBean 
{
	private long applyId;
	private String fName;
	private String lName;
	private String email;
	private long contactNo;
	private String stream;
	private float aggregate;
	
	//Getters and Setters
	public long getApplyId() 
	{
		return applyId;
	}
	public void setApplyId(long applyId) 
	{
		this.applyId = applyId;
	}
	public String getfName() 
	{
		return fName;
	}
	public void setfName(String fName) 
	{
		this.fName = fName;
	}
	public String getlName() 
	{
		return lName;
	}
	public void setlName(String lName) 
	{
		this.lName = lName;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public long getContactNo() 
	{
		return contactNo;
	}
	public void setContactNo(long cnum) 
	{
		this.contactNo = cnum;
	}
	public String getStream() 
	{
		return stream;
	}
	public void setStream(String stream) 
	{
		this.stream = stream;
	}
	public float getAggregate() 
	{
		return aggregate;
	}
	public void setAggregate(float agg) 
	{
		this.aggregate = agg;
	}
	
	//Empty Constructor
	public ApplicantBean() 
	{
		super();
		
	}
	
	//Parameterized Constructor
	public ApplicantBean(long applyId, String fName, String lName,
			String email, long contactNo, String stream, float aggregate) 
	{
		super();
		this.applyId = applyId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.contactNo = contactNo;
		this.stream = stream;
		this.aggregate = aggregate;
	}
	
	
	@Override
	public String toString() 
	{
		return "ApplicantBean [applyId=" + applyId + ", fName=" + fName
				+ ", lName=" + lName + ", email=" + email + ", contactNo="
				+ contactNo + ", stream=" + stream + ", aggregate=" + aggregate
				+ "]";
	}
	
	
	
}
