// JVCRequestContext_5Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains one unit test case for the {@link JVCRequestContext#getCookie(String)} method.
*/
class JVCRequestContext_5Test {
		/**
		* A HttpServletRequest with no user credentials set.
		* @throws java.io.IOException
		*/
    @Test
    void emptyContext() throws IOException {

        // Create a HttpServletRequest with an empty credentials set.
        HttpServletRequest request = new MockHttpServletRequest();
        request.setUserPrincipal(new TestAuthenticationProvider());
        request.setUserPrincipalName(request.getUserPrincipal().toString());
        request.setCredentials(new String[] {});
        request.setAuthenticated(false);
        request.setMethod("POST");
        request.setServletPath("/");
        request.setRequestURI("/");
        request.setPathInfo("/");
        request.setTimeStamp(new Date().getTime());
        request.setRequestURL(new SimpleStringRepresentation("/"));

        // Build and validate HttpServletRequest instance.
        JVCRequestContext jvc = new JVCRequestContext(request);
		assertEquals("Expect to get a empty list of credentials",
                Collections.<String>emptyList(), jvc.getCookieNames());
    }


// Class for testing authentication and credentials.
    @Test
    void authenticateCredentialsTest() throws IOException {

        // Build an HttpServletRequest and test the authentication.
        HttpServletRequest request = new MockHttpServletRequest();
        request.setUserPrincipal(new TestAuthenticationProvider());
        request.setUserPrincipalName(request.getUserPrincipal().toString());

        // Perform the request and test the result.
        String response = null;
        try (Response responseObject = new JVCResponse(request)) {
            assertEquals("Wrong response", response, responseObject.getBody());
        }
        request.removeAttribute(ServletRequestAttributes.USER_PRINCIPAL);
        request.removeAttribute(ServletRequestAttributes.USER_NAME);
        request.removeAttribute(ServletRequestAttributes.AUTHORIZATION);
    }

    private class SampleAuthenticationProvider implements AuthenticationProvider {
        /**
         * Authentication service for this authentication provider.  It always
         * returns a SAMPLE user.
         * @return A SAMPLE user.
         */
        @Override
        public String getUserName() {
            return "SampleUser";
        }

        /**
         * Create the SAMPLE credentials for this authentication provider.
         * @return SAMPLE credentials.
         */
        @Override
        public Credentials getCredentials(String username, Principal[] issuers) {
            return new SAMPLECredentials("SampleUser", "SamplePassword");
        }

        @Override
        public boolean supports(String authentication) {
            return authentication.equals(AuthenticationVIAuthenticationProvider.AUTH_VIA);
        }
    }

    private class SampleCredentials implements Credentials {
        private String name;
        private String password1;

        public SAMPLECredentials(String name, String password1) {
            this.name = name;
            this.password1 = password1;
        }

        @Override
        public String getPassword() {
            return password1;
        }

        @Override
        public String getPrincipal() {
            return name;
        }

        @Override
        public boolean isSecure() {
            return false;
        }

        @Override
        public boolean equals(Object arg) {
            if (arg == null? this == null :!arg.getClass().equals(arg.getClass())) {
                return false;
            }
            SAMPLECredentials other = (SAMPLECredentials)arg;
            return (this.password1 == null? other.password1 == null : this.password1.equals(other.password1))
                && (this.name == null? other.name == null : this.name.equals(other.name));
        }

        @Override
        public int hashCode() {
            return (name == null? 0 : name.hashCode()) ^ (password1 == null? 0 : password1.hashCode());
        }

        /**
         * The SAMPLE credentials.
         * It is null for POST requests.
         * @return A SAMPLE user.
         */
        public static SAMPLECredentials getCredentials(String arg) {
            SAMPLECredentials credentials = null;

            // Get the credentials from POST requests.
            if (arg.equals(AUTH_VIA)) {
                credentials = new SAMPLECredentials(arg, null);
            }

            // Get the credentials from a session.
            else if ((arg == null? "" : arg).length() > 0) {
                credentials = new SAMPLECredentials(arg, arg);
            }

            return credentials;
        }

    }
}

// This method implements a HttpServletRequest which represents the object which would be
// exposed by a javax.servlet.ServletRequest instance.  The object can be obtained from
// a HttpServletRequest instance, or by a ServletRequest instance.  The method only
// performs conversions between this HttpServletRequest and a ServletRequest instance.
private static class MockHttpServletRequest implements HttpServletRequest {

    private Map<String, String[]> requestParams;
        // This field is set when this object is created.  It indicates a null
        // credentials instance was specified.
	private Credentials credentials;
    private SimpleStringRepresentation servletURL;

    public MockHttpServletRequest(HttpServletRequest request) throws IOException {
        this.requestParams = new HashMap<>();
		this.credentials = new SAMPLECredentials("Example", "example");
		this.requestParams.put(Constants.REQUEST_METHOD_KEY, new String[] {
			"POST", "PUT", "PATCH", "PREFIX", "GET"
		});

		// Create an empty String representing this request.
        this.servletURL = new SimpleStringRepresentation("");
    }

    public void setCredentials(SAMPLECredentials credentials) {
        this.credentials = credentials;
    }

    public void setServletURL(SimpleStringRepresentation url) {
        this.servletURL = url;
    }

    public String getRequestParameter(String key) {
}
}