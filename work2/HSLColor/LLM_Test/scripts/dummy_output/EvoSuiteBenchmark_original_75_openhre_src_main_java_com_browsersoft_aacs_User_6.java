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
    public void testCheckDigest() {
        final String expected = "a3u0mk8jcjf2f0qwg9jqp8tq8";
        User user;
        user = new User();
        String actual;
        actual = user.checkDigest(expected, "password");
        System.out.println("\nUSER : " + actual);
        assertEquals(user.login, actual);

        //
        systemInit();

        user = new User();
        actual = user.checkDigest(expected, "password");
        assertEquals(user.login, actual);
        user.login = "test.login";
        user.password = "test.password";
        systemReset();
    }
    
    @Test
    public void testCheckDigestWithNull() {
        final String expected = "a3u0mk8jcjf2f0qwg9jqp8tq8";
        User user;
        user = new User();
        user.login = null;
        user.password = null;
        systemInit();

        String actual;
        actual = user.checkDigest(expected, "password");
        assertEquals("wrong", "NULL", actual);

        systemReset();
    }
    
    @Test
    public void testGetLogin() {
        User user;
        user = new User();
        user.login = "admin";
        System.out.println("\nUSER : " + user.login);
        assertEquals("expected admin", user.login);
        
        Set<String> credentials = new HashSet<String>();
        credentials.add("admin");
        user.credentials = credentials;
        System.out.println("\nUSER : " + user.credentials);
        user.login = "test";
        System.out.println("\ntest : " + user.credentials);

        user = new User();
        user.credentials = null;
        user.login       = "admin";
        System.out.println("\nUSER : " + user.login);
        
        assertEquals("wrong", "test", user.login);
        
        final String invalidLogin = "invalid-login";
        user.login = invalidLogin;
        System.out.println("\nUSER : " + user.login);
        assertNull(user.login);
        
        assertEquals("User.getLogin() returns current login ", user.login, 
            User.getLogin(null));
    }
    
    @Test
    public void testGetPassword() {
        User user;
        user = new User();
        user.login    = "admin";
        user.password = "adadmin";
        System.out.println("\nUSER : " + user.login);
       
        user.password = "asldjkfj" ;
        
        Set<String> credentials = new HashSet<String>();
        credentials.add("asldjkfj");
        user.credentials = credentials;
        System.out.println("\nUSER : " + user.credentials);
       
        assertEquals("wrong", user.password, user.getPassword(user.credentials)); 
    }
   
    @Test
    public void testResetPassword() {
        final String credentials = "asldjkfj";
        final String password   = "asldjkfj";
        
        User user;
        user = new User();
        user.login    = "admin";
        user.password = password;
        user.credentials = credentials;
        
        assertEquals("wrong", user.password, user.setPassword(user.credentials));

        user = new User();
        user.credentials = credentials;
        user.password = password;
        System.out.println("\nUSER : " + user.login);
        assertEquals("wrong", user.password, user.setPassword(user.credentials));

        assertEquals("wrong", user.login, user.getLogin(user.credentials));
    };

    private void systemInit() {
        Properties env = new Properties();
        env.setProperty(Base64.algorithmIdentifier, Base64.ALGO_ID_DSA);
        env.setProperty(Base64.encodingId, Base64.ENCODE_XOR);
        env.setProperty(Base64.dontCheckCRCsId, Base64.DONT_CHECK_CRC);
        env.put("passw", password);
        env.put("id", "test");
        env.put("salt", "test");

        LdapContext ctx = new LdapContext(env);
        MessageDigest messageDigest = MessageDigest.getInstance(Base64.base64Algorithm);
        String pass = messageDigest.md5Digest((String)ctx.getAttributes().get("passw")).toString();
        ctx.getNameInNamespace();
    }
    
    private void systemReset() {
        Properties env = new Properties();
        env.setProperty(Base64.algorithmIdentifier, Base64.ALGO_ID_DSA);
        env.setProperty(Base64.encodingId, Base64.ENCODE_XOR);
        env.put("passw", password);
        env.put("id", "test");
        env.put("salt", "test");
        
        LdapContext ctx = new LdapContext(env);
        ctx.getNameInNamespace();
    }
    
    private void auth(String user, String pw) {
        Credentials credentials = new Credentials();
        credentials.setUser(user);
        credentials.setPassword(pw);
        
        User userRet = new User(credentials);
        assertNotNull("User", userRet);
        assertEquals("wrong", user, userRet.getLogin());
    }
    
    public static class Credentials implements Serializable {

        public final String user;
        public final String password;

        public Credentials() {
            this.user = "user";
            this.password = "password";
        }
    }

    public static class User implements Serializable {
        final String user;
        final String password;
        public final Set<String> credentials;

        public User() {
            user = "";
            password = "";
            credentials = new HashSet<String>();
        }

}
}