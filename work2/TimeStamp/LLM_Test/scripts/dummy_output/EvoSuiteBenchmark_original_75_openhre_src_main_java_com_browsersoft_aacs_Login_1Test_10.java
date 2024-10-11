// Login_1Test.java
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
* It contains one unit test case for the {@link Login#getProps()} method.
*/
class Login_1Test {
		
	// Logging Config.
	Logger sLog4JLogger;
	
	final File configFile = new MockFile("Test.xml");

	/**
	* Constructor
	* <br>
	* Creates a {@link Login_1Test} for the given file
	*
	*/
    public Login_1Test (File f){

        configFile = f;
    }

    @Test
    public void test1(){
	HashSet<String> sSet = new HashSet<String>(0);
	Set<String> sSet1 = new HashSet<String>();
	Set<String> sSet2 = new HashSet<String>();
	Set<String> sSet3 = new HashSet<String>();
	sSet.add("true");
	sSet1.add("false");
	sSet2.add("true");
	sSet3.add("true");
	
	Set<String> sSet4 = new HashSet<String>();
	sSet5 = new HashSet<String>();
    	sSet4.add("true");
	sSet5.add("true"); // 1


    	// Logging Config.
	FileAppender appender5 = new FileAppender();
	appender5.setContentType("text/xml");
	appender5.setThreshold(Level.WARN);
	appender5.activateOptions();
	appender5.setLayout(new SimpleLayout());
	appender5.addAppender(null, null, "/tmp/Log4JLog.xml");
	appender5.setFile(configFile);
	appender5.setPriority(Level.WARN);
	appender5.setEncoding("UTF-8");
	final String sLog4JLoggingConfig = "\n        <log4j-property>\r\n           <properties>\r\n             <property name=\"log4j.Logger\" type=\"java.util.logging.Logger\" />\r\n           </properties>\r\n\r\n";
	String sLog4JLoggingConfig1 = sLog4JLoggingConfig;
	sLog4JLoggingConfig1 += "\r\n           <properties>\r\n             <property name=\"log4j.appender\" type=\"org.apache.log4j.DefaultAppender\" />\r\n           </properties>\r\n";
	FileAppender fileAppender5 = new FileAppender();
	fileAppender5.setLayout(new SimpleLayout());

	fileAppender5.addAppender(null, null, "/tmp/Log4JLog.xml");
	fileAppender5.setFile(configFile);
	fileAppender5.setPriority(Level.DEBUG);
	fileAppender5.setEncoding("UTF-8");
	fileAppender5.setLayout(new SimpleLayout());

	fileAppender5.addAppender(configFile, null, "/tmp/Log4JLog.xml");
	log4JLogger = Logger.getRootLogger();
	
}
}