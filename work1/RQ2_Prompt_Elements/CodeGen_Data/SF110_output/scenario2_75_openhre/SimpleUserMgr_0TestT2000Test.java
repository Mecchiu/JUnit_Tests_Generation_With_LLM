// SimpleUserMgr_0Test.java
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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleUserMgr}.
* It contains one unit test case for the {@link SimpleUserMgr#getUser(String, String, String)} method.
*/
class SimpleUserMgr_0Test {
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

    /**
     * get User with username, org and email
     *
     * @param username cn variable
     * @param org o variable
     * @param email email variable
     * @return User
     */
    public User getUser(String username, String org, String email) {
        User user = null;
        try {
            // try unique email first (this should always return the user)
            if (email!= null &&!email.equals(""))
                user = (User) id.get(email);
            if ((user == null) && (org!= null) && (username!= null)) {
                // get the user list for the organization
                users = recman.getHashtable(org);
                if (users!= null) {
                    String userid = (String) users.get(username);
                    if (userid!= null)
                        user = (User) id.get(userid);
                }
            }
            if (user == null)
                cat.warn("getUser(" + username + "," + org + "," + email + "): user not found, ");
        } catch (IOException e) {
            cat.error("getUser: " + e);
        }
        return user;
    }
}

// SimpleUserMgr_0Test.java
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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleUserMgr}.
* It contains one unit test case for the {@link SimpleUserMgr#getUser(String, String, String)} method.
*/
class SimpleUserMgr_0Test {
		/**
		* Test method for {@link SimpleUserMgr#getUser(int, String, String)}.
		*/
    @Test
    void test_getUser() {
        int userid = 12;
    	int userid2 = 22;
    	int userid3 = 33;
    	User user = null;

        try {
            // try unique email first (this should always return the user)
            user = (User) id.get(userid);
            if (user == null)
                user = (User) id.get(userid2);
            if (user == null)
                user = (User) id.get(userid3);
        } catch (IOException e) {
            cat.error("test_1_getUser: " + e);
        }
        assertNotNull(user);
        assertEquals("getUser - User's id mismatch",userid,user.getId());
        assertEquals("getUser - User's name mismatch",user.getUsername(),user.getName().toUpperCase());
        assertNotNull(user.getOrgList());
        assertEquals("test_2_getUserId",userid2+"",((String) user.getOrgList().get(0)).toUpperCase());
        assertEquals("test_3_getUserId",userid3+"",((String ) user.getOrgList().get(1)).toUpperCase());
    }

    /**
	* Test method for {@link SimpleUserMgr#getUsers(int)} method.
	*/
    @Test
    void test_getUserCollection() {
        // test for null arguments
        assertNull(SimpleUserMgr.getUsers(0));

        // test for normal cases
        ArrayList<User> users1 = new ArrayList<>();
        Vector<String> users2 = new Vector<>();
        int startId = new Integer(1250).intValue();
        int endId = new Integer(1250).intValue();
        JDBMHashtable<String> users3 = JDBMHashtable.init(new Properties(""));
    	boolean empty = JDBMEnumeration.NEXT_FALSE;
    	try {
    	    JDBMEnumeration.PREVIOUS_TRUE;
    	} catch (IOException e) {
    	    cat.error("getUserCollection: " + e);
    	}
        while (users3.size() > 0) {
            users1.add(users3.get(0));
        }
        while (empty && users1.size() > 0) {
            users2.add(users3.get(0));
        }
        int cnt = users2.size();
        Vector<User> newusers = new Vector<>();
        if (users2.size() > 0)
            cnt &= ~(users2.size() - 1);
        while (users2.size() > 0) {
            newusers.add(users2.elementAt(0));
            if (cnt & 1) {
                users2.remove(0);
                if (users2.size() > 0)
                    cnt &= ~(users2.size() - 1);
            }
        }
        assertEquals("test_4_getUserCollection: User",users1.size(),users2.size());
        assertTrue("Failed to put users in correct order",users2.equals(newusers));
    }

    /**
	* Test method for {@link SimpleUserMgr#UserManager(Properties)}.
	*/
    @Test
    void test_JDBM_MGR() throws IOException {
        // test for valid properties object
        Properties props = new Properties();
        String prop = props.getProperty("usermanager."+SimpleUserMgr.class.getName() +".dir","./users.properties");
        //String prop = System.getProperty("usermanager.dir");
        String prop2 = false;
        String prop3 = ".browsersoft.aacs.users.conf";
        props.setProperty("usermanager.dir",prop);
        props.setProperty("usermanager.dir.prop3",prop3);

        // test for null arguments
        assertNull(SimpleUserMgr.UserManager(null));

        props.setProperty("usermanager.dir", prop);
        props.setProperty("usermanager.dir.prop3", prop3);

        // test on properties
        ArrayList<String> list = new ArrayList<>();
        props.listProperties("");
        props.listProperties(".");
        props.remove(".");
        String prop1 = "";
        props.remove(".");
        props.list(".");
        String prop2 = "";
        props.remove(".");
        props.list(".");
        String prop3 = "abc";
        props.remove(".");
        props.list(".");

        // test properties in files
        props.listProperties(".browsersoft.aacs.users.properties");
        assertEquals("test_5_getUserManager: dirProps",props.getProperty("usermanager." + SimpleUserMgr.class.getName() + ".dir"),prop);
        assertEquals("test_5_getUserManager: prop3",props.getProperty("usermanager.dir.prop3"),prop);
        try {
            InputStream bis = new UserManagerManager().openURL(new URL("file://"+props.getProperty("usermanager.dir")));
            BufferedReader br = new BufferedReader(new Input