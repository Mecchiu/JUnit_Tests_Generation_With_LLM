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
Set<String> testSet = new HashSet<>();
		
		Login_0Test() {
			Properties props = getProps("login-test.properties");
			testSet = new HashSet<String>(props.keySet());
		}
	
        /**
         * Get log4j properties from the properties file "login-test.properties"  
         */
        Properties getProps(){
            Properties props = new Properties(); // empty
            props.loadFromXML(new File ("login-test.properties"));
	            return props;
        }
        
        /**
	     * Get the default log4j properties
	     * @throws LoginException, ParseException
	     */
        void getDefaultPropsAndCheckErrorCase() throws LoginException, ParseException {
            Properties prop = getProps("login.properties");
            for (String key : testSet) {
                String value = prop.getProperty(key);
                if (key.startsWith("login-default-"))
                    assertEquals(value, prop.getProperty("login-default-" + key));
            }
            // This test needs to be in sync with what is done in the
	            // 'testProperties' config file
            assertEquals("No login default value found", prop.getProperty("log4J.LoggerImpl"), null);
            assertEquals("No login default value found", 
                         prop.getProperty("log4J.Logger.level.test"), "OFF");
        }
        
	     /**
	     * Get the log4j properties from the file system
	     */
        void getLog4jPropsFromFileSystem(String theDir) {
            Properties props = getProps(theDir);
            for (String key : testSet) {
                String value = props.getProperty(key);
                if (key.startsWith("login-default-"))
                    assertEquals(value, props.getProperty("login-default-" + key));
            }
	        // This test needs to be in sync with what is done in the
	        // 'testProperties' config file
            assertEquals("No login default value found", value, props.getProperty("log4J.LoggerImpl"));
            assertEquals("No login default value found", 
                         String.valueOf (value), 
                         String.valueOf (props.getProperty("log4J.Logger.level.test")));
        }
        
}

// login_1.java
class Login_1Test {
	Properties oldPropSet;
	Properties newPropSet;

	Login_1Test () {
		Properties pProps = new Properties();
		oldPropSet = new Properties(); 
		newPropSet = new Properties();
		Login_1Test.initProps(pProps, oldPropSet, newPropSet);
	}
	
	@Test
	public void testLog4J () {
		TimeZone toz1 = TimeZone.getTimeZone("GMT");
		StringTokenizer tok1 = new StringTokenizer("GMT",
				"+00:00");
		String tok2 = new StringTokenizer("GMT",
                "+01:00");
		
		Properties old = oldPropSet;
		old.clear();
		oldPropSet = new Properties(); 
		
		Properties new = newPropSet;
		new.clear();
		newPropSet = new Properties(); 
		

		new.setProperty("log4J.LoggerImpl", Level.FATAL.getName()+".fatal");
		new.setProperty("log4J.Logger.level.fatal", Level.WARNING.getName());
		old.setProperty("log4J.LoggerImpl", Level.FATAL.getName()+".fatal");
		old.setProperty("log4J.Logger.level.fatal", Level.FATAL.getName()+".fatal");
		
		old.clear();
		newPropSet.setProperty("log4J.LoggerImpl", Level.FATAL.getName()+".fatal");
		newPropSet.setProperty("log4J.Logger.level.fatal", Level.INFO.getName());
		old.setProperty("log4J.LoggerImpl",Level.FATAL.getName()+".fatal");
		old.setProperty("log4J.Logger.level.fatal", Level.INFO.getName());
	    // This test just needs to be in sync with what is done in

	    assertEquals("No log4J.LoggerImpl set from old config file", "fatal", old.getProperty("log4J.LoggerImpl"));
	    assertEquals("No log4J.Logger.level.fatal set from old config file", Level.FATAL.getName(), old.getProperty("log4J.Logger.level.fatal"));
	    assertEquals("No log4J.LoggerImpl set from old config file", "fatal", new.getProperty("log4J.LoggerImpl"));
	    assertEquals("No log4J.Logger.level.fatal set from old config file", Level.FATAL.getName(), new.getProperty("log4J.Logger.level.fatal"));
		
		old = new;
		newPropSet = old;
		
		//This test just needs to be in sync with what is done in
	    assertEquals("No log4j.Logger set from new config file", "fatal", old.getProperty("log4j.LoggerImpl"));
	    assertEquals("No log4j.Logger.fatal set from new config file", Level.FATAL.getName(), newPropSet.getProperty("log4j.Logger.fatal"));
		
		new.setProperty("log4j.