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

    // Test methods
    private final DefaultHttpClient client = new DefaultHttpClient();

	@Test
	public void testRetrieveAppQuotaDetails() throws Exception {
		
		// test Google App Engine client
        assertEquals(LogonHelper.get().getAccountType(), AppEngineManager.get().getUserInfo().getAccountType());
        
        HttpGet method = new HttpGet(AppEngineManager.get().getUserInfo().getAppend("Quota.metrics"));
        
        // execute the GET
        HttpResponse response;
        try {
            response = (HttpResponse)client.execute(method);
        }
        catch(Exception e) {
            e.printStackTrace();
            return;
        }
        
        HttpResponse getResponse = (HttpResponse)client.execute(method);
        // check size of response
		assertEquals(200, getResponse.getStatusLine().getStatusCode());
		
		assertTrue("Response from google app engine is valid", response.hasEntity());

		assertEquals("200 OK", response.getStatusLine().toString());
		
		// we can read the information from http response
		// and can determine the expected values, we are not interested in the information
		LogonHelper.get().resetAccount(AppEngineManager.get().getUserInfo().getEmail());
		LogonHelper.get().resetAccount(AppEngineManager.get().getUserInfo().getPassword());
				
        // retrieve the quota details from google app engine
        QuotaDetails details = manager.retrieveAppQuotaDetails(AppEngineManager.get().getUserInfo().getEmail(), AppEngineManager.get().getUserInfo().getPassword(), "GAAppEngine", "Gaa");
        // check if the correct amount of information was extracted
        assertEquals(AppEngineManager.get().getUserInfo().getEmail(), details.getAppend("Email"));
        assertEquals(AppEngineManager.get().getUserInfo().getPassword(), details.getAppend("Password"));
        assertEquals(1, details.getCount().longValue());
	}
}