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

// QuotaDetails.java
package net.sf.gaeappmanager.google.appengine;

import java.util.Date;

/**
 * Google App Engine application quota details.
 *
 * @author Alois Belaska
 */
public class QuotaDetails {

    /**
     * Retrieve quota details of application deployed in Google App Engine.
     *
     * @param userid full gmail address for user
     * @param password gmail account password
     * @param source name of application requesting quota details
     * @param application appspot application name
     * @return quota details of application
     * @throws Exception in case of failure
     */
    public static QuotaDetails retrieveAppQuotaDetails(String userid, String password, String source, String application) throws Exception {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        try {
            LogonHelper.logon(httpclient, userid, password);
            HttpGet httpget = new HttpGet("https://appengine.google.com/api/quotadetails?app_id=" + application);
            httpget.addHeader("X-appcfg-api-version", "1");
            httpget.addHeader("X-appcfg-source", source);
            HttpResponse response = httpclient.execute(httpget);
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new Exception("Failed to retrieve quota details for application " + application + ": " + response.getStatusLine());
            }
            return new QuotaDetails();
        } finally {
            httpclient.getConnectionManager().shutdown();
        }
    }
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
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_UseridNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails(null, "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid is empty.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_UseridEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the password is null.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_PasswordNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", null, "source", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the password is empty.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_PasswordEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the source is null.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_SourceNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", null, "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the source is empty.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_SourceEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", "", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the application is null.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_ApplicationNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", "source", null);
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the application is empty.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_ApplicationEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", "source", "");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the userid is invalid.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_UseridInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the password is invalid.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_PasswordInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
	
	/**
	 * Test case for {@link QuotaDetails#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the case when the application is invalid.
	 * Expected result: IllegalArgumentException.
	 */
	@Test
	void testRetrieveAppQuotaDetails_ApplicationInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			QuotaDetails.retrieveAppQuotaDetails("userid", "password", "source", "application");
		});
	}
}

// LogonHelper.java
package net.sf.gaeappmanager.google.appengine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/**
 * Google App Engine application manager.
 *
 * @author Alois Belaska
 */
public class LogonHelper {

    /**
     * Logon to Google App Engine.
     *
     * @param httpclient http client
     * @param userid full gmail address for user
     * @param password gmail account password
     * @throws Exception in case of failure
     */
    public static void logon(DefaultHttpClient httpclient, String userid, String password) throws Exception {
        HttpGet httpget = new HttpGet("https://www.google.com/accounts/ServiceLogin?service=ah&amp;passive=true&amp;continue=https://appengine.google.com/_ah/conflogin%3Fcontinue%3Dhttps://appengine.google.com/");
        HttpResponse response = httpclient.execute(httpget);
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new Exception("Failed to logon to Google App Engine: " + response.getStatusLine());
        }
        String content = EntityUtils.toString(response.getEntity());
        String galx = extractGalx(content);
        HttpPost httppost = new HttpPost("https://www.google.com/accounts/ServiceLoginAuth");
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("continue", "https://appengine.google.com/_ah/conflogin?continue=https://