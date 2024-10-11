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
		// @BeforeTest
		// public void beforeClass() throws Exception {
		// cat.warn("beforeClass():");
		//}

        @Test
        void getUser_0() throws Exception {
            cat.warn("getUser(String,String,String): ");

            String username = "Test User 1";
            String org = "org1";

            SimpleUserMgr sm = new SimpleUserMgr();
            String email = "test.email@gmail.com";
            String orgname = "test.org1";

            int i = 0;
            while (i < 100) {
                String expectedUser = "username" + i++;
                String expectedOrg = "org" + i++;
                String expectedEmail = "user" + i++;

                boolean found = sm.getUser(expectedUser, expectedOrg, expectedEmail);
                if (!found)
                    return;
            }
            System.err.println("Test failed, returned 0x00!0x0F!");

        };
}

// SimpleUserMgr_1.java
