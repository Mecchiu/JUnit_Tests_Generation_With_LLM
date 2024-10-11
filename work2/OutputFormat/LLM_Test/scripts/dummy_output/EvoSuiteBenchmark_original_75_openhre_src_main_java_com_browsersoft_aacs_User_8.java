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
		@Test
		public void login() {
			User u = new User((String)null);
			check(u, "", "", "");
		}

    @Test
    public void loginWithUser() {
        User u = new User("userid");
        check(u, "", "", "");
    }

    @Test
    public void addUser() {
        User u = new User("userid");
        u.setPassword("123123123");
        u.setEtcdRoles("etcdC");
        u.setEtcdConfigMapKey("etcdCFGK");
		assertEquals(u, User.findByUserId("123123123"));
    }

    @Test
    public void addUserWithBadPassword() {
        User u = new User((String)null);
        u.setPassword("1231234567");
        u.setEtcdRoles("etcdC");
        u.setEtcdConfigMapKey("etcdCFGK");
        assertEquals(u, User.findByUserId("1231234567"));
    }
}