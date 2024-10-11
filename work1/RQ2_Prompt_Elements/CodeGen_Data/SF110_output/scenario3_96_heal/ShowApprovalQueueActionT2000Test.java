// ShowApprovalQueueActionTest.java
package org.heal.servlet.approver;

import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ShowApprovalQueueAction}.
* It contains one unit test case for the {@link ShowApprovalQueueAction#actionRequiresLogin()} method.
*/
class ShowApprovalQueueActionTest {

	@Test
    public void test() throws Exception {
    	
    	HttpServletRequest request = new MockHttpServletRequest();
    	HttpServletResponse response = new MockHttpServletResponse();

    	// Get a mock catalog dao
    	QueueDAO dao = QueueDAO.init();

    	// Check that "none" is shown in the queue
    	request.setAttribute("_type", "none");
    	request.setAttribute("_id", "none");
    	request.setAttribute("_count", "1");
    	request.setAttribute("_total", "1");
    	
    	assertEquals("_type", "none", QueueDAO.getStatus(request));
    	assertEquals("_id", "none", QueueDAO.getId(request));
    	assertEquals("_count", "1", QueueDAO.getCount(request));
    	assertEquals("_total", "1", QueueDAO.getTotal(request));
    	
    	// Verify that the queue with "none" was shown in the queue details
    	assertNotEquals("_type", "none", QueueDAO.getStatus(request));
    	assertEquals("_id", "none", QueueDAO.getId(request));
    	assertEquals("_count", "1", QueueDAO.getCount(request));
    	assertEquals("_total", "1", QueueDAO.getTotal(request));
    	
    	// Fetch only the approval queue details
    	request.setAttribute("_type", "approving");
    	request.setAttribute("_id", "approving");
    	request.setAttribute("_count", "2");
    	request.setAttribute("_total", "1");
    	
    	List<QueueDetails> queueDetails = QueueDAO.fetchDetails(request, true);
    	assertEquals("_count", "2", queueDetails.size());
    	QueueDetails approvedQueueDetails = queueDetails.get(0);
    	assertEquals("_total", "1", approvedQueueDetails.getTotal());
    	assertEquals("_type", "approving", approvedQueueDetails.getType());
    	assertNotEquals("_id", "approving", approvedQueueDetails.getItem());
    	assertNotEquals("_item", "approving", QueueDAO.getItem(request));
    	
    	List<QueueDetails> rejectedQueueDetails = queueDetails.get(1);
    	assertEquals("_count", "2", rejectedQueueDetails.size());
    	rejectedQueueDetails.get(0).setItem("rejected");
    	assertEquals("_type", "rejected", rejectedQueueDetails.get(0).getType());
    	assertEquals("_id", "rejected", rejectedQueueDetails.get(0).getItem());
    	
    }
}

