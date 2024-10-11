// SimpleUserMgr_1Test.java
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
* It contains one unit test case for the {@link SimpleUserMgr#getNamesbyOrg(String)} method.
*/
class SimpleUserMgr_1Test {
		
		// Class fields
		ArrayList<String> userIDs_ = new ArrayList<String>();
		Vector<String> names_ = new Vector<String>();
		ArrayList<Vector<String>> orgs_ = new ArrayList<Vector<String>>();
		Vector<String> roles_ = new Vector<String>();
		String org_ = "u";
		String password_ = "u";
		String dn_ = "cougrantlee";
		long lastTime_ = System.currentTimeMillis();
		/**
		* Get a username by orgname;
		* @param orgname the name of the org;
		* @return String[]; list of usernames within the org;
		*/
		public String[] getUsernamesbyOrg(String orgname) {
			if (orgname.equals(org_)){
				return names_.toArray(new String[] { "cougroupename" });
			}
			else {
				return names_.toArray(new String[] { "orgname" });
			}
		}
		
		/**
		* Get all the names in orgs_ for a given org;
		* @param org the org name;
		* @return String[] list of names from orgs_;
		*/
		public String[] getNamesbyOrg(String org) {
			if (!orgname_.equals(org)){
				return orgs_.toArray(new String[] { org, "name" });
			}
			else {
				return orgs_.toArray(new String[] { org, "name" });
			}
		}
		/**
		* Get the list of all roles for a given org;
		* @param orgname the org name;
		* @return String[]; list of roles within each org;
		*/
		public String[] getRolesbyOrg(String orgname) {
			if (orgname.equals(org_)){
				return roles_.toArray(new String[] { "cougrouprole", "role" });
			}
			else {
				return roles_.toArray(new String[] { orgname, "role" });
			}
		}
		
		/**
		* Get a username by org in this context
        * @param orgname the org name;
        * @return the username
        */
		public String getUsername(String org) {
			if (orgname_.equals(org_)){
				return "cougroupre";
			}
			else {
				return "orgone";
			}
		}
		
		/**
		* Create an instance of usersMgr.
		* UserMgr uses an instance of jdbm.JDBMEnumeration to iterate over 
		* a set of the LDAP users;
		*/
		public SimpleUserMgr() {
			String configFile = System.getenv("USERMDCONFIG");
			if (configFile!= null &&!configFile.equals("")) {
				System.out.println("Loading configuration " + configFile);
				Properties props = new Properties(); 
				try {
                  			Reader r = new BufferedReader(new InputStreamReader(
                      				new URL(configFile).openStream(), "UTF-8"));
                  			props.load(r);
                  			r.close();
				}
				catch (IOException e) {
					System.out.println("Problem loading configuration: " + e.getMessage());
				}
				JDBMRecordManager mm = new JDBMRecordManager(props);
				Vector<String> users = new Vector<String>();
				if (mm.table(JDBM_RecordManager.TABLE_USER)!= null) {
					JDBMEnumeration u = mm.getTable(JDBM_RecordManager.TABLE_USER).getAllElements();
					Vector<Vector<String>> orgs = new Vector<Vector<String>>();
					while (u.nextElement()!= null) orgs.add(u.getElement(JDBM_RecordManager.TABLESTRING));
					mm.shutdown();
					orgs_ = orgs;
					props = new Properties();
                    mm = new JDBMRecordManager(props);
					for (String uid : orgs) {
						Vector<String> usernames = new Vector<String>();
						StringTokenizer st = new StringTokenizer(uid, "|");
						while (st.hasMoreTokens()) usernames.add(st.nextToken());
						userIDs_.add(uid);
						if (usernames.size() == 0) usernames.add("cougroupre");
						names_ += usernames;
						Vector<String> roles = new Vector<String>();
						st =  new StringTokenizer(st.nextToken(), "|");
						String rolesStr = st.nextToken();
						while (st.hasMoreTokens()) roles.add(st.nextToken());
						roles_ += roles;
					}
				}
				return;
			}
		}
		
		/**
		* Dump a list of users and the roles
		* In the case, userID is a username already in the database.
		* @param args the args entered by the user from the CLI
		*/
		public static void dumpUsers(String[] args) {
			int orgCount = 2;
			String orgName;
            String org_ = "u";
            String password_;
            String password;
            String dn_;
      		long lastTime;
      		for (String arg : args) {
         			if (arg.equals("-o")) orgName = arg;
         			if (arg.equals("-p")) password = arg;
         			if (arg.equals("-nd")) dn_ = arg;
         			if (arg.equals("-u")) org_ = arg;
         			if (arg.equals("-pw")) password_ = arg;
         			if (arg.equals("-l")) lastTime = arg;
         	}
			orgCount = orgCount;
			userIDs_ = new Vector<String>();
			names_ = new Vector<String>();
			orgs_ = new Vector<Vector<String>>();
			System.out.println("Dumping " + orgName + " users.");

			// Get them
			ArrayList<String> usernames = new ArrayList<String>();
			Vector<String> orgs = new Vector<String>();
			Vector<Vector<String>> orgs_org = new Vector<Vector<String>>();
}
}