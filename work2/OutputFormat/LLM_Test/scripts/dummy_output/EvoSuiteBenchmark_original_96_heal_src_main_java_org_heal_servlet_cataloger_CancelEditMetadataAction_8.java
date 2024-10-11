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
     * @return True
     */
	@Test
	public void actionRequiresLogin() {
		
		assertNotSame(true, CancelEditMetadataAction.actionRequiresLogin());
	}

	/**
	 * Test the method which clears the session variable
	 * used for editing metadata.
	 */
	@Test
	public void perform() {
		
		HttpServlet servlet = new HttpServlet("test");
		HttpServletRequest req = new HttpServletRequest("post", "/cataloger/new");
		HttpSession s = req.getSession(false);
		s.setAttribute("cancelEditor", false);

		try {
			servlet.doPost(req, resp);
			
		} catch (ServletException e) {
			
			assertArrayEquals(authenticationTools.getLoginUsers().toArray(),
				getSessions().toArray(new AuthenticationTools.User[0]));
			
		} else {
			throw e;
		}
		
	}
	
	/**
	 * @param s The {@link HttpSession} to delete from,
	 * the session to be deleted shall be contained
	 * in the argument.
	 */
	private void deleteSessions(HttpSession s){
		AuthenticationTools.User[] ss = s.getAttribute("deleteSessions")
			.toArray(new AuthenticationTools.User[0]);
		for (AuthenticationTools.User u : ss) {
			s.invalidate();
			u.setStatus(AuthenticationTools.User.Status.USER_NOT_IN_STOP);
		}
	}
	
	/**
	 * @param req The {@link HttpServletRequest} object to validate.
	 * @param resp The {@link HttpServletResponse} object to validate.
	 */
	private void validateInput(HttpServletRequest req, HttpServletResponse resp) {
	
		assertArrayEquals(1, req.getParameterNames().keySet().size());
		assertArrayEquals(Integer.valueOf(1), authenticationTools.getLoginUsers().toArray(new AuthenticationTools.User[0])[0].getId());
		assertArrayEquals(Integer.valueOf(0), authenticationTools.getLoginUsers().toArray(new AuthenticationTools.User[0])[1].getId());
	}
	
	/**
	 * @return The {@link HttpServletRequest} object to validate
	 */
	private HttpServletRequest createRequest(String method, String action) {
		
		HttpServletRequest req = new HttpServletRequest();
		if (method.equals("POST")) {
			
			if ("post".equals(authenticationTools.getMethod())) {
				
			HttpServletRequest.setParameterValuesMatching("cancelEditor", "true");
				return req;
			}
		}
		
		if (method.equals("GET")) {
			
			if ("get".equals(authenticationTools.getMethod())) {
				
			HttpServletRequest.setParameterValuesMatching("cancelEditor", "");
				return req;
			}
			
		}

		System.out.println("Invalid Method: " + authenticationTools.getMethod());
		return null;
	}

	/**
	 * @return The {@link HttpServletResponse} object to validate
	 */
	private HttpServletResponse createResponse(String method, String action) {
		
		HttpServletResponse resp = new HttpServletResponse();
		if (method.equals("POST")) {
			HttpServletResponse.setContentType("text/plain");
			resp.setStatus(HttpServletResponse.SC_NO_CONTENT);
			
		} else if (method.equals("GET")) {
			HttpServletResponse.setContentType("text/html");
			resp.setStatus(HttpServletResponse.SC_OK);
			String c = req.getParameterValuesMatching(requestMethod + "CANCELED", "").toString();
			assertTrue("No message", c!= null && c.length() > 0);
			
		} else {
			assertTrue("Method is not POST or GET", false);
		}
		
		return resp;
	}

	/**
	 * Method to determine if the {@link HttpServletResponse} object has the
	 * {@link HttpServletRequest} object used for validating input.
	 * @return True if the response has the user logged in,
	 * false otherwise.
	 */
	private boolean responseHasUser(HttpServletRequest req) {
		
		HttpServletResponse resp = req.getResponse();
		
		return AuthenticationTools.User.Status.USER_INACTIVE!= 
				resp.getStatus() && 
				resp.getStatus() == HttpServletResponse.SC_OK && 
				authenticationTools.getLoginUsers().getById().length > 0;
	}

	/**
	 * Determine which {@link RequestDispatcher} method should be used
	 * for checking the request parameters.
	 */
	private String requestMethod() {
		return "POST";
	}

	/**
	 * A simple {@link HttpSession} object containing the current HTTP session.
	 */
	private HttpSession getSessions() {
		
		HttpSession s = req.getSession(false);
		s.setAttribute("cancelEditor", true);
		
		return s;
	}

	private AuthenticationTools.User[] authenticationTools.getLoginUsers() {
		
		AuthenticationTools.User[] users = AuthenticationTools.User.list(authenticationTools.getLoginUsers().getById());
		ArrayList<AuthenticationTools.User> ss = new ArrayList<AuthenticationTools.User>(users.length);
		AuthenticationTools.User u = null;
		for (AuthenticationTool ust : users) {
			if (ut.equals(authenticationTools.getLoginUsers().getById())) {
				u = ust;
			} else {
				ss.add(ust);
			}
		}
		
		return ss.toArray(new AuthenticationTools.User[ss.size()]);
	}

}