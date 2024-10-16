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
* It contains ten unit test cases for the {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()} method.
*/
class ModifyApprovalQueueEntryActionTest {
		
	/**
	* Test case 1 for method {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()}.
	*
	* @throws Exception
	*			if any error occurs
	*/
	@Test
	public void testActionRequiresLogin1() throws Exception {
		ModifyApprovalQueueEntryAction modifyApprovalQueueEntryAction = new ModifyApprovalQueueEntryAction();
		boolean result = modifyApprovalQueueEntryAction.actionRequiresLogin();
		assertTrue(result);
	}
}