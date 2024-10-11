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

// QuotaDetails.java
package net.sf.gaeappmanager.google.appengine;

import java.util.ArrayList;
import java.util.List;

/**
 * Quota details of application deployed in Google App Engine.
 *
 * @author Alois Belaska
 */
public class QuotaDetails {

    private String application;
    private List<Quota> quotas = new ArrayList<Quota>();

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public List<Quota> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<Quota> quotas) {
        this.quotas = quotas;
    }

    @Override
    public String toString() {
        return "QuotaDetails{" + "application=" + application + ", quotas=" + quotas + '}';
    }
}

// QuotaDetailsParser.java
package net.sf.gaeappmanager.google.appengine;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;

/**
 * Parser of quota details of application deployed in Google App Engine.
 *
 * @author Alois Belaska
 */
public class QuotaDetailsParser {

    private static final Pattern PATTERN_APPLICATION = Pattern.compile("<h1>Quota Details for (.*?)</h1>");
    private static final Pattern PATTERN_QUOTA = Pattern.compile("<td class=\"quota-name\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*?<td class=\"quota-value\">(.*?)</td>.*