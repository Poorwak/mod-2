package com.cg.Lab11.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

import com.cg.Lab11.bean.Mobiles;
import com.cg.Lab11.bean.PurchaseDetails;
import com.cg.Lab11.dao.PurchaseDao;
import com.cg.Lab11.dao.PurchaseDaoImpl;
import com.cg.Lab11.exception.MobileException;

public class PurchaseServiceImpl implements PurchaseService
{
	PurchaseDao purchaseDao=null;
	public PurchaseServiceImpl()
	{
		purchaseDao=new PurchaseDaoImpl();
	}

	@Override
	public int addPurchaseDtls(PurchaseDetails pd) throws MobileException 
	{
		return purchaseDao.addPurchaseDtls(pd);
	}

	@Override
	public int updateMob(int mobId) throws MobileException 
	{
		
		return purchaseDao.updateMob(mobId);
	}

	@Override
	public ArrayList<Mobiles> getAllMob() throws MobileException 
	{
		
		return purchaseDao.getAllMob() ;
	}

	@Override
	public int delMob(int mobId) throws MobileException 
	{
		
		return purchaseDao.delMob(mobId);
	}

	@Override
	public int selectMob(Mobiles mob) throws MobileException 
	{
		
		return 0;
	}

	@Override
	public int generatePurchaseid() throws MobileException 
	{
		
		return 0;
	}

	@Override
	public boolean validateName(String cName) throws MobileException 
	{
		String namePattern="[A-Z][a-z]{1,19}";
		if(Pattern.matches(namePattern, cName))
		{
			return true;
		}
		else
		{
			throw new MobileException("Only Characters allowed and starts with UPPERCASE e.g Poorwa");
		}
	}

	@Override
	public boolean validateMailID(String mailId) throws MobileException 
	{
		String namePattern="[A-Za-z0-9+_.-]+@(.+)$";
		if(Pattern.matches(namePattern, mailId))
		{
			return true;
		}
		else
		{
			throw new MobileException("Enter a valid Mail ID e.g xyz@abc.com");
		}
	}

	@Override
	public boolean validatePhoneNo(String phnNo) throws MobileException 
	{
		String namePattern="[7-9][0-9]{9}";
		if(Pattern.matches(namePattern, phnNo))
		{
			return true;
		}
		else
		{
			throw new MobileException("Enter a valid Mobile Number starting with 7,8,9");
		}
	}

	@Override
	public boolean validateMobId(int mobId) throws MobileException 
	{
		int count=0;
		Iterator it=purchaseDao.getmobileId().iterator();
		while(it.hasNext())
		{
			int id=(int)it.next();
			if(mobId==id)
			{
				count=1;
				break;
			}
		}
		if(count==1)
		{
			return true;
		}
		else
		{
			throw new MobileException("Enter the valid Mobile Id present in the table");
		}
	}

	@Override
	public ArrayList<Integer> getmobileId() throws MobileException 
	{
		
		return purchaseDao.getmobileId();
	}

	@Override
	public int getQuantity(int qnty) throws MobileException 
	{
		
		return purchaseDao.getQuantity(qnty);
	}

	@Override
	public ArrayList<Mobiles> searchMob(float r1, float r2) throws MobileException 
	{
		
		return purchaseDao.searchMob(r1,r2);
	}

}
