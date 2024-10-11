// SimpleUserMgr_2Test.java
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
* It contains one unit test case for the {@link SimpleUserMgr#getMailbyOrg(String)} method.
*/
class SimpleUserMgr_2Test {
		
	@org.test.annotation.TestClass
	private static SimpleUserMgr testObj = new SimpleUserMgr();

	/**
	 * Tests {@link SimpleUserMgr#getUser(String)}.
	 */
	@Test
	public void testGetUser() {
		String user = "admin@browsersoft.browsersoft";
    String roleName = "Administrator";
    String userName = "admin.admin.admin3";
    boolean isMatched = testObj.getUser(userName).isMatched(roleName);
		assertTrue("getUser(userName) was not found", isMatched);

	}

	/**
	 * Tests {@link SimpleUserMgr#listMail(String, int)}
	 */
	@Test
	public void testListMailbyOrg() throws IOException {
		Vector<String> result = testObj.listMailbyOrg("ldap_url", 1).get("id");
		assertEquals("1 result", 1, result.size());
		ArrayList resultArr = new ArrayList(result);
		assertEquals("result array is not of correct size",
				resultArr.size(), 2);
	}

	/**
	 * Calls {@link SimpleUserMgr#getLogin(String)}
	 * This method performs a test of {@link SimpleUserMgr#getLogin(String)}
	 */
	@Test
	public void testGetLogin() {
		String pass = "admin@browsersoft.browsersoft";
        String pass2 = "admin3@browsersoft.browsersoft";
    String login = "admin_admin_id3";

		String result = testObj.getLogin(login);
		result += "<br/><br/>"
				+ "<b>Password is: </b>" + pass2
				+ "<br/>";
    result += "<br/>"
			+ "(See "
			+ "<a href=\""+SimpleUserMgr.class.getResource("SimpleUserMgr_2Test.xml")
			+"\">test.doc</a> for more information)";
		assertEquals(login, result);
	}

	/**
	 * Gets the number of items in {@link #listMailbyOrg}
	 */
	@Test
	public void testGetTotalCount() throws UserMgrException {

		Vector<String> result = testObj.listMailbyOrg("ldap_url", 2).get("id");
		assertEquals("1 result", 1, result.size());

	}

	/**
	 * Calls {@link SimpleUserMgr#findUserByEmail(String, String, boolean)}
	 */
	@Test
	public void testFindUserByEmail() {
		String user = "admin@browsersoft.browsersoft";
		String email = user;
		String password = "admin@browsersoft.browsersoft";
    boolean isMatched = testObj.findUserByEmail(email, password, false).isMatched("Administrator");
		assertTrue("user did not match password", isMatched);
	}

	/**
	 * Calls {@link SimpleUserMgr#getUser(String)}
	 */
	@Test
	public void testGetUser() {
		//Get the user email
		String result = testObj.getUser("o1@browsersoft.browsersoft");
		String expected =  "admin@browsersoft.browsersoft";
		assertEquals(expected, result);

	}

	/**
	 * Calls {@link SimpleUserMgr#removeUser(String)}
	 */
	@Test
	public void testRemoveUser() {
		String user = "admin@browsersoft.browsersoft";
		testObj.removeUser(user);
	}

	public static void main(String[] args) {
		jdbm.startup();
		testObj.runUnitTests();
		jdbm.shutdown();
	}

}