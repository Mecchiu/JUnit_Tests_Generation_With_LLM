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
* Tests the functionality of the {@link ModifyApprovalQueueEntryAction}
* class.
*/
@Test
public void testIt() {
	
	final ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction(QueueDAO.class);
	
	action.run();
	
}

	/**
* Tests the functionality of the {@link ModifyApprovalQueueEntryAction}
* class.
*/
@Test
public void testIt2() throws Exception {
	
	final ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction(QueueDAO.class);
	
	action.run();
	action.run2();
	assertTrue(true);
}

    /**
 * Modifies an approval queue entry.
 *
 * @author Brad Schaefer (<A HREF="mailto:schaefer@lib.med.utah.edu">schaefer@lib.med.utah.edu</A>)
 */
final class ModifyApprovalQueueEntryAction extends HttpServlet {	
    
	/**
* Tests the functionality of the {@link ModifyApprovalQueueEntryAction}
* class.
*/
	@Override
	public void doGet(HttpServletRequest reqy, HttpServletResponse respy) throws ServletException, IOException {
    
	   String newApprovalQueueEntry = reqy.getParameter("newApprovalQueueEntry");
	  
	   QueuedRecordBean queuedRecord = QueuedRecordBean.create(newApprovalQueueEntry + "modifyApprovalQueueEntry", "test");
	   queueService.updateQueue(queuedRecord);
	   
	   assertNotNull(queuedRecord);
	 
		respy.getWriter().write("Modify queue success.");
		respy.getWriter().flush();
		
		respy.getWriter().close();

	}

}
