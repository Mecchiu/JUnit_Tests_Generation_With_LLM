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
		final Vector users = new Vector();
		final String username = "SimpleUserMgr_0";
		final String org = "org1, org2, org3";
		final String email = "email_3";
		
	public SimpleUserMgr_0Test()
	{
	}

	public String getUser() {return(users.firstElement());}
	
	public void testInit() {
		Vector v = new Vector();
		v = new Vector();
		org= new String("test");
		v.addElement(username);
		System.out.println(org);
		for (Enumeration e = JDBMEnumeration.getDBMSInstances(); e.hasMoreElements();) {
			System.out.println(((JDBMRecordManager)e.nextElement()).getRecordForKey(org));
			users.addElement(((JDBMEnumeration)e.nextElement()).getRecordForKey(org));
		}
		assertTrue(users.size()==v.size());
	}

  public String getUserWithNull() {return  (users.firstElement());}
	
	public void testGetUserByName() {
		// getUserWithNull
		String userName = getUserWithNull();
		if (userName==null) return;
        ArrayList users = new ArrayList();
		users.add(userName);
		for (Enumeration e = users.elements();e.hasMoreElements();)
			System.out.println(us.firstElement());
		assertTrue(users.indexOf(userName) > 0);
	}

  public void testGetGroupByName() {
		// getGroupsByName
		ArrayList groupList = new ArrayList();
		groupList.add(password);
		groupList.add(first_name);
		ArrayList users = new ArrayList();
		for (Enumeration e = JDBMEnumeration.getDBMSInstances(); e.hasMoreElements();) {
			System.out.println(((JDBMRecordManager)e.nextElement()).getRecordForKey(first_name));
			Vector users1 = ((JDBMHashtable) e.nextElement()).get(first_name);
			System.out.println(users1.size());
			groups.add(first_name);
			for (Enumeration e2 = users1.elements();e2.hasMoreElements();) {
				users.addElement(((JDBMRecordManager)e2.nextElement()).getRecordForKey(first_name));
			}
		}
		assertTrue(users.size() == groups.size());
		System.out.println("Groups are ");
		for (Enumeration i = groups.elements();i.hasMoreElements();)
			System.out.println(i.nextElement());
		for (Enumeration e = groupList.elements();e.hasMoreElements();)
			System.out.println(e.nextElement());
	}

 	public Properties getUsers() {
		Properties users=new Properties();
		Vector users1=new Vector();
		users.setProperty("name",username);
		for (Enumeration e= JDBMRecordManager.getDBMRecordsInstances(email);e.hasMoreElements();)
			users1.add(e.nextElement());
		String[] s=new String[users1.size()];
		users1.copyInto(s);
		users=users.subProperties();
		for (Enumeration e = s;e.hasMoreElements();) {
			User user=(User)users.get(e.nextElement());
			users.remove(e.nextElement());
			System.out.println("user name: "+user.getFirstName());
			System.out.println("user userid : "+user.getUserID());
		}
		return users;
	}

  public void testSetUserWithNull() {
		// getUserWithNull
		String userName = getUserWithNull();
		if (userName==null) return;
        ArrayList users = new ArrayList();
		users.add(userName);
		ArrayList groups = new ArrayList();
		groups.add(userName);
		users.set(userName);
		System.out.println(users);
		System.out.println(groups);
	}
}

class User {
	String first_name;
	String middle_name;
	String last_name;

		public User(String fname, String mname, String last) {
			if (fname.equals("")) {
			System.err.println("Error in User.first_name!");
			this.first_name = "";
			} else {
				this.first_name = fname;
			}
			System.out.println(fname);
			if (mname.equals("")) {
				System.err.println("Error in User.middle_name!");
				this.middle_name = "";
			} else {
				this.middle_name = mname;
			}
			System.out.println(mname);
			if (last.equals("")) {
				System.err.println("Error in User.last_name!");
				this.last_name = "";
			} else {
				this.last_name=last;
			}
			System.out.println(last);
		}

	public String getFirstName() {
		return first_name;
	}

	public String getMiddleName() {
		return middle_name;
	}

	public String getLastName() {
        return last_name;
	}

}