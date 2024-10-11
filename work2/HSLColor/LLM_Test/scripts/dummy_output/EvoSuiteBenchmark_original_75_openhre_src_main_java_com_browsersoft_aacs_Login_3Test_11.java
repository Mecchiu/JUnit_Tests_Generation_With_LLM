// Login_3Test.java
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
* It contains one unit test case for the {@link Login#authorize()} method.
*/
class Login_3Test {
		
 	/**
	 * The xacml log file name.
	 */
	private static final String XACML_FILE = "log";
	
	/**
	 * The xacml log file name.
	 */
	private static final String XACML_RESULT_FILE = "log";

	/**
	 * The default file for output files.
	 */
	private static final String DEFAULT_FILE = "jax.xml";
	
	
	/**
	 * Logger for Junit.
	 */
	private static Logger logger;

	/**
	 * The result log file name.
	 */
	private static final String RESULT_FILE = "jax.xml";

	/**
	 * Login result file name.
	 */
	private static final String RESULTFILE = "l2.xml";

	/**
	 * This is the date and time format for the output files.
	 */
	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd-HH:mm:ss");
	
	/**
	 * The result log file name.
	 */
	private Properties logs;

	/**
	 * An internal logger instance.
	 */
	private static final Logger logger = Logger.getLogger("LoginTest");

	/**
	 * The log file name.
	 */
	private File xmlFile;

	/**
	 * The result log file name.
	 */
	private File resultFile;

    /**
     * Simple constructor.
     * It creates a test case with the default log file name. The log 
     * file is created as "log" directory in the test working directory.
     * All tests that need a log file are executed here.
     */
	public Login_3Test() {

		this.logs = new Properties();
		
		try {

			this.logs.put("logpath", new File(System.getProperty("test.dir",".")));
			this.logs.put("xml", new File("logs/log-2.xml"));
			this.logs.put("l1", new File("logs/log-1.xml"));

			this.resultFile = new File(this.logs.getProperty("xml","l2.xml"));
			this.xmlFile = new File(this.logs.getProperty("logpath","log"));

		} catch (SecurityException e) {
			
			logger.debug("SecurityException:", e);
		}

		SimpleLayout layout = new SimpleLayout();
		
		if (this.xmlFile.canRead()) {
			
			getLogger("")
				.debug("File name is " + this.xmlFile.getAbsolutePath());
			
			// Initializing the internal logger instance using the above names.
			logger = Logger.getLogger("");
			logger.debug("Initializing internal logger.");
			logger.debug("File name is " + this.xmlFile.getAbsolutePath());
			logger.debug("Initializing Log Manager using file location " + this.logs.getProperty("xml","l2.xml"));
			
			logger.debug("Returning the Logger instance " + logger.getRootLogger());
			return;
		}

		try {

			getLogger("")
				.debug("Opening file for reading.");
			
			// Creating a file applayer.
			Logger appender = Logger.getRootLogger().getAppender("appender1");
			
			// Appending a Log4j appender.
			appender 
				= new FileAppender(layout,
					new Indenter(new StringBuilder(),new Indenter(new StringBuilder()),formatter)) 
				.addAppender(appender)
				.addMDCProperties(new StringTokenizer("paths=log4j.level=ALL"), false);
			
			getLogger("")
				.debug("Setting the appender " + appender);
			
			logger.addAppender(appender);

		} catch (SecurityException e) {
			
			logger.debug("SecurityException:", e);
		}
		
		System.err.println("TEST FAILED");

		Logger.getLogger("").debug("Exiting test");
		System.exit(1);
	}

    /**
     * Creates a new Test case with the default file name for running the tests.
     *
     * @throws SecurityException Thrown if a file cannot be created.
     * @throws LoginException Thrown if the password cannot be converted.
     */
    public static synchronized User authorize() throws LoginException, ParseException {

    	return new Login().authorize();
    }

    /**
     * Test cases are written to a file, which is set as
     * the value of the "xml" variable in this class, 
     * which is a default directory in a test working directory.
     *
     * @throws Exception Thrown when any exception occurs.
     */
	@Test
    public void test_log() throws Exception {

		File xml = TestData.file(XACML_FILE);
        File xmlResult = TestData.file(XACML_RESULT_FILE);
		
		this.logs.put("xml", xml);
		this.logs.put("xmlResult", xmlResult);
	
		File result = TestData.file(RESULT_FILE);
		
		this.logs.put("result", result);
	
		// Generate xml as input file.
		logger.debug("Generating XML file");
		File xmlfile = new File(xml.getAbsolutePath());
		File xmlfilestop = new File(xmlfile.getAbsolutePath());

        System.err.println("XML file name is " + xml.getAbsolutePath());
		System.err.println("XML file name is " + xmlfile.getAbsolutePath());
}
}