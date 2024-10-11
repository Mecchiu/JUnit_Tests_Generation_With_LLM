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
		private String id1;
		private String id2;

    /**
     * Test method for {@link User#User(String)}.
     *
     * @throws Exception if an error occurs
     */
            @Test
        public void testConstructorUser() throws Exception {
        assertNotNull( "user is null", new User("joe"));
        assertNotNull("user is null", new User("joe", "password", "user", "mail"));
        }

        /**
     * Test method for {@link User#checkDigest(String)}.
     *
     * @throws Exception if an error occurs
     */
		@Test
		public void testCheckDigest() throws Exception {
			fail("Not yet implemented");
		}

		/**
     * Test method for {@link User#checkDigest(String, String)}.
     *
     * @throws Exception if an error occurs
     */
		@Test
		public void testCheckDigestStringPassword() throws Exception {
			fail("Not yet implemented");
		}
}//UserTest class