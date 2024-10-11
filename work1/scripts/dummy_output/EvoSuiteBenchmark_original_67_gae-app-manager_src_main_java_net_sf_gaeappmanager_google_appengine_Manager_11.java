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
		 * Test method for {@link net.sf.gaeappmanager.google.appengine.Manager#retrieveAppQuotaDetails(String, String, String, String)}.
		 * 
		 * @throws Exception
		 */
	@Test
	public void testRetrieveAppQuotaDetails() throws Exception {
			HttpGet get = new HttpGet("");
			String source = "";
			String application = "";

			Manager manager = new Manager();

			QuotaDetails quotaDetails = manager.retrieveAppQuotaDetails(LogonHelper.getLocalUserId(),LogonHelper.getLocalUserPassword(),source,application);
			
			assertNotNull(quotaDetails);
			assertTrue(quotaDetails.getQuotaBytes() > 0);
			assertTrue(quotaDetails.getResourceBytes() > 0);
			assertTrue(quotaDetails.getInstanceBytes() > 0);
			assertTrue(quotaDetails.getProjectBytes() > 0);
	}

		/**
		 * Test method for {@link net.sf.gaeappmanager.google.appengine.Manager#retrieveAppQuotaDetails(String, String, String, String)}.
		 * 
		 * @throws Exception
		 */
	@Test
	public void testRetrieveAppQuotaDetailsWithGmail() throws Exception {
			Manager manager = new Manager();

			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpGet get = new HttpGet("https://api.google.com/appengine/v1/quota?service=appstatistics&application=localhost%3Fdomain%3Ffqe.appmanager.google.com%3A%7B%5Bdomain%5D%2Ffqe.qe.appmanager.google.com%3A%2Ffqe.qe.appadmin.google.com%3A%2Ffqe.qe.fqe.app.%7Bdomain%22%7D%3B%2Ffqe.pk.appadmin.google.com%3A%2Ffqe.pk.appmanager.google.com%3A%2Ffqe.pk.appadmin.google.com%3A%2Ffqe.pk.app.%7Bdomain%22%7D" ;
			HttpResponse httpResponse = null ; 
			try {
				get = new HttpGet(get.getURI().toString()+"&callback="+get.getURI().toString()+"&type=instance");
				httpResponse = httpClient.execute(get);
				assertTrue(LogonHelper.getResponseCode(httpResponse) > 500 && LogonHelper.getResponseCode(httpResponse) < 600 &&
					get.getURI().toString().contains("access_token=") && LogonHelper.getResponseHeader("set-cookie", "http-proxy", httpResponse)
						.contains("Google App Engine"));
				assertTrue(LogonHelper.getResponseCode(httpResponse) >= 400 && LogonHelper.getResponseCode(httpResponse) <= 600);
			} catch (Exception e) {
				assertTrue(httpResponse!= null);
			}
			assertTrue(httpClient.getHostConfiguration() instanceof DefaultHttpClient);
			manager = ((DefaultHttpClient)httpClient.getHostConfiguration()).getDefaultHttpClient();
			manager.setFollowRedirect(true);
			manager.setHttpClient(httpClient);
			quotaDetails = manager.retrieveAppQuotaDetails(LogonHelper.getLocalUserId(),LogonHelper.getLocalUserPassword(),source,application);
			
			assertNotNull(quotaDetails);
			assertTrue(quotaDetails.getQuotaBytes() > 0);
			assertTrue(quotaDetails.getResourceBytes() > 0);
			assertTrue(quotaDetails.getInstanceBytes() > 0);
			assertTrue(quotaDetails.getProjectBytes() > 0);
	}
}