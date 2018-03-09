package com.cg.Lab11.bean;

import java.time.LocalDate;

public class Mobiles 
{
	private int mobId;
	private String mobName;
	private float mobPrice;
	private int mobQty;
	
	public int getMobId() {
		return mobId;
	}
	public void setMobId(int mobId) {
		this.mobId = mobId;
	}
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	public float getMobPrice() {
		return mobPrice;
	}
	public void setMobPrice(float mobPrice) {
		this.mobPrice = mobPrice;
	}
	public int getMobQty() {
		return mobQty;
	}
	public void setMobQty(int mobQty) {
		this.mobQty = mobQty;
	}
	
	public Mobiles() 
	{
		super();
	}
	
	public Mobiles(int mobId, String mobName, float mobPrice, int mobQty) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
		this.mobPrice = mobPrice;
		this.mobQty = mobQty;
	}
	@Override
	public String toString() {
		return "Mobiles [mobId=" + mobId + ", mobName=" + mobName
				+ ", mobPrice=" + mobPrice + ", mobQty=" + mobQty + "]";
	}
	
	
	
	
	
	
}
