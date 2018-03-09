package com.cg.bat;

public class Batch 
{
	private String batchId;
	private String batchTime;
	private String batchFaculty;
	public String getBatchId() 
	{
		return batchId;
	}
	public void setBatchId(String batchId) 
	{
		this.batchId = batchId;
	}
	public String getBatchTime() 
	{
		return batchTime;
	}
	public void setBatchTime(String batchTime) 
	{
		this.batchTime = batchTime;
	}
	public String getBatchFaculty() 
	{
		return batchFaculty;
	}
	public void setBatchFaculty(String batchFaculty) 
	{
		this.batchFaculty = batchFaculty;
	}
	
	public Batch() 
	{
		super();
		
	}
	public Batch(String batchId, String batchTime, String batchFaculty) 
	{
		
		this.batchId = batchId;
		this.batchTime = batchTime;
		this.batchFaculty = batchFaculty;
	}
	
	public String showBatchInfo() 
	{
		return "Batch [batchId=" + batchId + ", batchTime=" + batchTime
				+ ", batchFaculty=" + batchFaculty + "]";
	}
	
}
