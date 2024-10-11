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
		* Test method for {@link com.browsersoft.aacs.Login#getSecurityLogFilePath()}.
		*/
        @Test
        void testGetSecurityLogFilePath() {
            File f = new File(Login.getSecurityLogFilePath());
            assertExist(f, "_config/log4j.properties");
            assertExist(f, "_java/run/logging.properties");
        	
            // check whether the file is loaded
            f = new File(Login.getSecurityLogFilePath());
            assertExist(f, "_log4j.properties");
            assertExist(f, "_java/run/log4j.properties");
        }
	  
	/**
	* Make sure the SecurityLogFilePath is read and load
	* the file.
	*/
	  @Test
	  public void testLoadSecurityLogFilePath(){
	    File f = new File(Login.getSecurityLogFilePath());
	    String log4j3Settings[] = f.list();
	    String property = log4j3Settings[log4j3Settings.length-1]; // file name
	    // check the property which contains SecurityLogFilePath
	    assertContains(property, Login.getSecurityLogFilePath(),"SecurityLogFilePath");
	  }	  
	/**
	* Check whether the SecurityLogFilePath is empty
	* If it is not empty, the check should fail.
	*/
       @Test
	  public void testEmptyLog4jProperty(){
	      System.setProperty("com.sun.xacml.SecurityLogFilePath", ""); //set empty to "";
	      try {
	        getSecurityLogFilePath();
	    } catch (LoginException ex) {
	        assertTrue("ex.getMessage() should be ", ex.getMessage().indexOf("Log4jSecurityLogFilePath is not set")!=-1);
	    }
	  }  	  
	  
	/**
	* Make sure the SecurityLogFilePath is loaded
	* if the property is not empty.
	*/
       @Test	  
     public void testLoadSecurityLogFilePathIfPropertyIsNotEmpty(){
      	  System.setProperty("com.sun.xacml.SecurityLogFilePath", "File"); //Set log4j.properties to log4j
	      String log4j3Settings[] = f.list();
	      String property = log4j3Settings[log4j3Settings.length-1]; // file name
	      
	      assertContains(property, Login.getSecurityLogFilePath(),"SecurityLogFilePath");
	  }  
    }

class Main {
    
    public static void main(String[] args) {
       File f = new File("TestLogMessages");
        String date = getLogFileName();
        boolean isFile = false;
        if (f.exists()) {
            log4j("Found file " + f.getName() + ". " + 
                "It is ready to go from start or end with timestamp");
            
        } else if (f.exists()) {
            log4j("Found file " + f.getName() + ". " + 
                "It is not found. " +
                "Is the end of the previous log or not? " + 
                "If it is wrong you know."); 
        } else {
            log4j("There is no such file " + f.getName() + "!");
        }
        
        String level = getLogFileLevel();
        boolean isLEVEL = level.equals("DEBUG");
        if (isLEVEL) {
            log4j("All the messages below are ready to go from start...");            
        }else{
            log4j("Level from log4j.xml file is not correct. It needs to be " 
                + "DEBUG, ERROR, TRACE. " 
                + "See http://coder.dev.java.net/examples/XACMLClientActions/logging-in-log4j.html  ");
        }
        
                           
    } 
    
    private static String getLogFileLevel() {
       	return System.getProperty("java.util.logging.LogManager.loggerProperty");
    	
    } 
} 

class log4j3Settings extends StringTokenizer {
	  public  void addToken(String st) {
		  return;
		  StringTokenizer token = new StringTokenizer(st);
		  while (token.hasMoreElements()) {
	        addToken(token.nextToken());
		  }
	  }
	  public void addToken(String token) {
		  addToken("\"" + token + "\"");
		  
	  }	  
}


class FileAppenderTest {
	protected static void assertExist(File f, String prop) {
        String line = "\t" + prop;
        //log4j.setLevel("INFO");
        if (!f.exists()) {
            log4j.error(line); 
            return;
        }
        log4j.debug(line); 
	} 
	protected static void assertContains(String token, String value, String msg) {
        int i = value.indexOf(token);
        if (i == -1 || value.substring(i).length() > value.length()) {
        	log4j.error(msg + " (value: " + token + 
        			  ") out of date. " + 
        			  "Value has been updated.");
        }
    }
    protected static Level getLogFileLevel() {
        return Level.INFO;
    }
    protected static Logger getLogFile() {
        return Logger.getLogger(FileAppenderTest.class);
    }
}

class log4jTest extends Logger {
	private Set loggers = new Set();
	private FileAppender tail;
	
	private String lastMessage = null;

	public log4jTest() {
}
}