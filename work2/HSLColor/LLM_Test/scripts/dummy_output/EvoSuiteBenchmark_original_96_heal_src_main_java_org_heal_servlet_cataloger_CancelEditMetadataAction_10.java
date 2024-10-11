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
		
	private HttpServlet servlet;
	private HttpServletRequest request;
	private HttpServletResponse response;
	private HttpSession session;
	
	/**
	 * Set up the HttpServletRequest handler.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ServletException Thrown when a Servlet exception has occurred.
	 */
	@Test
	public void setup() throws IOException, ServletException {

		servlet = new HttpServlet() {"CancelEditMetadataAction";};
		// request init
		request = servlet.getRequest();
		assertNotNull("request", request);
		request.setCharacterEncoding("UTF-8");
		response =  servlet.getResponse();
		assertNotNull("response", response);
		servlet.getServletConfig().setInitParameter("UserAgent", "test");
	}
	
	/**
	 * Verify the response when a login attempt is required.
	 *
	 * @throws ServletException Thrown if a servlet-specific error occurs
	 * @throws IOException Thrown if an input/output error occurs
	 */
	@Test
	public void ensureLoginRequired() throws ServletException, IOException {
		
		session = request.getSession(true);
		assertNotNull("request does not contain a login object in the session", session);
		String expectedSessionVariable = "catid";
		HttpSession actualSession = request.getSession(true);

		String actualSessionVariable =  (String) actualSession.getAttribute(expectedSessionVariable);
		assertNotNull("actualSession["+expectedSessionVariable + "].isValid", false);
		assertEquals("actual ["+expectedSessionVariable+"] is not "+expectedSessionVariable, expectedSessionVariable, actualSessionVariable);
		// assert that the expected session variable has not been expired;
		
		request.setParameter("catid", "");
		response.sendRedirect(actualSession.getValue(expectedSessionVariable));
		session = request.getSession(true);
    	assertNull(session.getValue(expectedSessionVariable), "Session was expired ");
    	assertEquals("Session was expired ", expectedSessionVariable, session.getValue(expectedSessionVariable));
	}


}