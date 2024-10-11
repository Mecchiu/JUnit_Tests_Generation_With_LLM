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
		
	@Test
	public void authenticate1() throws LoginException {
	
		User userA = login("loginA", "userA");
		assertEquals("User A", userA.getId());
		
		User userB = login("loginA", "userB");
		assertEquals("User B", userB.getId());
		
		Exception exA = null;
		try {
			login("not_a_login", "loginA");
		} catch (LoginException ex1) {
			exA = ex1;
		}
		assertNotNull(exA);
		assertEquals(Authenticate.NotPasswd, exA.getError());
		
	}
		
	@Test
	public void authenticate2() throws LoginException {
	
		User userA = login("loginA", "userA");
		assertEquals("User A", userA.getId());
		
		User userB = login("loginA", "userB");
		assertEquals("User B", userB.getId());
		
		Exception exA = null;
		try {
			login("loginA", "not_a_login");
		} catch (LoginException ex1) {
			exA = ex1;
		}
		assertNotNull(exA);
		assertEquals(Authenticate.NotAllowed, exA.getError());
		
	}

}

public class Login {
	private XACMLResult result = null;
	
	public Login() throws LoginException {
	}
	
	public XACMLResult login(String user, String pass) throws LoginException {
		
		Set<String> req = new HashSet<String>();
		req.add("authn: " + user);
		req.add("session: " + user);

		XACMLResult ret = null;
		RequestBuilder bu = new RequestBuilder();
		RequestCtx requestCtx = bu.buildRequest(req);
		requestCtx.setSecurityCtx(new SecurityContext());
		User userA = null;

		try {
			
			ret = bu.doRequest(requestCtx);
			
			if (user == null)
				return ret;
			
			userA = ret.getUser();
			req.clear();
			req.add("session: " + userA.getId());
			
			
			ret = bu.doRequest(requestCtx);

			if (userA.getID()!= user || ret.isFailed()) {
				
				error(ret);
				return ret;
				
			}
			
			return ret;
			
			
			
			
			
			
		} catch (Exception e) {
			
			error(e);
			return ret;
			
		}
	}

	public boolean isAuthenticated() throws LoginException {
		 
		boolean ret = false;
		RequestBuilder bu = new RequestBuilder();
		RequestCtx requestCtx = bu.buildRequest();
		requestCtx.setSecurityCtx(new SecurityContext());
		
		MessageDigest md = null;
		byte[] data = null;
		
		try {
			
			
			md = MessageDigest.getInstance("md5");
			data= md.digest(requestCtx.getBody().getBytes());
			
		} catch (UnsupportedEncodingException e1) {
			
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		boolean resultA = false;
		boolean testCancelled = false;
		while (!testCancelled) {

			Set<String> req = new HashSet<String>();
			req.add("authn: " + "login");
			req.add("resource: user1");
			
			try {

				
				RequestCtx requestCtx2 = bu.buildRequest(req);
				requestCtx2.setSecurityCtx(new SecurityContext());

				MessageDigest md2 = null;
				byte[] data2 = null;
				try {

					
					md2 = MessageDigest.getInstance("md5");
					data2= md2.digest(requestCtx2.getBody().getBytes());
										
				} catch (UnsupportedEncodingException e1) {				
					
					e1.printStackTrace();
					return false;
				}

				if ((md!= null) && (md.isEqual(data, data2))) {
					
					if (!checkPassword("password", data)) {
						
						try {
							md.update(data, 0, md.digest().length);
						} catch (UnsupportedEncodingException e1) {
							
							e1.printStackTrace();
							return false;
						}
						if (((MD5) md.getDigest()).verify(data2, 0, md2.digest().length)) {
							
							boolean a =!md2.getVerifier().equals("false")? true : false;
							ret = a;
						} else
							return false;
						
						resultA = resultA && ret;
						break;
					}				
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
				break;
			}
			
			
			if (!testCancelled && isTestOK())
				break; // do not let the user wait too long!
			
		
			if (md!= null)
				try {
					Thread.sleep(5000);
				} catch (InterruptedException ignored) {
				}
			
		}
		return ret;
		
	}

	private boolean isTestOK() {
		return (result!= null && result.isOk() && requestCtx.getBody().getBytes().length > 0);
	}
	
	
	private void error(XACMLResult result) {
}
}