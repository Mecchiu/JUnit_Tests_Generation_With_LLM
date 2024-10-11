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
		
	/**
	 * Constructor for this test object type.
	 * @param nameName name passed into test class to this object
	 */
	public ShowApprovalQueueActionTest(String nameName) {
		super(nameName);
	}

	/**
	 * Performs test with a GET request which results in the output being redirected to the HTTP request page with the appropriate
	 * data and state.
	 * The expected behavior is expected to be:
	 * <ul>
	 * <li>The queue list page contains an HTML link to the page to display the queue list.</li>
	 * <li>The page includes the approval queue list table as its top-level table.</li>
	 * <li>
	 * <ul>
	 * <li>The page has the approval queue list table under the queue table</li>
	 * <li>The list table contains a HTML link to the list page for user approval</li>
	 * <li>The list table contains a link for user rejection</li>
	 * <li>The list table contains a HTML link to the next page of results</li>
	 * </ul>
	 * </li>
	 * </ul>
	 *
	 * @throws Exception if an unexpected error occurs
	 */
	@Test
	public void testPOST(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<QueueDAO> queues = QueueDAO.getListFromFile(request, null);
		System.out.println("Queues: " + queues);

		String queueNames = new String(AuthenticationTools.readPassword(""));
		request.setAttribute("list", queues);
		response.sendRedirect("show-queue-page?list=" + queueNames);
	}
		
	/**
	 * Performs test with a GET request which results in the output being redirected to the HTTP request page with the appropriate
	 * data and state.
	 * The expected behavior is expected to be:
	 * <ul>
	 * <li>The queue list page contains an HTML link to the page to display the queue list.</li>
	 * <li>
	 * <ul>
	 * <li>The page has the approval queue list table under the queue table</li>
	 * <li>The queue table contains a HTML link to the list page for user approval</li>
	 * <li>The list table contains an HTML link to the next page of results</li>
	 * </ul>
	 * </li>
	 * </ul>
	 * 
	 * @throws Exception if an unexpected error occurs
	 */
	@Test
	public void testGET(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<QueueDAO> queues = QueueDAO.getListFromFile(request, null);
		List<QueueDAO> list = QueueDAO.getListFromFile(request, null);

		request.setAttribute("list", list);
		request.setAttribute("queues", queues);
		RequestDispatcher rd = request.getRequestDispatcher("show-queue-page");
		rd.forward(request,response);
	}
}