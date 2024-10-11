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
	void testCheckDigest1() {
		User user = new User();
		String digest = "{SHA}qUqP5cyxm6YcTAhz05Hph5gvu9M=";
		String identity = "hello";
		assertTrue(user.checkDigest(digest, identity));
	}
	
	/**
	* Test case 2 for {@link User#checkDigest(String, String)}
	*/
	@Test
	void testCheckDigest2() {
		User user = new User();
		String digest = "{SHA}qUqP5cyxm6YcTAhz05Hph5gvu9M=";
		String identity = "hello";
		assertTrue(user.checkDigest(digest, identity));
	}
	
	/**
	* Test case 3 for {@link User#checkDigest(String, String)}
	*/
	@Test
	void testCheckDigest3() {
		User user = new User();
		String digest = "{SHA}qUqP5cyxm6YcTAhz05Hph5gvu9M=";
		String identity = "hello";
		assertTrue(user.checkDigest(digest, identity));
	}
	
	/**
	* Test case 4 for {@link User#checkDigest(String, String)}
	*/
	@Test
	void testCheckDigest4() {
		User user = new User();
		String digest = "{SHA}qUqP5cyxm6YcTAhz05Hph5gvu9M=";
		String identity = "hello";
		assertTrue(user.checkDigest(digest, identity));
	}
	
	/**
	* Test case 5 for {@link User#checkDigest(String, String)}
	*/
	@Test
	void testCheckDigest5() {
		User user = new User();
		String digest = "{SHA}qUqP5cyxm6YcTAhz05Hph5gvu9M=";
		String identity = "hello";
		assertTrue(user.checkDigest(digest, identity));
	}
	
	/**
	* Test case 6 for {@link User#checkDigest(String, String)}
	*/
	@Test
	void testCheckDigest6() {
		User user = new User();
		String digest = "{SHA}qUqP5cyxm6YcTAhz05Hph5gvu9M=";
		String identity = "hello";
		assertTrue(user.checkDigest(digest, identity));
	}
	
	/**
	* Test case 7 for {@link User#checkDigest(String, String)}
	*/
	@Test
	void testCheckDigest7() {
		User user = new User();
		String digest = "{SHA}qUqP5cyxm6YcTAhz05Hph5gvu9M=";
		String identity = "hello";
		assertTrue(user.checkDigest(digest, identity));
	}
	
	/**
	* Test case 8 for {@link User#checkDigest(String, String)}
	*/
	@Test
	void testCheckDigest8() {
		User user = new User();
		String digest = "{SHA}qUqP5cyxm6YcTAhz05Hph5gvu9M=";
		String identity = "hello";
		assertTrue(user.checkDigest(digest, identity));
	}
	
	/**
	* Test case 9 for {@link User#checkDigest(String, String)}
	*/
	@Test
	void testCheckDigest9() {
		User user = new User();
		String digest = "{SHA}qUqP5cyxm6YcTAhz05Hph5gvu9M=";
		String identity = "hello";
		assertTrue(user.checkDigest(digest, identity));
	}
	
	/**
	* Test case 10 for {@link User#checkDigest(String, String)}
	*/
	@Test
	void testCheckDigest10() {
		User user = new User();
		String digest = "{SHA}qUqP5cyxm6YcTAhz05Hph5gvu9M=";
		String identity = "hello";
		assertTrue(user.checkDigest(digest, identity));
	}
}