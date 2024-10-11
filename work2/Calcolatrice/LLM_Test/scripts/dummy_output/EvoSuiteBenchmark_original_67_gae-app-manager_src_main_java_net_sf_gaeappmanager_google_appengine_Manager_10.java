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
		
	@Test
	public void retrievAppRqstqDetails() throws Exception {
		
		DefaultHttpClient client = LogonHelper.getClient("google", "demo", "demo", "demo", "webmaster", "demo", "demo");
		HttpGet get = new HttpGet("/appengine/quota");
		get.setHeader("Accept", "text/html");
		HttpResponse response = client.execute(get);
		assertEquals(200, response.getStatusLine().getStatusCode());
		assertNotNull("Expecting response from API", response);


		//Retrieve quota details of application deployed in Google App Engine.
		//Get the quota details.
	        String queryString ="";
	        //We append userId and sourceId parameter into this method.
	    	queryString ="?userId="+userid+"&sourceId="+source;
		//We send the query string.
		HttpGet result = new HttpGet(queryString);
		result.setHeader("User-agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_3) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/14.0.814.64 Safari/535.1");
		HttpResponse response2 = client.execute(result);
		assertEquals(200,response2.getStatusLine().getStatusCode());
		assertNotNull("Expecting success of retrieving quota details of application",response2);

		//Retrieve quota details of application deployed in Google App Engine.
		LogonHelper.login(client, password);
		//The quota details of application deployed in Google App Engine shall be retrieved.
		QuotaDetails applicationDetails = manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNotNull(
        		"Expecting 'Retrieving quota details' message",
        		"Expecting retrieving quota details of application",
        		applicationDetails);

	}
}