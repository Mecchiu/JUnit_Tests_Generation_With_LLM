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
	 */
	@Test
	void testRetrieveAppQuotaDetails_valid_userid_password_source_application() throws Exception {
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 */
	@Test
	void testRetrieveAppQuotaDetails_valid_userid_password_source_application2() throws Exception {
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 */
	@Test
	void testRetrieveAppQuotaDetails_valid_userid_password_source_application3() throws Exception {
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 */
	@Test
	void testRetrieveAppQuotaDetails_valid_userid_password_source_application4() throws Exception {
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 */
	@Test
	void testRetrieveAppQuotaDetails_valid_userid_password_source_application5() throws Exception {
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 */
	@Test
	void testRetrieveAppQuotaDetails_valid_userid_password_source_application6() throws Exception {
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 */
	@Test
	void testRetrieveAppQuotaDetails_valid_userid_password_source_application7() throws Exception {
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 */
	@Test
	void testRetrieveAppQuotaDetails_valid_userid_password_source_application8() throws Exception {
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 */
	@Test
	void testRetrieveAppQuotaDetails_valid_userid_password_source_application9() throws Exception {
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 */
	@Test
	void testRetrieveAppQuotaDetails_valid_userid_password_source_application10() throws Exception {
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails("userid", "password", "source", "application");
		assertNotNull(quotaDetails);
	}
}

// QuotaDetails.java
package net.sf.gaeappmanager.google.appengine;

import java.io.Serializable;
import java.util.Date;

/**
 * Quota details of application deployed in Google App Engine.
 *
 * @author Alois Belaska
 */
public class QuotaDetails implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Application name.
     */
    private String application;

    /**
     * Application version.
     */
    private String version;

    /**
     * Application id.
     */
    private String applicationId;

    /**
     * Application creation date.
     */
    private Date creationDate;

    /**
     * Application last update date.
     */
    private Date lastUpdateDate;

    /**
     * Application last update time.
     */
    private Date lastUpdateTime;

    /**
     * Application last update user.
     */
    private String lastUpdateUser;

    /**
     * Application last update version.
     */
    private String lastUpdateVersion;

    /**
     * Application last update host.
     */
    private String lastUpdateHost;

    /**
     * Application last update instance.
     */
    private String lastUpdateInstance;

    /**
     * Application last update instance version.
     */
    private String lastUpdateInstanceVersion;

    /**
     * Application last update instance host.
     */
    private String lastUpdateInstanceHost;

    /**
     * Application last update instance id.
     */
    private String lastUpdateInstanceId;

    /**
     * Application last update instance ip.
     */
    private String lastUpdateInstanceIp;

    /**
     * Application last update instance port.
     */
    private String lastUpdateInstancePort;

    /**
     * Application last update instance protocol.
     */
    private String lastUpdateInstanceProtocol;

    /**
     * Application last update instance server.
     */
    private String lastUpdateInstanceServer;

    /**
     * Application last update instance server version.
     */
    private