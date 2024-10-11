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
		* Test case 1 for {@link Login#authorize()}.
		* It tests the case when the user is not allowed to login currently.
		*/
		@Test
		void testAuthorize1() {
				Login login = new Login();
				login.setUserId("user1");
				login.setPassword("password");
				login.setIpAddr("192.168.1.1");
				User user = new User();
				user.setPassvalidstart("20200101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.10");
				Set<String> groups = new HashSet<String>();
				groups.add("group1");
				groups.add("group2");
				user.setGroups(groups);
				UserMgr userMgr = new UserMgr();
				userMgr.setUser(user);
				login.setUserMgr(userMgr);
				Properties props = new Properties();
				props.setProperty("AuthType", "krb5");
				props.setProperty("IPfiltering", "yes");
				login.setProps(props);
				try {
						login.authorize();
				} catch (LoginException e) {
						assertEquals("Not allowed to login currently.", e.getMessage());
				}
		}
		
		/**
		* Test case 2 for {@link Login#authorize()}.
		* It tests the case when the user is not authorized from the current IP address.
		*/
		@Test
		void testAuthorize2() {
				Login login = new Login();
				login.setUserId("user1");
				login.setPassword("password");
				login.setIpAddr("192.168.1.1");
				User user = new User();
				user.setPassvalidstart("20200101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.11-192.168.1.20");
				Set<String> groups = new HashSet<String>();
				groups.add("group1");
				groups.add("group2");
				user.setGroups(groups);
				UserMgr userMgr = new UserMgr();
				userMgr.setUser(user);
				login.setUserMgr(userMgr);
				Properties props = new Properties();
				props.setProperty("AuthType", "krb5");
				props.setProperty("IPfiltering", "yes");
				login.setProps(props);
				try {
						login.authorize();
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 3 for {@link Login#authorize()}.
		* It tests the case when the user is authorized from the current IP address.
		*/
		@Test
		void testAuthorize3() {
				Login login = new Login();
				login.setUserId("user1");
				login.setPassword("password");
				login.setIpAddr("192.168.1.1");
				User user = new User();
				user.setPassvalidstart("20200101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.10");
				Set<String> groups = new HashSet<String>();
				groups.add("group1");
				groups.add("group2");
				user.setGroups(groups);
				UserMgr userMgr = new UserMgr();
				userMgr.setUser(user);
				login.setUserMgr(userMgr);
				Properties props = new Properties();
				props.setProperty("AuthType", "krb5");
				props.setProperty("IPfiltering", "yes");
				login.setProps(props);
				try {
						login.authorize();
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 4 for {@link Login#authorize()}.
		* It tests the case when the user is authorized from the current IP address.
		*/
		@Test
		void testAuthorize4() {
				Login login = new Login();
				login.setUserId("user1");
				login.setPassword("password");
				login.setIpAddr("192.168.1.1");
				User user = new User();
				user.setPassvalidstart("20200101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.10");
				Set<String> groups = new HashSet<String>();
				groups.add("group1");
				groups.add("group2");
				user.setGroups(groups);
				UserMgr userMgr = new UserMgr();
				userMgr.setUser(user);
				login.setUserMgr(userMgr);
				Properties props = new Properties();
				props.setProperty("AuthType", "krb5");
				props.setProperty("IPfiltering", "yes");
				login.setProps(props);
				try {
						login.authorize();
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 5 for {@link Login#authorize()}.
		* It tests the case when the user is authorized from the current IP address.
		*/
		@Test
		void testAuthorize5() {
				Login login = new Login();
				login.setUserId("user1");
				login.setPassword("password");
				login.setIpAddr("192.168.1.1");
				User user = new User();
				user.setPassvalidstart("20200101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.10");
				Set<String> groups = new HashSet<String>();
				groups.add("group1");
				groups.add("group2");
				user.setGroups(groups);
				UserMgr userMgr = new UserMgr();
				userMgr.setUser(user);
				login.setUserMgr(userMgr);
				Properties props = new Properties();
				props.setProperty("AuthType", "krb5");
				props.setProperty("IPfiltering", "yes");
				login.setProps(props);
				try {
						login.authorize();
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 6 for {@link Login#authorize()}.
		* It tests the case when the user is authorized from the current IP address.
		*/
		@Test
		void testAuthorize6() {
				Login login = new Login();
				login.setUserId("user1");
				login.setPassword("password");
				login.setIpAddr("192.168.1.1");
				User user = new User();
				user.setPassvalidstart("20200101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.10");
				Set<String> groups = new HashSet<String>();
				groups.add("group1");
				groups.add("group2");
				user.setGroups(groups);
				UserMgr userMgr = new UserMgr();
				userMgr.setUser(user);
				login.setUserMgr(userMgr);
				Properties props = new Properties();
				props.setProperty("AuthType", "krb5");
				props.setProperty("IPfiltering", "yes");
				login.setProps(props);
				try {
						login.authorize();
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 7 for {@link Login#authorize()}.
		* It tests the case when the user is authorized from the current IP address.
		*/
		@Test
		void testAuthorize7() {
				Login login = new Login();
				login.setUserId("user1");
				login.setPassword("password");
				login.setIpAddr("192.168.1.1");
				User user = new User();
				user.setPassvalidstart("20200101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.10");
				Set<String> groups = new HashSet<String>();
				groups.add("group1");
				groups.add("group2");
				user.setGroups(groups);
				UserMgr userMgr = new UserMgr();
				userMgr.setUser(user);
				login.setUserMgr(userMgr);
				Properties props = new Properties();
				props.setProperty("AuthType", "krb5");
				props.setProperty("IPfiltering", "yes");
				login.setProps(props);
				try {
						login.authorize();
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 8 for {@link Login#authorize()}.
		* It tests the case when the user is authorized from the current IP address.
		*/
		@Test
		void testAuthorize8() {
				Login login = new Login();
				login.setUserId("user1");
				login.setPassword("password");
				login.setIpAddr("192.168.1.1");
				User user = new User();
				user.setPassvalidstart("20200101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.10");
				Set<String> groups = new HashSet<String>();
				groups.add("group1");
				groups.add("group2");
				user.setGroups(groups);
				UserMgr userMgr = new UserMgr();
				userMgr.setUser(user);
				login.setUserMgr(userMgr);
				Properties props = new Properties();
				props.setProperty("AuthType", "krb5");
				props.setProperty("IPfiltering", "yes");
				login.setProps(props);
				try {
						login.authorize();
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 9 for {@link Login#authorize()}.
		* It tests the case when the user is authorized from the current IP address.
		*/
		@Test
		void testAuthorize9() {
				Login login = new Login();
				login.setUserId("user1");
				login.setPassword("password");
				login.setIpAddr("192.168.1.1");
				User user = new User();
				user.setPassvalidstart("20200101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.10");
				Set<String> groups = new HashSet<String>();
				groups.add("group1");
				groups.add("group2");
				user.setGroups(groups);
				UserMgr userMgr = new UserMgr();
				userMgr.setUser(user);
				login.setUserMgr(userMgr);
				Properties props = new Properties();
				props.setProperty("AuthType", "krb5");
				props.setProperty("IPfiltering", "yes");
				login.setProps(props);
				try {
						login.authorize();
				} catch (LoginException e) {
						assertEquals("Not authorized from the current IP address.", e.getMessage());
				}
		}
		
		/**
		* Test case 10 for {@link Login#authorize()}.
		* It tests the case when the user is authorized from the current IP address.
		*/
		@Test
		void testAuthorize10() {
				Login login = new Login();
				login.setUserId("user1");
				login.setPassword("password");
				login.setIpAddr("192.168.1.1");
				User user = new User();
				user.setPassvalidstart("20200101");
				user.setPassrenewal("-1");
				user.setAllowedips("192.168.1.1-192.168.1.10");
				Set<String> groups = new HashSet<String