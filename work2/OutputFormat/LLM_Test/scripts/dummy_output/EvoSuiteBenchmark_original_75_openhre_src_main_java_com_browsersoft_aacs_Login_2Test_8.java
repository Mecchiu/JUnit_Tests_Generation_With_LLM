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
		
	/*
	* Get the Security Log File Path and instantiate a logger. 
	*/

	private static final String SECURITY_LOG_FILE_PATH;
	static {
		
		String strLogFilePath = getSecurityLogFilePath();

		//Create the Security Log File
		String strLogFileRootPath = strLogFilePath;
		strLogFileRootPath += getLogFileName();
		File[] setLogFile = new File[1];
		setLogFile[0] = new File(strLogFileRootPath);
		String strLogFilePath;
		String strLogFileFileName;

		try {
			setLogFile = FileAppender.createFileAppender(true);
			//create log file
			if (setLogFile.length > 0) {
				strLogFilePath = strLogFileRootPath;
				strLogFilePath = strLogFilePath + "-log.log";
				strLogFileFileName = "";
				strLogFile = setLogFile;
				Logger.getRootLogger().addAppender(setLogFile[0]);
			} else {
				System.out.println("No log file found at " + strLogFilePath);
			}
		} catch (SecurityException exc) { System.out.println(exc.getMessage()); }
	}

	/*
	* Initialize and test {@link Login#getSecurityLogFilePath()} method. 
	*/

    @Test
    public void getSecurityLogFileName() throws LoginException {

    	assertNotNull(new Login_1());


    }

    /**
    * The test for {@link Login_3#getSecurityLogFilePath()} method.
    */

    private static final String TEST_LOG_FOLDER = "tmpTestLog";
    @Test
    public void getSecurityLogFile_3() throws LoginException {

    	assertNotNull(new Login_3());


    }

// test with test case with a user named "aats" in case of log4j/xml/xml/log file.
    public static class Login_3 {

    	private File appDir = null;

    	public Login_3() throws LoginException {
            String strFileDirectory = getTestFilePath();
            File testLogFile = new File(strFileDirectory + File.separator + getLogFileName());
            appDir = testLogFile.getParentFile();
            System.out.println("Test log file " + testLogFile.getName() + '(' + getLogFileName() + ")");
        }

    	private String getTestFilePath() {
			return System.getProperty("test.dir", null);
		}

		private String getLogFileName() {
			return "AATLSQL";
		}
    }

    /**
    * The test for {@link Login_4#getSecurityLogFilePath()} method.
    */

    @Test
    public void getSecureSecurityLogFileName_3() throws LoginException {

    	assertNotNull(new Login_4());


    }

// Test to see if the log4j2-xml-log file can be read and if it can be determined.
public static class Login_4 {

	private File appDir = null;

	private Date currentDate = null;
	private Calendar time = null;
	private Set<Date> listOfSetDate = null;
	private HashSet<Date> listOfHashSetDate = null;
	private Set<Set<Date>> listOfSetsOfSetsDate = null;
	private HashSet<Set<Set<Date>>> listOfSetsOfSetsSetsDate = null;
	private HashSet<HashSet<Date>> listOfSetsOfHashesSetsDate = null;
	private HashSet<HashSet<Set<Date>>> listOfSetsOfHashesSetsSetsDate = null;

	private long lastAccessed = 0L;

	public Login_4() throws LoginException {

		this.listOfSetDate = new HashSet<Date>();
		this.listOfHashSetDate = new HashSet<HashSet<Date>>();
		this.listOfSetsOfSetsDate = new HashSet<Set<Set<Date>>>();
		this.listOfSetsOfSetsSetsDate = new HashSet<Set<Set<Date>>>();
		this.listOfSetsOfHashesSetsDate = new HashSet<Set<Set<Set<Date>>>>();
		this.listOfSetsOfHashesSetsSetsDate = new HashSet<Set<Set<Set<Date>>>>();

		this.appDir = new File(".");
		this.currentDate = new Date();
		this.time = new Calendar();
		this.lastAccessed = 0L;
	}

	public File getAppDir() {
		return this.appDir;
	}

	public Date getCurrentDate() {
		return this.currentDate;
	}

	public Calendar getTime() {
		return this.time;
	}

	public long getLastAccessed() {
		return this.lastAccessed;
	}

	public Set<Date> getListOfSetDate() {
		return this.listOfSetDate;
	}

	public HashSet<Date> getListOfHashSetDate() {
		return this.listOfHashSetDate;
	}

	public Set<Set<Date>> getListOfSetsOfSetsDate() {
		return this.listOfSetsOfSetsDate;
	}

	public HashSet<Set<Set<Date>>> getListOfSetsOfSetsSetsDate() {
		return this.listOfSetsOfSetsSetsDate;
	}

	public HashSet<HashSet<Date>> getListOfSetsOfSetsSetsDate() {
		return this.listOfSetsOfSetsSetsDate;
	}

	public Set<Set<Date>> getListOfSetsOfHashesSetsDate() {
		return this.listOfSetsOfHashesSetsDate;
	}

}
}