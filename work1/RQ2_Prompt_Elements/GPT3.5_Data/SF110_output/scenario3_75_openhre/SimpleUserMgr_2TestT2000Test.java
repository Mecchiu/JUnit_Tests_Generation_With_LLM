// Here's an example implementation of the SimpleUserMgr class and its test class:

// SimpleUserMgr.java
package com.browsersoft.aacs;

import jdbm.JDBMEnumeration;
import jdbm.JDBMHashtable;
import jdbm.JDBMRecordManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;

public class SimpleUserMgr implements UserMgr {

    private JDBMHashtable<String, User> users;

    public SimpleUserMgr(JDBMRecordManager recMan) throws IOException {
        users = new JDBMHashtable<String, User>(recMan, "users");
    }

    /**
     * get the email addresses of all users in an organization
     *
     * @param org name of the organization (o LDAP field)
     * @return String[] array of email addresses
     */
    public String[] getMailbyOrg(String org) {
        HashSet<String> emails = new HashSet<String>();
        JDBMEnumeration<String, User> e = users.elements();
        while (e.hasMoreElements()) {
            User u = e.nextElement();
            if (u.getOrg().equals(org)) {
                emails.add(u.getEmail());
            }
        }
        return emails.toArray(new String[emails.size()]);
    }
}

// SimpleUserMgr_2Test.java
package com.browsersoft.aacs;

import jdbm.recman.BaseRecordManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleUserMgr}.
* It contains ten unit test cases for the {@link SimpleUserMgr#getMailbyOrg(String)} method.
*/
class SimpleUserMgr_2Test {

    @Test
    void testGetMailbyOrgEmpty() throws Exception {
        BaseRecordManager recMan = new BaseRecordManager();
        SimpleUserMgr mgr = new SimpleUserMgr(recMan);
        String[] emails = mgr.getMailbyOrg("org1");
        assertEquals(0, emails.length);
    }

    @Test
    void testGetMailbyOrgOneUser() throws Exception {
        BaseRecordManager recMan = new BaseRecordManager();
        SimpleUserMgr mgr = new SimpleUserMgr(recMan);
        User u = new User("user1", "org1", "user1@example.com");
        mgr.users.put(u.getUsername(), u);
        String[] emails = mgr.getMailbyOrg("org1");
        assertEquals(1, emails.length);
        assertEquals("user1@example.com", emails[0]);
    }

    @Test
    void testGetMailbyOrgMultipleUsersSameOrg() throws Exception {
        BaseRecordManager recMan = new BaseRecordManager();
        SimpleUserMgr mgr = new SimpleUserMgr(recMan);
        User u1 = new User("user1", "org1", "user1@example.com");
        User u2 = new User("user2", "org1", "user2@example.com");
        User u3 = new User("user3", "org1", "user3@example.com");
        mgr.users.put(u1.getUsername(), u1);
        mgr.users.put(u2.getUsername(), u2);
        mgr.users.put(u3.getUsername(), u3);
        String[] emails = mgr.getMailbyOrg("org1");
        assertEquals(3, emails.length);
        assertTrue(emails[0].equals("user1@example.com") || emails[1].equals("user1@example.com") || emails[2].equals("user1@example.com"));
        assertTrue(emails[0].equals("user2@example.com") || emails[1].equals("user2@example.com") || emails[2].equals("user2@example.com"));
        assertTrue(emails[0].equals("user3@example.com") || emails[1].equals("user3@example.com") || emails[2].equals("user3@example.com"));
    }

    @Test
    void testGetMailbyOrgMultipleUsersDifferentOrgs() throws Exception {
        BaseRecordManager recMan = new BaseRecordManager();
        SimpleUserMgr mgr = new SimpleUserMgr(recMan);
        User u1 = new User("user1", "org1", "user1@example.com");
        User u2 = new User("user2", "org2", "user2@example.com");
        User u3 = new User("user3", "org1", "user3@example.com");
        mgr.users.put(u1.getUsername(), u1);
        mgr.users.put(u2.getUsername(), u2);
        mgr.users.put(u3.getUsername(), u3);
        String[] emails = mgr.getMailbyOrg("org1");
        assertEquals(2, emails.length);
        assertTrue(emails[0].equals("user1@example.com") || emails[1].equals("user1@example.com"));
        assertTrue(emails[0].equals("user3@example.com") || emails[1].equals("user3@example.com"));
    }

    @Test
    void testGetMailbyOrgNonexistentOrg() throws Exception {
        BaseRecordManager recMan = new BaseRecordManager();
        SimpleUserMgr mgr = new SimpleUserMgr(recMan);
        User u1 = new User("user1", "org1", "user1@example.com");
        User u2 = new User("user2", "org2", "user2@example.com");
        User u3 = new User("user3", "org1", "user3@example.com");
        mgr.users.put(u1.getUsername(), u1);
        mgr.users.put(u2.getUsername(), u2);
        mgr.users.put(u3.getUsername(), u3);
        String[] emails = mgr.getMailbyOrg("org3");
        assertEquals(0, emails.length);
    }

    @Test
    void testGetMailbyOrgNullOrg() throws Exception {
        BaseRecordManager recMan = new BaseRecordManager();
        SimpleUserMgr mgr = new SimpleUserMgr(recMan);
        User u1 = new User("user1", "org1", "user1@example.com");
        User u2 = new User("user2", "org2", "user2@example.com");
        User u3 = new User("user3", "org1", "user3@example.com");
        mgr.users.put(u1.getUsername(), u1);
        mgr.users.put(u2.getUsername(), u2);
        mgr.users.put(u3.getUsername(), u3);
        assertThrows(IllegalArgumentException.class, () -> mgr.getMailbyOrg(null));
    }

    @Test
    void testGetMailbyOrgEmptyOrg() throws Exception {
        BaseRecordManager recMan = new BaseRecordManager();
        SimpleUserMgr mgr = new SimpleUserMgr(recMan);
        User u1 = new User("user1", "org1", "user1@example.com");
        User u2 = new User("user2", "org2", "user2@example.com");
        User u3 = new User("user3", "org1", "user3@example.com");
        mgr.users.put(u1.getUsername(), u1);
        mgr.users.put(u2.getUsername(), u2);
        mgr.users.put(u3.getUsername(), u3);
        assertThrows(IllegalArgumentException.class, () -> mgr.getMailbyOrg(""));
    }

    @Test
    void testGetMailbyOrgWhitespaceOrg() throws Exception {
        BaseRecordManager recMan = new BaseRecordManager();
        SimpleUserMgr mgr = new SimpleUserMgr(recMan);
        User u1 = new User("user1", "org1", "user1@example.com");
        User u2 = new User("user2", "org2", "user2@example.com");
        User u3 = new User("user3", "org1", "user3@example.com");
        mgr.users.put(u1.getUsername(), u1);
        mgr.users.put(u2.getUsername(), u2);
        mgr.users.put(u3.getUsername(), u3);
        assertThrows(IllegalArgumentException.class, () -> mgr.getMailbyOrg("  "));
    }

    @Test
    void testGetMailbyOrgCaseSensitive() throws Exception {
        BaseRecordManager recMan = new BaseRecordManager();
        SimpleUserMgr mgr = new SimpleUserMgr(recMan);
        User u1 = new User("user1", "org1", "user1@example.com");
        User u2 = new User("user2", "Org1", "user2@example.com");
        User u3 = new User("user3", "ORG1", "user3@example.com");
        mgr.users.put(u1.getUsername(), u1);
        mgr.users.put(u2.getUsername(), u2);
        mgr.users.put(u3.getUsername(), u3);
        String[] emails = mgr.getMailbyOrg("org1");
        assertEquals(1, emails.length);
        assertEquals("user1@example.com", emails[0]);
    }

    @Test
    void testGetMailbyOrgSpecialChars() throws Exception {
        BaseRecordManager recMan = new BaseRecordManager();
        SimpleUserMgr mgr = new SimpleUserMgr(recMan);
        User u1 = new User("user1", "org1", "user1@example.com");
        User u2 = new User("user2", "org1", "user2@example.com");
        User u3 = new User("user3", "org1", "user3@example.com");
        User u4 = new User("user4", "org1", "user4@example.com");
        User u5 = new User("user5", "org1", "