package com.cg.Lab11.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;











import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.cg.Lab11.bean.Mobiles;
import com.cg.Lab11.bean.PurchaseDetails;
import com.cg.Lab11.exception.MobileException;
import com.cg.Lab11.util.MobUtil;





public class PurchaseDaoImpl implements PurchaseDao
{
	Connection con =null;			
	Statement st=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	Logger mobLogger=null;
	
	public PurchaseDaoImpl()
	{
		PropertyConfigurator.configure("resources/log4j.properties");
		mobLogger=Logger.getLogger("PurchaseDaoImpl.class");
	}
	
	
	@Override
	public int addPurchaseDtls(PurchaseDetails pd) throws MobileException 
	{
		String insertQry="INSERT INTO purchasedetails VALUES (?,?,?,?,sysdate,?)";
		int dataAdded=0;
		//int pid=0;
		try 
		{
			con=MobUtil.getCon();
			pst=con.prepareStatement(insertQry);
			pst.setInt(1, generatePurchaseid());
			pst.setString(2, pd.getcName());
			pst.setString(3, pd.getMailId());
			pst.setString(4, pd.getPhnNo());
			pst.setInt(5, pd.getMobId());
			
			dataAdded=pst.executeUpdate();
			mobLogger.info("Mobile Data Inserted");
		} 
		
		catch (Exception e) 
		{
			throw new MobileException(e.getMessage());
		}  
		
		finally
		{
			try 
			{
				pst.close();
				con.close();
			} 
			
			catch (SQLException e) 
			{
				mobLogger.error("This is Exception"+e.getMessage());
				throw new MobileException(e.getMessage());
			}
			
		}
		return dataAdded;
	}
/***********************************************************************/
	@Override
	public int updateMob(int mobId) throws MobileException 
	{
		String updateQry= "UPDATE mobiles SET quantity=quantity-1 WHERE mobileid=?";
		int dataUpdated=0;
		
		try 
		{
			con=MobUtil.getCon();
			pst=con.prepareStatement(updateQry);
			pst.setInt(1, mobId);
			dataUpdated=pst.executeUpdate();
			mobLogger.info("Mobile Data Updated");
						
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		} 
		finally
		{
			try 
			{
				pst.close();
				con.close();
			} 
			
			catch (SQLException e) 
			{
				mobLogger.error("This is Exception"+e.getMessage());
				throw new MobileException(e.getMessage());
			}
			
		}
		
		return dataUpdated;
	}
	
	
/***********************************************************************/
	
	@Override
	public ArrayList<Mobiles> getAllMob() throws MobileException 
	{
		ArrayList<Mobiles> mobList= new ArrayList<Mobiles>();
		String selectQry= "SELECT * FROM MOBILES";
		Mobiles mob=null;
		try 
		{
			con=MobUtil.getCon();
			st=con.createStatement();
			rs=st.executeQuery(selectQry);
			mobLogger.info("Mobile Data Fetched");
			while(rs.next())
			{
				mob=new Mobiles(rs.getInt("mobileid"),rs.getString("name"),rs.getFloat("price"),rs.getInt("quantity"));
				mobList.add(mob);
			}
		} 
		catch (Exception e) 
		{
			throw new MobileException(e.getMessage());
		} 
		finally
		{
			try 
			{
				st.close();
				con.close();
			} 
			catch (SQLException e) 
			{
				mobLogger.error("This is Exception"+e.getMessage());
				throw new MobileException(e.getMessage());
			}
		}
		return mobList;
		
	}

/***********************************************************************/	
	
	@Override
	public int delMob(int mobId) throws MobileException 
	{
		String deleteQry="DELETE FROM mobiles WHERE mobileID=?";
		int dataDeleted=0;
		
		try 
		{
			con=MobUtil.getCon();
			pst=con.prepareStatement(deleteQry);
			pst.setInt(1, mobId);
			dataDeleted=pst.executeUpdate();
			mobLogger.info("Mobile Data Deleted");
		} 
		catch (Exception e) 
		{
			throw new MobileException(e.getMessage());
			
		} 
		finally
		{
			try 
			{
				pst.close();
				con.close();
			} 
			
			catch (SQLException e) 
			{
				mobLogger.error("This is Exception"+e.getMessage());
				throw new MobileException(e.getMessage());
			}
			
		}
		return dataDeleted;
	}

/***********************************************************************/	
	
	@Override
	public ArrayList<Mobiles> searchMob(float r1, float r2) throws MobileException 
	{
		ArrayList<Mobiles> priceList= new ArrayList<Mobiles>();
		String searchQry= "SELECT * FROM MOBILES WHERE price BETWEEN ? AND ?";
		Mobiles r=null;
		
		try 
		{
			con=MobUtil.getCon();
			pst=con.prepareStatement(searchQry);
			pst.setFloat(1, r1);
			pst.setFloat(2, r2);
			rs=pst.executeQuery();
			mobLogger.info("Mobile Searched");
			while(rs.next())
			{
				r=new Mobiles(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getInt(4));
				priceList.add(r);
			}
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		} 
		finally
		{
			try 
			{
				rs.close();
				pst.close();
				con.close();
			} 
			catch (SQLException e) 
			{
				mobLogger.error("This is Exception"+e.getMessage());
				throw new MobileException(e.getMessage());
			}
		}
		
		return priceList;
	}
	
	
/***********************************************************************/
	
	@Override
	public int generatePurchaseid() throws MobileException 
	{
		String qry="SELECT pid_seq.NEXTVAL FROM DUAL";
		int generatedVal=0;
		
		
		try 
		{
			con=MobUtil.getCon();
			st=con.createStatement();
			rs=st.executeQuery(qry);
			rs.next();
			generatedVal=rs.getInt(1);
			mobLogger.info("Purchase Id Generated");
		} 
		catch (Exception e) 
		{
			throw new MobileException(e.getMessage());
		} 
		finally
		{
			try 
			{
				rs.close();
				st.close();
				con.close();
			} 
			catch (SQLException e) 
			{
				mobLogger.error("This is Exception"+e.getMessage());
				throw new MobileException(e.getMessage());
			}
		}
		return generatedVal;
	}
	
/*************************************************************************/	
	
	@Override
	public ArrayList<Integer> getmobileId() throws MobileException 
	{
		ArrayList<Integer> mobList= new ArrayList<Integer>();
		String selectQry= "SELECT mobileid FROM MOBILES";
		
		try 
		{
			con=MobUtil.getCon();
			st=con.createStatement();
			rs=st.executeQuery(selectQry);
			mobLogger.info("Mobile Id");
			while(rs.next())
			{
				
				mobList.add(rs.getInt("mobileid"));
			}
		} 
		catch (Exception e) 
		{
			throw new MobileException(e.getMessage());
		} 
		finally
		{
			try 
			{
				st.close();
				con.close();
			} 
			catch (SQLException e) 
			{
				mobLogger.error("This is Exception"+e.getMessage());
				throw new MobileException(e.getMessage());
			}
		}
		return mobList;
		
	}
	
/*****************************************************************************/	

	@Override

	public int getQuantity(int qnty) throws MobileException 
	{
		String selectQry= "SELECT quantity FROM mobiles WHERE mobileid=?";
		int quantity;
		
		try 
		{
			con=MobUtil.getCon();
			pst=con.prepareStatement(selectQry);
			pst.setInt(1,qnty);
			rs=pst.executeQuery();
			rs.next();
			quantity=rs.getInt("quantity");
		} 
		catch (Exception e) 
		{
			
			throw new MobileException(e.getMessage());
		} 
		finally
		{
			try
			{
				con.close();
				pst.close();
				rs.close();
			
			}
			catch(SQLException e)
			{
				throw new MobileException(e.getMessage());
			}
		}
		return quantity;
	}
}
