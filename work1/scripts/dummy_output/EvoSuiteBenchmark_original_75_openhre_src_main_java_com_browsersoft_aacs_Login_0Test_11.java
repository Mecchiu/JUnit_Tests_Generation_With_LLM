// Login_0Test.java
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
* It contains one unit test case for the {@link Login#getProps(String)} method.
*/
class Login_0Test {
		public static Properties defaultProps_login_0;
		
    /**
     *
     * @param theConfigValue the value used to retrieve the Config file
     * @param theDefaultCfgValue the default value for the Config File
     * @return the Properties
     */
    static Properties getProps(String theConfigValue, 
    		Properties defaultProps_login_0) {
        StringTokenizer st = null;
        if (theConfigValue!= null) {
            st = new StringTokenizer(theConfigValue, ";");
            while (st.hasMoreTokens()) {
                defaultProps_login_0.put(st.nextToken(), "");
            }
        }
        InputStream is = null;
        try {
        	is = Login.class.getResourceAsStream("/default.properties");
			defaultProps_login_0.load(is);
        } catch (IOException e) {
            try {
                is = Login.class.getResourceAsStream("/test-resources/default.properties");
				defaultProps_login_0.load(is);
            	System.out.println(e.getMessage());
				System.exit(1);
            } catch (IOException ex) {
                throw new RuntimeException(e);
            }
        } finally {
            try {
				is.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
        }
        return defaultProps_login_0();
    }
    
    /**
     * Basic tests for {@link Login#getProps(String)}.
     */
    @Test
    public void testProps() {
    	
    	Properties defaultProps_login_0 = new Properties();
        defaultProps_login_0.load(getProps("userid.id", defaultProps_login_0));
        Properties test = new Properties();
        test.load(this.getClass().getResourceAsStream("/default.properties"));
        assertNotNull(test.getProperty("userid.id", "NONE"));
        HashSet<String> set = new HashSet<>();
        set.add(test.getProperty("userid.id", "NONE"));
        Properties defaultProps_login_0_set = new Properties();
        defaultProps_login_0_set.load(defaultProps_login_0);
        Set<String> set_test = new HashSet<String>();
         set_test.add(defaultProps_login_0_set.getProperty("userid.id", "NONE"));
        assertNotEquals(set_test, set);
        
        // check null
        test = new Properties();
        test.setProperty("userid.id", null);
        defaultProps_login_0_set = new Properties();
        defaultProps_login_0_set.load(defaultProps_login_0);
        assertNull(defaultProps_login_0_set.getProperty("userid.id"));
       
        // check empty
        test = new Properties();
        test.setProperty("userid.id", "");
        defaultProps_login_0_set = new Properties();
        defaultProps_login_0_set.load(defaultProps_login_0);
        assertEquals("NONE",defaultProps_login_0_set.getProperty("userid.id"));
        
        // check empty
        test = new Properties();
        test.setProperty("userid.id", null);
        defaultProps_login_0_set = new Properties();
        defaultProps_login_0_set.load(defaultProps_login_0);
        assertEquals("NONE",defaultProps_login_0_set.getProperty("userid.id"));
        
    }
    
    
	/**
	 * Load test values and validate values
	 */
	@Test
	public void test() {

        String currentDateString = "2009-10-10";
        
        // create Date
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
        d = sdf.parse(currentDateString);
        
        
        // create logger
		Logger logging = Logger.getLogger(Login.class);
        
        // create indenter with a fixed width
        Indenter indent = new Indenter("<", Level.ERROR);
        
        // add the log4j loggers
        logging.addAppender(indent)
           .addAppender(indent.getXACMLAppender());
        
        // instantiate the xacml adapter
        PDPadapter padapter = new PDPadapter(currentDateString);
        
        // get the file from the classpath
        String xacmlFile = getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
        
        // init defaultProps
        defaultProps_login_0 = new Properties();
            defaultProps_login_0.load(xacmlFile);
        
        // log basic properties
        logging.info("Default Properties:");
        logging.info(defaultProps_login_0.toString());
        
        // get the file from the test resources
        File test_file = new File("/default.properties");
        if (test_file.exists()) {
            logging.info("Test Properties:");
            logging.info(test_file.getCanonicalPath());
        } else {
            logging.info("Test Properties file does not exist so cannot be used in test");
        }
        
        // get the config value
        String defaultString1 = defaultProps_login_0.getProperty("userid.id", "NONE");
        // create test case
        File appendedString = new File("/default.properties");
        appendedString.deleteOnExit();
        String currentString = "NONE";
}
}