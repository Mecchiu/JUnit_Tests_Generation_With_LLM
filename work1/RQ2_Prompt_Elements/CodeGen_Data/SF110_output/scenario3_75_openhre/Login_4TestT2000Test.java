// Login_4Test.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains one unit test case for the {@link Login#authenticate()} method.
*/
class Login_4Test {
private final static String NAMESPACE_URL = "http://mynamespace.com/Namespace";
		private final static String NAMESPACE_LOCATION = "http://mynamespace.com/Namespace";
		private final static String NAMESPACE_TARGET = "user-context-1";
		private final static String USER_ID = "user";
		private final static String REALM = "T-User";
	
 		private final String PASSWORD = "password";
		private final String TOKEN = "token";
		private final String LOGOUT_RESPONSE = "logoutResponse";
		private final String LOGIN_RESPONSE = "loginResponse";
		private final String BAD_USER_ID = "badUserId";
		private final String USER_IS_NOT_AUTHORIZED = "badUserIsNotAuthorized";
		private final String TIME_CREATION = "timeCreation";
		private final String TIME_LAST_LOGIN = "timeLastLogin";
		private final String LOGGED_IN = "loggedIn";
		
		@Test
		public void checkUser_existsInNamespace(){
			boolean success = false;
			boolean exceptionThrownWhenNameSpaceIsNotFound = true;
			
			try {
				success = loginUsingUsernamePassword("user", PASSWORD);
				fail("Expected an IllegalArgumentException");
			} catch (IllegalArgumentException e) {
				String actualLine = e.getMessage();
				//System.err.println (actualLine);
				if (actualLine.equals("Unknown namespace: user-context-1. The namespace does not exist")) {
					exceptionThrownWhenNameSpaceIsNotFound = false;
				}
			}	

			// check the exception thrown when the namespace name is not found
			assertTrue(exceptionThrownWhenNameSpaceIsNotFound);
		}
		
		@Test
		public void checkUserWithSamePassword_throwsBadAuthentication() throws LoginException {
			boolean success = false;
			boolean exceptionThrownWhenPasswordIsDifferent = true;
			try {
				success = loginUsingUsernamePassword(USER_ID, PASSWORD);
				fail("Expected an IllegalArgumentException");
			} catch (IllegalArgumentException e) {
				String actualLine = e.getMessage();
				//System.err.println (actualLine);
				if (actualLine.equals("Invalid username or password.")) {
					exceptionThrownWhenPasswordIsDifferent = false;
				}
			}

			// check the exception thrown when wrong password is used
			assertTrue(exceptionThrownWhenPasswordIsDifferent);
		}

    
    // get the list of tokens
    private static Set<Integer> getTokenListFromRequestCtx(RequestCtx theSession) {
        Set<Integer> tokenList = new HashSet<Integer>();
        try {
            RequestCtx.getAttributes().
                get(0, Long.class).value().toString();
            RequestCtx.getAttributes().
                get(1, Long.class).value().toString();
        }
        catch (IllegalStateException ignored) {
            throw new IllegalStateException(
                     "The request context contains incomplete information");
        }
        catch (IllegalDataException ignored) {
            throw new IllegalStateException(
                     "The request context contains invalid information");
        }
        catch (IndexOutOfBoundException ignored) {
            throw new IllegalStateException(
                     "The request context contains invalid information");
        }
        tokenList.addAll(theSession.getAttribute(RequestCtx.REQUEST_ATTRIBUTE_LIST)
                                           .get(0);
        tokenList.addAll(theSession.getAttribute(RequestCtx.REQUEST_ATTRIBUTE_LIST)
                                          .get(1));
        return tokenList;
    }

    /**
     * Get the list of tokens from the user ticket using the username from the
     * session attribute.
     */
    private Set<Integer> getTicketListFromCtx(RequestCtx theRequestCtx) {
        RequestCtx.getAttributes().
                 get(0, Long.class).value().toString();
        RequestCtx.getAttributes().
                      get(1, Long.class).value().toString();
        return theRequestCtx.getAttributeValues(Token.ID);
    }
		private boolean loginUsingUsernamePassword(String theUsername, String thePassword) {
			logger.trace("Trying to login by username");
			//logger.trace(String.format("username=%s, password=%s", username, password));
			//logger.trace("Using user credentials");
			logger.trace("Logging in");
			Set<Integer> tokenList = new HashSet<Integer>();
			Set<Integer> ticketList = new HashSet<Integer>();
			try {
				RequestBuilder theReqBuilder = RequestBuilder
					.login(NAMESPACE_URL, NAMESPACE_TARGET, theUserId)
					.authorize(theUserId, NAMESPACE_URL,
						   NAMESPACE_LOCATION).
					withPassword(thePassword);
				RequestCtx theRequestCtx = theReqBuilder
					.withRequestCtx(RequestCtx.ID_REQUEST_ATTRIBUTE_NAME,
						NAMESPACE_URL, NAMESPACE_LOCATION)
					.build();
				theReqBuilder.getRequestCtx(0);
	  	                theReqBuilder.getRequestCtx(1);
	  	        	 theRequestCtx.getAttributeValues(0);
	  	        	 theRequestCtx.getAttributeValues(1);
	  	               //request.logIn(thePassWord, theUsername);
				if (theUsername.equals(PASSWORD)) {
				  Set<Integer> theRetrievalTokens = getTokenListFromCtx(theRequestCtx);
				  int