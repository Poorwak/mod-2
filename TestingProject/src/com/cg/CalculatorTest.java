package com.cg;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest 
{
	static Calculator cc=null;
	@BeforeClass
	public static void calcBeforeClass()
	{
		cc=new Calculator();
		System.out.println("This function is invoked by jUnit runner only once before the execution of all test cases.");
	}
	
	@AfterClass
	public static void calcAfterClass()
	{
		System.out.println("This function is invoked by jUnit runner only once after the execution of all test cases.");
	}
	
	@Before
	public void calcBefore()
	{
		System.out.println("This function is invoked by jUnit runner before the execution of each test cases.");
	}
	
	@After
	public void calcAfter()
	{
		System.out.println("This function is invoked by jUnit runner after the execution of each test cases.");
	}
	
	@Test							//Test Case
	public void testDivide1()
	{
		Assert.assertEquals(2, cc.divide(50));
	}
	
	@Test							
	public void testDivide2()
	{
		Assert.assertEquals(6, cc.divide(20));
	}
	
	@Test							
	public void testDivide3()
	{
		Assert.assertEquals(-100, cc.divide(-1));
	}
	
	@Test(expected=ArithmeticException.class)						
	public void testDivide4()
	{
		Assert.assertEquals(1, cc.divide(0));
	}
}
