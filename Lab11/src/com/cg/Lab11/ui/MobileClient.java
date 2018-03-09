package com.cg.Lab11.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.Lab11.bean.Mobiles;
import com.cg.Lab11.bean.PurchaseDetails;
import com.cg.Lab11.exception.MobileException;
import com.cg.Lab11.service.PurchaseService;
import com.cg.Lab11.service.PurchaseServiceImpl;



public class MobileClient 
{
	static Scanner sc=null;
	static PurchaseService purSer=null;
	public static void main(String[] args)
	{
		purSer=new PurchaseServiceImpl();
		sc=new Scanner(System.in);
		int choice=0;
		
		while(true)
		{
			
			System.out.println("What do you want to do?");
			System.out.println("1.Add Mobile \t 2.Fetch All Mobile \t 3.Delete Mobile \t 4.Search Mobile based on Price");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1: addMob();
					break;
//				case 2: updateMob();
//					break;
				case 2: fetchAllMob();
					break;
				case 3: deleteMob();
					break;
				case 4: searchMob();
					break;
				default: System.exit(0);
			}
		}
	}
/***************************Main Ends Here****************************/	
	
	private static void searchMob() 
	{
		float r1,r2;
		System.out.println("Enter minimum price: ");
		r1=sc.nextInt();
		
		System.out.println("Enter maximum price: ");
		r2=sc.nextInt();
		
		ArrayList<Mobiles> priceList;
		try 
		{
			priceList=purSer.searchMob(r1, r2);
			for(Mobiles r:priceList)
			{
				System.out.println(r);
			}
		} 
		catch (MobileException e) 
		{
			
			e.printStackTrace();
		}
		
	}
/**********************************************************************/
	private static void deleteMob()
	{
		System.out.println("Enter Mobile Id: ");
		int mobId=sc.nextInt();
		
		try 
		{
			int dataDeleted=purSer.delMob(mobId);
			if(dataDeleted==1)
			{
				System.out.println("Mobile data deleted");
			}
			else
			{
				System.out.println("May be some exception has occured while deletion");
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			
		}
	}
	
		
/*******************************************************************/

	private static void fetchAllMob() 
	{
		try 
		{
			ArrayList<Mobiles> mobList=purSer.getAllMob();
			for(Mobiles mob:mobList)
			{
				System.out.println(mob);
			}
		} 
		catch (MobileException e) 
		{
			System.out.println("Some Exception while fetching data");
			e.printStackTrace();
		}
		
	}
/***********************************************************************/
	
	
	public static void addMob()
	{
		System.out.println("Enter Customer Name : ");
		String cnm=sc.next();
		
		try 
		{
			if(purSer.validateName(cnm))
			{
				System.out.println("Enter Mail ID : ");
				String id=sc.next();
				
				if(purSer.validateMailID(id))
				{
					System.out.println("Enter Phone Number : ");
					String phn=sc.next();
					
					if(purSer.validatePhoneNo(phn))
					{
						System.out.println("Enter Mobile ID : ");
						int mobId =sc.nextInt();
						
						if(purSer.validateMobId(mobId))
						{
							System.out.println(purSer.getQuantity(mobId));
							
							if(purSer.getQuantity(mobId)>0)
							{
								System.out.println("Mobile Available");
								
								purSer.updateMob(mobId);
								System.out.println("Data Updated");
								
								PurchaseDetails pd=new PurchaseDetails();
								pd.setcName(cnm);
								pd.setMailId(id);
								pd.setPhnNo(phn);
								pd.setMobId(mobId);
								int dataAdded=purSer.addPurchaseDtls(pd);
								if(dataAdded==1)
								{
									
									System.out.println("Mobile Data Added");
								}
								else
								{
									System.out.println("May be some exception has occured while addition");
								}		
							}
							
							else
							{
								System.out.println("Mobile Not Available");
							}
							
											
						}
					}
				}
			}
		}
		catch (MobileException e) 
		{
			System.out.println(e.getMessage());
		}				
	}
}	

/***********************************************************************/




	