package com.cg.Lab11.bean;

import java.sql.Date;

public class PurchaseDetails extends Mobiles
{
	private int purchaseid;
	private String cName;
	private String mailId;
	private String phnNo;
	private Date purchaseDate;		//In sql there is Date function 
	
	
	public int getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(int purchaseid) {
		this.purchaseid = purchaseid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	

	
	public PurchaseDetails() 
	{
		super();
		
	}
	
	public PurchaseDetails(int purchaseid, String cName, String mailId,
			String phnNo, Date purchaseDate) {
		super();
		this.purchaseid = purchaseid;
		this.cName = cName;
		this.mailId = mailId;
		this.phnNo = phnNo;
		this.purchaseDate = purchaseDate;
		
	}
	@Override
	public String toString() 
	{
		return "PurchaseDetails [purchaseid=" + purchaseid + ", cName=" + cName
				+ ", mailId=" + mailId + ", phnNo=" + phnNo + ", purchaseDate="
				+ purchaseDate;
	}
	
	
}
