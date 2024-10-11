// Here's an example implementation of the Manager class and its test class:

// Manager.java
package net.sf.gaeappmanager.google.appengine;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Google App Engine application manager.
 *
 * @author Alois Belaska
 */
public class Manager {

    /**
     * Retrieve quota details of application deployed in Google App Engine.
     *
     * @param userid full gmail address for user
     * @param password gmail account password
     * @param source name of application requesting quota details
     * @param application appspot application name
     * @return quota details of application
     * @throws Exception in case of failure
     */
    public static QuotaDetails retrieveAppQuotaDetails(String userid, String password, String source, String application) throws Exception {
        // Log in to the user's Google account
        LogonHelper logonHelper = new LogonHelper();
        logonHelper.login(userid, password);

        // Construct the URL to retrieve the quota details
        String url = "https://appengine.google.com/api/appversion/get_quotas?app_id=" + application;

        // Set up the HTTP request
        HttpGet request = new HttpGet(url);
        request.setHeader("Authorization", "GoogleLogin auth=" + logonHelper.getAuthToken());
        request.setHeader("User-Agent", source);

        // Send the HTTP request and get the response
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpResponse response = httpClient.execute(request);

        // Parse the response and return the quota details
        QuotaDetails quotaDetails = QuotaDetails.parse(response.getEntity().getContent());
        return quotaDetails;
    }
}

// ManagerTest.java
package net.sf.gaeappmanager.google.appengine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Manager}.
 * It contains ten unit test cases for the {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
 */
class ManagerTest {

    @Test
    void testRetrieveAppQuotaDetails() throws Exception {
        // Test case 1: Valid input
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails("user@gmail.com", "password", "MyApp", "myapp");
        assertNotNull(quotaDetails);
        assertEquals(1000000, quotaDetails.getDailyBudget());
        assertEquals(1000000, quotaDetails.getDailyUsage());
        assertEquals(10000000, quotaDetails.getStorageLimit());
        assertEquals(1000000, quotaDetails.getStorageUsage());

        // Test case 2: Invalid user ID
        assertThrows(Exception.class, () -> {
            Manager.retrieveAppQuotaDetails("", "password", "MyApp", "myapp");
        });

        // Test case 3: Invalid password
        assertThrows(Exception.class, () -> {
            Manager.retrieveAppQuotaDetails("user@gmail.com", "", "MyApp", "myapp");
        });

        // Test case 4: Invalid source
        assertThrows(Exception.class, () -> {
            Manager.retrieveAppQuotaDetails("user@gmail.com", "password", "", "myapp");
        });

        // Test case 5: Invalid application
        assertThrows(Exception.class, () -> {
            Manager.retrieveAppQuotaDetails("user@gmail.com", "password", "MyApp", "");
        });

        // Test case 6: Non-existent application
        assertThrows(Exception.class, () -> {
            Manager.retrieveAppQuotaDetails("user@gmail.com", "password", "MyApp", "nonexistentapp");
        });

        // Test case 7: Insufficient permissions
        assertThrows(Exception.class, () -> {
            Manager.retrieveAppQuotaDetails("user2@gmail.com", "password2", "MyApp", "myapp");
        });

        // Test case 8: Server error
        assertThrows(Exception.class, () -> {
            Manager.retrieveAppQuotaDetails("user@gmail.com", "password", "MyApp", "servererror");
        });

        // Test case 9: Network error
        assertThrows(Exception.class, () -> {
            Manager.retrieveAppQuotaDetails("user@gmail.com", "password", "MyApp", "networkerror");
        });

        // Test case 10: Timeout
        assertThrows(Exception.class, () -> {
            Manager.retrieveAppQuotaDetails("user@gmail.com", "password", "MyApp", "timeout");
        });
    }
}