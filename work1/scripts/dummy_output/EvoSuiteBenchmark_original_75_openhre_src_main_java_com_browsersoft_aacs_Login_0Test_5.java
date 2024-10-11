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
		static Properties PROPS;
		
    /**
     * Get the properties from the configuration
     * @param theConfigFile the configuration file
     */
    public static void getProps(String theConfigFile) {
        PROPS = Login.getProps(theConfigFile);
    }

	@Test
    public void test00_getProps(){
		Log4jLogger logger = (Log4jLogger)Logger.getRootLogger();
		logger.finest("test00_getProps");
		
		if(String.valueOf(PROPS.getProperty("DEBUG"))!= null)LOGGER.setLevel(Level.ERROR);
        
		//TESTCMD_02_01
        assertEquals(PROPS.getProperty("DEBUG"), "true");
        //TESTCMD_02_02
        assertTrue(PROPS.getProperty("DEBUG").equals("true"));
        //TESTCMD_02_03
        assertTrue(PROPS.getProperty("DEBUG").equals("true"));
        //TESTCMD_02_04
        assertEquals(PROPS.getProperty("DEBUG"), "true");
        
        //TESTCMD_02_05
        assertTrue(PROPS.getProperty("DEBUG").equals("true"));
        //TESTCMD_02_06
        assertTrue(String.valueOf(PROPS.getProperty("DEBUG"))
                   .equals("true"));
        //TESTCMD_02_07
        assertEquals(PROPS.getProperty("DEBUG"), "true");
        //TESTCMD_02_08
        assertTrue(String.valueOf(PROPS.getProperty("DEBUG"))
                   .equals("true"));
        //TESTCMD_02_09
        assertEquals(PROPS.getProperty("DEBUG"), "true");
        //TESTCMD_02_10
        assertTrue(String.valueOf(PROPS.getProperty("DEBUG"))
                   .equals("true"));
    }
	
	@Test
    public void test10_Login_1_Logout(){
        Logger logger = Log4jLogger.getLogger("");
        
        logger.setLevel(Level.ERROR);
        StringTokenizer tok = new StringTokenizer(PROPS.getProperty("DEBUG"));
        
        if (null == tok) {
            logger.fatal("Log file not enabled by the configuration.");
        }
        
        logger.setLevel(Level.OFF);
        assertFalse(tok.hasMoreTokens());
		
		//Login_1_Logout_02_01
        try {
			RequestCtx requestCtx = RequestBuilder.createRequest(RequestCtx.R_CODE_RESPONSE);
			response = PDPadapter.pdp(requestCtx);
			logger.fatal(response.toString());
		} catch (LoginException le) {
            logger.fatal("LoginException: " + le.getMessage());
		}
    
	}
	
	@Test
    public void test11_Login_1_Logout_03() throws ParseException {
        Logger logger = Log4jLogger.getLogger("");
        
        logger.setLevel(Level.WARN);
        
		StringTokenizer tok = new StringTokenizer(PROPS.getProperty("DEBUG"));
                
        if (null == tok || tok.countTokens() < 2) {
            logger.fatal("The debug value is not set.");
        } else {
            logger.warning(tok.nextToken());
        }
	}
}