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
		
	public static class EmptyUsersListMock implements UserList {
		ArrayList<String> users = new ArrayList<>();
		@Override
		public String[] getIds(Class c) {
			String[] returnedValue = new String[users.size()];
			return users.toArray(returnedValue);
		}
		@Override
		public void register(Class c, String name, String desc) { }
		@Override
		public void unregister(Class c, String name) { }
		@Override
		public void remove(Class c, String name, int index) { }
		@Override
		public Class get(Class c) { return null;}
	}

	@Test
	void test_NoNames() {
		SimpleUserMgr sut = new SimpleUserMgr();
		ArrayList<String> users = new ArrayList<>();
		assertNull("No users defined", sut.getNamesbyOrg(null));
		assertTrue("More than 0 users defined", users.size() > 0);
	}

	@Test
	void testBasicGetUsers() {
		JDBMRecordManager emgr = new JDBMRecordManager();
		JDBMEnumeration<User> uen = emgr.enumerate(null);
		ArrayList<String> users = new ArrayList<>();
		assertNull("No users in ajdbm database", users);
		emgr.open(users)
				.forEach(u -> uen.seek(u.getUserId()))
				.forEach(u -> uen.forward())
				.toArray(users)
				.close();
	}

	@Test
	void testBasicGetUsersFromFile() {
		JDBMRecordManager emgr = new JDBMRecordManager();
		JDBMEnumeration<User> uen = emgr.enumerate();
		Class<EmptyUsersListMock> cClass = EmptyUsersListMock.class;
		ArrayList<String> users = new ArrayList<>();
		assertNull("No users in ajdbm database", users);
		emgr.open(users, cClass)
				.forEach(u -> uen.seek(u.getUserId()))
				.toArray(users)
				.close();
	}

	@Test
	void testBasicFindNameById() {
		JDBMRecordManager emgr = new JDBMRecordManager();
		JDBMEnumeration<User> uen = emgr.enumerate();
		User user = emgr.load("1234")
		.forEach(u -> uen.seek(u.getUserId()))
		.toMap().get("1234")
		.get(0);
		Object o = emgr.findName(user.getUserId());
		String s = o instanceof String? (String)o : null;
		assertNotNull("Not found", s);
		assertEquals("Name not in user list?", "Bob", s);
	}

	@Test
	void testGetName() {
		JDBMEnumeration<User> uen = new JDBMHashtable<>()
			.enumerator();
		String user = uen.next();
		ArrayList<String> users = new ArrayList<>();
		users.add(user);
		HashSet<String> names = new HashSet<>();
		uen.forward().forEach(u -> names.add(u.getUserId().toString()));
		props.setProperty("username.users",
				users.toString().replaceAll("\\*", ","));
}
}