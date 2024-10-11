// User_4Test.java
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
class User_4Test {

		/**
		* Test case 1 for {@link User#checkDigest(String, String)}.
		* The test case checks the method with a valid digest and identity.
		*/
		@Test
		void testCheckDigest_1() {
				String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
				String identity = "hello";
				User user = new User();
				boolean result = user.checkDigest(digest, identity);
				assertTrue(result);
		}
		
		/**
		* Test case 2 for {@link User#checkDigest(String, String)}.
		* The test case checks the method with a valid digest and identity.
		*/
		@Test
		void testCheckDigest_2() {
				String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
				String identity = "hello";
				User user = new User();
				boolean result = user.checkDigest(digest, identity);
				assertTrue(result);
		}
		
		/**
		* Test case 3 for {@link User#checkDigest(String, String)}.
		* The test case checks the method with a valid digest and identity.
		*/
		@Test
		void testCheckDigest_3() {
				String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
				String identity = "hello";
				User user = new User();
				boolean result = user.checkDigest(digest, identity);
				assertTrue(result);
		}
		
		/**
		* Test case 4 for {@link User#checkDigest(String, String)}.
		* The test case checks the method with a valid digest and identity.
		*/
		@Test
		void testCheckDigest_4() {
				String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
				String identity = "hello";
				User user = new User();
				boolean result = user.checkDigest(digest, identity);
				assertTrue(result);
		}
		
		/**
		* Test case 5 for {@link User#checkDigest(String, String)}.
		* The test case checks the method with a valid digest and identity.
		*/
		@Test
		void testCheckDigest_5() {
				String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
				String identity = "hello";
				User user = new User();
				boolean result = user.checkDigest(digest, identity);
				assertTrue(result);
		}
		
		/**
		* Test case 6 for {@link User#checkDigest(String, String)}.
		* The test case checks the method with a valid digest and identity.
		*/
		@Test
		void testCheckDigest_6() {
				String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
				String identity = "hello";
				User user = new User();
				boolean result = user.checkDigest(digest, identity);
				assertTrue(result);
		}
		
		/**
		* Test case 7 for {@link User#checkDigest(String, String)}.
		* The test case checks the method with a valid digest and identity.
		*/
		@Test
		void testCheckDigest_7() {
				String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
				String identity = "hello";
				User user = new User();
				boolean result = user.checkDigest(digest, identity);
				assertTrue(result);
		}
		
		/**
		* Test case 8 for {@link User#checkDigest(String, String)}.
		* The test case checks the method with a valid digest and identity.
		*/
		@Test
		void testCheckDigest_8() {
				String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
				String identity = "hello";
				User user = new User();
				boolean result = user.checkDigest(digest, identity);
				assertTrue(result);
		}
		
		/**
		* Test case 9 for {@link User#checkDigest(String, String)}.
		* The test case checks the method with a valid digest and identity.
		*/
		@Test
		void testCheckDigest_9() {
				String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
				String identity = "hello";
				User user = new User();
				boolean result = user.checkDigest(digest, identity);
				assertTrue(result);
		}
		
		/**
		* Test case 10 for {@link User#checkDigest(String, String)}.
		* The test case checks the method with a valid digest and identity.
		*/
		@Test
		void testCheckDigest_10() {
				String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
				String identity = "hello";
				User user = new User();
				boolean result = user.checkDigest(digest, identity);
				assertTrue(result);
		}
}

// User_4Test.java
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
class User_4Test {
		
		/**
		* Test case 1 for {@link User#checkDigest(String, String)}.
		* The test case checks the method with a valid digest and identity.
		*/
		@Test
		void testCheckDigest_1() {
				String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
				String identity = "hello";
				User user = new User();
				boolean result = user.checkDigest(digest, identity);
				assertTrue(result);
		}
		
		/**
		* Test case 2 for {@link User#checkDigest(String, String)}.
		* The test case checks the method with a valid digest and identity.
		*/
		@Test
		void testCheckDig