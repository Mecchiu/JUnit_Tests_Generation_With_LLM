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
	* Test case 1 for {@link SimpleUserMgr#export()}.
	* It tests the method with a null hashtable.
	*/
	@Test
	public void testExport1() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.setHashtable(null);
		assertEquals("", userMgr.export());
	}
	
	/**
	* Test case 2 for {@link SimpleUserMgr#export()}.
	* It tests the method with an empty hashtable.
	*/
	@Test
	public void testExport2() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		JDBMHashtable hashtable = new JDBMHashtable();
		userMgr.setHashtable(hashtable);
		assertEquals("", userMgr.export());
	}
	
	/**
	* Test case 3 for {@link SimpleUserMgr#export()}.
	* It tests the method with a hashtable containing one user.
	*/
	@Test
	public void testExport3() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		JDBMHashtable hashtable = new JDBMHashtable();
		hashtable.put("user1", "password1");
		userMgr.setHashtable(hashtable);
		assertEquals("user1:password1\n", userMgr.export());
	}
	
	/**
	* Test case 4 for {@link SimpleUserMgr#export()}.
	* It tests the method with a hashtable containing two users.
	*/
	@Test
	public void testExport4() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		JDBMHashtable hashtable = new JDBMHashtable();
		hashtable.put("user1", "password1");
		hashtable.put("user2", "password2");
		userMgr.setHashtable(hashtable);
		assertEquals("user1:password1\nuser2:password2\n", userMgr.export());
	}
	
	/**
	* Test case 5 for {@link SimpleUserMgr#export()}.
	* It tests the method with a hashtable containing three users.
	*/
	@Test
	public void testExport5() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		JDBMHashtable hashtable = new JDBMHashtable();
		hashtable.put("user1", "password1");
		hashtable.put("user2", "password2");
		hashtable.put("user3", "password3");
		userMgr.setHashtable(hashtable);
		assertEquals("user1:password1\nuser2:password2\nuser3:password3\n", userMgr.export());
	}
	
	/**
	* Test case 6 for {@link SimpleUserMgr#export()}.
	* It tests the method with a hashtable containing four users.
	*/
	@Test
	public void testExport6() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		JDBMHashtable hashtable = new JDBMHashtable();
		hashtable.put("user1", "password1");
		hashtable.put("user2", "password2");
		hashtable.put("user3", "password3");
		hashtable.put("user4", "password4");
		userMgr.setHashtable(hashtable);
		assertEquals("user1:password1\nuser2:password2\nuser3:password3\nuser4:password4\n", userMgr.export());
	}
	
	/**
	* Test case 7 for {@link SimpleUserMgr#export()}.
	* It tests the method with a hashtable containing five users.
	*/
	@Test
	public void testExport7() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		JDBMHashtable hashtable = new JDBMHashtable();
		hashtable.put("user1", "password1");
		hashtable.put("user2", "password2");
		hashtable.put("user3", "password3");
		hashtable.put("user4", "password4");
		hashtable.put("user5", "password5");
		userMgr.setHashtable(hashtable);
		assertEquals("user1:password1\nuser2:password2\nuser3:password3\nuser4:password4\nuser5:password5\n", userMgr.export());
	}
	
	/**
	* Test case 8 for {@link SimpleUserMgr#export()}.
	* It tests the method with a hashtable containing six users.
	*/
	@Test
	public void testExport8() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		JDBMHashtable hashtable = new JDBMHashtable();
		hashtable.put("user1", "password1");
		hashtable.put("user2", "password2");
		hashtable.put("user3", "password3");
		hashtable.put("user4", "password4");
		hashtable.put("user5", "password5");
		hashtable.put("user6", "password6");
		userMgr.setHashtable(hashtable);
		assertEquals("user1:password1\nuser2:password2\nuser3:password3\nuser4:password4\nuser5:password5\nuser6:password6\n", userMgr.export());
	}
	
	/**
	* Test case 9 for {@link SimpleUserMgr#export()}.
	* It tests the method with a hashtable containing seven users.
	*/
	@Test
	public void testExport9() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		JDBMHashtable hashtable = new JDBMHashtable();
		hashtable.put("user1", "password1");
		hashtable.put("user2", "password2");
		hashtable.put("user3", "password3");
		hashtable.put("user4", "password4");
		hashtable.put("user5", "password5");
		hashtable.put("user6", "password6");
		hashtable.put("user7", "password7");
		userMgr.setHashtable(hashtable);
		assertEquals("user1:password1\nuser2:password2\nuser3:password3\nuser4:password4\nuser5:password5\nuser6:password6\nuser7:password7\n", userMgr.export());
	}
	
	/**
	* Test case 10 for {@link SimpleUserMgr#export()}.
	* It tests the method with a hashtable containing eight users.
	*/
	@Test
	public void testExport10() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		JDBMHashtable hashtable = new JDBMHashtable();
		hashtable.put("user1", "password1");
		hashtable.put("user2", "password2");
		hashtable.put("user3", "password3");
		hashtable.put("user4", "password4");
		hashtable.put("user5", "password5");
		hashtable.put("user6", "password6");
		hashtable.put("user7", "password7");
		hashtable.put("user8", "password8");
		userMgr.setHashtable(hashtable);
		assertEquals("user1:password1\nuser2:password2\nuser3:password3\nuser4:password4\nuser5:password5\nuser6:password6\nuser7:password7\nuser8:password8\n", userMgr.export());
	}
}