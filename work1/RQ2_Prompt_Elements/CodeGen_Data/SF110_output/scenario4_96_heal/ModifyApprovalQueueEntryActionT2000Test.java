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
private final String APPROVE = "Approval/ApplicationQueue/Queue";

		/**
		 * Test method for {@link ModifyApprovalQueueEntryAction#actionRequiresLogin()}.
		 */
		@Test
public void test() {
		if (!AuthTools.authorizeApproverOrNonApprover(request(), response(), (String)null)) {
			fail("Should authorize access for modification of approval queue entries");
		}
	}

    /**
     * Tests modification of approval queue entry
     */
    @Test
    public void testApprovalQueueEntry() throws IOException, ServletException, Exception {
        HttpServletRequest request = new ModifyApprovalQueueEntryAction.ModifyApprovalQueueEntryRequest(true, APPROVE, "SomeApplicationQueue/QueueName", QueueDAO.TABLE);
        HttpServletResponse response = new ModifyApprovalQueueEntryAction.ModifyApprovalQueueEntryResponse(true, APPROVE, false, QueuedRecordBean.TABLE, "");
        final ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
        assertNotNull(action);
        assertFalse(action.actionRequiresLogin());
        
        final QueuedRecordBean queuedRecord = new QueuedRecordBean();
        request.setParameter("queueName", queuedRecord);
        request.setParameter(QueueDAO.FIELD_FIELD_QUEUE_NAME, queuedRecord.getQueueName());
        request.setParameter("queueFields", QueuedRecordBean.TABLE);
        request.setParameter((String)null, QueuedRecordBean.FIELD_FIELD_QUEUE_ADDED, queuedRecord.getQueueAddDate());
        final String result = action.perform(request, response);
        assertTrue("Check number of records added", queuedRecord.getQueueAddedCount() >= 1);
        queuedRecord.setQueueAddedCount(queuedRecord.getQueueAddedCount() - 1);
        request.setParameter(QueueDAO.FIELD_FIELD_QUEUE_ADDED, queuedRecord.getQueueAddDate());
        final String responseString = action.perform(request, response);
        assertEquals("Check queue updated", queuedRecord.getQueueUpdatedDate(), new Date());
        queuedRecord = QueuedRecordBean.loadById(queuedRecord.getQueueAddDate());
        assertNotNull("Check queue record found", queuedRecord);
        request.setParameter((String)null, QueuedRecordBean.FIELD_FIELD_QUEUE_UPDATE_DATE, queuedRecord.getQueueUpdateDate());
        final String result2 = action.perform(request, response);
        assertComparing("Check queue updated", result, result2);
        
        // clean queue
        request.setParameter(QueueDAO.FIELD_FIELD_QUEUE_REQUEST, request.getParameter(QueueDAO.FIELD_FIELD_QUEUE_REQUEST));
        request.setParameter(QueueDAO.FIELD_FIELD_QUEUE_REQUEST_ID, "");
        final String responseString2 = action.perform(request, response);
        assertEquals("Check queue request removed", queuedRecord.getQueueRequest(), "");
    }

	/**
	 * Test set of non-applicable parameters.
	 * @throws ServletException
     */
    @Test
    public void testNonApplicableApprovalQueueValues() throws ServletException {
        HttpServletRequest request = new ModifyApprovalQueueEntryAction.ModifyApprovalQueueEntryRequest(true, APPROVE, "SampleQueue/QueueName", QueueDAO.TABLE);
        String[] notApplicableFields = new String[QueueDAO.NUM_FIELDS];
        for (int i=0; i<QueueDAO.NUM_FIELDS; i++) {
            notApplicableFields[i] = QueuedRecordBean.FIELD_FIELD_QUEUE_ADDED;
        }
        HttpServletResponse response = new ModifyApprovalQueueEntryAction.ModifyApprovalQueueEntryResponse((String[])null, 0, true, QueuedRecordBean.TABLE, notApplicableFields);
        final ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
        assertNotNull(action);
        assertFalse(action.actionRequiresLogin());
        
        final QueuedRecordBean queuedRecord = new QueuedRecordBean();
        request.setParameter("queueName", queuedRecord);
        request.setParameter(QueueDAO.FIELD_FIELD_QUEUE_REQUEST_ID, 0);
        final String responseString = action.perform(request, response);
        assertTrue("Check number of records removed", queuedRecord.getQueueRequest() == 0);
    }
	/**
	 * Test set of application and non-applicable parameters.
	 * @throws ServletException
     */
    @Test
    public void testApprovalQueueValues() throws ServletException {
        HttpServletRequest request = new ModifyApprovalQueueEntryAction.ModifyApprovalQueueEntryRequest(true, APPROVE, "SampleQueue/QueueName", QueueDAO.TABLE);
        String[] availableFields = new String[QueueDAO.NUM_FIELDS];
        for (int i=0; i<QueueDAO.NUM_FIELDS; i++) {
            availableFields[i] = QueuedRecordBean.FIELD_FIELD_QUEUE_ADDED;
            availableFields[i] = QueuedRecordBean.FIELD_FIELD_QUEUE_REQUEST_ID;
        }
        HttpServletResponse response = new ModifyApprovalQueueEntryAction.ModifyApprovalQueueEntryResponse((String[])null, 0, true, QueuedRecordBean.TABLE, availableFields);
        final ModifyApprovalQueueEntryAction action = new ModifyApprovalQueueEntryAction();
        assertNotNull(action);
        assertFalse(action.actionRequiresLogin());
        
        final QueuedRecordBean queuedRecord = new QueuedRecordBean();
        request.setParameter("queueName", queuedRecord);
        request.setParameter(QueueDAO.FIELD_FIELD_QUEUE_REQUEST_ID, 0);
        final String responseString = action.perform(request, response);
        assertTrue("Check number of records removed", queuedRecord.getQueue