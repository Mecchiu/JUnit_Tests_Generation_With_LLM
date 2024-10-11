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
		
    private static final String PREFIX = "LOGIN_Test_";
    
    /**
     * Test case where all parameters are set, one is checked for
     * in a set (to avoid parsing failure with 'logs/', 'noparse' values).
     */
    @Test
    public void checkLogin() {
        Properties props = getProps();
        
        String user = "user";
        String passwd1 = "pass";
        String login = PREFIX + "1";
        String host = "host";
        int port = 80;
        boolean tls = false;
        boolean useIPXMPP = false;
        boolean checkLogin = false;
        String ipxmppServerAddr = null;
        
        props.put("user", user);
		props.put("passwd1", passwd1);
        props.put("login", login);
        props.put("host", host);
        props.put("port", port);
        props.put("tls", String.valueOf(tls));
        props.put("useipxmpp", String.valueOf(useIPXMPP));
        props.put("checklogin", String.valueOf(checkLogin));
        props.put("ipxmpp_serverAddr", ipxmppServerAddr);
         
        String error = null;
        boolean isPasswdChangeException = false;
        try {
            System.err
               .println(String.format("\n\n## In test 1 of checkLogin()\n"));
            System.err.println("\n\n*** User changed password ****");
            String errorUser = "User changed password.\n";
            String errorPass = "new password required.\n";
           
            props.put("errorUser", errorUser);
            props.put("errorPass", errorPass);
            
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ParseException e1) {
            error = "new password required: " + e1.getMessage();
            e1.printStackTrace();
        }
            
        checkLogin = checkLogin(false, false, false, false, false, false, error,
                passwd1, user, passwd1, errorUser, errorPass);
        
        assertTrue(checkLogin);
        
        // Check login works in the following cases
        // 1. User changed the password from none to "pass" on host change,
        //    i.e., host change of the user and from no change to no change
        //    of credentials to ipxmpp server
        // 2. User changed the password from "pass" to "NOPASS" on host change
        //    and ipxmpp server
        System.out.println("### Set host: " + host + " of " + error);
        props.put("errorHost", host);
        props.put("errorUser", errorUser);
        checkLogin = checkLogin(false, false, true, false, false, false, errorUser,
                errorPass, user, passwd1, false, false);
        
        // Check login works in the following cases
        // 1. User changed "none" to "pass" on host change and host change of the user
        //     from no changes to no changes of credentials to none
        // 2. User changed "NOPASS" to "pass" on host change and host change of the user
        //     from no changes to no changes of credentials to NOPASS
        System.out.println("### Set host: " + host + " of " + error);
        props.put("errorHost", host);
        props.put("errorUser", errorUser);
        checkLogin = checkLogin(false, false, true, false, false, false, errorUser,
                errorPass, user, passwd1, false, false);
        
        // Check login works in the following cases
        // 1. User changed "pass" to "NOPASS" on host change and host change of the user
        //     from no changes to no changes of credentials to "pass
        // 2. User changed "pass" to "NOPASS" on host change and host change of the user
        //     from no changes to no changes of credentials to "NOPASS
        System.out.println("### Set host: " + host + " of " + error);
        props.put("errorHost", host);
        props.put("errorUser", errorUser);
        checkLogin = checkLogin(false, false, true, false, false, false, errorUser,
                errorPass, user, passwd1, false, true);
        
        // Check login works in the following cases
        // 1. User changed "NOPASS" to "pass" on host change and host change of the user
        //     from no changes to no changes of credentials to "NOPASS
        // 2. User changed "NOPASS" to "pass" on host change and host change of the user
        //     from no changes to no changes of credentials to "NOPASS
        System.out.println("### Set host: " + host + " of " + error);
        props.put("errorHost", host);
        props.put("errorUser", errorUser);
        checkLogin = checkLogin(false, false, true, false, false, false, errorUser,
                errorPass, user, passwd1, false, true);
        
        // Check login works in the following cases
        // 1. User changed "none" to "pass" on host change and host change of the user
        //     from no changes to no changes of credentials to "none"
        // 2. User changed "pass" to "NOPASS" on host change and host change of the user
        //     from no changes to no changes of credentials to "NOPASS
        System.out.println("### Set host: " + host + " of " + error);
        props.put("errorHost", host);
        props.put("errorUser", errorUser);
}
}