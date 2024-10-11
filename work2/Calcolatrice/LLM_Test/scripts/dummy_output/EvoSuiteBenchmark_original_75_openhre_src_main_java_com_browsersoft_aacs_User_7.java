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
		
    static String dn = "dc=browsersoft,dc=org";
    static String password = "secret";
    static String[] users = null;
    static String uid=null;
    static File dsFile = null;
    static String[] addUser = {
                "uid=newuser,ou=Users,dc=browsersoft,dc=org",
                "uid=newuser2,ou=Users,dc=browsersoft,",
                "uid=newuser3,ou=Users,dc=browsersoft,"};
    static LdapContext ctx = null;
    static String password1 = null;
    static String password2 = null;
    static String dn1 = "dc=browsersoft,dc=org";
    static String dn1a = "dc=browsersoft,dc=org";
    static String username1 = null;
    final Set<String> uids = new HashSet<String>();
    final Set<String> names = new HashSet<String>();
    final Set<String> emails = new HashSet<String>();
    final Set<String> credentials = new HashSet<String>();
    @Test
    public void testCase1() throws Exception {
        setUp();
        UserTest test = new UserTest();
        test.users = dn;
        Object obj1 = test.findObject(null);
        assertEquals("Incorrect object value", ctx.getNameInNamespace(), "newuser");
        credentials.add("secret");
        ctx.rename("newuser", "newuser2");
        try {
            ctx.add(addUser, null);
        } catch(Exception ex) {
            fail("Unexpected failure.");
        }
        ctx.rename(addUser[0], null);
        try {
            ctx.add(addUser, password1);
            fail("Exception expected.");
        } catch (Exception ex) {
            assertTrue("Unexpected Exception",
                    ex instanceof NamingException
                    && "Security constraint violation".equals(((NamingException) ex).getMessage()));
        }
        StringTokenizer st1 = newStringTokenizer("newuser2", ":");
        StringTokenizer st2 = newStringTokenizer(password1 + ":");
        Iterator it1 = st1.iterator();
        Iterator it2 = st2.iterator();
        while(it1.hasNext()) {
            ctx.rename(it1.next(), null);
        }
        ctx.rename(addUser[0], "");
        // ctx.add(addUser[0], null);
        ctx.add(addUser[0], password2);
        ctx.setAuthenticationDeleteEnabled(false);
        ctx.add(addUser[0], null);
        String[] result1 = test.findObjects(null);
        assertEquals("Incorrect number of object found", 0, result1.length);
        Iterator it = uids.iterator();
        while(it.hasNext()) {
            String t = it.next();
            ctx.destroySynchronized(t);
        }
        try {
            ctx.lookup(null, dn1);
            fail("Exception expected");
        } catch (Exception ex) {
            assertTrue("Unexpected Exception",
                ex instanceof NamingException
                && "Object not found.".equals(((NamingException) ex).getMessage()));
        }
        try {
            ctx.lookup(null, dn1a);
            fail("Exception expected");
        } catch (Exception ex) {
            assertTrue("Unexpected Exception",
                ex instanceof NamingException
                && "Object not found.".equals(((NamingException) ex).getMessage()));
        }
        try {
            ctx.lookup(null, null); 
            fail("Exception expected");
        } catch (Exception ex) {
            assertTrue("Unexpected Exception",
                ex instanceof NamingException
                && "Object not found.".equals(((NamingException) ex).getMessage()));
        }
        Set<String> all = new HashSet<String>();
        ctx = LdapUtil.createLdapCtx(dsFile);
        ctx.add(new String[] {dn1}, password1);
        ctx.add(new String[] {dn1a}, password1);
        ctx.add(addUser[0], password1);
        ctx.add(addUser[1], password1);
        ctx.add(addUser[2], password1);
        ctx.add(addUser[3], password1);
        int total = 200;
}
}