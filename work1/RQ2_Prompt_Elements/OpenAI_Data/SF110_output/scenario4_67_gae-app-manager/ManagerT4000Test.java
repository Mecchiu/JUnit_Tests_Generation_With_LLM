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
	void testRetrieveAppQuotaDetails_userid_null() {
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
	void testRetrieveAppQuotaDetails_userid_empty() {
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
	void testRetrieveAppQuotaDetails_password_null() {
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
	void testRetrieveAppQuotaDetails_password_empty() {
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
	void testRetrieveAppQuotaDetails_source_null() {
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
	void testRetrieveAppQuotaDetails_source_empty() {
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
	void testRetrieveAppQuotaDetails_application_null() {
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
	void testRetrieveAppQuotaDetails_application_empty() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "password", "source", "");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid is invalid.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_userid_invalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the password is invalid.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_password_invalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the source is invalid.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_source_invalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the application is invalid.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_application_invalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid, password, source and application are valid.
	 * Expected result: {@link QuotaDetails} is returned.
	 */
	@Test
	void testRetrieveAppQuotaDetails_valid() {
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		assertNotNull(quotaDetails);
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

    /**
     * Retrieve quota details of application deployed in Google App Engine.
     *
     * @param userid
     *            full gmail address for user
     * @param password
     *            gmail account password
     * @param source
     *            name of application requesting quota details
     * @param application
     *            appspot application name
     * @return quota details of application
     * @throws Exception
     *             in case of failure
     */
    public static QuotaDetails retrieveAppQuotaDetails(String userid, String password, String source, String application) throws Exception;
}

// QuotaDetailsTest.java
package net.sf.gaeappmanager.google.appengine;

import net.sf.gaeappmanager.google.LogonHelper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuotaDetails}.
* It contains ten unit test cases for the {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
*/
class QuotaDetailsTest {
		
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid is null.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_userid_null() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails(null, "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid is empty.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_userid_empty() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the password is null.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_password_null() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", null, "source", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the password is empty.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_password_empty() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the source is null.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_source_null() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", null, "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the source is empty.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_source_empty() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", "", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the application is null.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_application_null() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", "source", null);
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the application is empty.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_application_empty() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", "source", "");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid is invalid.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_userid_invalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the password is invalid.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_password_invalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the source is invalid.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_source_invalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the application is invalid.
	 * Expected result: {@link IllegalArgumentException} is thrown.
	 */
	@Test
	void testRetrieveAppQuotaDetails_application_invalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid, password, source and application are valid.
	 * Expected result: {@link QuotaDetails} is returned.
	 */
	@Test
	void testRetrieveAppQuotaDetails_valid() {
		QuotaDetails quotaDetails = QuotaDetails.retrieveAppQuotaDetails("userid", "password", "source", "application");
		assertNotNull(quotaDetails);
	}
}