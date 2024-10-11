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
		private User firstUser = getUser("test", "test@gmail.com", "userId@gmail.com");
		private User secondUser = getUser("test", "test@gmail.com", "userId2@gmail.com");
		private Vector users = new Vector();
		private HashSet result1 = new HashSet();
		private HashSet result2 = new HashSet();

		@Test
		public void getUser1Test1() {
			assertNotNull(firstUser);
			assertEquals("test", firstUser.getOrgName());
			assertEquals("test", firstUser.getUserName());
			assertEquals("userId@gmail.com", firstUser.getEmail());
			assertEquals("userId", firstUser.getUserId());
		}

		@Test (expected = NullPointerException.class)
		public void getUser1Test2() {
			SimpleUserMgr.getUser(null, null, null);
		}

		@Test
		public void getUser1Test3() {
			SimpleUserMgr.getUser("", null, null);
		}

		@Test
		public void getUser1Test4() {
			ArrayList usersList = new ArrayList((Vector) firstUser);
			String orgName = (String) (usersList.get(0));
			ArrayList emailNames = (ArrayList) (usersList.get(1));
			final String email = (String) (emailNames.get(0));

			ArrayList expectedResult = userList(firstUser.getOrgName(),
                    firstUser.getOrgId(),
                    firstUser.getUserName(),
                    firstUser.getEmail(),
                    firstUser.getUserId());
			assertEquals((Vector)expectedResult, users);
		}

		@Test
		public void getUser2Test1() {
			ArrayList emailNames = (ArrayList) firstUser.getUsers();
			Vector userList = (Vector) userNames(emailNames);
			assertEquals((Integer) 4, ((Integer)(userList.get(0))).intValue());
			assertEquals((Integer) 1, ((Integer)(userList.get(1))).intValue());
			assertEquals((Integer) 0, ((Integer)(userList.get(2))).intValue());
			assertEquals((Integer) 0, ((Integer)(userList.get(3))).intValue());
		}

		@Test
		public void getUser2Test2() {
			ArrayList emailNames = (ArrayList) firstUser.getUsers();
			String orgName = (String) (emailNames.get(0));
			assertEquals("userId@gmail.com", firstUser.getOrgName());
			assertEquals("userId@gmail.com", firstUser.getOrgId());
			assertEquals("userId", firstUser.getUserId());
		}

		@Test
		public void getUser2Test3() {
			Vector orgNames = new Vector();
			String orgName = (String)firstUser.getOrgName();

			Vector users = firstUser.getUsers();
			Vector userList = new Vector();
			Vector usersAfter = new Vector();
			if (users == null) {
				userList = firstUser.getUsers();
				userList.add(firstUser);
			} else {
				userList = users;
				userList.add(firstUser);
			}

			for (int i=0; i< orgNames.size(); i++) {
				String orgName = (String)orgNames.get(i);
				Vector usersInOrg1 = (Vector)jdbmManager.getUser(jdbmManager, orgName,
                        orgName, orgId(orgName, firstUser.getOrgId()));
				Vector usersInOrg2= null;
				if ((usersInOrg2 = (Vector)jdbmManager.getUser(jdbmManager, orgName,
                        firstUser.getOrgId(),
                        firstUser.getUserId()))) {
					userList.addAll(usersInOrg2);
				} else {
					userList.add(firstUser);
				}
				Vector userNames = (Vector) jdbmManager.getUserNames(jdbmManager, orgName,
			            orgId(orgName, firstUser.getOrgId()));

				if ((userList.size() > 0) &&
				    ((String)userList.get(userList.size()-
				                        ((Vector)userList.get(userList.size()-1)).get(0)).split(":")[0] == firstUser.getUserName()))
					usersInOrg2 = (Vector) jdbmManager.getUser(jdbmManager, orgName,
			                    orgName, orgId(orgName, firstUser.getOrgId()));
				userList.addAll(usersInOrg2);

			}

			ArrayList result = new ArrayList();
			for (int i=1; i< users.size(); i++) {
				result.add(userList.indexOf(((User)users.get(i)).getUsers().iterator()));
			}
			assertEquals(result.size(),
			             (orgNames.size() + users.size()));
			String user1 = users.indexOf(((User)firstUser.getUsers().iterator()).getUsers().iterator()).toString();
			String user2 = users.indexOf(((User)firstUser.getUsers().iterator()).getUsers().iterator().next()).toString();

			assertEquals(user1, firstUser.getOrgName());
			assertEquals(orgName, firstUser.getOrgName());
			assertEquals(user2, firstUser.getOrgName());
            assertEquals(result1.size(), result.size());

			Vector userList1 = (Vector) result1.clone();
			ArrayList expectedResult1 = new Vector(
			        Vector.newInstance(
			                "orgName",
			                firstUser.getOrgName(),
			                Vector.newInstance(
			                        firstUser.getEmail(),
			                        firstUser.getUserEmail()
			                )),
			        Vector.newInstance(
			                firstUser.getUserName(),
			                firstUser.getOrgName(),
			                Vector.newInstance(
			                        firstUser.getOrgId(),
			                        firstUser.getOrgId()
			                )));
			assertEquals(userList1, expectedResult1);
		}

		@Test
		public void getUser1Test4() {
			assertNotNull(firstUser);
			assertEquals("test", firstUser.getOrgName());
			assertEquals("test", firstUser.getUserName());
}
}