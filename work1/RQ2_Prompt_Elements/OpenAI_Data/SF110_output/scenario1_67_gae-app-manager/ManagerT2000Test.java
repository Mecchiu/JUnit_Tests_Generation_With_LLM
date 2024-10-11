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
		* Test case for the {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
		* It tests the method with valid parameters.
		*/
		@Test
		void testRetrieveAppQuotaDetailsWithValidParameters() throws Exception {
				String userid = "userid";
				String password = "password";
				String source = "source";
				String application = "application";
				String authCookie = LogonHelper.loginToGoogleAppEngine(userid, password, source);
				DefaultHttpClient client = new DefaultHttpClient();
				try {
						HttpGet get = new HttpGet("https://appengine.google.com/dashboard/quotadetails?&app_id=" + application);
						get.setHeader("Cookie", "ACSID=" + authCookie);
						HttpResponse response = client.execute(get);
						QuotaDetails quotaDetails = new QuotaDetailsParser().parse(response.getEntity().getContent());
						assertEquals(quotaDetails, Manager.retrieveAppQuotaDetails(userid, password, source, application));
				} finally {
						client.getConnectionManager().shutdown();
				}
		}
		
		/**
		* Test case for the {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
		* It tests the method with invalid userid.
		*/
		@Test
		void testRetrieveAppQuotaDetailsWithInvalidUserid() throws Exception {
				String userid = "userid";
				String password = "password";
				String source = "source";
				String application = "application";
				String authCookie = LogonHelper.loginToGoogleAppEngine(userid, password, source);
				DefaultHttpClient client = new DefaultHttpClient();
				try {
						HttpGet get = new HttpGet("https://appengine.google.com/dashboard/quotadetails?&app_id=" + application);
						get.setHeader("Cookie", "ACSID=" + authCookie);
						HttpResponse response = client.execute(get);
						QuotaDetails quotaDetails = new QuotaDetailsParser().parse(response.getEntity().getContent());
						assertNotEquals(quotaDetails, Manager.retrieveAppQuotaDetails("invalidUserid", password, source, application));
				} finally {
						client.getConnectionManager().shutdown();
				}
		}
		
		/**
		* Test case for the {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
		* It tests the method with invalid password.
		*/
		@Test
		void testRetrieveAppQuotaDetailsWithInvalidPassword() throws Exception {
				String userid = "userid";
				String password = "password";
				String source = "source";
				String application = "application";
				String authCookie = LogonHelper.loginToGoogleAppEngine(userid, password, source);
				DefaultHttpClient client = new DefaultHttpClient();
				try {
						HttpGet get = new HttpGet("https://appengine.google.com/dashboard/quotadetails?&app_id=" + application);
						get.setHeader("Cookie", "ACSID=" + authCookie);
						HttpResponse response = client.execute(get);
						QuotaDetails quotaDetails = new QuotaDetailsParser().parse(response.getEntity().getContent());
						assertNotEquals(quotaDetails, Manager.retrieveAppQuotaDetails(userid, "invalidPassword", source, application));
				} finally {
						client.getConnectionManager().shutdown();
				}
		}
		
		/**
		* Test case for the {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
		* It tests the method with invalid source.
		*/
		@Test
		void testRetrieveAppQuotaDetailsWithInvalidSource() throws Exception {
				String userid = "userid";
				String password = "password";
				String source = "source";
				String application = "application";
				String authCookie = LogonHelper.loginToGoogleAppEngine(userid, password, source);
				DefaultHttpClient client = new DefaultHttpClient();
				try {
						HttpGet get = new HttpGet("https://appengine.google.com/dashboard/quotadetails?&app_id=" + application);
						get.setHeader("Cookie", "ACSID=" + authCookie);
						HttpResponse response = client.execute(get);
						QuotaDetails quotaDetails = new QuotaDetailsParser().parse(response.getEntity().getContent());
						assertNotEquals(quotaDetails, Manager.retrieveAppQuotaDetails(userid, password, "invalidSource", application));
				} finally {
						client.getConnectionManager().shutdown();
				}
		}
		
		/**
		* Test case for the {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
		* It tests the method with invalid application.
		*/
		@Test
		void testRetrieveAppQuotaDetailsWithInvalidApplication() throws Exception {
				String userid = "userid";
				String password = "password";
				String source = "source";
				String application = "application";
				String authCookie = LogonHelper.loginToGoogleAppEngine(userid, password, source);
				DefaultHttpClient client = new DefaultHttpClient();
				try {
						HttpGet get = new HttpGet("https://appengine.google.com/dashboard/quotadetails?&app_id=" + application);
						get.setHeader("Cookie", "ACSID=" + authCookie);
						HttpResponse response = client.execute(get);
						QuotaDetails quotaDetails = new QuotaDetailsParser().parse(response.getEntity().getContent());
						assertNotEquals(quotaDetails, Manager.retrieveAppQuotaDetails(userid, password, source, "invalidApplication"));
				} finally {
						client.getConnectionManager().shutdown();
				}
		}
		
		/**
		* Test case for the {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
		* It tests the method with null userid.
		*/
		@Test
		void testRetrieveAppQuotaDetailsWithNullUserid() throws Exception {
				String userid = "userid";
				String password = "password";
				String source = "source";
				String application = "application";
				String authCookie = LogonHelper.loginToGoogleAppEngine(userid, password, source);
				DefaultHttpClient client = new DefaultHttpClient();
				try {
						HttpGet get = new HttpGet("https://appengine.google.com/dashboard/quotadetails?&app_id=" + application);
						get.setHeader("Cookie",