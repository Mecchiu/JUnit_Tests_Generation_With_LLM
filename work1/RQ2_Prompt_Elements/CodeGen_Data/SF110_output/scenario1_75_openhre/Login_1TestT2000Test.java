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

    // Set the current user's name.
   	private SimpleDateFormat sdf = new SimpleDateFormat(XACML3_USER_NAME, "dd/MMM/yyyy");
    // Get the current user's name.
        private String CURRENT_USER_NAME = getUserName();

        // Logout case when there is none.
   	   public Login.Login(String username) {
   	        System.out.println(username);
   	        RequestBuilder builder = new RequestBuilder();;
   	        builder.newPDRequest().newSetResponse().newGet()
   					.newIndenter().newIndenter().newIndenter().get()
   					.setXOP(true).setXOPEnabled(true).build()
   			.newIndenter().newIndenter().newIndenter().setXOP(true).setXOPEnabled(true).build()
   					.setAuthMethod(XACML_AUTH_METHOD).setAuthenticator().setPasswd("password").build();
   	        RequestCtx req = builder.build();
   	        ResponseHandler handler = new ResponseHandler();
   	        try {
   	            Set<String> success = new HashSet<>();
   	            success.add(handler.getResponse().toString());
   	            System.out.println("XOP enabled and success in response: " + success);
   	        } catch (Exception e) {
   	            throw new AssertionError(e.getMessage());
   	        }
   	        this.props = builder.end().build();
   	    }
    
 /*   		public String getCurrentUserName() {
   			RequestBuilder builder = new RequestBuilder();
   			builder.newPDRequest().newGet().newIndenter().newIndenter().newCond().setXOP(true).newCond().get();
   			ResponseHandler handler = new ResponseHandler();
   			try {
   	            Set<String> success = new HashSet<>();
   	            success.add(handler.getResponse().toString());
   	            System.out.println("XOP enabled and success in response: " + success);
   	        } catch (Exception e) {
   	            throw new AssertionError(e.getMessage());
   	        }
    		Properties props = (Properties)builder.end().get().buildProps();
   			Calendar calendar = Calendar.getInstance();
   			Calendar calendar2 = Calendar.getInstance();

    			String current_user = props.getProperty(XACML3_USER_NAME);
    			Calendar ct_current_user = Calendar.getInstance();
    			ct_current_user.set(0, Calendar.DATE, ct_current_user.get(Calendar.YEAR) - 1);
    			calendar.setTime(ct_current_user.getTime());

    			String current_tz = props.getProperty(XACML_USER_TZID);
    			Calendar ct_current_tz = Calendar.getInstance();
    			ct_current_tz.setTime(ct_current_user.getTime());
    			calendar2.setTime(ct_current_user.getTime());

    			String current_tz2 = current_tz;
    			System.out.println("Using user's TZID " + ct_current_tz.getTimeInMillis());
    			calendar.setTime(current_tz, Calendar.DATE, 11);
    			calendar.setTime(current_tz2, Calendar.DATE, 11);
    			calendar.setTimeZone(java.security.Security.getProvider("JVM").getTimeZone());
    			calendar2.setTimeZone(java.security.Security.getProvider("JVM").getTimeZone());

    			if (calendar.get(Calendar.YEAR)!= calendar2.get(Calendar.YEAR))
    			{
    				System.out.println("Current Date changed.");
    			}
    			if (calendar.get(Calendar.DAY_OF_YEAR)!= calendar2.get(Calendar.DAY_OF_YEAR))
    			{
    				System.out.println("Current Date changed.");
    			}
    			if (calendar.get(Calendar.MONTH)!= calendar2.get(Calendar.MONTH))
    			{
    				System.out.println("Current Date changed.");
    			}
    			if (calendar.get(Calendar.HOUR_OF_DAY)!= calendar2.get(Calendar.HOUR_OF_DAY))
    			{
    				System.out.println("Current Date changed.");
    			}
    			if (calendar.get(Calendar.MINUTE)!= calendar2.get(Calendar.MINUTE))
    			{
    				System.out.println("Current Date changed.");
    			}
   				String response = sdf.format(calendar.getTime());
    			String response2 = DateBuilder.convertTime(calendar2.getTime().getTime());
    			ResponseHandler handler2 = new ResponseHandler();
    			try {
    	            System.out.println("Date converted from current time to " + response2);
    	            Set<String> success2 = new HashSet<>();
    	            success2.add(response2);
    	            System.out.println("Success2 returned: " + success2);
    	            
    	        } catch (Exception e) {
    	            throw new AssertionError(e.getMessage());
    	        }

    		}
  */
    public void login() throws LoginException {
    		
    		new Login.Login(CURRENT_USER_NAME);
    }
}
