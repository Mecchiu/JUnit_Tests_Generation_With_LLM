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
		User user;
		void setUp() {
			user = Utils.createUser();
		}

		@Test
		void testValidate() {
			final Set<String> badStrings = new HashSet<String>();
			badStrings.add("-1-");
			badStrings.add("0123456789");
			badStrings.add("abcdefghijklmnop");
			badStrings.add("123456789-abcde");
			badStrings.add("123456789-");
			badStrings.add("--");
			badStrings.add("@");
			badStrings.add("_");
			badStrings.add("#");
			badStrings.add("*");
			badStrings.add("'");
			badStrings.add("\"");
			badStrings.add(",");
			badStrings.add("\"\\");
			badStrings.add("\"\'");

			final Properties props = new Properties();
			System.setProperty("su.user.name", "Test User");
			Iterator i = badStrings.iterator();
			for (; i.hasNext();) {
				String s = (String) i.next();
				if (!badStrings.contains(s)) {
					String message = "Invalid char: "+s+" should be "+"\""+"-1-\""+"0123456789"+
									"abcdefghijklmnop"+"123456789-abcde"+"123456789-\""+"--"+
									"@"+"_"+"#"+"*"+"'"+"\""+"\""+
									"\\"+"\""+"'"+"\""+","+
					          "''''"+"\"'\""+"\"\\\""+"\""+
					          "\""+ "\""+"\""+"\""+  "\""+"\""+ "\""+
					          "+\""+"\""+"\""+"\"";
					System.getProperties().put(s, message);
					i.remove();
					testFails(user, s, message);
				}
			}
			i = badStrings.iterator();
		}

		@Test
		void testGetProperty() {
			assertEquals(user.getProperty("su.user.name"), "Test User");
		}

		@Test
		void testGetName() throws Exception {
			assertEquals(user.getName(), user.getName());
		}

		@Test
		void testGetRID() throws Exception {
			assertEquals(user.getRID(), "123456789");
		}

		@Test
		void testAddRID() throws Exception {
			user.addRID("123456789");
			assertEquals(set(user.getRID(), "123456789"), set(2L, 3L, 5L, 6L, 7L));
		}

		@Test
		void testGetNameByRIID() throws Exception {
			String RIID = user.getNameByRID("123456789");
			assertEquals(user.getNameByRID("123456789"), RIID);
		}

		@Test
		void testGetRIDByName() throws Exception {
			assertEquals("123456789", user.getRIDByName("Test User"));
		}

		@Test
		void testGetRIDByNameAndRID() throws Exception {
			assertEquals("123456789", user.getRIDByNameButRIID("Test User"));
		}

		@Test
		void testGetRIDByNameAndRID2() throws Exception {
			String RIID = user.getRIDByNameButRIID("Test User");
			assertEquals("123456789", user.getRIDByNameButRIID("Test User2"));
		}

		void testFails(User user, String s) {
			final String sExp = "Invalid char: " + s;
			user.checkDigest(sExp, s);
		}
}