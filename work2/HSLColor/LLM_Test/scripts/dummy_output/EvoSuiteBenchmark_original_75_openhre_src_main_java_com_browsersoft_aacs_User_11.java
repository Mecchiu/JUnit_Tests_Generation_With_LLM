// UserTest.java
package com.browsersoft.aacs;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import javax.naming.ldap.LdapContext;
import org.apache.xerces.impl.dv.util.Base64;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link User}.
* It contains one unit test case for the {@link User#checkDigest(String, String)} method.
*/
class UserTest {
		
    private static Properties DEST = new Properties();
    private static Object userLog = new System(UserTest.class).getSystem("userLog");
    private static Object user = new System(UserTest.class).getSystem("user");
    static {
        DEST.put("mail", "user2@browsersoft.com");
        DEST.put("pwd", "foo2");
    }

    @Test
	public void testPassword() {

		// Create a user
		user.create();

        // Test with user log
        userLog.add("userLog");
        System.out.println("Adding user with log attribute: " + user.getId());
		assertTrue(user.checkDigest("pwd", DEST.getProperty("pwd")));

		// Test without user log
		System.out.println("Removing user from log attribute");
		userLog.remove();
		assertFalse(user.checkDigest("pwd", DEST.getProperty("pwd")));

        // Test with user
		user.load();
        System.out.println("Adding user with log attribute: " + user.getId());
		assertTrue(user.checkDigest("pwd", DEST.getProperty("pwd")));

		// Test without user
		System.out.println("Removing user from log attribute");
		userLog.remove();
		assertFalse(user.checkDigest("pwd", DEST.getProperty("pwd")));

        // Test Password Check is disabled
		assertFalse(user.checkDigest("pwd", DEST.getProperty("pwd")));

    }

    /**
     * Check digest for check user with same username
     * Test for password
     */
	@Test
    public void testPassword1() {

        // Create a user
        user.create();

        // Test with wrong value of username
        Properties wrongId = new Properties();
        wrongId.put("log", "wrongValue");
        assertFalse(user.checkDigest("log", wrongId));

        // Test with wrong value of password
        Properties wrongPwd = new Properties();
        wrongPwd.put("pwd", "wrongValue");
        assertFalse(user.checkDigest("pwd", wrongPwd));

    }

}