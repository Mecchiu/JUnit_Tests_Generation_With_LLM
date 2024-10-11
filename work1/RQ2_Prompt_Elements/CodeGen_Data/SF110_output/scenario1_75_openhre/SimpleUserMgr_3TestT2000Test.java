// SimpleUserMgr_3Test.java
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
* It contains one unit test case for the {@link SimpleUserMgr#export()} method.
*/
class SimpleUserMgr_3Test {
static final int DEFAULT_USER_ID = 907001;

    int maxLimit;
    int maxAge;
    int minAge;
    Vector<String> users;
    Vector<String> groups;
    Vector<String> ids;
    HashSet<String> usersGroups;
	SimpleUserMgr userMgr;
	
    public SimpleUserMgr_3Test() {
        this.userMgr = new SimpleUserMgr();	
    }

	@Test
	public void testExport() {

		// create empty properties
		Properties prop1 = new Properties();
		prop1.setProperty("a", "b");
		prop1.setProperty("c", "d");

		// create a database manager
		JDBMRecordManager dbMgr = new JDBMRecordManager();

		// create some users
		for (int i = 0; i < 10; i++) {
			String usr = "usr" + i;
			String grp = "group" + i;
            
			int id = DEFAULT_USER_ID;
			String s = usr + "-" + grp;
			users.add(s);
			groups.add(grp);
			
			// create a user
			id = userMgr.export(prop1, dbMgr, usr + "-" + grp);

            prop1.setProperty("userId[" + i + "]", id);
		}

		// create some users
		for (int i = 0; i < 10; i++) {
			String username = usr + "-" + i;
            // try and export user with the id
			id = userMgr.exportNonExisting(prop1, dbMgr, username);

            // user not found, let's make it
            prop1.setProperty("userId[" + i + "]", id);
            
		}

		// read users from a db
		try {
			users = (Vector) dbMgr.get(prop1);
		} catch (IOException e) {
			e.printStackTrace();
			fail("Could not read expected users from a db");
		}

		// iterate through users
		for (String name : users) {

			boolean found = false;
			for (int i = 0; i < 10; i++) {
				
				// try and get properties from user
                // get user names (first)
                String u = name + "-" + i;	
				String x = getProperty(prop1, u);

				// get number of groups from user
				int g = getProperty(u, "grp.");
				
				if (x == null) continue;
				
				// we found this, let's get it
                if (x.equals(g + ".0")) {
                    found = true;
                    break;
                }
			}
			
			String s = name + "-" + "" + g;
			String g = users.size() > 1? "" + users.get(users.size()-1) : "0";
			String t = name + "-" + g;
			
			if (found) {
                usersIds.add(s + " - " + t);
            } else {
                usersIds.add(s);
            }
		}

		// check if we found the required number of users
		assertEquals("users not found", 10, usersIds.size());
		
		// check if we found the required number of groups
		assertEquals("groups not found", 10,
				usersGroups.size() / 2, Integer.MAX_VALUE);

              
	}

        private String getProperty(Properties prop, String name) {
            String s = null;
            if (prop!= null) {
                String propname = prop.getProperty(name);
                if (propname!= null) {
                    s = propname;
                }
            }
            return s;
        }

	@Test
	public void testParse() throws IOException {
		users = new ArrayList<String>();
		users.add("foo");
		users.add("bar");

		groups = new ArrayList<String>();
		groups.add("Group");
		groups.add("A");

		ids = new ArrayList<String>();
		ids.add("id");
		ids.add("1-0");
		ids.add("0-1");

		maxLimit = 0;
		maxAge = 180;
		minAge = 1;

		minLimit = 0;
		userMgr = new SimpleUserMgr();

		// read users from a db
		String res = userMgr.parse("users");
		res = res.replace("[", "").replace(params("userId"), "").replace("]", "");
		res = res.replace("[", "").replace("[", "").replace("[", "");

		assertEquals("Users not parsed properly",
				new StringBuffer().append("\tfoo\t\tbar\t\t\n"),
				res);
	}
	
	public String toString() {
			StringBuffer buff = new StringBuffer();
			StringTokenizer st = new StringTokenizer(export(), ",");
			while (st.hasMoreTokens()) {
				String name = st.nextToken();
				int age = st.countTokens();
				buff.append(name + "-" + age);
				if (age == 1) buff.append("\n");
			}
			buff.append("\nusers: " + users.size() +
					"\ngroups: " + groups.size() +
					"\nmax(1) limit = " + maxLimit + "\nmax age = " + maxAge +
					"\nmin(1) limit = " + minLimit + "\nmin age = " + minAge);
			return buff.toString();
	}
	
	
}