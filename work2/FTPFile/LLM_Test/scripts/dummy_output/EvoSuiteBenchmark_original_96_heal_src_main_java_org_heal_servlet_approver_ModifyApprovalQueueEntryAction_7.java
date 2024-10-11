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
	 * @return <code>true</code>
	 */
	public boolean actionRequiresLogin();

	/**
	 * Test the {@link ModifyApprovalQueueEntryAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method of the {@link ModifyApprovalQueueEntryAction} object.
	*/
	@Test
	public final void testActionIsActionRequiresLogin() {
		assertTrue(actionRequiresLogin());
	}

	/**
	* Test the {@link ModifyApprovalQueueEntryAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method of the {@link ModifyApprovalQueueEntryAction} object.
	*/
	@Test
	public final void testActionIsPerformIsApprovalQueueEntryAction() {
		new ModifyApprovalQueueEntryAction().perform(null, null, null);
	}

	/**
	* Test the {@link ModifyApprovalQueueEntryAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method of the {@link ModifyApprovalQueueEntryAction} object.
	*/
	@Test(expected = RuntimeException.class)
	public final void testActionIsPerformWithNullObject() {
		new ModifyApprovalQueueEntryAction().perform(new HttpServletRequest(), null, null);
	}

    /**
     * Test the modifiable version of an approve queue entry.
     *
     */
	@Test
	public final void testModifyApprovalQueueEntryWithApprovalQueueEntryIsModifiable() {
		
		new QueueDAO(new QueueDAO.Type(QueueDAO.Type.type)).delete(null);
		
		assertTrue(ModifyApprovalQueueEntryAction.actionRequiresLogin());
		
		final QueueDAO queueDAO = ApplicationTools.setupQueueDAO();
		
		Long approvedQueueEntryId = queueDAO.approve("New approve queue entry");
		
		assertNotNull(approvedQueueEntryId);
		
		queueDAO.approve(approvedQueueEntryId, "testing it goes");
		
		final QueuedRecordBean record = new QueuedRecordBean(queueDAO, null);

		final String text = record.getText();
		
		assertEquals("Adding approve with ApprovalQueueEntryAction, approve queue entry with id: "+record.getId(), "Adding approve with ApprovalQueueEntryAction, approve\nthe queue entry with id: "+approvedQueueEntryId+"\n...text: "+text, text);
		
		queueDAO.delete(approvedQueueEntryId);
	}

	/**
	* Test the modifiable version of a reject queue entry.
	*
	*/
	@Test
	public final void testModifyApprovalQueueEntryWithApprovalQueueEntryIsModifiableWithPeriod() {
		
		new QueueDAO(new QueueDAO.Type(QueueDAO.Type.type)).delete(null);
		
		assertTrue(ModifyApprovalQueueEntryAction.actionRequiresLogin());
		
		final QueueDAO queueDAO = ApplicationTools.setupQueueDAO();
		
		Long approvedQueueEntryId = queueDAO.approve("New approve queue entry");
		
		assertNotNull(approvedQueueEntryId);
		
		queueDAO.reject(approvedQueueEntryId, "testing it goes");
		
		final QueuedRecordBean record = new QueuedRecordBean(queueDAO, null);
		
		final String text = record.getText();
		
		assertEquals("Adding reject with ApprovalQueueEntryAction, reject queue entry with id: "+record.getId(), "Adding reject with ApprovalQueueEntryAction, reject the queue entry with id: "+approvedQueueEntryId+"\n...text: "+text, text);
		
		queueDAO.delete(approvedQueueEntryId);
	}

	/**
	* Test the modifiable version of a reject queue entry.
	*/
	@Test
	public final void testModifyApprovalQueueEntryWithApprovalQueueEntryIsModifiableWithAuthorization() {
		
		new QueueDAO(new QueueDAO.Type(QueueDAO.Type.type)).delete(null);
		
		assertTrue(ModifyApprovalQueueEntryAction.actionRequiresLogin());
		
		final QueueDAO queueDAO = ApplicationTools.setupQueueDAO();
		
		final String approvedAuthorizationId = "testing its authorization";
		Object obj = null;
		
		queueDAO.approve(null, approvedAuthorizationId);

		try {
			obj = AuthenticationTools.requestUser();
			
			QueueDAO.QueueList.authorization("testing its authorization", obj);
			
		} catch(RuntimeException ex) {
			
			System.err.println(ex);
			assertTrue(false);
		}
		
		queueDAO.reject(null, approvedAuthorizationId, "testing it goes");
		
		final QueuedRecordBean record = new QueuedRecordBean(queueDAO, null);
		
		assertFalse(record.getText().startsWith("Adding reject with ApprovalQueueEntryAction"));
	}

}