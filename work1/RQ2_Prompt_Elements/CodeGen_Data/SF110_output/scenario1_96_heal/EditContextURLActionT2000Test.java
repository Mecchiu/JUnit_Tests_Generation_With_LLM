// EditContextURLActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContextURLBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditContextURLAction}.
* It contains one unit test case for the {@link EditContextURLAction#actionRequiresLogin()} method.
*/
class EditContextURLActionTest {
private EditContextURLAction action;
		private HttpServletRequest request;
		private HttpServletResponse response;
		private RequestDispatcher requestDispatcher;

		/**
	 * Constructor.
	*/
		private EditContextURLActionTest() {
			super();
			request = new MockHttpServletRequest();
			response = new MockHttpServletResponse();
			requestDispatcher = new MockRequestDispatcher();
		}

		/**
		 * Constructor.
		 * @param aRequest Servlet request.
		 * @param aResponse Servlet response.
		 * @param aUrlname Servlet name to use, or <code>.edit</code> if none exists.
		 */
		public EditContextURLActionTest(HttpServletRequest aRequest, HttpServletResponse aResponse, String aUrlname) {
			request = aRequest;
			response = aResponse;
			requestDispatcher = getRequestDispatcher(aUrlname);
		}
		
        /**
	 * Test {@link EditContextURLAction#actionRequiresLogin()}.
	 * 
	 * <p>The test is designed to verify that when the URL is edited
	 * the user is logged in and that the Context URL is correctly
	 * looked up.
	 * 
	 * <p>The problem is that we have no way to pass in a different user
	 * session information.  So the user ID is needed to find out the URL.
	 * 
	 * @throws IOException
	 * @throws ServletException
	 */
	@Test
	public void testEditWithDifferentSessionId() throws ServletException, IOException
	{
		// setup
		final CompleteMetadataBean metadata = new CompleteMetadataBean();
		metadata.setContextURL("");
		final ContextURLBean newValue = new ContextURLBean("", "", "", metadata);
		newValue.setSessionId("differentSessionId1");
		newValue.setVersion("1.0");
		action = new EditContextURLAction();
		action.setMetadata(metadata);

		// test
		assertTrue("Wrong result from call to {@link EditContextURLAction#actionRequiresLogin()}\n"
		"The call to EditContextURLAction should return false",
				action.actionRequiresLogin());

		// check that the correct request comes through from {@link #requestDispatcher}
		for (int i=0; i<10; i++) {
			assertNotNull("Missing request before testing", request);
			assertTrue("Unexpected request", action.getRequestURI().endsWith(String.valueOf(i)));
			assertNotNull("Missing RequestDispatcher", requestDispatcher);
			request = requestDispatcher.getRequest();
			// assert that the right URL is in the query string
			// this means that the proper parameter was added
			assertTrue("query parameters are not added", 
					request.getQueryString().contains("foo=" + String.valueOf(i)));
			// assert that the right URL is in the header
			// this means that the proper parameter was added
			assertEquals("Header value should be correct", "sessionId=differentSessionId1", 
					request.getHeader("Context-Session-Id"));
			// assert that the right URL is in the header
			// this means that the proper parameter was added
			assertEquals("Header value should be correct", "version=1.0", 
					request.getHeader("Custom-HttpVersion"));
			
			// assert that the correct user's session info is returned
			assertEquals("Session Info: wrong user session is returned", 
					(new ValueObjectImpl("differentSessionId1")).getValue(), request.getSession().getId());
		}
	}
	
	private void assertRequestBodyExists(HttpServletRequest theRequest, String expectedBody) throws IOException
	{
		final Iterator<String> theRequestBodyIt = theRequest.getHeaderNames();
		while (theRequestBodyIt.hasNext()) {
			if (expectedBody.equals(theRequestBodyIt.next())) {
				assertTrue("Request body does not match!", theRequest.getContentType().equals(theRequestBodyIt.next()));
			}
		}
		assertTrue("Unexpected request body", theRequest.getContentLength() > 0);
	}
	
	private RequestDispatcher getRequestDispatcher(String urlname) {
		RequestDispatcher theRequestDispatcher = request.getRequestDispatcher(urlname);
		assertNotNull("Can't get RequestDispatcher!", theRequestDispatcher);
		return theRequestDispatcher;
	}

	private class MockRequestDispatcher implements RequestDispatcher {
		public void forward(String theUri, HttpServletRequest theRequest) throws IOException, ServletException {
			requestDispatcher.forward(theUri, theRequest);
		}
	}

}
