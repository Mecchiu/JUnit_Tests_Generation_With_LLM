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
		
    /**
     * Returns log4j log and layout properties from {@link com.browsersoft.aacs.Properties#LOG4J_PROPERTIESFILE}
     */
    @Test
    public void testProps() throws LoginException, ParseException, javax.security.auth.login.LoginException {
	
	java.io.File f = new java.io.File(getClass()
				.getProtectionDomain()
					.getCodeSource()
						.getLocation()
						.append( "/"));
	try (final java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(f))) {
	    logger.info("\nTesting {0}\n", f.toString());

	    /** 
	    ** Get the property value, using the following form:
	    ** 
	    ** getProperty("log4j.layout.file")
	    */
	    final Properties p = new com.browsersoft.aacs.Properties();
	    p.load(br);

	    /**
	    ** Test the content of
	    ** 
	    ** String
	    */
	    logPropsTest(p);

	    logger.info("TEST OK: {}", p.toString());
	}

        /**
         * Test of logPropsTest method, of class com.browsersoft.aacs.Properties.
         */  
}
}