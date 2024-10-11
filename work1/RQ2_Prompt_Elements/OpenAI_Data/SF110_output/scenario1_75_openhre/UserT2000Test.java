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
	*
	* @throws Exception
	*/
	@Test
	void testCheckDigest1() throws Exception {
		User user = new User();
		String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
		String identity = "foo";
		boolean result = user.checkDigest(digest, identity);
		assertTrue(result);
	}
	
	/**
	* Test case 2 for {@link User#checkDigest(String, String)}
	*
	* @throws Exception
	*/
	@Test
	void testCheckDigest2() throws Exception {
		User user = new User();
		String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
		String identity = "bar";
		boolean result = user.checkDigest(digest, identity);
		assertFalse(result);
	}
	
	/**
	* Test case 3 for {@link User#checkDigest(String, String)}
	*
	* @throws Exception
	*/
	@Test
	void testCheckDigest3() throws Exception {
		User user = new User();
		String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
		String identity = "foobar";
		boolean result = user.checkDigest(digest, identity);
		assertFalse(result);
	}
	
	/**
	* Test case 4 for {@link User#checkDigest(String, String)}
	*
	* @throws Exception
	*/
	@Test
	void testCheckDigest4() throws Exception {
		User user = new User();
		String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
		String identity = "barfoo";
		boolean result = user.checkDigest(digest, identity);
		assertFalse(result);
	}
	
	/**
	* Test case 5 for {@link User#checkDigest(String, String)}
	*
	* @throws Exception
	*/
	@Test
	void testCheckDigest5() throws Exception {
		User user = new User();
		String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
		String identity = "foobarfoo";
		boolean result = user.checkDigest(digest, identity);
		assertFalse(result);
	}
	
	/**
	* Test case 6 for {@link User#checkDigest(String, String)}
	*
	* @throws Exception
	*/
	@Test
	void testCheckDigest6() throws Exception {
		User user = new User();
		String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
		String identity = "barfoobar";
		boolean result = user.checkDigest(digest, identity);
		assertFalse(result);
	}
	
	/**
	* Test case 7 for {@link User#checkDigest(String, String)}
	*
	* @throws Exception
	*/
	@Test
	void testCheckDigest7() throws Exception {
		User user = new User();
		String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
		String identity = "foobarfoobar";
		boolean result = user.checkDigest(digest, identity);
		assertFalse(result);
	}
	
	/**
	* Test case 8 for {@link User#checkDigest(String, String)}
	*
	* @throws Exception
	*/
	@Test
	void testCheckDigest8() throws Exception {
		User user = new User();
		String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
		String identity = "barfoobarfoo";
		boolean result = user.checkDigest(digest, identity);
		assertFalse(result);
	}
	
	/**
	* Test case 9 for {@link User#checkDigest(String, String)}
	*
	* @throws Exception
	*/
	@Test
	void testCheckDigest9() throws Exception {
		User user = new User();
		String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
		String identity = "foobarfoobarfoo";
		boolean result = user.checkDigest(digest, identity);
		assertFalse(result);
	}
	
	/**
	* Test case 10 for {@link User#checkDigest(String, String)}
	*
	* @throws Exception
	*/
	@Test
	void testCheckDigest10() throws Exception {
		User user = new User();
		String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
		String identity = "barfoobarfoobar";
		boolean result = user.checkDigest(digest, identity);
		assertFalse(result);
	}
}