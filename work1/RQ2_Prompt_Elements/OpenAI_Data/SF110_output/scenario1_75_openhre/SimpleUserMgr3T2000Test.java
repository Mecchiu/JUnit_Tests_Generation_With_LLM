// SimpleUserMgrTest.java
package com.browsersoft.aacs;

import jdbm.JDBMEnumeration;
import jdbm.JDBMHashtable;
import jdbm.JDBMRecordManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleUserMgr}.
* It contains ten unit test cases for the {@link SimpleUserMgr#export()} method.
*/
class SimpleUserMgrTest {

	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the user manager is empty.
	*/
	@Test
	void testExportEmpty() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		assertEquals("", userMgr.export());
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the user manager contains one user.
	*/
	@Test
	void testExportOneUser() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("user1", "password1");
		assertEquals("user1:password1\n", userMgr.export());
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the user manager contains two users.
	*/
	@Test
	void testExportTwoUsers() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("user1", "password1");
		userMgr.addUser("user2", "password2");
		assertEquals("user1:password1\nuser2:password2\n", userMgr.export());
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the user manager contains three users.
	*/
	@Test
	void testExportThreeUsers() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("user1", "password1");
		userMgr.addUser("user2", "password2");
		userMgr.addUser("user3", "password3");
		assertEquals("user1:password1\nuser2:password2\nuser3:password3\n", userMgr.export());
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the user manager contains four users.
	*/
	@Test
	void testExportFourUsers() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("user1", "password1");
		userMgr.addUser("user2", "password2");
		userMgr.addUser("user3", "password3");
		userMgr.addUser("user4", "password4");
		assertEquals("user1:password1\nuser2:password2\nuser3:password3\nuser4:password4\n", userMgr.export());
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the user manager contains five users.
	*/
	@Test
	void testExportFiveUsers() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("user1", "password1");
		userMgr.addUser("user2", "password2");
		userMgr.addUser("user3", "password3");
		userMgr.addUser("user4", "password4");
		userMgr.addUser("user5", "password5");
		assertEquals("user1:password1\nuser2:password2\nuser3:password3\nuser4:password4\nuser5:password5\n", userMgr.export());
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the user manager contains six users.
	*/
	@Test
	void testExportSixUsers() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("user1", "password1");
		userMgr.addUser("user2", "password2");
		userMgr.addUser("user3", "password3");
		userMgr.addUser("user4", "password4");
		userMgr.addUser("user5", "password5");
		userMgr.addUser("user6", "password6");
		assertEquals("user1:password1\nuser2:password2\nuser3:password3\nuser4:password4\nuser5:password5\nuser6:password6\n", userMgr.export());
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the user manager contains seven users.
	*/
	@Test
	void testExportSevenUsers() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("user1", "password1");
		userMgr.addUser("user2", "password2");
		userMgr.addUser("user3", "password3");
		userMgr.addUser("user4", "password4");
		userMgr.addUser("user5", "password5");
		userMgr.addUser("user6", "password6");
		userMgr.addUser("user7", "password7");
		assertEquals("user1:password1\nuser2:password2\nuser3:password3\nuser4:password4\nuser5:password5\nuser6:password6\nuser7:password7\n", userMgr.export());
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the user manager contains eight users.
	*/
	@Test
	void testExportEightUsers() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("user1", "password1");
		userMgr.addUser("user2", "password2");
		userMgr.addUser("user3", "password3");
		userMgr.addUser("user4", "password4");
		userMgr.addUser("user5", "password5");
		userMgr.addUser("user6", "password6");
		userMgr.addUser("user7", "password7");
		userMgr.addUser("user8", "password8");
		assertEquals("user1:password1\nuser2:password2\nuser3:password3\nuser4:password4\nuser5:password5\nuser6:password6\nuser7:password7\nuser8:password8\n", userMgr.export());
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the user manager contains nine users.
	*/
	@Test
	void testExportNineUsers() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("user1", "password1");
		userMgr.addUser("user2", "password2");
		userMgr.addUser("user3", "password3");
		userMgr.addUser("user4", "password4");
		userMgr.addUser("user5", "password5");
		userMgr.addUser("user6", "password6");
		userMgr.addUser("user7", "password7");
		userMgr.addUser("user8", "password8");
		userMgr.addUser("user9", "password9");
		assertEquals("user1:password1\nuser2:password2\nuser3:password3\nuser4:password4\nuser5:password5\nuser6:password6\nuser7:password7\nuser8:password8\nuser9:password9\n", userMgr.export());
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the user