package com.capgemini.contact.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.capgemini.contact.exception.ApplicantException;



public class DBUtil 
{
	
		static String dbunm=null;
		static String dbpwd=null;
		static String url=null;
		
		public static Connection getCon()    //import connection from java.sql package
		throws IOException, ApplicantException, SQLException
		{
			Connection con=null;
			Properties dbInfoProps=getProp();
			url=dbInfoProps.getProperty("dbURL");
			dbunm=dbInfoProps.getProperty("dbUser");
			dbpwd=dbInfoProps.getProperty("dbPwd");
			
			
			if (con==null)
			{
				con=DriverManager.getConnection(url,dbunm,dbpwd);
			}
			return con;
		}
		
		public static Properties getProp()
		throws IOException, ApplicantException
		{
			Properties props=new Properties();
			FileReader fr=null;
			props=new Properties();
			fr=new FileReader("resources/dbinfo.properties");
			props.load(fr);
			return props;	
		}
	
}
