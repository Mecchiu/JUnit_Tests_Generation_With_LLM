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

private static final String PROP_LOGINPATH = "org.apache.log4j.xml.conf.xml";
private static final String SECURITY_LOG_FILENAME = "LOGIN.xml";
	
	// A set of all the tests being performed in this suite.
	Set<Test> tests = new HashSet<Test>();
	
	@Test
	public void testGetSecurityLogFilePath() throws ParseException, LoginException,
	LoginException {
		
		// load the database and initialize all the test.
		Iterator<String> loginFileIterator =
		    FileDirectoryManager.getLoginFileIterator().iterator();
		File tempDir = FileDirectoryManager.getTemporaryDirectory();
		File logFile = File.createTempFile(tempDir.getName(), "log", tempDir);
		
		String line = null;
		while ((line = loginFileIterator.next())!= null) {
			logFile = new File(logFile, line);
		}
		
        // set the defaults for the log file
        Properties properties = new Properties();
        properties.setProperty("log4j.rootLogger", "INFO, TASK");
        properties.setProperty("log4j.logger.INFO", "INFO");
        properties.setProperty("log4j.logger.DEFAULT", "[INFO]");
		properties.setProperty(PROP_LOGINPATH, logFile.getAbsolutePath());
		
        // log a message to the console and create a new file.
        FileAppender fileAppender =
                new FileAppender(
                    new SimpleLayout(
                        
                        " [INFO]", "  Level: INFO     : \"Logging a message on the console\"",
                        
                        
                        " [INFO]", "  Level: DEBUG     : \"Logging a message on the console\"",
                        
                        " [INFO]", "  Level: WARN      : \"Logging a message on the console\"",
                        
                        " [INFO]", "  Level: ERROR    : \"Logging a message on the console\"",
                        
                        " [INFO]", "  Level: FATAL    : \"Logging a message on the console\"",
                        
                        
                        " [FATAL]", "   Level: ERROR     : \"Logging a message on the console\""),
                new Indenter(" "),
                new PDPadapter(),
                properties);
        logFile =  new File("target/log_"+System.getProperty("user.name")+"_testlog.txt");
        fileAppender.doAppend(logFile);
        
        // we need this so that the log files are ready by the start method.
        logFile.deleteOnExit();
		
        // create a new log file with the new data.
        Date date = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        dateFormatter.setTimeZone(TimeZone.getTimeZone("GMT+8"));
		
        // Create a new security log file
        logFile.deleteOnExit();
        try {
			logFile.createNewFile();
		} catch (Exception exc) {
			fail("Error creating a new security log file. "+exc);
		}
				
		Logger securityLogger = Logger.getRootLogger();
		securityLogger.setLevel(Level.INFO);
		
		if (System.getProperty("os.name").contentEquals("Mac OS X")) {
			// Add the security log filename
			FileSecurityLogFile fsl = new FileSecurityLogFile(logFile, SECURITY_LOG_FILENAME);
			securityLogger.addAppender(fsl);
		} else {
			// Add the security log filename
			FileSecurityLogFile fsl = new FileSecurityLogFile(logFile, SECURITY_LOG_FILENAME);
			securityLogger.addAppender(fsl);
			
			// Initialize the log file for every test
			fsl.setFirstDataDate(date);
			for (Test test : tests) {
				fsl.setDataDate(date);
				fsl.initialize(null, null, dateFormatter.format(dateFormatter.parse(test.setUpMethod(date))));
				fsl.start(date);
				
				// if the logger is logged when this test is run first time, then reset the data of the first test to 
				// the file's first logdata.
				if (test.getFirstDataDate().after(date)) {
					test.setFirstDataDate(date);
				}
				
				
			}
			
			// if we are going to see all the tests finish, just run the last data
			fsl.start(date);
		}
		
		
	}

	public static class FileSecurityLogFile extends FileAppender {
		
		private Date dataDate;
		
		public FileSecurityLogFile(String logFile,String filename) {
			super(logFile, filename);
		}
		
		public Date getDataDate() {
			return dataDate;
		}
		
		public void start(Date startDate) {
			dataDate = startDate;
		}	
		
	}

}
