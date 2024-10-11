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
* It contains ten unit test cases for the {@link User#checkDigest(String, String)} method.
*/
class UserTest {

	/**
	* Test case 1 for {@link User#checkDigest(String, String)}
	*/
	@Test
	public void testCheckDigest1() {
		User user = new User();
		String digest = "";
		String identity = "";
		boolean result = user.checkDigest(digest, identity);
		assertTrue(result);
	}
	
	/**
	* Test case 2 for {@link User#checkDigest(String, String)}
	*/
	@Test
	public void testCheckDigest2() {
		User user = new User();
		String digest = "";
		String identity = "";
		boolean result = user.checkDigest(digest, identity);
		assertTrue(result);
	}
	
	/**
	* Test case 3 for {@link User#checkDigest(String, String)}
	*/
	@Test
	public void testCheckDigest3() {
		User user = new User();
		String digest = "";
		String identity = "";
		boolean result = user.checkDigest(digest, identity);
		assertTrue(result);
	}
	
	/**
	* Test case 4 for {@link User#checkDigest(String, String)}
	*/
	@Test
	public void testCheckDigest4() {
		User user = new User();
		String digest = "";
		String identity = "";
		boolean result = user.checkDigest(digest, identity);
		assertTrue(result);
	}
	
	/**
	* Test case 5 for {@link User#checkDigest(String, String)}
	*/
	@Test
	public void testCheckDigest5() {
		User user = new User();
		String digest = "";
		String identity = "";
		boolean result = user.checkDigest(digest, identity);
		assertTrue(result);
	}
	
	/**
	* Test case 6 for {@link User#checkDigest(String, String)}
	*/
	@Test
	public void testCheckDigest6() {
		User user = new User();
		String digest = "";
		String identity = "";
		boolean result = user.checkDigest(digest, identity);
		assertTrue(result);
	}
	
	/**
	* Test case 7 for {@link User#checkDigest(String, String)}
	*/
	@Test
	public void testCheckDigest7() {
		User user = new User();
		String digest = "";
		String identity = "";
		boolean result = user.checkDigest(digest, identity);
		assertTrue(result);
	}
	
	/**
	* Test case 8 for {@link User#checkDigest(String, String)}
	*/
	@Test
	public void testCheckDigest8() {
		User user = new User();
		String digest = "";
		String identity = "";
		boolean result = user.checkDigest(digest, identity);
		assertTrue(result);
	}
	
	/**
	* Test case 9 for {@link User#checkDigest(String, String)}
	*/
	@Test
	public void testCheckDigest9() {
		User user = new User();
		String digest = "";
		String identity = "";
		boolean result = user.checkDigest(digest, identity);
		assertTrue(result);
	}
	
	/**
	* Test case 10 for {@link User#checkDigest(String, String)}
	*/
	@Test
	public void testCheckDigest10() {
		User user = new User();
		String digest = "";
		String identity = "";
		boolean result = user.checkDigest(digest, identity);
		assertTrue(result);
	}
}