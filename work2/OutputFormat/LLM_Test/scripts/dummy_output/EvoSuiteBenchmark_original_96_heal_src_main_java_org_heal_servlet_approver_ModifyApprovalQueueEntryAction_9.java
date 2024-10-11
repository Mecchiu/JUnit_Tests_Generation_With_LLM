// ModifyApprovalQueueEntryActionTest.java
package org.heal.servlet.approver;

import org.heal.module.catalog.QueueDAO;
import org.heal.module.catalog.QueuedRecordBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyApprovalQueueEntryAction}.
* It contains one unit test case for the {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()} method.
*/
class ModifyApprovalQueueEntryActionTest {
		/**
		* Class constructor
		*/
		public ModifyApprovalQueueEntryActionTest(){}

		/**
		* Method tests {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()}
		*/
		@Test
		public void requiresLogin() throws Exception {
			String serverID = new QueuedRecordBean().getRecid();
			String server = serverID;
			String action = "modify";
			QueueDAO queueDAO = new QueueDAO();
			QueuedRecordBean record = new QueuedRecordBean();
			record.setServer(server);
			record.setQueueID(serverID);

			assertTrue("ModifyApprovalQueueEntryAction requires login from server: " + server + " to get queue ID: " + serverID, AuthenticationTools.requiresCorrectCredentials(serverID));
			assertFalse("ModifyApprovalQueueEntryAction requires login from server: " + server + " to get queue ID: " + serverID, AuthenticationTools.requiresCorrectCredentials(serverID, ""));
			assertTrue("ModifyApprovalQueueEntryAction requires login from server: " + server + " to get queue ID: " + serverID, AuthenticationTools.requiresCorrectCredentials(serverID, action));
			
		}
}