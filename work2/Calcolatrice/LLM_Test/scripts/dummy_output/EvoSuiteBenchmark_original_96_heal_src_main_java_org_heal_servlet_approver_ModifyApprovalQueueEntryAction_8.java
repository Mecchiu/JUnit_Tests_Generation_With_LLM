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
     * This unit test case holds information about the module that is being tested.
    */
    @Test
    public void testActionRequiresLogin() {
        // Create module
        ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();

        // Set module to require login
        action.actionRequiresLogin(true);
        assertTrue("module 'ModifyApprovalQueueEntryActionTest'" + action + " must require login", 
            (action.requiresLogin()));

        // Verify
        assertTrue("module 'ModifyApprovalQueueEntryActionTest'" + action + " must require login", 
            (action.requiresLogin()) || (action.requester.getUser()!= null));
    }

    /**
     * Test action requires login and requires user
     */
    @Test
    public void testActionRequiresUser() {
        // Create module
        ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();

        // Set module to require login
        action.actionRequiresLogin(true);
        assertTrue("module 'ModifyApprovalQueueEntryActionTest'" + action + " must require login", (action.requiresLogin()) || (action.requester.getUser() == null));
        
        // Set module to require user
        action.actionRequiresUser(true);
        assertTrue("module 'ModifyApprovalQueueEntryActionTest'" + action + " must require user", (action.requiresUser()) || (action.requester.getUser()!= null));
    }

}