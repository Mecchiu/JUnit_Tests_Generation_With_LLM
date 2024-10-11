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
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails1() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails2() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails3() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails4() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails5() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails6() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails7() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails8() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails9() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails10() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails =