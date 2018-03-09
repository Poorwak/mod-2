package com.cg.Lab11.dao;

import java.util.ArrayList;

import com.cg.Lab11.bean.Mobiles;
import com.cg.Lab11.bean.PurchaseDetails;
import com.cg.Lab11.exception.MobileException;
import com.cg.Lab11.exception.MobileException;

public interface PurchaseDao 
{
	public int addPurchaseDtls(PurchaseDetails pd) throws MobileException;
	public int updateMob(int mobId) throws MobileException;
	public ArrayList<Mobiles> getAllMob() throws MobileException;
	public int getQuantity(int qnty) throws MobileException;
	public int delMob(int mobId) throws MobileException;
	public ArrayList<Mobiles> searchMob(float r1, float r2) throws MobileException;
	public int generatePurchaseid() throws MobileException;
	public ArrayList<Integer> getmobileId() throws MobileException;
}
