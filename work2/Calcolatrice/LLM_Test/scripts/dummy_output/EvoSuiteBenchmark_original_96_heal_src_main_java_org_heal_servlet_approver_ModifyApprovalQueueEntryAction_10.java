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
		 * Test of checkPassword method, of class org.heal.servlet.approver.ModifyApprovalQueueEntryAction
		 */
	@Test
    public void testCheckPassword() {
			UserRole role = new UserRole("administrator");
			assertTrue(role.checkPassword("password"));
    }



		/**
		* Test of getQueueDAO method, of class org.heal.servlet.approver.ModifyApprovalQueueEntryAction
		*/
	@Test
    public void testGetQueueDAO(){
    	UserRole role = new UserRole("administrator");
    	QueueDAO dao = new QueueDAO(role);
    	assertNotNull(dao);
	}

		/**
		* Test of getQueuedRecordBean method, of class org.heal.servlet.approver.ModifyApprovalQueueEntryAction
		*/
	@Test
    public void testGetQueuedRecordBean(){
    	UserRole role = new UserRole("administrator");
    	QueueDAO dao = new QueueDAO(role);
    	QueuedRecordBean recordBean = dao.getQueueRecordBean("queue");
    	assertNotNull(recordBean);
	}
}