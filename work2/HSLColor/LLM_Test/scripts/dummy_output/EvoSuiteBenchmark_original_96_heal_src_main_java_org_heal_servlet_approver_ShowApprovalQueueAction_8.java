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
	 * Test method for
	 * {@link ShowApprovalQueueAction#actionRequiresLogin()}
	 *
	 * @throws IOException
	 * @throws ServletException
	 */
	@Test
	public void testActionRequiresLoginTrue() throws IOException, ServletException {
		
		final Action action = new ShowApprovalQueueAction("/ShowApprovalQueueActionTest/");
		
		assertTrue("True", action.requiresLogin());
	}
	
	/**
	 * Test method for {@link ShowApprovalQueueAction#showApprovalQueueAction()}
	 *
	 * @throws IOException
	 * @throws ServletException
	 */
	@Test
	public void testGetActionWithNull()
		throws Exception{
		
		final Action action = new ShowApprovalQueueAction(
			"/ShowApprovalQueueActionTest/");

		assertEquals("ShowApprovalQueueAction.doGetAction", null, action.doPost(request, response));
	}

	/**
	 * Test method for
	 * {@link ShowApprovalQueueAction#showApprovalQueueAction()}
	 *
	 * @throws ServletException
	 * @throws IOException
	 */
	@Test
	public void testShowApprovalQueueAction()
		throws ServletException, IOException{
		
		final HttpServletResponse response = new
			ResponseOutputServlet().getServletOutput();
		
		// Make the request and assert success.
		assertEquals("response.returnCode = 200",
			this.responseCode(200),
			request(response,
				"/ShowApprovalQueueActionTest/",
				null, 
				null,
				null,
				true).getRequestDispatcherURI().toString(), null);
		
		// Fill in a list
		final List<String> list = request(response,
			"/ShowApprovalQueueActionTest/",
			null, 
			null,
			null,
			true).getResultStrings();

		assertFalse("Non-empty list", list.isEmpty());
		final QueueDAO queueDAO = (QueueDAO) this.bean;
		
		// Verify the list
		assertEquals("1", list.size(), queueDAO.countSatisfiedEffort(null));
		assertEquals("0", list.size(), queueDAO.countNotSatisfiedEffort(null));
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
		request(response, "/ShowApprovalQueueActionTest/", null, null, null, true);
}
}