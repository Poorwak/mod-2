package com.cg.Lab11.junit;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.Lab11.bean.PurchaseDetails;
import com.cg.Lab11.bean.Mobiles;
import com.cg.Lab11.dao.PurchaseDao;
import com.cg.Lab11.dao.PurchaseDaoImpl;
import com.cg.Lab11.exception.MobileException;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.Lab11.bean.PurchaseDetails;
import com.cg.Lab11.bean.Mobiles;
import com.cg.Lab11.dao.PurchaseDao;
import com.cg.Lab11.dao.PurchaseDaoImpl;
import com.cg.Lab11.exception.MobileException;

public class PurchaseDaoImplTest 
{
    static int a,b=0;
    static PurchaseDao PurchaseDao=null;
    static PurchaseDetails pd=null;
        
    @BeforeClass
    public static void beforeClass() throws MobileException
        {
            PurchaseDao=new PurchaseDaoImpl();
            pd=new PurchaseDetails();
        }
    
        @Test												//False Test
        public void testAddEmp1() throws MobileException
        {
            Assert.assertEquals(1,PurchaseDao.addPurchaseDtls(pd));
            
        }
        
        @Test(expected =Exception.class)					//True Test
        public void testAddEmp2() throws MobileException
        {
            Assert.assertEquals(1, PurchaseDao.addPurchaseDtls(pd));
            
        }
        
        @Test												//True Test
        public void testAddEmp3() throws MobileException
        {
            Assert.assertNotNull(PurchaseDao.getAllMob());
            
        }
        
        @Test												//False Test
        public void testAddEmp4() throws MobileException
        {
            Assert.assertEquals(1,PurchaseDao.searchMob(a,b));
            
        }
        
        @Test(expected =Exception.class)					//True Test
        public void testAddEmp5() throws MobileException
        {
            Assert.assertEquals(1, PurchaseDao.searchMob(a,b));
            
        }
        
    }
