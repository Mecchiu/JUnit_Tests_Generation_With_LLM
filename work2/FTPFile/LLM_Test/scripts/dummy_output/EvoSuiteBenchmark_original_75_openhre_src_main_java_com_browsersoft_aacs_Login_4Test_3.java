// Login_4Test.java
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
* It contains one unit test case for the {@link Login#authenticate()} method.
*/
class Login_4Test {
		private static final Logger logger = Logger.getLogger(Login_4Test.class);
        
        boolean loginFail;
        
        String password;
		@Test
        void testLogin_success() throws Exception {
		    loginFail=false;
            Properties p = new Properties();
            p.put("user", "admin");
            p.put("password", "123");
            Set uSet = new HashSet();
            uSet.add("admin");
            Set pUSet = new HashSet();
            pUSet.add("admin");
            pUSet.add("password");
            logger.debug("Running testLogin_success in "+ this.getClass().getName());
            login(p);
            //verify the login succeeded
            logger.info("Testlogin_success:");
            assertTrue(loginFail);
	    }
	    @Test
    	void testLogin_wrongPassword() throws Exception {
            Properties p = new Properties();
            p.put("user", "admin");
            p.put("password", "12345");
            Set uSet = new HashSet();
            userSet(p, uSet);
            login(p);
            //verify the login succeeded
    	    logger.info("TestLogin_wrongPassword:");
    	    assertTrue(userSet(p, uSet).size()==0);
    	}
	    @Test
    	public void testLogin_wrongPassword_wrongUser() throws Exception {
            Properties p = new Properties();
            p.put("user", "admin");
            p.put("password", "12345");
            Set uSet = new HashSet();
            userMissing(p, uSet);
            login(p);
    	    //verify the username is present in setUser
            userSet(p, uSet);
            logger.info("TestLogin_wrongPassword_wrongUser:");
            assertTrue(userSet(p, uSet).size()>0);
    	}
	    /**
		@Test
		public void testLogin_wrongPassword_wrongUser_wrongPassword() throws Exception {
            Properties p = new Properties();
            p.put("user", "admin");
            p.put("password", "12345");
            Set uSet = new HashSet();
            uSet.add("admin");
            userMissing(p, uSet);
    	}
	    @SuppressWarnings({"rawtypes","unused"})
	    private void userMissing(Properties p, Set set){
	        assertTrue("Set is empty", set.size()==0);
	    }
	    @Test
	    public void testLogin_wrongPassword_wrongUser_wrongPassword(){
	    	Properties p = new Properties();
	    	p.put("user", "admin");
                p.put("password", "12345");
                Set uSet = new HashSet();
                userMissing(p, uSet);
//                System.out.println(uSet);
	    }
	    @Test
		public void testLogin_wrongPasswordAndUserMissing_wrongPassword(){
            Properties p = new Properties();
            p.put("user", "admin");
            p.put("password", "12345");
            Set uSet = new HashSet();
            userMissing(p, uSet);
//            Set pUSet = new HashSet();
//            pUSet.add("admin");
//            userSet(p, uSet);
	    }
    
    /**
     * Get a new logger for the given properties
     */
    private static final Logger getLogger(final String module) {
        FileAppender f = null;
        try {
            File file = new File("log4j.properties", "log4j.properties");
            f = new FileAppender();
            f.setName(module);
            f.setLayout(new SimpleLayout());
            f.setAppender(new Logger(file.getCanonicalPath()));
        }
        catch (ParseException e) {
            logger.debug(module + " log4j.properties could not be read/created");
            return null;
        } catch (NullPointerException e) {
            logger.debug(module + " log4j.properties was null");
            return null;
        }
        f.setFormatter(new Indenter(new SimpleDateFormat(
        		 "yyyy-MM-dd HH:mm:ss.SSSSSSSSSS", Locale.ENGLISH),
                Locale.getDefault()));
        try {
            return new Logger(file.getCanonicalPath());
        } catch (IOException e) {
        	return null;
        }
    }

    /** Creates a new empty properties with a specific default constructor. */
    private static final Properties newProperties(String module) throws Exception {
        // Use the same props with the same values at each run time.
        Properties p = new Properties();
        p.put("user", "admin");
        p.setProperty("password","123");
        Set uSet = new HashSet();
        uSet.add("admin");
        return p;
    }

	/**
	 * Get a new logger for the given properties
	 */
	private static final Logger getLogger(File log4jConfig) throws Exception {
		FileAppender f = null;
}
}