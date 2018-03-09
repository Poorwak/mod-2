package com.cg.Lab11.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cg.Lab11.exception.MobileException;
import com.cg.Lab11.util.MobUtil;
import com.cg.Lab11.exception.MobileException;

public class MobUtil 
{
	static String mobunm=null;
	static String mobpwd=null;
	static String url=null;
	
	public static Connection getCon() throws IOException, MobileException, SQLException
	{
		Connection con=null;
		Properties dbInfoProps=MobUtil.getProp();
		url=dbInfoProps.getProperty("mobURL");
		mobunm=dbInfoProps.getProperty("mobUser");
		mobpwd=dbInfoProps.getProperty("mobPwd");
		
		if (con==null)
		{
			con=DriverManager.getConnection(url,mobunm,mobpwd);
		}
		return con;
	}
	
	public static Properties getProp()
	throws IOException, MobileException
	{
		Properties props=new Properties();
		FileReader fr=null;
		props=new Properties();
		fr=new FileReader("resources/mobinfo.properties");
		props.load(fr);
		return props;	
	}
}
