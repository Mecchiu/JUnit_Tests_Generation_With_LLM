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
		
    private static final Logger log = Logger.getLogger(Login.class.getName());
	
    private static final String logoutFile_4Test = "logoutFile_"+System.currentTimeMillis();
    private static final String reqToken_4Test = "reqToken_"+System.currentTimeMillis();
   

    private static final String passwordFile_4Test = "passwdFile_"+System.currentTimeMillis();
    private static final String logoutFile_4TestEmpty = "logoutFile_"+System.currentTimeMillis();
    private static final String reqToken_4File_Empty = "reqToken_"+System.currentTimeMillis();

    private static final String passwordFile_4TestFullFile = "passwdFile_"+System.currentTimeMillis();
    private static final String logoutFile_4TestFullFile = "logoutFile_"+System.currentTimeMillis();
    private static final String reqToken_4File_FullFile = "reqToken_"+System.currentTimeMillis ();   				
																				
    private static final String logoutFile_4TestFile= logoutFile_4Test;
    private static final String reqToken_4File = reqToken_4File_FullFile;
    private static final String passwordFile_4TestFile = passwordFile_4TestEmpty;
    private static final String logoutFile_4TestFile_Empty = 
        logoutFile_4TestEmpty;
    
    /**
     * Creates the {@link Set} object that is used to
     * login the user, add all the users it would have
     * to do so.
     *
     * @return Set<User>
     */
    Set<User> createSet() {
		Set<User> set = new HashSet<User>();
		set.add(new User("1", "jolokia"));
		set.add(new User("2", "jolokia"));
		return set;
    }
	
    /**
     * Creates another {@link Set} object that is used as
     * a new user set before adding that one to the
     * original one
     *
     * @return Set<User>
     */
    Set<User> returnCreateSet() {
		Set<User> set = new HashSet<User>();
		set.add(new User("3", "jolokia"));
		set.add(new User("4", "jolokia"));		
		return set;
    }
	
    /**
     * Login function will use the provided
     * {@link Login.LoginCtx} to prepare the
     * {@link Login.LoginCtx} for a login request.
     *
     * @param loginCtx Login.LoginCtx object
     * @return User object
    */
    private User login(Login.LoginCtx loginCtx) {
        User user = loginCtx.loginUser();
        assertNotNull(user);
        return user;
    }
	
	/**
	 * This method is used to verify the login function
	 * for a new {@link Login} object created after a 
	 * {@link Login.LoginCtx} object has been
	 * returned
	 * by the {@link Login} function
	 *
	 * @throws LoginException Thrown
	 */
	public void loginTest() throws LoginException {
        LoginCtx ctx = new LoginCtx(createSet());
        Set<User> users = login(ctx);
        assertTrue(users.size() == 3);
	}
	
	/**
	 * Test method for
     * {@link Login#login(com.browsersoft.aacs.xacml.AuthCtx, Set)}.
     *
     * @throws LoginException
     */
    @Test
    public void testLogin() throws LoginException {
       logoutTest();
        
        login();
        
      //  loginTest();
    }
	
    /**
     * This method sets the log output file into 
     * a new log4j file.
     * 
	 * @param logoutFile logoutFile object
     */
	public void setLogoutFile(String logoutFile) {
		logoutFile = new SimpleDateFormat("GMT").format(new Date());
        FileAppender appender = new FileAppender();
        logger = Logger.getLogger(SimpleLayout.getInstance().getLayoutData(false));
        File logFile = new File(logoutFile);
        FileAppender fappender = new FileAppender();
        fappender.setDest( logFile.toString());
        fappender.setLocationRelativeTo(logFile );
        file = fappender;
        appender.setLogger(file.getName());
        additionalLayout();
        System.setProperty("file.encoding", "UTF-8");
    }
    
    /**
     * This method saves the additional layout (or only the original)
     * file into log4j.
     */
    public void additionalLayout() {
        String appenderProp = "org.apache.log4j.helpers.FileAppender";
       additionalLayout(appenderProp);
    }	
    
    /**
     * This method saves all the log4j properties
     * to the new log4j file(logoutFile)/log4j.xml(logoutFile)
     * XML file with logout and additional, 
     * and adds more properties to add more additional log4j properties
     *
     * @param additionalLayout additional properties to write out
     */	
	private void additionalLayout(String additionalLayoutProp) {
		FileAppender appender = new FileAppender();
        appender.setLayout(new SimpleLayout());
        logger.addAppender(appender);
        
        Set<String> log4jProp = new HashSet<String>();
   //  	log4jProp = Properties.getStringProperty("log4j.configuration.file
}
}