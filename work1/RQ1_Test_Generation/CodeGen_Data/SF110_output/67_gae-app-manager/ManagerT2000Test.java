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
@SuppressWarnings("unused")
	private final static String source = "testApp";
	@SuppressWarnings("javadoc")
	private final static String application  = "testApp";

	/**
	 * Tests retrieving quota details of application deployed in Google AppEngine.
	 *
	 * @throws Exception in case of failure.
	 */
	@Test
	void testRetrieveAppQuotaDetails() throws Exception{
        Manager manager = new Manager();
        manager.setAuthenticationHandler(new GoogleLoginAuthHandler());
		QuotaDetails quotaDetails = manager.retrieveAppQuotaDetails(LogonHelper.getUserId(), LogonHelper.getPassword(), LogonHelper.getSource(), application);
        // Verify the result of QuotsApi.get
        assertNotNull(quotaDetails);
        // Verification of QuotsApi.getAppQuota
        assertNotNull(quotaDetails.getAppQuota());
        assertEquals(quotaDetails.getAppQuota().getAppId(), application);
        assertEquals(quotaDetails.getAppQuota().getAppName(), source);
        // Verification of QuotsApi.updateAppQuota
        assertEquals(quotaDetails.getAppQuota().getQuota(), 100);

    }
}