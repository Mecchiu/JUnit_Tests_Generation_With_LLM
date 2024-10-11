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
		public static final String testHost           = "javax.naming.ldap.initial";
		public static final String testServer          = "javax.naming.ldap.cached";
		public static final String testUser             = "alice"; // javax.naming.ldap.username attribute
		public static final String base64EncodedIdentity = "Zg=="; // Base64.encode(Base64.encodeBase64(
		public static final String testPassword       = Base64.encodeBase64("this is the password");
		public static final String testPass               = "this is the password";
}