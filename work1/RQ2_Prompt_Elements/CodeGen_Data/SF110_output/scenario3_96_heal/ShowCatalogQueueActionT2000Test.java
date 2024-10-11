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

	/**
	 * Test the action with a HttpServlet request.
	 *
	 * @param request HttpServlet request.
	 * @return <code>true</code> to indicate the request is expected.
	 * @throws IOException if the operation could not be executed.
	 * @throws ServletException if a servlet exception occurred.
	 */
	@Test
	public boolean actionRequiresLogin(HttpServletRequest request)
			throws IOException, ServletException {
		return request.getParameter("username")!= null;
	}

	/**
	 * Test the action with a List containing Queues.
	 *
	 * @param request HttpServlet request.
	 * @param response HttpServlet response.
	 * @param queues List containing Queues.
	 * @return <code>true</code> to indicate the operation is expected.
	 * @throws IOException if the operation could not be executed.
	 * @throws ServletException if a servlet exception occurred.
	 */
	@Test
	public boolean operationDoesNotRequireLogin(HttpServletRequest request,
			HttpServletResponse response, List<QueueDAO.QueueEntry> queues)
			throws IOException, ServletException {
		// Check the operation requires a username.
		return!queues.stream().anyMatch(request::getParameter("username"));
	}

	/**
	 * Test the action with an empty list.
	 *
	 * @param request HttpServlet request.
	 * @param response HttpServlet response.
	 * @return <code>true</code> to indicate the operation is expected.
	 * @throws IOException if the operation could not be executed.
	 * @throws ServletException if a servlet exception occurred.
	 */
	@Test
	public boolean operationDoesNotRequireLogin(HttpServletRequest request,
			HttpServletResponse response)
			throws IOException, ServletException {
		// Check the operation requires a username.
		return!request.getParameter("username").equals("");
	}
}
/*
* End ShowCatalogQueueActionTest.java
*/