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

	@Test
	public void testGetProps( ) {
	int s = 0;
        try {
            s = getProps().size();
        } catch (ParseException e) {
            fail("Failed!");
        }
        assertEquals(1, s);
	}
	public void testGetPropsAsString( ) {
		Properties p = getProps();
		String s = (String)p.get("Login");
		assertEquals("LoginString", s);
	}
	
	@Test
	public void testGetLog4J( ) {
		Logger.getRootLogger().setLevel(Level.ALL);
		logger.warn(Login.getProps("log4j.xml").toString());
	}
	
	@Test
	public void testGetLog4JAsString( ) {
		Logger.getRootLogger().setLevel(Level.ALL);
		logger.warn("log4j.xml as String:"+Logger.getContext().toString());
	}
	
	private static final Logger logger = Logger.getLogger(Login.class.getName());
	
    @Test
    public void testGetXOPolicy( ) {
        try {
            RequestBuilder rb = new RequestBuilder("http://foo");
            setParam(rb,"xopolicy","XORequestXOA");
            RequestCtx r = rb.get();
            assertEquals(XOPolicy.XORequestXOA.toString(),r.getXopolicies().toString());
            RequestBuilder sub = createRequestBuilder("https://foo.com");
    	    RequestCtx subRb = sub.get();
            Iterator<XOPolicy> iter = r.getXopolicies().iterator();
            subRb.setParameter("xopolicy",iter.next().toString());
            iter.next();
        } catch (LoginException e) {
            fail("Failed!");
        }
    }
	/**
	* Check value of {@link Login#setConfigFile(String)} property.
	*/
	public void testGetConfigFile( ) {
		File newConfigFile = new File("/tmp/aaa.conf");
        try {
            newConfigFile.deleteOnExit();
        } catch (SecurityException e) {
            fail("SecurityException can't delete");
        }
        setConfigFile(newConfigFile.getCanonicalPath());
        if (newConfigFile.exists()) {
            if (!newConfigFile.canDelete()) {
                fail("Failed to delete:"+newConfigFile.getName());
            }
        }
        boolean exists = newConfigFile.exists();
        if (!exists) {
            fail("Failed to create new config file:"+newConfigFile.getName());
        }
	    System.out.println(newConfigFile.getAbsolutePath());
        String configFile = newConfigFile.getAbsolutePath();
        Logger.getRootLogger().addAppender(
        		new FileAppender(new SimpleLayout(), "\n%n%", configFile, true, true));
        for (String prop : getProps().size()) {
            if (prop.startsWith("Login.")) {
                Logger.getRootLogger().removeAppender(configFile);
                propsChanged(prop);
                configFile = newConfigFile.getAbsolutePath();
            }
        }
        Logger.getRootLogger().removeAppender(configFile);
	}

    /**
     * If this file existed, it would also exist.
     */
    private void propsChanged(String prop) {
        Properties p = getProps();
        StringTokenizer st = new StringTokenizer(prop,"=");
        String p1 = st.nextToken();
        String p2 = st.nextToken();
        System.out.println(st.nextToken());
        if (p1.startsWith("Login.")) {
            String login = p1.substring("Login.".length());
            String logins = p2;
            if (logins.startsWith("Login:")) {
                logins = logins.substring(6);
            }
            for (String sLogin : logins.split(",")) {
                if (!login.equals(sLogin.trim().toLowerCase())) {
                    System.out.println("login changed to "+login+" (no. of occurences "+nOccurences(logins)+")");
                    p.put(login,logins);
                }
            }
        }

    /**
    * Get number of occurences that a login parameter changed.
    *
    */
    private int nOccurences(String s) {
        String tokens = s.split(":");
        return tokens.length;
    }
}
