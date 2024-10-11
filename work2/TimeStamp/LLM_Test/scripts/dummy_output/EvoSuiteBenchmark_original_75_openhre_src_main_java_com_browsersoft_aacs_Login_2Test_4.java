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
		private static final Logger logger = Logger.getLogger("com.browsersoft");
		private String securityLogFilePath;
		/**
		 * @throws Exception
		 */
		/*
		 * @BeforeClass
		 */
        @Before
		public void beforeClass() throws Exception {
			File appDir = new File("binaries/test-files/");
			String[] path = appDir.list();
			String testScriptExecutable = PathUtils.findScriptExecutable("security");
			for (int i = 0; i < path.length; i++) {
                appDir = new File(appDir.getPath(), "binaries/" + path[i]);
			}
			File logFile = new File(appDir, "test.log");
			if(!logFile.exists()) {
				FileAppender fileAppender = new FileAppender();
				fileAppender.setName("AACSN");
				fileAppender.setLayout(new SimpleLayout());
				fileAppender.setThreshold(15);
				fileAppender.setAppend(true);
				
			}
			
		}
	/**
	* Test case of {@link Login#getSecurityLogFilePath()} method.
	* It tests the value returned by {@link Login#getSecurityLogFilePath()} method for a file for test file.
	*/
	@Test
	public void login_fileTest() throws Exception {
		String testScriptExecutable = PathUtils.findScriptExecutable("security");
		File logFile = new File(testScriptExecutable);
		if(!logFile.exists()) {
			FileAppender fileAppender = new FileAppender();
			fileAppender.setName("AACSN");
			fileAppender.setLayout(new SimpleLayout());
			fileAppender.setThreshold(15);
			fileAppender.setAppend(true);
			
			
		}
		File newLogFile = new File("binaries/test-files/testFile.log");
		
		logger.debug("logFile "+logFile);
		logger.debug("newLogFile "+newLogFile);
		
		logger.debug("fileAppender "+fileAppender.getLayout().getDatePattern());
		String log = Login.getSecurityLogFilePath();
		logger.debug("log "+log);
		logger.debug("logger "+getLogger());
		assertFalse("The directory does not exists anymore.", new Logger("test").getLoggerAppenders().iterator().hasNext());
	}
    private static String getLogger() {
		return logger.getFQCN();
	}
	private static String getLogger2() {
		return logger.getFQCN();
	}
	
	private static Logger getLogger2() {
		return logger;
	}
	
	private static String getLogger3() {
		return logger2.getFQCN();
	}
    private static Logger getLogger3() {
        return logger2;
    }
}