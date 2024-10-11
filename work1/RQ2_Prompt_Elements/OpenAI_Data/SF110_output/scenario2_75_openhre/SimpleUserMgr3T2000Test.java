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
	* It tests the case when the hashtable is empty.
	*/
	@Test
	void testExport_empty() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		String result = userMgr.export();
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the hashtable contains one user.
	*/
	@Test
	void testExport_one() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.id.put("user1", "user1");
		String result = userMgr.export();
		assertEquals("user1\n", result);
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the hashtable contains two users.
	*/
	@Test
	void testExport_two() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.id.put("user1", "user1");
		userMgr.id.put("user2", "user2");
		String result = userMgr.export();
		assertEquals("user1\nuser2\n", result);
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the hashtable contains three users.
	*/
	@Test
	void testExport_three() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.id.put("user1", "user1");
		userMgr.id.put("user2", "user2");
		userMgr.id.put("user3", "user3");
		String result = userMgr.export();
		assertEquals("user1\nuser2\nuser3\n", result);
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the hashtable contains four users.
	*/
	@Test
	void testExport_four() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.id.put("user1", "user1");
		userMgr.id.put("user2", "user2");
		userMgr.id.put("user3", "user3");
		userMgr.id.put("user4", "user4");
		String result = userMgr.export();
		assertEquals("user1\nuser2\nuser3\nuser4\n", result);
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the hashtable contains five users.
	*/
	@Test
	void testExport_five() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.id.put("user1", "user1");
		userMgr.id.put("user2", "user2");
		userMgr.id.put("user3", "user3");
		userMgr.id.put("user4", "user4");
		userMgr.id.put("user5", "user5");
		String result = userMgr.export();
		assertEquals("user1\nuser2\nuser3\nuser4\nuser5\n", result);
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the hashtable contains six users.
	*/
	@Test
	void testExport_six() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.id.put("user1", "user1");
		userMgr.id.put("user2", "user2");
		userMgr.id.put("user3", "user3");
		userMgr.id.put("user4", "user4");
		userMgr.id.put("user5", "user5");
		userMgr.id.put("user6", "user6");
		String result = userMgr.export();
		assertEquals("user1\nuser2\nuser3\nuser4\nuser5\nuser6\n", result);
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the hashtable contains seven users.
	*/
	@Test
	void testExport_seven() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.id.put("user1", "user1");
		userMgr.id.put("user2", "user2");
		userMgr.id.put("user3", "user3");
		userMgr.id.put("user4", "user4");
		userMgr.id.put("user5", "user5");
		userMgr.id.put("user6", "user6");
		userMgr.id.put("user7", "user7");
		String result = userMgr.export();
		assertEquals("user1\nuser2\nuser3\nuser4\nuser5\nuser6\nuser7\n", result);
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the hashtable contains eight users.
	*/
	@Test
	void testExport_eight() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.id.put("user1", "user1");
		userMgr.id.put("user2", "user2");
		userMgr.id.put("user3", "user3");
		userMgr.id.put("user4", "user4");
		userMgr.id.put("user5", "user5");
		userMgr.id.put("user6", "user6");
		userMgr.id.put("user7", "user7");
		userMgr.id.put("user8", "user8");
		String result = userMgr.export();
		assertEquals("user1\nuser2\nuser3\nuser4\nuser5\nuser6\nuser7\nuser8\n", result);
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the hashtable contains nine users.
	*/
	@Test
	void testExport_nine() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.id.put("user1", "user1");
		userMgr.id.put("user2", "user2");
		userMgr.id.put("user3", "user3");
		userMgr.id.put("user4", "user4");
		userMgr.id.put("user5", "user5");
		userMgr.id.put("user6", "user6");
		userMgr.id.put("user7", "user7");
		userMgr.id.put("user8", "user8");
		userMgr.id.put("user9", "user9");
		String result = userMgr.export();
		assertEquals("user1\nuser2\nuser3\nuser4\nuser5\nuser6\nuser7\nuser8\nuser9\n", result);
	}
	
	/**
	* Test case for {@link SimpleUserMgr#export()} method.
	* It tests the case when the hashtable contains ten users.
	*/
