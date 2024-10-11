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
		 * Test method {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()}.
		 */
	@Test
    public void testActionRequiresLogin() {
        // Setup
        QueueDAO queueDAO = new QueueDAO();
        // Action
        ModifyApprovalQueueEntryAction actionBean = new ModifyApprovalQueueEntryAction();
        // Test
        assertTrue(ActionUtils.requiresLogin(null, null, null));
        assertFalse(ActionUtils.requiresLogin(actionBean, null, AuthenticationTools.createLoggedInUser()));
    }
}