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
		/**
     * Constructor for {@link UserTest}.
     */
    public UserTest() {
    }


    /**
	 * @throws java.lang.Exception if the tests are failed
	 */
    @Test
    public void testCompareInt() throws Exception {
        // The two objects are equal if they are the same class/interface
        assertEquals(new User(""), new User(""));
        assertEquals(new User(""), new User("abcdefgh"));
        assertEquals(new User("abcdefgh"), new User("abcdefgh"));

        // Objects with different types
        assertNotEquals("abcdefgh", new Object());
    }


    /**
     * @throws java.lang.Exception if the tests are failed
     */
    @Test
    public void testCompareString() throws Exception {
        Set<User> user1 = new HashSet<User>();
        Set<User> user2 = new HashSet<User>();

        assertEquals(new User(""), new User(""));
        assertEquals(new User("abcdefgh"), new User("abcdefgh"));
        assertEquals(new User("abcdefgh"), new User("abcdefgh"));

        user1.add(new User("abcdefgh"));
        user2.add(new User("abcdefgh"));

        assertNotEquals("abcdefgh", new User("abcdefgh"));
    }

    /**
	 * @throws java.lang.Exception if the tests are failed
	 */
    @Test
    public void testCompareHashSet() throws Exception {
        Set<User> user1 = new HashSet<User>();
        Set<User> user2 = new HashSet<User>();
        user1.add(new User("abcdefgh"));

        Set<User> user3 = new HashSet<User>();
        user3.add(new User("abcdefgh"));

        user2.add(user3);
        user1.add(user2);

        assertNotEquals("abcdefgh", new User("abcdefgh"));
    }
}


/**
 *
 * <pre>
 * $Log$
 */
class StringMessage {
    String s;
    StringMessage(String s) {
        this.s = s;
    }

    public String toString() {
        return s.length() + ": " + s;
    }
}

/**
 *
 * <pre>
 * $Log$
 */
class User {
    String userName;
    String password;
    String id;
    String host;
    int port;
    LdapContext context;

    public User(String userName, String password, String id, String host, int port) throws Exception {
        this.userName = userName;
        this.password = password;
        this.id = id;
        this.host = host;
        this.port = port;
    }
    public User(User user) {
        this.userName = user.userName;
        this.password = user.password;
        this.id = user.id;
        this.host = user.host;
        this.port = user.port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public Set<String> getIdList() {
        Iterator<String> it = getId().split(",");
        Set<String> set = new HashSet<String>();
        while (it.hasNext()) {
            set.add(it.next());
        }
        return set;
    }
    public String getId() {
        return userName;
    }

    public String getPassword(String userName) {
        return password;
    }

    public void setName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String userName, String password) {
        this.password = password;
    }
    
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return userName + "@" + this.host + ":" + this.port;
    }
}