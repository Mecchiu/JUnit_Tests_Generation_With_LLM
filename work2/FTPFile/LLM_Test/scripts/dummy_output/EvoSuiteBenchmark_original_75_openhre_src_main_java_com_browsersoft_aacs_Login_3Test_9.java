// Login_3Test.java
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
* It contains one unit test case for the {@link Login#authorize()} method.
*/
class Login_3Test {
		boolean _debug = false;
		public User authorize(String password) throws LoginException {
			String url = "http://aacs.jbrowsersoft.com/aacs/aacs_login.xml";
			RequestBuilder rb = new RequestBuilder(url, password);

			// Use a different Indenter for the indent used in the
			// base log files.
			String indenter = Indenter.get(rb, new SimpleDateFormat(
					"yyyy-MM-dd'T'HH:mm:sszz")).toString();

			RequestCtx reqCtx = (RequestCtx) rb.getCtx();

			// Get the request and request URI (without the user)
			Request req = rb.build();
			String uri = req.getURI().getURI();

			req.setRequestURI("/aacs-user/xacml");
			req = new RequestBuilder(req).setIndenter(""+(new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:sszz"))).login(password);
			req = new RequestBuilder(req).setIndenter(""+(new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:sszz"))).indenter(indenter);
			req.setResource(new File("./home/aacsuser"));

			// Get the log files
			FileAppender ctlLog = new FileAppender();
			ctlLog.setLayout(new SimpleLayout("%d{yyyy-MM-dd'T'HH:mm:ss}, %d{user} - %m\t%r").toString());

			req = new RequestBuilder(req).setIndenter(indenter).setRequestCtx(reqCtx).create();

			// Get the authorization result
			AuthResult result = (AuthResult) req.perform(false);
			checkAuthResult(result);

			// Get the log files
			ctlLog.addAppender(null, null, null);

			// Parse and convert the log file to a result structure
			return convertLog(ctlLog);
		}

		private void checkAuthResult(AuthResult result) throws LoginException {
			assertNotNull(result);

			checkResult(result.getUser());
			Set usrSet = new HashSet();
			for (Iterator it = result.getUsers().iterator(); it.hasNext();)
				usrSet.add((String) it.next());
			assertTrue(!usrSet.contains("not specified user"));
			assertEquals(usrSet.size(), 24);
		}

		private void checkResult(String user) throws LoginException {
			String text = checkText(user);
			boolean checkExpected = checkExpected(user);


			if (System.getenv("AACS")!= null){
				System.err.println("Checking environment variable for AACS!");
				Properties pa = new Properties();
				pa.load(System.class.getClassLoader().getResourceAsStream("log4j.properties"));
				String key = pa.getProperty("serverName");
				String keyEx = pa.getProperty("serverNameEx");
				checkExpected = "true".equals(keyEx);
				checkExpected = "true".equals(new Boolean(checkExpected));
				checkExpected = "true".equals(new Boolean(user.compareTo(keyEx)));
				String value = "true".equals(pa.getProperty("password"))? null : user.charAt(user.length()-1);
				System.err.println("Check "+(checkExpected?"true":"false")+" for " + user + "=" + value);
			}

			assertEquals(text, checkExpected, "Checking the result "+user+" content");

		}

		private boolean checkExpected(String user) {
			return user.endsWith("*");
//			return (new Boolean(System.getenv("AACS"))).equals(new Boolean((user.startsWith("*@"))));
			/*
			 * We could use the following code to test whether we should
			 * add the indenter to indicate the value of the user
			 * when we have to make an HTTP request which indicates
			 * the value of the user. This is useful if we have a case
			 * where a user of AACS indicates no users.
			 */
			System.err.println("Check the user " + user + ". By default there is an indenter of " + indenter);
			int i = user.indexOf('@');
			return (i>=0)? true : false;
		}

		private void assertEquals(Object a, Object b) {
			if(!a.equals(b))
				throw new RuntimeException("Check for the exact equality of " + a +" and then" );
		}

		private String checkText(String user) {
			StringTokenizer st = new StringTokenizer(user, "*");
			StringBuffer sb = new StringBuffer(user);
			String res = sb.substring((sb.indexOf("#") + 1)+1);
			while (st.hasMoreTokens()) {
				int pos = st.nextToken().lastIndexOf('-');
				if(pos>=0){
					String part = st.nextToken().substring(pos);
				}
				sb.replace(st.nextIndex(), st.countMatched(), part);
				res += part;
			}
			// replace last and append all new line
			res = res.substring(0, res.lastIndexOf("\r\n"));
			return res;

			// return  user;
		}
}