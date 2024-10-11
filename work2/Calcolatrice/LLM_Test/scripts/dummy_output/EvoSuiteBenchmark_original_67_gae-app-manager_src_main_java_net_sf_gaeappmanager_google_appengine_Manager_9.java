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
     * Test of the retrieved quota detail.
     */
    @Test
    void
    Test_retrieveAppQuotaDetails_Succeeds() throws Exception {
        LogonHelper.addLogin(DefaultHttpClient.getConnectionPoolTimeout(), DefaultHttpClient.getConnectionTimeout());
        Manager manager = new Manager();
        QuotaDetails quotaDetails = manager.retrieveAppQuotaDetails("admin", "admin", "google/appdeploy", "appdeploy");
		assertNotNull(quotaDetails);
    }

    /**
     * Test of the retrieved quota detail.
     */
    @Test
    void
    Test_retrieveAppQuotaDetails_NoResponse_ThrowException() throws Exception {
        Manager manager = new Manager();
        try {
            manager.retrieveAppQuotaDetails("admin", "admin", "", "");
        } catch (Exception e) {
            fail("Check quota details call failed, the client should throw exception");
        }
    }

    /**
     * Test of the retrieved quota detail.
     */
    @Test
    void
    Test_retrieveAppQuotaDetails_ResponseException_ThrowException() throws Exception {
        Manager manager = new Manager();
        try {
            manager.retrieveAppQuotaDetails("admin", "admin", "google/appdeploy", "appdeploy");
        } catch (Exception e) {
            fail("Check quota details call failed, the client should throw exception");
        }
    }

    /**
     * Test of the retrieved quota detail.
     */
    @Test
    void
    Test_retrieveAppQuotaDetails_ThrowNonExistResponseException_ThrowNullPointerException() throws Exception {
        Manager manager = new Manager();
        try {
            manager.retrieveAppQuotaDetails("admin", "admin", "google/appdeploy", "");
        } catch (Exception e) {
            if (!ExceptionHelper.exists(e) ||!ExceptionHelper.isNullPointerException(e)) {
                fail("Retrieved quota detail from response should throw NullPointerException");
            }
        }
    }

}