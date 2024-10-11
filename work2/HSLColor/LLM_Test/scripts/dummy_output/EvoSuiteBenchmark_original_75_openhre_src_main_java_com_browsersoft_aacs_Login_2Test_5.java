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
	* Initialize and load users.
	*/
    @org.junit.jupiter.api.Test
    public void testLogin_1() {
	    
        String userLogFile = "users.log";
	    String userLogFileWithFormat = ".users.log";
	    
	    //Initializing log4j
        Logger.getRootLogger().setLevel(Level.TRACE); 
	    File log4jFile = new File(getSecurityLogFilePath());
	    new FileAppender(new SimpleLayout(), log4jFile, Level.WARN);
	    
	    //Initializing PD adapter: get a new one
	    PDPadapter pdAdapter = PDPadapter.getInstanceN();
	    
	    //Getting the login logger
        Logger login = Logger.getRootLogger();
        
        //Initialization a set of test user
        Set<String> set = new HashSet<String>();
        set.add("user1");
        
	    //Get the Security Logger's File Path
	    String securityLogPath = login.getConfiguration().getProperty("security.log.file.path");
	    File file = new File("C:\\Users\\user1\\Documents\\log_tests");
	    file.mkdir();
	    log4jFile = new File(file.getAbsolutePath() + userLogFileWithFormat);
	    new FileAppender(new SimpleLayout(), log4jFile, Level.INFO);
	    
	    //Using the log4j file's Appender
        LoggerAppender log = (LoggerAppender)AppenderSystem.getSystemAppender("Log4jLogFileAppender");
        log.setAppender(log4jFile);
        
	    //Setting the property for the Security Logger's File Path
	    Set<String> propFiles = login.getConfiguration().getPropertySet("security.log.file.path");
	    File file = new File("C:\\Users\\user1\\Documents\\log_tests");
	    propFiles.add(securityLogPath);
	    login.setConfiguration(new Properties());
	    login.setConfiguration(new Properties());
	    
        //Seting the set of test users from a properties file
        login.setProperty("security.log.file.path", propFiles.size());
        
	    //Initializing the Properties object, and setting a new set of test users from the Properties object
        Properties p = login.getConfiguration().getProperties();
	    Iterator<String> setIterator = p.stringPropertyNames()
	   .iterator();
	    while (setIterator.hasNext()) {
	    	String testUser = setIterator.next();
	    	userLogFile = p.getProperty(testUser);
	    }
	    
	    //Getting the user log filename
	    String expectedUserLog = ".users.log";
	    expectedUserLog = p.getProperty("security.log.user.filename");
	    //setting the password in properties and logging in
	    login.login();
        
	    //Accessing the Security Logger's File Path
	    String filePath = login.getConfiguration().getProperty("security.log.file.path");
	    
	    //Getting the Security Logger's File Path
	    filePath = login.getConfiguration().getProperty("security.log.file.path");
	    
	    //Getting The User Log Filename after the log command
	    expectedUserLogFile = expectedUserLog + userLogFileWithFormat;
	    
	    //Getting the File's File Path of the user logging in
	    String foundFilename = userLogFile.substring(0, userLogFile.indexOf(expectedUserLog));
	    String expectedFilename = login.getConfiguration().getProperty("security.log.file.filename");

	    assertEquals("Path not set correctly", expectedFilename, foundFilename);
	}

	/**
	* Initializing xACML security logger.
	*/
    @org.junit.jupiter.api.Test
    public void testLoginSecurityLogger_1() throws LoginException, ParseException, InterruptedException {
	    
        String userLogFile = "users.log";
	    String userLogFileWithFormat = ".users.log";
	    
        //Initializing log4j
        Logger.getRootLogger().setLevel(Level.TRACE); 
        File log4jFile = new File(getSecurityLogFilePath());
        new FileAppender(new SimpleLayout(), log4jFile, Level.WARN);
        
	    //Initializing PD adapter: get a new one
	    PDPadapter pdAdapter = PDPadapter.getInstanceN();
	    
	    //Getting the Security Logger's File Path
	    String securityLogPath = pdAdapter.getLogPath(pdAdapter.getXCMD().getFileName());
	    File file = new File("C:\\Users\\user1\\Documents\\log_tests");
	    file.mkdir();
	    log4jFile = new File(file.getAbsolutePath() + userLogFileWithFormat);
	    new FileAppender(new SimpleLayout(), log4jFile, Level.INFO);
	  
	    //Initializing the Properties object with an XCMD Path
	    //Setting the set of test users from a properties file
	    Properties p = pdAdapter.getProperties(pdAdapter.getXCMD());
	    Iterator<String> setIterator = p.stringPropertyNames()
	   .iterator();
	    while (setIterator.hasNext()) {
	    	String testUser = setIterator.next();
	    	userLogFile = p.getProperty(testUser);
	    }
	    
	    //Getting the Security Logger's File Path
	    securityLogPath = pdAdapter.getLogPath(pdAdapter.getXCMD().getFileName());
	    
	    //Getting the File's File Path of the user logging in
}
}