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
	 * Test of retrieveAppQuotaDetails method, of class Manager.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails() throws Exception {
		System.out.println("retrieveAppQuotaDetails");
		String userid = "";
		String password = "";
		String source = "";
		String application = "";
		QuotaDetails expResult = null;
		QuotaDetails result = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}