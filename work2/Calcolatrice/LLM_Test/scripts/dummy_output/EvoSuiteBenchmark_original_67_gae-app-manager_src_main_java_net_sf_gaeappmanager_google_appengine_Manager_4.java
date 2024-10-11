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
		/**
		 * Retrieves quota details of application deployed in Google App Engine.
		 *
		 * @param userid
		 *            full gmail address for user
		 * @param password
		 *            gmail account password
		 * @param source
		 *            name of application requesting quota details
		 * @param application
		 *            appspot application name
		 * @throws Exception
		 *             in case of failure
		 */
		@Test
		public final void testRetrieveAppQuotaDetails() throws Exception {
			LogonHelper.logonUser();
			DefaultHttpClient httpclient = new DefaultHttpClient();
			HttpGet httpget = new HttpGet(Manager.retrieveAppQuotaDetails.getEndpoint() + "/" + source + "/" + application);
			HttpResponse response1 = httpclient.execute(httpget);
			String responseString1 = response1.getEntity().toString();
			assertNotNull(responseString1);
			assertNotNull(httpget);
			assertNotNull(httpclient);
			LogonHelper.logout();
			LogonHelper.logonUser();
		}
}