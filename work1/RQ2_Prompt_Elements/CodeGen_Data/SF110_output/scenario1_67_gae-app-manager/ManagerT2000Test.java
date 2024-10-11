// ManagerTest.java
package net.sf.gaeappmanager.google.appengine;

import net.sf.gaeappmanager.google.LogonHelper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Manager}.
* It contains one unit test case for the {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
*/
class ManagerTest {
Manager manager;

		@Test
		public void getAppQuotaDetails(@TempDir String tempDir) throws Exception {
			manager = new Manager();
			String testUserid = LogonHelper.loginToGoogleAppEngine("TestLogon@appengine.google.com", "pwd", "");
			manager.retrieveAppQuotaDetails(testUserid, "pwd", "", "example");
			final QuotaDetails details = manager.retrieveAppQuotaDetails(testUserid, "pwd", "", "example");
			assertEquals("error code", HttpStatus.SC_OK, details.getErrorCode());
			assertNotNull("app quota number", details.getAppQuotaNumber());
			assertNotNull("app quota name", details.getAppQuotaName());
			assertNotNull("app quota unit", details.getAppQuotaUnit());
			assertNotNull("app quota units", details.getAppQuotaUnits());
			assertNotNull("application quota", details.getAppQuota());
		}

		@Test
		public void getAppQuotaDetailsWithWrongUser(@TempDir String tempDir) throws Exception {
			manager = new Manager();
			String testUserid = LogonHelper.loginToGoogleAppEngine("Other@appengine.google.com", "pwd", "");
			assertNull("userId", manager.retrieveAppQuotaDetails(testUserid, "pwd", "", ""));
		}

		@Test
		public void getAppQuotaDetailsWithWrongPassword(@TempDir String tempDir) throws Exception {
			manager = new Manager();
			String testUserid = LogonHelper.loginToGoogleAppEngine("UserId@appengine.google.com", "pwd", "");
			manager.retrieveAppQuotaDetails(testUserid, "pwd", "");
			assertNull("userId", manager.retrieveAppQuotaDetails(testUserid, "pwd", ""));
		}

		@Test
		public void getAppQuotaDetailsWithError(@TempDir String tempDir) throws Exception {
			manager = new Manager();
			String testUserid = LogonHelper.loginToGoogleAppEngine("Baduser@appengine.google.com", "pwd", "");
			assertNull("userId", manager.retrieveAppQuotaDetails(testUserid, "pwd", ""));
		}

		@Test
		public void getNoAppQuotaDetails(@TempDir String tempDir) throws Exception {
			manager = new Manager();
			String testUserid = LogonHelper.loginToGoogleAppEngine("userId@appengine.google.com", "pwd", "");
			assertNull("userId", manager.retrieveAppQuotaDetails(testUserid, "pwd", ""));
		}
}
