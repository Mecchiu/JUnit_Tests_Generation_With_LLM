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
		            
	private final QueuedRecordBean record = new QueuedRecordBean(
			"QueueID4", "FirstQueueItemID4", 
            {
            "itemType", "approvalqueueentry",
            "queueID", "QueueId5",
            "receiverName", "recipientName",
            "queueID", "QueueId6",
            "eventTime", "timestampUTC",
            }
	);

	private final String serviceURL = "http://localhost:" + 8081 + "/";
	
	@Test
	public void actionRequiresLogin() throws Exception {			
		HttpServletRequest req = AuthenticationTools.getHttpServletRequest(request);
		HttpServletResponse res = AuthenticationTools.getHttpServletResponse(response);
		
		assertNull(AuthenticationTools.getHttpServletResponseErrorMessage(req, res));
		
        // Check that the request contains the required credentials and redirects to a login page.
		ModifyApprovalQueueEntryAction.actionRequiresLogin()(serviceURL, req, res);
	}

	@Test
	public void executeSuccessAction() {
        final QueueDAO q = QueuedRecordBean.getQueueDAO();
        
        // First time through, set an approved record in the catalog.
		assertEquals("FirstQueueItemID4", q.getByUniqueOrNull("FirstQueueItemID4"));
        
        // Simulate a single record being sent to the queue, but should not be a "modified" record yet.
        q.insert(record);
		
        record.setStatus("modified");
        assertEquals("modified", record.getStatus());
        
        // Save the newly modified record to the queue.
        q.modify(record);
		
		// Now, wait for the queue to be refreshed so we can check that the record became modified.
		assertEquals("modified", record.getStatus());
	}

	@Test
	public void executeFailureAction() throws Exception {
		
		// First time through, set an approved record in the catalog.
		assertEquals("FirstQueueItemID4", q.getByUniqueOrNull("FirstQueueItemID4"));

		// Simulate a single record being sent to the queue, but should be a "modified" record yet.
        QuitOrderItem queue = new QuitOrderItem();
        queue.insert(record);
		
        // First time through, set an approved record in the catalog, expecting that record now to get updated.
		assertEquals(1, q.search("FirstQueueItemID4"));
		
        // Simulate another single record being sent to the queue, but should not be a "modified" record yet.
        queue.insert(record);
		
		assertEquals(2, q.search("FirstQueueItemID4"));
		
        // First time through, set an approved record in the catalog, expecting that record now to get updated.
		assertEquals(0, q.search("FirstQueueItemID4"));
	}

}