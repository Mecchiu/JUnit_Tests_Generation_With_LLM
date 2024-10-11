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
		
	public SimpleUserMgr_3Test() { }

	@Test
	public void testExport() throws IOException {
		SimpleUserMgr sm = new SimpleUserMgr();
		boolean result = sm.export();
		assertFalse(result);
	}

	@Test
	public void testExportedDatabaseVersion() throws IOException {
		SimpleUserMgr sm = new SimpleUserMgr();
		String version = sm.export().substring(10);
		assertTrue(version.contains("SimpleUserMgr-3"));
	}

	@Test
	public void testSimpleUsersTable() throws IOException {
		SimpleUserMgr sm = new SimpleUserMgr();
		JDBMEnumeration<String> users = sm.users();
		assertNull(users);
		assertEquals("Default users", sm.defaultUser, sm.users().firstEntry().getKey());
	}

	@Test
	public void testPropertiesTable() throws IOException {
		SimpleUserMgr sm = new SimpleUserMgr();
		JDBMEnumeration<String> users = sm.users();
		System.out.println("Users:" + users);
		props = new Properties();
		result = sm.properties().export(props);
		props.store(System.out, null);
		assertEquals(result, sm.properties().export(props));
	}

	@Test
	public void testJsonTable() throws IOException {
		SimpleUserMgr sm = new SimpleUserMgr();
		JDBMEnumeration<String> users = sm.users();
		assertNull(users);
	}

	private static boolean result;
	private static boolean props = false;
	private static boolean ex = false;
	private static HashSet<String> set = new HashSet<String>();
	private static StringTokenizer st = new StringTokenizer("");
	private static StringBuffer sb = new StringBuffer();
	private static StringReader sr = new StringReader();
	private static BufferedReader r = new BufferedReader(sr);
	private static Vector<Vector<String>> records = new Vector<Vector<String>>();
	private static ArrayList<String> data = new ArrayList<String>();
	private static String dataStr = "";
	private static ArrayList<String> namesRef = new ArrayList<String>();
	private static String namesCStr = "";
	private static String namesStr = "";
	private static String namesArray = "";
	private static final String EMPTY = "";
	private static final String SPACE = " ";
	private static JDBMRecordManager manager = null;
	private static StringBuffer propsStr = "";
	private static Vector<String> userData = new Vector<String>();
	private static String userDataStr = "";
	private static HashSet<String> userNames = new HashSet<String>();
	private static String userDataArray = "";
	private static int version = 1;
	private static String versionStr = "";
	private static ArrayList<String> passwordList = new ArrayList<String>();

	private String getString(JDBMRecordManager manager, String name) throws Exception {
		Object result = manager.get(name);
		if (result instanceof String) {
			return (String) result;
		} else if (result instanceof Integer) {
			return (Integer) result;
		} else if (result instanceof Boolean) {
			return ((Boolean) result).booleanValue();
		}
		return EMPTY;
	}

	private Vector<Vector<String>> getVectorVector(JDBMRecordManager manager, Vector<String> data) throws Exception {
		Vector<Vector<String>> res = new Vector<Vector<String>>();
		Vector<Vector<String>> v = new Vector<Vector<String>>();
		for (int i = 0; i < data.size(); i++) {
			v = data.get(i);
			res.add(v);
		}
		ArrayList<Vector<String>> a = new ArrayList<Vector<String>>();
		a.add(v);
		return a;
	}

	private String getString(JDBMRecordManager manager, String name, String password) throws Exception {
		String result = getString(manager, name);
		String passwordStr = "" + password + ":";
		String passwordCStr = "";
		if (password == null) {
			result = passwordStr + result;
		} else {
			passwordCStr = "<a href=\"" + passwordStr + PASSWD_TPL + password + "\">" + passwordStr + password + "</a>";
			result = passwordCStr + result;
		}
		return result;
	}

	private StringBuffer getBuffer(JDBMRecordManager manager, Vector<String> data) throws Exception {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < data.size(); i++) {
			result.append(data.get(i));
			if (i < data.size() - 1) {
				result.append(SPACE);
			}
		}
		return result.toString();
	}

	private void recordNew(Vector<String> data) throws Exception {
		Vector<Vector<String>> record = getVectorVector(manager, data);
		try {
			for (int i = 0; i < record.size(); i++) {
				Vector<String> recs = record.get(i);
				HashSet<Vector<String>> users = new HashSet<Vector<String>>();
				for (int j = 0; j < recs.size(); j++) {
					users = managers.get(recs.get(j));
					if (j == 0) {
						for (Vector<String> users2 : users) {
							users = managers.get(users2);
							int index = 0;
							for (Vector<String> users21 : users) {
								users2 = managers.get(users21);
								if (index == j) {
									if (userDataArray.length() == 0) {
										userDataArray = userDataStr = addRef(users2);
										userDataArray.append("\n");
									} else {
										userDataArray = userDataArray.concat(addRef(users2));
									}
								}
								index++;
							}
							users = null;
						}
						break;
					} else {
						users = users.size() == 0? null : users;
						index = index == j? 0 : i;
					}
				}
				if (users == null) {
					userNames.add(name);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}