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
		ManagerTest(){}

    /**
     * Test method that test for retrieval app quota details.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    public void testRetrieveAppQuotaDetails() throws Exception {

        defaultTestSetup();
        String query = "https://spreadsheets.google.com/feeds/users/b4jKD9qBtV7gjb8z5nLrOgE6HwK6VU6gv/public%20dimensions"
                   + "/web/entries?key%3Dalluxiumquota&alt%3Djson";
        HttpGet   get = new HttpGet("https://spreadsheets.google.com/feeds/users/b4jKD9qBtV7gjb8z5nLrOgE6HwK6VU6gv");
        HttpResponse response =  DefaultHttpClient.newHttpConnection().execute(get);
        assertEquals(200, response.getStatusLine().getStatusCode());
        String text = retrieveAppQuotaDetails(LogonHelper.getActiveUserId(),LogonHelper.getActivePassword(), "alluxiumquota", "web");
        String expected = LogonHelper.appQuota("web", "alluxiumquota");
        assertTrue(( text.equals(expected) && response.getFirstHeader("Content-Type").contains("text/plain"))) : "Invalid result";

    }

    private void defaultTestSetup() throws Exception {
        defaultSetup();
    }

    private void defaultSetup() throws Exception {
        String query = "https://spreadsheets.google.com/feeds/users/b4jKD9qBtV7gjb8z5nLrOgE6HwK6VU6gv/public%20dimensions"
                   + "/web/extenant?key%3Dalluxiumquota&alt%3Djson";
        HttpGet   get = new HttpGet("https://spreadsheets.google.com/" + "b4jKD9qBtV7gjb8z5nLrOgE6HwK6VU6gv");
        HttpResponse response =  DefaultHttpClient.newHttpConnection().execute(get);
        assertEquals(200, response.getStatusLine().getStatusCode());
        String text = retrieveAppQuotaDetails("someuserid", "somepassword", "alluxiumquota", "web");
        String expected = LogonHelper.appQuota("someuserid", "somepassword");
        assertTrue(( text.equals(expected) && response.getFirstHeader("Content-Type").contains("text/plain"))) : "Invalid result";
    }

}