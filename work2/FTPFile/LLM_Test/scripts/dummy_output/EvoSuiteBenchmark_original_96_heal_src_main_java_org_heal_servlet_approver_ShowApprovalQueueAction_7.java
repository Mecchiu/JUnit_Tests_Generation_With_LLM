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
		/** Create a {@link ShowApprovalQueueAction} instance. */
    /*@BeforeMations*/

    public ShowApprovalQueueActionTest() throws ClassNotFoundException {
        QueueDAO queueDAO = new QueueDAO();
        queueDAO.saveOrUpdateQueue("", QueueDAO.INITAL_STATUS);
    }
		/** The {@link ShowApprovalQueueAction#actionRequiresLogin()} method verifies that no
         * necessary authentication information is provided to display the approval queue. */
    @Test
		public final void actionReceivesNoAuth() throws IOException {
        HttpServletRequest req = new RequestServlet().createRequest();
        Action.actionReceiver(req, null);
		}
		public void FailsLogin() throws IOException {
			HttpServletRequest request = new RequestServlet().createRequest();
			Action.actionReceiver(request, null);
		}
		public boolean actionRequiresLogin() {
			return (AuthenticationTools.userIsAuthenticated(null));
		}
		public void actionReceivesStatus(String status) {
			HttpServletRequest request = new RequestServlet().createRequest();
			request.setAttribute("status", status);
			Action.actionReceiver(request, null);
		}
		private class RequestServlet extends HttpServlet {
			@Override
            protected void service(HttpServletRequest request, HttpServletResponse response)
                    throws IOException, ServletException {

                assertNotNull(request.getAttribute("status"));

                assertTrue(request.getAttribute("status").equals(QueueDAO.INITAL_STATUS));

                request.setAttribute("status", null);

                Action.actionResponder(request, response);

			}
		}
})