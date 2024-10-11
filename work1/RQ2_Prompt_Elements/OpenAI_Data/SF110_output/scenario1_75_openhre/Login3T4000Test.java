// LoginTest.java
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
* It contains ten unit test cases for the {@link Login#authorize()} method.
*/
class LoginTest {

		/**
		* Test case 1:
		* Test if the user is authorized to login.
		* The user is authorized to login.
		*/
		@Test
		void testAuthorize1() {
				Login login = new Login();
				User user = new User();
				user.setUserid("user1");
				user.setPassword("password1");
				user.setPassvalidstart("20100101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.255");
				user.setIpAddr("192.168.1.1");
				login.setUser(user);
				try {
						login.authorize();
				} catch (LoginException e) {
						fail("The user is authorized to login.");
				}
		}
		
		/**
		* Test case 2:
		* Test if the user is authorized to login.
		* The user is not authorized to login.
		*/
		@Test
		void testAuthorize2() {
				Login login = new Login();
				User user = new User();
				user.setUserid("user1");
				user.setPassword("password1");
				user.setPassvalidstart("20100101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.255");
				user.setIpAddr("192.168.2.1");
				login.setUser(user);
				try {
						login.authorize();
						fail("The user is not authorized to login.");
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 3:
		* Test if the user is authorized to login.
		* The user is not authorized to login.
		*/
		@Test
		void testAuthorize3() {
				Login login = new Login();
				User user = new User();
				user.setUserid("user1");
				user.setPassword("password1");
				user.setPassvalidstart("20100101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.255");
				user.setIpAddr("192.168.1.0");
				login.setUser(user);
				try {
						login.authorize();
						fail("The user is not authorized to login.");
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 4:
		* Test if the user is authorized to login.
		* The user is not authorized to login.
		*/
		@Test
		void testAuthorize4() {
				Login login = new Login();
				User user = new User();
				user.setUserid("user1");
				user.setPassword("password1");
				user.setPassvalidstart("20100101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.255");
				user.setIpAddr("192.168.1.256");
				login.setUser(user);
				try {
						login.authorize();
						fail("The user is not authorized to login.");
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 5:
		* Test if the user is authorized to login.
		* The user is not authorized to login.
		*/
		@Test
		void testAuthorize5() {
				Login login = new Login();
				User user = new User();
				user.setUserid("user1");
				user.setPassword("password1");
				user.setPassvalidstart("20100101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.255");
				user.setIpAddr("192.168.1.255");
				login.setUser(user);
				try {
						login.authorize();
						fail("The user is not authorized to login.");
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 6:
		* Test if the user is authorized to login.
		* The user is not authorized to login.
		*/
		@Test
		void testAuthorize6() {
				Login login = new Login();
				User user = new User();
				user.setUserid("user1");
				user.setPassword("password1");
				user.setPassvalidstart("20100101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.255");
				user.setIpAddr("192.168.1.256");
				login.setUser(user);
				try {
						login.authorize();
						fail("The user is not authorized to login.");
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 7:
		* Test if the user is authorized to login.
		* The user is not authorized to login.
		*/
		@Test
		void testAuthorize7() {
				Login login = new Login();
				User user = new User();
				user.setUserid("user1");
				user.setPassword("password1");
				user.setPassvalidstart("20100101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.255");
				user.setIpAddr("192.168.1.255");
				login.setUser(user);
				try {
						login.authorize();
						fail("The user is not authorized to login.");
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 8:
		* Test if the user is authorized to login.
		* The user is not authorized to login.
		*/
		@Test
		void testAuthorize8() {
				Login login = new Login();
				User user = new User();
				user.setUserid("user1");
				user.setPassword("password1");
				user.setPassvalidstart("20100101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.255");
				user.setIpAddr("192.168.1.256");
				login.setUser(user);
				try {
						login.authorize();
						fail("The user is not authorized to login.");
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 9:
		* Test if the user is authorized to login.
		* The user is not authorized to login.
		*/
		@Test
		void testAuthorize9() {
				Login login = new Login();
				User user = new User();
				user.setUserid("user1");
				user.setPassword("password1");
				user.setPassvalidstart("20100101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.255");
				user.setIpAddr("192.168.1.255");
				login.setUser(user);
				try {
						login.authorize();
						fail("The user is not authorized to login.");
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 10:
		* Test if the user is authorized to login.
		* The user is not authorized to login.
		*/
		@Test
		void testAuthorize10() {
				Login login = new Login();
				User user = new User();
				user.setUserid("user1");
				user.setPassword("password1");
				user.setPassvalidstart("20100101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.255");
				user.setIpAddr("192.168.1.256");
				login.setUser(user);
				try {
						login.authorize();
						fail("The user is not authorized to login.");
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
}