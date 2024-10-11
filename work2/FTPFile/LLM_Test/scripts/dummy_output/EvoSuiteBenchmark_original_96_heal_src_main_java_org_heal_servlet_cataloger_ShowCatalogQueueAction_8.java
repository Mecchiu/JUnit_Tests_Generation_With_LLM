// ShowCatalogQueueActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ShowCatalogQueueAction}.
* It contains one unit test case for the {@link ShowCatalogQueueAction#actionRequiresLogin()} method.
*/
class ShowCatalogQueueActionTest {
		
    @Test
    public void actionRequiresLogin() throws IOException, ServletException {
    	checkRequiredLoginRequired(actionRequiresLogin());
    }
	
	@Test
	public void checkRequiredLoginRequired() throws IOException, ServletException {
		
      // check required login required
      checkRequiredLoginRequired(false);
      
      // check if username is enabled
      assertNotNull(requestRequiresLogin(AuthenticationTools.getCurrentUserName()));
      
      // check if login required
      String msg = checkLoginRequired(AuthenticationTools.getCurrentUserName(), AuthenticationTools.getCurrentUserId());
      assertNull(msg);
  
      // check if the current user has a valid (active) profile with his login
      checkCurrentUserHasProfile(AuthenticationTools.getCurrentUserName(), AuthenticationTools.getCurrentUserLogins().size(), AuthenticationTools.getCurrentUserId());
  }
	
	/**
	 * Check if the user has the same profile we have (the one we have currently logged
	 * in from within the web app) as the user who last logged in from the web.
	 * @param currentUserName current user name
	 * @param lastLoginsCurrentUser number of last logins of the currently logged
	 * in user
	 * @param lastLoginsOtherLogins other user who is used to login
	 */
	private void checkCurrentUserHasProfile(String currentUserName, int lastLoginsCurrentUser, String lastLoginsOtherLogins) {
		assertEquals(AuthenticationTools.getCurrentUserName().toString(), currentUserName);
		assertNotEquals(lastLoginsCurrentUser, AuthenticationTools.getLastLoginId());
		assertFalse(lastLoginsOtherLogins.contains(currentUserName));
	}
	
	/**
	 * Check if login required is done only for current user.
	 * @throws IOException
	 * @throws ServletException
	 */
	private void checkRequiredLoginRequired(boolean requiredLogin) throws IOException, ServletException {
		
        // check login not required
        checkRequiredLoginRequired(requiredLogin && requestRequiresLogin(AuthenticationTools.getCurrentUserName()));
	}
	
	/**
	 * @see ShowCatalogQueueAction#actionRequiresLogin()
	 */
	private boolean checkRequiredLoginRequired(boolean expected) throws IOException, ServletException {
		assertEquals(expected, isRequiredLoginRequired());
		
	return true;
	}
	
	/**
	 * @see ShowCatalogQueueAction#actionRequiresLogin()
	 */
	private boolean isRequiredLoginRequired() {
		String lastLoginId;
		List<String> logins;
		
		if (AuthenticationTools.getCurrentUser() == null) {
			return false;
		}
		if (requestRequiresLogin(AuthenticationTools.getCurrentUserName())) {
			logins = AuthenticationTools.getCurrentUserLogins();
		} else {
			logins = null;
		}
		
		RequestDispatcher rd = servlet.getServletContext().getRequestDispatcher("/catalogQueue");
		lastLoginId = null;
		try {
			lastLoginId = rd.handleRequest(new HttpServletRequest() {
				@Override
				public String getParameter(String key) {
					return "test";
				}
			});
		} catch (ServletException e) {
			fail("handleRequest method threw exception: "+e);
		}
		
		return lastLoginId!= null && lastLoginId.toString().equals(AuthenticationTools.getLastLoginId());
	}
	
	/**
	 * Check if login is required for the given user or a combination of users.
	 * @param currentUserName current user name
	 * @param lastLoginsCurrentUser number of last logins of the currently logged
	 * in user
	 * @param lastLoginsOtherLogins other user who is used to login
	 * @throws IOException
	 * @throws ServletException
	 */
	private void checkLoginRequired(String currentUserName, int lastLoginsCurrentUser,
			String lastLoginsOtherLogins) throws IOException, ServletException {
		String lastLoginId = null;
		List<String> logins = null;
		
		if (currentUserName.equals(AuthenticationTools.getCurrentUserName())) {
			lastLoginId = AuthenticationTools.getLastLoginId();
			logins = AuthenticationTools.getCurrentUserLogins();
		} else {
			// TODO: add login logins for other users
			throw new IllegalArgumentException("not yet implemented");
		}
		
		if (lastLoginsCurrentUser!= 0) {
			assertTrue(logins.size() > lastLoginsCurrentUser + 1);
		} else if (lastLoginsOtherLogins!= null) {
			assertEquals(lastLoginsOtherLogins, logins.remove(0));
		}
		
		RequestDispatcher rd = servlet.getServletContext().getRequestDispatcher("/catalogQueue");
		lastLoginId = null;
		try {
			lastLoginId = rd.handleRequest(new HttpServletRequest() {
				@Override
				public String getParameter(String key) {
					return "test";
				}
			});
		} catch (ServletException e) {
			fail("handleRequest method threw exception: "+e);
		}
		
		assertNotNull(lastLoginId);
	}
}