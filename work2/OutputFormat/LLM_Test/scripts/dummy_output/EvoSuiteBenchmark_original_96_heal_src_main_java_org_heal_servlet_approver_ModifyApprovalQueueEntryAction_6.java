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
     * Unit test for {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()} method of {@link ModifyApprovalQueueEntryAction} class.
     */
    @Test
    public void testActionRequiresLogin_false() throws Exception {
        AuthenticationTools.setAuthenticationLevel(null, null);
        ServletSetup servletSetup = new ServletSetup("modifyApprovalQueueEntry");
        ModifyApprovalQueueEntryAction action = new AddApplication(new QueueDAO(new QueuedRecordBean()), "aId", "bId", false, "sId", "fId", servletSetup);		
        
        assertFalse(action.actionRequiresLogin());
    }
    
    /**
     * Unit test for {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()} method of {@link ModifyApprovalQueueEntryAction} class.
     */
    @Test
    public void testActionRequiresLogin_true() throws Exception {
        AuthenticationTools.setAuthenticationLevel(null, null);
        ServletSetup servletSetup = new ServletSetup("modifyApprovalQueueEntry");
        ModifyApprovalQueueEntryAction action = new AddApplication(new QueueDAO(new QueuedRecordBean()), "aId", "bId", true, "sId", "fId", servletSetup);		
        
        assertTrue(action.actionRequiresLogin());
    }
}