// Login_2Test.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains one unit test case for the {@link Login#getSecurityLogFilePath()} method.
*/
class Login_2Test {
/** 
* LoginTest.java 
* @throws java.lang.Exception
*/
	@Test
	public void testLogin()  throws Exception {
		String username="admin";
		String password="admin";
		String xacmlFile="";
		String xacmlLogFile="";
		
		//Get security logpath
		String newSecurityLogFilePath=getSecurityLogFilePath();
		
		log(new Date());
		logger.info("TEST USER INFO");
		logger.info("username:" + username + " password: " + password);
		logger.info("log path : "+ newSecurityLogFilePath);
		
		Set<String> users= new HashSet<String>();
		
		//Login with a security log
		users.add(username);
		String log= new Login().getSecurityLogFilePath(users);
		logger.info("security log path : "+log);
		logger.info("log file name : "+ log);
			
		//Execute the request
		RequestCtx reqCtx=new RequestCtx(); 

		String requestText=reqCtx.createPDReq("", "log", log, "", "test test" );
		logger.info("request text : "+requestText);
		
//		reqCtx.setFormatter(new MyFormatter());
//		reqCtx.setIndenter(new Indenter("  "));
	    reqCtx.setIndenter(new Indenter(" "));
	    reqCtx.setLocation("");
		
		System.err.println(log);
		System.err.println(new Login().getSecurityLogFile());
		
		RequestBuilder rb= new RequestBuilder();
		RequestCtx reqCtx2=rb.create(requestText);
		String resFilePath=null;
		try {
			resFilePath=lb.build(reqCtx2);
		}
		catch (LoginException le) {
			System.err.println("ERROR: " + le.getMessage());
			fail();
		}
		
		FileAppender tmp=null;
		try {
		    tmp=new FileAppender();
		    tmp.setFile(new File(newSecurityLogFilePath + "/log.txt"));
		    tmp.setFilename(newSecurityLogFilePath);
		    tmp.start();
		}
		catch (Throwable t) {
			throw new Exception("Couldn't open the output log file.");
		}
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		File tmppath=tmp.getFile();
				
		Date date=null;
		try {
			date=f.parse(tmppath.getAbsolutePath());
		}
		catch (ParseException e) {
			if(tmppath.isDirectory()) {
				tmppath=tmppath.getAbsoluteFile();
			}else {
				tmppath=null;
			}
			System.err.println("ERROR: "+e.getMessage());
			System.err.println("Error with date format " + date);
			return;
		}
		tmppath.delete();
		
		//Load the file using a default properties
		Properties properties=new Properties();
		properties.setProperty( "SecurityLogPath ", newSecurityLogFilePath);
		properties.setProperty( "LogDir", new SecurityLogFileDirName());
		properties.setProperty( "DateTimeFormat", new SafeDateFormat());
		properties.setProperty( "SystemIdFormat", new SystemIdEnumFormat() );
        properties.setProperty( "OutputLogFileType", "XML" );
        properties.setProperty( "LogLevel", Level.ALL.toString());
		
		//getSecurityLogFile is a property
		String secLogFile= null;
		if(newSecurityLogFilePath!=null) {
			secLogFile=lb.build(reqCtx2);
		}else {
			secLogFile=lb.build("security.log");
		}
		
		//getSecurityLogFile is a property
		String xacmlFile= null;
		if(secLogFile!=null) {
			xacmlFile=lb.build(reqCtx2);
		}
		Properties p= new Properties(properties);
		p.setProperty("SecurityLogPath", secLogFile);
		p.setProperty("LogDir", securityLogFileDirName());
		p.setProperty("DateTimeFormat", new SystemIdFormat() );
		p.setProperty("SystemIdEnumFormat", null );
		p.setProperty("OutputLogFileType", "XML");
		p.setProperty("LogLevel", Level.ALL.toString());
		
     // 	String fileLocation;
     // 	try {
     // 		fileLocation="test directory" + 
     // 			"  " +
     // 			"log.txt in:" +
     // 			" " +
     // 			"  java.log\n"
     // 			"";
     // 		System.setProperty("java.logdir", "../security/logs");
     //  		System.setProperty("SystemIdEnumFile", secLogFile);
     //  	}
      // 	catch (Exception e) {
     // 		
     // 	}
      // 	p.setProperty("SecurityLogPath", fileLocation);
      // 	SecurityLogFileDirName securityLogFileDirName = new SecurityLogFileDirName();
      // 	boolean result=SecLogFileDirNameUtils.loadConfigProperties(securityLogFileDirName, p);	   	
      // 	if(!result) {
      // 		System.err.println("WARNING: Couldn't configure properties for "+ securityLogFileDirName+ " "+securityLogFile+" with default values.");
      // 	}
      // 	p.setProperty("LogDir", securityLogFileDirName.getDefaultLogDir());
		
 		
		