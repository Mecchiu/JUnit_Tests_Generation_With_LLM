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
	 * Expected result: {@link IllegalArgumentException} is thrown.
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
	 * Expected result: {@link IllegalArgumentException} is thrown.
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
	 * Expected result: {@link IllegalArgumentException} is thrown.
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
	 * Expected result: {@link IllegalArgumentException} is thrown.
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
	 * Expected result: {@link IllegalArgumentException} is thrown.
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
	 * Expected result: {@link IllegalArgumentException} is thrown.
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
	 * Expected result: {@link IllegalArgumentException} is thrown.
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
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_ApplicationEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "password", "source", "");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid is not a valid gmail address.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_UseridNotGmail() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid is a valid gmail address, but the password is incorrect.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_PasswordIncorrect() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid@gmail.com", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid is a valid gmail address, the password is correct, but the application does not exist.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_ApplicationNotExist() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid@gmail.com", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid is a valid gmail address, the password is correct, the application exists, but the user is not authorized to access it.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_UserNotAuthorized() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid@gmail.com", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid is a valid gmail address, the password is correct, the application exists, the user is authorized to access it, but the source is not authorized to access it.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_SourceNotAuthorized() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid@gmail.com", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid is a valid gmail address, the password is correct, the application exists, the user is authorized to access it, the source is authorized to access it, but the application is not deployed.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_ApplicationNotDeployed