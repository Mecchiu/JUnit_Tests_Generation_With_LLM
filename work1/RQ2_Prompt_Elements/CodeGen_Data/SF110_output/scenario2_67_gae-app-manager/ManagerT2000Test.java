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
String testUrl = "http://apps.google.com/appengine/";
		Object testObject = new QuotaDetails();
		Manager manager = new Manager();
		
		//@RunWith(Parameterized.class)
		TestParameterizedParameterized testValue1, testValue2;
		
		@Test
		void testDefaultRetrieveAppQuotaDetails(Parameters parameter) throws Exception {
		
			// Set up the parameters and check status code
			Object[] params = testValue1.getParams(parameter);
			testValue1.assertValue1(params.length, "1", "1");
			
			// Make sure that the request is successful
			params = testValue2.getParams(parameter);
			testValue2.assertValue1(params.length, "2", "");
			assertEquals(testUrl + "?APPID=%2$s&QUOTA=", manager.testUrl(queryString("APPID=%2$s&QUOTA=", null)));
			assertEquals(testUrl + "?APPID=%2$s&QUOTA=&APPSERVERID=%%2$s", manager.testUrl(testUrl, null));
			assertEquals(testUrl + "?APPID=%%2$s&QUOTA=&APPSERVERID=%%2$s", manager.testUrl(testUrl, testValue1.parameter));
			assertEquals(testUrl + "?APPID=%%2$s&QUOTA=%2$d", manager.testUrl(testUrl, testValue1.parameter, "3"));
			assertEquals(testUrl + "?APPID=%%2$s&QUOTA=%2$d&APPSERVERID=%%2$s", manager.testUrl(testUrl, testValue1.parameter, "3"));
			assertEquals(testUrl + "?APPID=%%2$s&QUOTA=%2$d&APPSERVERID=%%2$s", manager.testUrl(testUrl, testValue1.parameter, "3"));
			assertTrue(manager.isValid(testUrl, testValue1.parameter));
			
			// TODO check status code (default request without quota)
		}
		
		@Test
		void testRetrieveAppQuotaDetailsFromGoogleAppEngine(Parameters parameter) throws Exception {
		
			// Set up the parameters and check status code
			Object[] params = testValue2.getParams(parameter);
			testValue2.assertParam1(params.length, "1");
			testValue2.assertParam2(params.length, "3");
			String expectedAppId = testValue1.parameter;
			
			Object[] paramsGoogleApp = LogonHelper.logoutFromGoogleAppEngine();
			LogonHelper.loginToGoogleAppEngine(paramsGoogleApp[0].toString(),
					(String) paramsGoogleApp[1].toString());
			Object[] paramsGoogleAppGoogleAccount = LogonHelper.logoutFromGoogleAppEngine();
			LogonHelper.loginToGoogleAppEngine(testUrl, "user");
			
			// Perform the request
			params = testValue2.getParams(parameter);
			LogonHelper.logoutFromGoogleAppEngine(
					(String) params[0].toString(), paramsGoogleApp[0].toString());
			params = testValue2.getParams(parameter);
			HttpGet get = new HttpGet("http://%s/%s?APPID=%s&QUOTA=%d&APPSERVERID=%s",
					testUrl, testUrlGoogleApp, expectedAppId, "", testUrlGoogleAccount);
			HttpResponse response = manager.retrieveAppQuotaDetails(testUrl, expectedAppId,
					LogonHelper.APPLICATION_ID_GOOGLE_GAE_ACCESS_CODE,
					LogonHelper.APPLICATION_ID_GOOGLE_APPSERVERID);
					
			HttpResponse responseGoogleAppGoogleAccount =
					manager.retrieveAppQuotaDetails(testUrlGoogleAccount, expectedAppId,
							LogonHelper.APPLICATION_ID_GOOGLE_GAE_ACCESS_CODE,
							LogonHelper.APPLICATION_ID_GOOGLE_APPSERVERID);
			
			assertEquals(get.getURI().toString(), responseGoogleAppGoogleAccount.getURI().toString());
			assertEquals(get.getURI().toString(), response.getURI().toString());
		}

}