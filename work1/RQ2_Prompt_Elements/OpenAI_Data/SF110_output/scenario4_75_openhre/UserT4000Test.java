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
	* Test case for {@link User#checkDigest(String, String)} method.
	* It tests the case when the digest is null.
	*/
	@Test
	void testCheckDigest_NullDigest() {
		User user = new User();
		String identity = "test";
		boolean result = user.checkDigest(null, identity);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link User#checkDigest(String, String)} method.
	* It tests the case when the identity is null.
	*/
	@Test
	void testCheckDigest_NullIdentity() {
		User user = new User();
		String digest = "test";
		boolean result = user.checkDigest(digest, null);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link User#checkDigest(String, String)} method.
	* It tests the case when the digest and identity are null.
	*/
	@Test
	void testCheckDigest_NullDigestAndIdentity() {
		User user = new User();
		boolean result = user.checkDigest(null, null);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link User#checkDigest(String, String)} method.
	* It tests the case when the digest and identity are empty.
	*/
	@Test
	void testCheckDigest_EmptyDigestAndIdentity() {
		User user = new User();
		String digest = "";
		String identity = "";
		boolean result = user.checkDigest(digest, identity);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link User#checkDigest(String, String)} method.
	* It tests the case when the digest is empty.
	*/
	@Test
	void testCheckDigest_EmptyDigest() {
		User user = new User();
		String digest = "";
		String identity = "test";
		boolean result = user.checkDigest(digest, identity);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link User#checkDigest(String, String)} method.
	* It tests the case when the identity is empty.
	*/
	@Test
	void testCheckDigest_EmptyIdentity() {
		User user = new User();
		String digest = "test";
		String identity = "";
		boolean result = user.checkDigest(digest, identity);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link User#checkDigest(String, String)} method.
	* It tests the case when the digest and identity are not equal.
	*/
	@Test
	void testCheckDigest_NotEqualDigestAndIdentity() {
		User user = new User();
		String digest = "test";
		String identity = "test1";
		boolean result = user.checkDigest(digest, identity);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link User#checkDigest(String, String)} method.
	* It tests the case when the digest and identity are equal.
	*/
	@Test
	void testCheckDigest_EqualDigestAndIdentity() {
		User user = new User();
		String digest = "test";
		String identity = "test";
		boolean result = user.checkDigest(digest, identity);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link User#checkDigest(String, String)} method.
	* It tests the case when the digest and identity are equal.
	*/
	@Test
	void testCheckDigest_EqualDigestAndIdentity1() {
		User user = new User();
		String digest = "test1";
		String identity = "test1";
		boolean result = user.checkDigest(digest, identity);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link User#checkDigest(String, String)} method.
	* It tests the case when the digest and identity are equal.
	*/
	@Test
	void testCheckDigest_EqualDigestAndIdentity2() {
		User user = new User();
		String digest = "test2";
		String identity = "test2";
		boolean result = user.checkDigest(digest, identity);
		assertTrue(result);
	}
}