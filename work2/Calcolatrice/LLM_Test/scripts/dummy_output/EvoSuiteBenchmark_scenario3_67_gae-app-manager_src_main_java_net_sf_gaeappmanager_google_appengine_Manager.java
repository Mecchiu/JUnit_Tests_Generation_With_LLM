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
	 * It tests the case when the userid is null.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_UseridNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails(null, "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid is empty.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_UseridEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the password is null.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_PasswordNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", null, "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the password is empty.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_PasswordEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the source is null.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_SourceNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "password", null, "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the source is empty.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_SourceEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "password", "", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the application is null.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_ApplicationNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "password", "source", null);
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the application is empty.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_ApplicationEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "password", "source", "");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid is invalid.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_UseridInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the password is invalid.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_PasswordInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the application is invalid.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_ApplicationInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
}