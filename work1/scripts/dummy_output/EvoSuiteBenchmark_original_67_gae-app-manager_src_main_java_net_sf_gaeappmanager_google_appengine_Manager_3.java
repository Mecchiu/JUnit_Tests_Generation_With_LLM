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
		
	private final String application;
	
	private final String source;
	
	
	public ManagerTest(String application, String source) {
		this.application = application;
		this.source = source;
	}
	
	/**
	 * Method for retrieving quota details of application deployed in Google App Engine.
	 * @throws Exception 
	 *             if an exception occured while trying to get quota details
	 */
	@org.junit.jupiter.api.Test
	void testRetrieveAppQuotaDetails(){
		
		final DefaultHttpClient httpClient = new DefaultHttpClient();
		final HttpGet method = new HttpGet(String.format("https://www.google.com/tpc/v2/quotas/%s", application));
		final HttpResponse response =  httpClient.execute(method);
	    final QuotaDetails info = LogonHelper.getInstance().retrieveAppQuotaDetails(LogonHelper.username(LogonHelper.gmailUrl(request)), password, application, source);
		
		assertNotNull(info);
		assertEquals(response.getStatusLine().getStatusCode(), 200);
		assertNotNull(response.getFirstHeader("Content-Type"));
		assertEquals(info.getContentType(), response.getFirstHeader("Content-Type").getValue());
		assertNotNull(response.getFirstHeader("X-Requested-With"));
		assertEquals(info.getXmlContentType(), response.getFirstHeader("X-Requested-With").getValue());
		
	}
	

}