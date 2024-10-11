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
		
	private RequestBuilder reqBuilder; 

	/**
	Creates a Set of users
	@throws LoginException for invalid users
	*/
	void prepareUsers() throws LoginException {		
		reqBuilder = new RequestBuilder(1000);
		Set<User> users = new HashSet<>(3);
		users.add(new User(0, "123456789012345678901"));		
		users.add(new User(1, "123456789012345678901"));		
		users.add(new User(2, "12345678901234567890"));		
		reqBuilder.setAuth(users);
		reqBuilder.setRationale(new StringTokenizer("", 1));	
	}
	
	void testLoginUser() throws LoginException {	
		Set<User> users = loginUser();
		assertEquals(3, users.size());
		Iterator<User> iter1 = users.iterator();
		User u1 = iter1.next();
		assertEquals(0, u1.id);
		assertEquals("123456789012345678901", u1.loginName);
		assertEquals("123456789012345678901", u1.password);
		u1 = iter1.next();
		assertEquals(1, u1.id);
		assertEquals("12345678901234567890", u1.loginName);
		assertEquals("123456789012345678901", u1.password);
	}
	
	/**
	 * Creates a set of users and a default date
	* @return Set<User> which contains users
	* @throws LoginException for invalid users
	*/
	private Set<User> loginUser() throws LoginException {
		Set<User> users = new HashSet<>(); 
		prepareUsers();
		Set<RequestCtx> reqCtxs = reqBuilder.createSignedCtx();   		
		Iterator<RequestCtx> iter1 = reqCtxs.iterator();
		RequestCtx reqCtx = iter1.next();
		RequestBuilder.getInstance().setAuth(reqCtx);   		
		reqBuilder.setRationale(new StringTokenizer("", 1));
		reqBuilder.setDateFmt(new SimpleDateFormat("%d-%M-%Y %H:%i:%s"));
		reqBuilder.setTimeZone(TimeZone.getDefault());   		   		
		User u1 = new User("1","123456789012345678901");
		
		assertNotNull(u1);
		u1.createInstance(reqBuilder);
		users.add(u1);
		
		assertEquals(reqBuilder,u1.reqBuilder);		
		users.add(u1);
		System.out.println("LoginUser: " + u1.loginName);
		assertEquals(u1.name,u1.loginName);
		users.add(u1);
		System.out.println("LoginUser: " + u1.loginName);
		assertEquals(u1.name,u1.loginName);
		
		Calendar from = Calendar.getInstance();
		calToFrom(u1, from);  
		u1.setLastLogin(new Date(from.getTimeInMillis()));
		Calendar to = Calendar.getInstance(); 
		calToTo(u1, to);  		
		users.add(u1);
		users.add(u1);
		users.add(u1);
		users.add(u1);
		assertEquals("users set size for one user not increased by one", 
				1, users.size()); 		
		users = reqBuilder.createSignedCtx();   		
		assertEquals(reqBuilder,u1.reqBuilder);		
		users.add(u1);
		users.add(u1);
		users.add(u1);
		users.add(u1);
		assertEquals(reqBuilder,u1.reqBuilder);		
		System.out.println("LoginUser: " + u1.loginName);
		assertEquals(u1.name,u1.loginName);
		assertEquals(u1.lastLogin,u1.reqBuilder);  		
		
		users.clear();
		users = reqBuilder.createSignedCtx();   		   	
		assertEquals(reqBuilder,u1.reqBuilder);		
		users.add(u1);
		users.add(u1);
		users.add(u1);
		users.add(u1);
		System.out.println("LoginUser: " + u1.loginName);
		assertEquals(u1.name,u1.loginName);
		assertEquals(u1.lastLogin,u1.reqBuilder);   		
		
		return users;
	}
	
	/**
	 * @see Login_4Test#prepareUsers()
	 */
	void prepareUsers(){
		FileAppender fileAppender = new FileAppender();
		fileAppender.setName("F1");
		fileAppender.setLayout(new SimpleLayout());
		fileAppender.setAppender(fileAppender);
		fileAppender.start();
		Logger.getRootLogger().addAppender(fileAppender); 
		Logger.getRootLogger().setLevel(Level.ERROR);
		Logger.getLogger("org.apache.log4j").getAppenderRef()
		.setLevel(Level.WARN);
	}
	
	/**
	 * @see Login_4Test#testLoginUser()
	 */
	void testLoginUser(){	
		FileAppender fileAppender = new FileAppender();
		fileAppender.setName("F1");
		fileAppender.setLayout(new SimpleLayout());
		fileAppender.setAppender(fileAppender);
}
}