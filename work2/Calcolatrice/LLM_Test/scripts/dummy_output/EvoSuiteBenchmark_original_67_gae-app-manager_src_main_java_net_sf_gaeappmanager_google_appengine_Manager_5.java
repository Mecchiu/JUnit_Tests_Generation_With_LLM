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
     * Retrieve quota details of application deployed in Google App Engine.
     *
     * The method prepares http request and post to url.
     * @param  userId
     * @param  password
     * @param  applicationQuery
     * @return quota details of Application
     * @throws Exception
     *             on failure.
     */
    @Test
    public void testRetrieveAppQuotaDetails(String userId, String password, String applicationQuery) throws Exception;
    
    /**
     * Sets up an application in Google App Engine. 
     * 
     * @param  userId
     * @param  password
     * @param  source
     * @param  application
     */
    @Test
    public void testRetrieveAppQuotaDetails_SuccessfullyUpload(String userId, String password, String source, String application);
}