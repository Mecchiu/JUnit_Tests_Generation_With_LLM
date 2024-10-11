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
// ManagedBy
    private String userid = null;
		// ManagedBy
    private String password = null;
		// ManagedBy
    private String source = null;
		// ManagedBy
    private String application = null;
			
    @Test
	public void ensureAppQuotaDetails(){
		QuotaDetails qd = null;
		// Get data
        DefaultHttpClient httpClient = new DefaultHttpClient();
                HttpResponse r = null;
				try {
					// Get GET method
					HttpGet httpGet = new HttpGet("https://www.googleapis.com/gmail/v1/users/"+userid+"/quota/"+application+"/"+source);
					r = httpClient.execute(httpGet);
                } catch (Exception e) {
                        assertFalse(true);// do nothing
                }
                assertTrue(r.getStatusLine().getStatusCode()==200);
				assertTrue(LogonHelper.checkQuota(userid, password, source));
				
    }
}

