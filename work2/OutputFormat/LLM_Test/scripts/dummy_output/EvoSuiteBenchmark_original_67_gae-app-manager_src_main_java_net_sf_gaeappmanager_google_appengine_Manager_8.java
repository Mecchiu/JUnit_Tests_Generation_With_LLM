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
		private static final String QAUTH = "AppEngineAuthentication";

		// Class members
		private final String mEmail;

        private final String mPassword;

        private final String mSource;

        private final String mApplication;

        /**
         * Method getRetrieveAppList
         *
         * @throws Exception
         *             in case of failure
         */
		ManagerTest(String[] sources, String email, String password, String app, String source) throws Exception;

        /**
         * Setup method of class variable which hold all the objects and references related to this class.
         *
         * @throws Exception
         */
		ManagerTest(ManagerTest cl) throws Exception;

		/**
         * Method getRetrieveAppInfo
         *
         * @return the name of the application
         * @throws Exception
         *             in case of failure
         */
		Manager getretrieveAppInfo() throws Exception;

		/**
		* Method getGetAppUsageUrl
		*
		* @return the url of the website where you can find the application usage summary
		* @throws Exception
		*/
		String getGetAppUsageUrl() throws Exception;

		/**
		* Creates the test object with parameters.
		*
		* @param source
		*            the name of the application, which can be obtained with the {@link #getGetAppUsageUrl()}
		* @param info
		*            the name of the application, which can be obtained with the {@link #getGetAppUsageUrl()}
		* @param sourceName
		*            the name of the application, which can be obtained with the {@link #getGetAppUsageUrl()}
		* @param password
		*            the app password, which can be obtained with the {@link #getAppToken()}
		* @param password
		*            the app password, which can be obtained with the {@link #getAppToken()}
		* @param sourceName
		*            the name of the application, which can be obtained with the {@link #getGetAppUsageUrl()}
		* @param email
		*            the email address of a user for whom you want to retrieve a quota details
		* @param email
		*            the email email address of a user for whom you want to retrieve a quota details
		* @param sourceName
		*            the name of the application, which can be obtained with the {@link #getGetAppUsageUrl()}
		* @param password
		*            the password of a user for whom you want to retrieve a quota details
		* @param password
		*            the password of a user for whom you want to retrieve a quota details
		* @throws Exception
		*             in case of failure
		*/
		ManagerTest(String source, String info, String sourceName, String email,
				String password, String password, String sourceName, String email)
				throws Exception;

		/**
		 * Method getGetAppToken
		 *
		 * @return the token to access the service
		 */
		String getGetAppToken() throws Exception;

		ManagerTest(ManagerTest cl) throws Exception;

		/**
		 * Method getAppToken
		 *
		 * @param email
		 *            the email of a user for whom you want to retrieve a quota details
		 * @param password
		 *            the password of an app.
		 * @return the token to access the service
		 */
		String getAppToken(String email, String password);

		/**
		 * Method getGetAppUsageUrl
		 *
		 * @return the url where you can find the access of the quota
		 */
		String getGetAppUsageUrl();

        ManagerTest(ManagerTest cl) throws Exception; // This class inherits from
        // object cl
        ManagerTest(ManagerTest cl) throws Exception;
}

//
//
//
//
//
// Class members
//


/**
 * ManagerTest.java
 *
 * @author Emmanuel Hugonneau - <j-f-s-h@epfl.ch>
 */