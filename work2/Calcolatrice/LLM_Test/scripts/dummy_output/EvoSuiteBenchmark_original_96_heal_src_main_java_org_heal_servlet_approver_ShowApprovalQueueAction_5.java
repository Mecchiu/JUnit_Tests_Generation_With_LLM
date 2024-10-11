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
	 * Shows the approval queue for a given queue name.
	 *
	 * @throws ServletException, IOException
	 */
	@Test
	void showApprovalQueueTest() throws ServletException, IOException {
		// Set up a request and response
		HttpServletRequest request = new ShowApprovalQueueRequest("TestQueueName");		
		
		// Call the method to get the URL for the approval queue from the admin
		RequestDispatcher dispatcher = request.getRequestDispatcher("showApprovalQueue.jsp");
		dispatcher.forward(request, response);
	}
	
	/**
	 * Shows the approval queue for all the queues in the "QueueNames" list.
	 *
	 */
	@Test
	void showApprovalQueue() {
		// Set up a request and response
		ShowApprovalQueueRequest request = new ShowApprovalQueueRequest("TestQueueNames");	
			
		// Call the method to get the URL for the approval queue from the admin
		RequestDispatcher dispatcher = request.getRequestDispatcher("showApprovalQueue.jsp");
		dispatcher.forward(request, response);
	}
}
/* end class ShowApprovalQueueActionTest */