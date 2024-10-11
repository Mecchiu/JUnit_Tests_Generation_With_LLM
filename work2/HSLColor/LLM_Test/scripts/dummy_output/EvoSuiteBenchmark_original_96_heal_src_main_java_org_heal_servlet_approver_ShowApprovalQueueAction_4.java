// ShowApprovalQueueActionTest.java
package org.heal.servlet.approver;

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
* Test class of {@link ShowApprovalQueueAction}.
* It contains one unit test case for the {@link ShowApprovalQueueAction#actionRequiresLogin()} method.
*/
class ShowApprovalQueueActionTest {
		
	@Test
	public void requiresLogin() throws IOException, ServletException {
				
		final RequestDispatcher dispatcher = (RequestDispatcher) Class.forName("DummyClass")
				.getDeclaredMethod("execute", HttpServletRequest.class, HttpServletResponse.class).invoke(null, null, null);
				
		assertFalse("The <GET> method should return false from the <Execute> method.", dispatcher
				.handleRequest(new HttpServletRequest(null), new HttpServletResponse()));

		Object oRetVal1 = AuthenticationTools.getAuthentication(request, response)
				.getUserDetailsService().userDetails("username", "pwd")
				.getCredentials();
				
		assertEquals("We should never return the credentials.",
				null, oRetVal1);
		assertFalse("The <GET> action should return false from <Execute> action. "
				+ "In this case a login should be requested by HttpServletRequest.",
				request.getMethod() == RequestDispatcher.FORWARD);
	}

}