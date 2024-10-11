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
* It contains ten unit test cases for the {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
*/
class ManagerTest {

	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		String authCookie = "authCookie";
		
		LogonHelper logonHelper = new LogonHelper();
		LogonHelper spyLogonHelper = spy(logonHelper);
		doReturn(authCookie).when(spyLogonHelper).loginToGoogleAppEngine(userid, password, source);
		
		Manager manager = new Manager();
		Manager spyManager = spy(manager);
		doReturn(spyLogonHelper).when(spyManager).getLogonHelper();
		
		DefaultHttpClient client = new DefaultHttpClient();
		DefaultHttpClient spyClient = spy(client);
		doReturn(spyClient).when(spyManager).getHttpClient();
		
		HttpGet get = new HttpGet("https://appengine.google.com/dashboard/quotadetails?&app_id=" + application);
		HttpGet spyGet = spy(get);
		doReturn(spyGet).when(spyManager).getHttpGet(authCookie, application);
		
		HttpResponse response = new HttpResponse();
		HttpResponse spyResponse = spy(response);
		doReturn(spyResponse).when(spyClient).execute(spyGet);
		
		QuotaDetails quotaDetails = new QuotaDetails();
		QuotaDetailsParser quotaDetailsParser = new QuotaDetailsParser();
		QuotaDetailsParser spyQuotaDetailsParser = spy(quotaDetailsParser);
		doReturn(quotaDetails).when(spyQuotaDetailsParser).parse(spyResponse.getEntity().getContent());
		
		doReturn(spyQuotaDetailsParser).when(spyManager).getQuotaDetailsParser();
		
		QuotaDetails result = spyManager.retrieveAppQuotaDetails(userid, password, source, application);
		
		assertEquals(quotaDetails, result);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with null userid.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithNullUserid() throws Exception {
		String userid = null;
		String password = "password";
		String source = "source";
		String application = "application";
		
		Manager manager = new Manager();
		
		assertThrows(IllegalArgumentException.class, () -> {
			manager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with empty userid.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithEmptyUserid() throws Exception {
		String userid = "";
		String password = "password";
		String source = "source";
		String application = "application";
		
		Manager manager = new Manager();
		
		assertThrows(IllegalArgumentException.class, () -> {
			manager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with null password.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithNullPassword() throws Exception {
		String userid = "userid";
		String password = null;
		String source = "source";
		String application = "application";
		
		Manager manager = new Manager();
		
		assertThrows(IllegalArgumentException.class, () -> {
			manager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with empty password.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithEmptyPassword() throws Exception {
		String userid = "userid";
		String password = "";
		String source = "source";
		String application = "application";
		
		Manager manager = new Manager();
		
		assertThrows(IllegalArgumentException.class, () -> {
			manager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with null source.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithNullSource() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = null;
		String application = "application";
		
		Manager manager = new Manager();
		
		assertThrows(IllegalArgumentException.class, () -> {
			manager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with empty source.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithEmptySource() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "";
		String application = "application";
		
		Manager manager = new Manager();
		
		assertThrows(IllegalArgumentException.class, () -> {
			manager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with null application.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithNullApplication() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = null;
		
		Manager manager = new Manager();
		
		assertThrows(IllegalArgumentException.class, () -> {
			manager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with empty application.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithEmptyApplication() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "";
		
		Manager manager = new Manager();
		
		assertThrows(IllegalArgumentException.class, () -> {
			manager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with invalid userid.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithInvalidUserid() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		String authCookie = "authCookie";
		
		LogonHelper logonHelper = new LogonHelper();
		LogonHelper spyLogonHelper = spy(logonHelper);
		doThrow(new Exception()).when(spyLogonHelper).loginToGoogleAppEngine(userid, password, source);
		
		Manager manager = new Manager();
		Manager spyManager = spy(manager);
		doReturn(spyLogonHelper).when(spyManager).getLogonHelper();
		
		assertThrows(Exception.class, () -> {
			spyManager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with invalid password.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithInvalidPassword() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		String authCookie = "authCookie";
		
		LogonHelper logonHelper = new LogonHelper();
		LogonHelper spyLogonHelper = spy(logonHelper);
		doThrow(new Exception()).when(spyLogonHelper).loginToGoogleAppEngine(userid, password, source);
		
		Manager manager = new Manager();
		Manager spyManager = spy(manager);
		doReturn(spyLogonHelper).when(spyManager).getLogonHelper();
		
		assertThrows(Exception.class, () -> {
			spyManager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with invalid source.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithInvalidSource() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		String authCookie = "authCookie";
		
		LogonHelper logonHelper = new LogonHelper();
		LogonHelper spyLogonHelper = spy(logonHelper);
		doThrow(new Exception()).when(spyLogonHelper).loginToGoogleAppEngine(userid, password, source);
		
		Manager manager = new Manager();
		Manager spyManager = spy(manager);
		doReturn(spyLogonHelper).when(spyManager).getLogonHelper();
		
		assertThrows(Exception.class, () -> {
			spyManager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with invalid application.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetailsWithInvalidApplication() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		String authCookie = "authCookie";
		
		LogonHelper logonHelper = new LogonHelper();
		LogonHelper spyLogonHelper = spy(logonHelper);
		doReturn(authCookie).when(spyLogonHelper).loginToGoogleAppEngine(userid, password, source);
		
		Manager manager = new Manager();
		Manager spyManager = spy(manager);
		doReturn(spyLogonHelper).when(spyManager).getLogonHelper();
		
		DefaultHttpClient client = new DefaultHttpClient();
		DefaultHttpClient spyClient = spy(client);
		doReturn(spyClient).when(spyManager).getHttpClient();
		
		HttpGet get = new HttpGet("https://appengine.google.com/dashboard/quotadetails?&app_id=" + application);
		HttpGet spyGet = spy(get);
		doReturn(spyGet).when(spyManager).getHttpGet(authCookie, application);
		
		HttpResponse response = new HttpResponse();
		HttpResponse spyResponse = spy(response);
		doReturn(spyResponse).when(spyClient).execute(spyGet);
		
		QuotaDetails quotaDetails = new QuotaDetails();
		QuotaDetailsParser quotaDetailsParser = new QuotaDetailsParser();
		QuotaDetailsParser spyQuotaDetailsParser = spy(quotaDetailsParser);
		doThrow(new Exception()).when(spyQuotaDetailsParser).parse(spyResponse.getEntity().getContent());
		
		doReturn(spyQuotaDetailsParser).when(spyManager).getQuotaDetailsParser();
		
		assertThrows(Exception.class, () -> {
			spyManager.retrieveAppQuotaDetails(userid, password, source, application);
		});
	}
}

// QuotaDetails.java
package net.sf.gaeappmanager.google.appengine;

import java.util.Date;

/**
 * Quota details of application deployed in Google App Engine.
 *
 * @author Alois Belaska
 */
public class QuotaDetails {

    private Date startTime;
    private Date endTime;
    private int totalRequests;
    private int totalBandwidth;
    private int totalErrors;
    private int totalCPU;
    private int totalDatastoreRead;
    private int totalDatastoreWrite;
    private int totalDatastoreSmallRead;
    private int totalDatastoreSmallWrite;
    private int totalDatastoreLargeRead;
    private int totalDatastoreLargeWrite;
    private int totalDatastoreCost;
    private int totalMemcacheRead;
    private int totalMemcacheWrite;
    private int totalMemcacheCost;
    private int totalBlobstoreRead;
    private int totalBlobstoreWrite;
    private int totalBlobstoreCost;
    private int totalTaskqueuePush;
    private int totalTaskqueueLeased;
    private int totalTaskqueueCost;
    private int totalMailInbound;
    private int totalMailOutbound;
    private int totalMailCost;
    private int totalXMPPInbound;
    private int totalXMPPOutbound;
    private int totalXMPPCost;
    private int totalChannelConnect;
    private int totalChannelMessage;
    private int totalChannelCost;
    private int totalURLFetch;
    private int totalURLFetchCost;
    private int totalURLFetchBandwidth;
    private int totalImageAPI;
    private int totalImageAPICost;
    private int totalImageAPIBandwidth;
    private int totalImageAPICacheHit;
    private int totalImageAPICacheMiss;
    private int totalImageAPICacheCost;
    private int totalImageAPICacheBandwidth;
    private int totalLogs;
    private int totalLogsCost;
    private int totalLogsBandwidth;
    private int totalDatastoreEntities;
    private int totalDatastoreEntityGroups;
    private int totalDatastoreEntityGroupsCost;
    private int totalDatastoreEntityGroupsWrite;
    private int