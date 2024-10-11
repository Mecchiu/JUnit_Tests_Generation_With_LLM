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
		
	
	@Test
	void getProps_valid();
	
	@Test
	void get_valid_defaults();
	
	@Test
	void get_valid_with_username_and_password();
	
	@Test
	void get_valid2_with_login_rejects();
	
	@Test
	void get_valid_with_password_empty();
	
	@Test
	void get_valid_with_other_empty_and_password();
	
	@Test
	void get_valid_with_other_passwords_empty();
	
	@Test
	void get_valid_with_other_empty_password();
	

	@Test
	void get_valid_invalid_with_defaults();
	
	@Test
	void get_valid_multiple_with_defaults();
	
	@Test
	void login_invalid_password();
	
	@Test
	void login_missing_username();
	
	@Test
	void login_missing_password();
	
	@Test
	void login_with_invalid_password();
	
	@Test
	void login_multiple_with_invalid_password();

        @Test
	void login_valid_with_username_password_same();
	
    //@Test
	public void get_valid() throws LoginException{
           
        
            RequestBuilder builder = new RequestBuilder();
            try {
            Set<String> userIdSet = new HashSet<>();
            String userIdValue = "test12";  
            Set<String> passSet = new HashSet<>();
            passSet.add("hello");
            Set<String> passSet2 = new HashSet<>();
            passSet2.add("world");
            RequestCtx ctx = RequestCtx.newCtx();
            
            RequestCtx.setParam(ctx, "userId", userIdSet);
            RequestCtx.setParam(ctx, "password", passSet);
            RequestCtx.setParam(ctx, "password2", passSet2);
            
            StringBuffer buffer = new StringBuffer();
            builder.executeRequest(ctx);
            
            Iterator<String> iters = userIdSet.iterator();
            while (iters.hasNext()) {
            String next = iters.next();
            buffer.append(next);
            }
            String next2 = buffer.toString();
            
            
            //TODO uncomment the following line for tests to make sure it works correctly.
            
            boolean eq =!next2.equals(userIdValue);
        }
        catch(Exception e){
            e.printStackTrace();
            
        }

    }
}