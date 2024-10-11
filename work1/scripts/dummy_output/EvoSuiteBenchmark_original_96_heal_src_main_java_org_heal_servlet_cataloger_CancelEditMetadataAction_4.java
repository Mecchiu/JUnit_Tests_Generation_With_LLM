// CancelEditMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CancelEditMetadataAction}.
* It contains one unit test case for the {@link CancelEditMetadataAction#actionRequiresLogin()} method.
*/
class CancelEditMetadataActionTest {
		
		/**
		* @throws IOException
		* @throws ServletException
		*/
		@Test
		public void test() throws IOException, ServletException, NoLoginException{ 
	
				//Test the case where there is no login session.
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();
			
				HttpSession session = new MockHttpSession(request, response);
				request.setSession(session);
			
				request.setCharacterEncoding("UTF-8");
				request.setAttribute(AuthenticationTools.USERNAME, "test");
				request.setAttribute(AuthenticationTools.USERINFO, "test");
				request.setAttribute(AuthenticationTools.PASSWORD, "test");
				
				assertEquals(true,
					CancelEditMetadataAction.actionRequiresLogin(session));
			
		}
		
		@Test
		@OAuth
        public void testOAuthLoginException() throws IOException, ServletException{ 
	
				//Test login exception
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();
			
				request.setCharacterEncoding("ISO-8859-1");
				RequestDispatcher rd_oauth = mock(RequestDispatcher.class);
				HttpSession session = new MockHttpSession(request, response);
				request.setSession(session);
		
				boolean res = CancelEditMetadataAction.actionRequiresLogin(session);
				assertFalse("Result true after fail with oauth exception.", res);
				/* Expect failure to be logged.
				 */
				Assert.assertTrue("", rd_oauth.include(request, response));
		}


		/**
		* @throws IOException
		* @throws ServletException
		*/
		@Test
		public void testOAuthLoginNonExistingUser() throws IOException, ServletException, NoLoginException{ 
	
				//Test login exception
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();

				//Setting the username and password that fail to match the database user name.
				String authHeader = AuthenticationTools.USERNAME + "=" + "test";
				String authHeader2 = AuthenticationTools.PASSWORD + "=" + "test";
				AuthManager authManager = new AuthManager();
				
				request.setCharacterEncoding("ISO-8859-1");
				authManager.setAuthUserName(request.getRemoteUser());
				authManager.setAuthUserName(request.getUserPrincipal().getName());
				authManager.setAuthPassword(request.getUserPrincipal().getPassword());
				
				RequestDispatcher rd_auth = mock(RequestDispatcher.class);
				HttpSession session = new MockHttpSession(request, response);
				request.setSession(session);
		
				boolean res = CancelEditMetadataAction.actionRequiresLogin(session);
				assertFalse("Result true after fail with oauth exception.", res);
				//See if authentication is still running, but with the correct credentials
				assertNull("Result null for oauth login failure.", authManager.getAuthUserInfo());
				assertFalse("Result false for oauth login failure.", authManager.getAuthCredentials().equals(request.getParameter(AuthenticationTools.AUTHENTICATION)));
				/* Expect failure to be logged
				 * Note that we can't use the assertTrue above when testing this case since we don't allow failure to be logged
				 * in the test case.
				 */
				request.setAttribute("authheader", authHeader);
 				request.setAttribute("authheader2", authHeader2);
				AuthManager.clearAUTH();
					
	
				/* Expect failure to be logged.
				 */
				Assert.assertTrue("", rd_auth.include(request, response));
				assertTrue("Result true after fail with no oauth exception.", res);
				/* Expect failure to be logged
				 * Check the response to ensure we logged out successfully
				 * This case is probably missing some authentication methods, or something.
				 * See if we could log in, then fail to login if no way to verify.
				 */
				/* Expect failure to be logged */
				assertFalse("Result false after fail with oauth exception.", authManager.getAuthUserInfo().equals(request.getAttribute("authheader")));
				/* No way to verify password: must logout from user */
				request.setAttribute("authheader", null);
				request.setAttribute("authheader2", null);
	
				/* Expect failure to be logged */
				Assert.assertTrue("", rd_auth.include(request, response));
				assertTrue("Result false after fail with no oauth exception.", res);
		}
		
		@Test
		@OAuth
        public void testOAuthLoginSuccess() throws IOException, ServletException{ 	
	
				//set the oauth username and password
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();

				request.setCharacterEncoding("ISO-8859-1");
				request.setAttribute(AuthenticationTools.USERNAME, "test");
				request.setAttribute(AuthenticationTools.USERINFO, "test");
				request.setAttribute(AuthenticationTools.PASSWORD, "test");

				String authHeader = AuthenticationTools.USERNAME + authManager.getAuthUserName();
				String authHeader2 = AuthenticationTools.PASSWORD + authManager.getAuthPassword();
				AuthManager authManager = new AuthManager();
				
				/*
				* Test the case where a good username is passed.
				*/
				request.setAttribute(AuthenticationTools.USERNAME, "test");
				request.setAttribute(AuthenticationTools.USERINFO, "test");

				boolean res = CancelEditMetadataAction.actionRequiresLogin(request.getSession());
				assertTrue("Result false after no oauth header when not logged in", res);
				request.setAttribute("authheader", authHeader);
				request.setAttribute("authheader2", authHeader2);
		
				/*
				* Test the case where an error is issued.
				* Note : this test does NOT use an authentaion manager (either in or in this case)
				* as the oauth manager should have failed because of the login failure.
				* The username is passed in the oauth header, which should cause the password to be
				* ignored in the correct method if it was in the correct credentials.
				*/
				//Set the wrong oauth username and password
}
}