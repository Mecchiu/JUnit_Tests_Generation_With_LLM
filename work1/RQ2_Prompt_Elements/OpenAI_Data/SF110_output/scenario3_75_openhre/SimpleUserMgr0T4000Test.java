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
* It contains ten unit test cases for the {@link SimpleUserMgr#getUser(String, String, String)} method.
*/
class SimpleUserMgrTest {

	/**
	* Test case 1 for {@link SimpleUserMgr#getUser(String, String, String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetUser1() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		User user = simpleUserMgr.getUser("username", "org", "email");
		assertEquals(user.getUsername(), "username");
		assertEquals(user.getOrg(), "org");
		assertEquals(user.getEmail(), "email");
	}
	
	/**
	* Test case 2 for {@link SimpleUserMgr#getUser(String, String, String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetUser2() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		User user = simpleUserMgr.getUser("username", "org", "email");
		assertEquals(user.getUsername(), "username");
		assertEquals(user.getOrg(), "org");
		assertEquals(user.getEmail(), "email");
	}
	
	/**
	* Test case 3 for {@link SimpleUserMgr#getUser(String, String, String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetUser3() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		User user = simpleUserMgr.getUser("username", "org", "email");
		assertEquals(user.getUsername(), "username");
		assertEquals(user.getOrg(), "org");
		assertEquals(user.getEmail(), "email");
	}
	
	/**
	* Test case 4 for {@link SimpleUserMgr#getUser(String, String, String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetUser4() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		User user = simpleUserMgr.getUser("username", "org", "email");
		assertEquals(user.getUsername(), "username");
		assertEquals(user.getOrg(), "org");
		assertEquals(user.getEmail(), "email");
	}
	
	/**
	* Test case 5 for {@link SimpleUserMgr#getUser(String, String, String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetUser5() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		User user = simpleUserMgr.getUser("username", "org", "email");
		assertEquals(user.getUsername(), "username");
		assertEquals(user.getOrg(), "org");
		assertEquals(user.getEmail(), "email");
	}
	
	/**
	* Test case 6 for {@link SimpleUserMgr#getUser(String, String, String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetUser6() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		User user = simpleUserMgr.getUser("username", "org", "email");
		assertEquals(user.getUsername(), "username");
		assertEquals(user.getOrg(), "org");
		assertEquals(user.getEmail(), "email");
	}
	
	/**
	* Test case 7 for {@link SimpleUserMgr#getUser(String, String, String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetUser7() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		User user = simpleUserMgr.getUser("username", "org", "email");
		assertEquals(user.getUsername(), "username");
		assertEquals(user.getOrg(), "org");
		assertEquals(user.getEmail(), "email");
	}
	
	/**
	* Test case 8 for {@link SimpleUserMgr#getUser(String, String, String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetUser8() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		User user = simpleUserMgr.getUser("username", "org", "email");
		assertEquals(user.getUsername(), "username");
		assertEquals(user.getOrg(), "org");
		assertEquals(user.getEmail(), "email");
	}
	
	/**
	* Test case 9 for {@link SimpleUserMgr#getUser(String, String, String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetUser9() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		User user = simpleUserMgr.getUser("username", "org", "email");
		assertEquals(user.getUsername(), "username");
		assertEquals(user.getOrg(), "org");
		assertEquals(user.getEmail(), "email");
	}
	
	/**
	* Test case 10 for {@link SimpleUserMgr#getUser(String, String, String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetUser10() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		User user = simpleUserMgr.getUser("username", "org", "email");
		assertEquals(user.getUsername(), "username");
		assertEquals(user.getOrg(), "org");
		assertEquals(user.getEmail(), "email");
	}
}

// User.java
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

public class User {

    /**
     * get username
     *
     * @return username
     */
    public String getUsername();

    /**
     * get org
     *
     * @return org
     */
    public String getOrg();

    /**
     * get email
     *
     * @return email
     */
    public String getEmail();
}

// UserMgr.java
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

public interface UserMgr {

    /**
     * get User with username, org and email
     *
     * @param username cn variable
     * @param org o variable
     * @param email email variable
     * @return User
     */
    public User getUser(String username, String org, String email);
}