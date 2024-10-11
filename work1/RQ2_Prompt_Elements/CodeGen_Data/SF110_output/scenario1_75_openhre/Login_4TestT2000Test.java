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
// Login.java
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

public class Login {

    public User authenticate() throws LoginException {
        user = null;
        if (userMgr == null)
            throw new LoginException("UserMgr undefined");
        if (password == null)
            throw new LoginException("Password not supplied");
        if (!userMgr.checkSecret(userid, password, authType)) {
            cat.warn("Invalid Password! User: " + username + ",userid: " + userid);
            throw new LoginException("Password invalid");
        }
        user = userMgr.getUser();
        user.setIpAddr(this.ipAddr);
        authorize();
        return user;
    }
}

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
		
    public User authenticate() throws LoginException {
        userid = null;
        if (userMgr == null)
            throw new LoginException("UserMgr undefined");
        if (username == null)
            throw new LoginException("Username not supplied");
        if (!userMgr.checkSecret(username, password, authType)) {
            this.cat.warn("Invalid username/Pass phrase for user: " + username);
            throw new LoginException("Invalid password/Passphrase");
        }
        userid = userMgr.getUser().getUniqueId();
        authorize();
		return userMgr.getUser();
    }
	
    public void authorize() throws LoginException {
               
    }
  
	@Test
	public void loginAuthTest() throws LoginException {
        Properties authTypeProperties = new Properties();
        authTypeProperties.setProperty("auth_level", "2");
        authTypeProperties.setProperty("auth_type", "" );
        
        
        
        Logger logger = Logger.getRootLogger();
        logger = Logger.getLogger("Login");       
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        parser.setTimeZone(TimeZone.getTimeZone("GMT"));
       
        
		Logger.getLogger("Global").setLevel(Level.getLevel("error"));
		
        
        if ((username == null) && (password == null))
            // username/password not given. Login and error 
            throw new LoginException("Please provide one of the parameters.");
        if (username == null)
        	 username = "testuser:";
        
		DateFormatFactory dateFormatFactory = new DateFormatFactory(logger);
	    SimpleDateFormat dFormat = new SimpleDateFormat("EEE, dd-MMM-yyyy 15:04:05");       
	    
	    StringBuilder sb = new StringBuilder("User");
    	if (username.equalsIgnoreCase("testuser:") && password.equalsIgnoreCase("testuser:testuser:password")) {
    		sb.append(" ").append("User1 ");
    		sb.append("User2 ");
    	}
    	else {
    		sb.append("User ");        
    		sb.append(username);
    		sb.append(" ");        
    		sb.append("");
    	}    	   
        logger.warn("username="+username+" password="+password);
        RequestCtx ctx = makeCtx();
        RequestBuilder rb = new RequestBuilder(RequestFactory.GET, "/login?auth_type=3");
        RequestCtx r = rb.build(ctx, authTypeProperties);
        Set<String> errorsCtx = new HashSet<String>();
        try {
        	rb.buildCtx(ctx, r);
    		rb.createCtx(r);
        	if (rb.isValid()!= 1)
    			throw new LoginException("Invalid Request");
    			    
        	user = rb.getResult();
        	this.cat.logDebug("The User: " + user.getUniqueId() + " " + user.getPassword());
    		this.cat.logDebug("RequestCtx: " + ctx);
    		try {
        		requestCtx = ctx;
        		requestBuilder = new RequestBuilder(RequestFactory.PUT, user);
        		try {
        			requestBuilder.getRequestCtx(requestCtx);
        			logger.error("Checking username " + username + " password");
        			
        		} catch(RequestException e) {
							if (errorsCtx.add(e.getName()+":"+e.getMessage())) return;
    				}
        		this.cat.logDebug("requestBuilder.getRequestCtx(requestCtx) = "+requestBuilder.getRequestCtx(requestCtx));
        		this.cat.logDebug("requestBuilder.buildCtx(requestCtx) = "+requestBuilder.buildCtx(requestCtx));
        		boolean ctxValid = rb.processCtx(requestCtx);
        		if (!ctxValid) return;
        		// this.cat.logDebug("requestBuilder.processCtx(requestCtx) = "+requestBuilder.processCtx(requestCtx));
        		requestCtx = requestBuilder.buildCtx(requestCtx);
        		return;
    		} catch (Exception e) {
							System.err.println("Exception: " + e.getMessage());
							requestCtx = requestBuilder.buildCtx(requestCtx);
    			throw new LoginException(e.getMessage());
    		}
			
    		rb.processCtx(requestCtx);
    		requestCtx = requestBuilder.buildCtx(requestCtx);
    		if (!rb.isValid()) return;
    		user = rb.getResult();
    		
			this.cat.logDebug("Got the User: "+user.toString());
			this.cat.logDebug("The User: "+user.getUniqueId());
			this.cat.logDebug("User type " + user.getUserType()+" user_type["+user.getUserTypeId()+"] users["+user.getUsername()+"] password(" + user.getPassword()+ ") username(" + user.getUsername()+")");  		
			if (userMgr.hasPassword(user.getUsername