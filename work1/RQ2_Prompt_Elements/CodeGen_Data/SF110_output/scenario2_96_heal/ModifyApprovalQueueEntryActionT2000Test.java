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
	
		* Tests the functionality of this action by verifying that a logged in user can create a queue entry with the required action.
	
		*/
	@Test
	void successExpectedInCreateNewQueueEntry() {
		HttpServletRequest request = AuthenticationTools.loginAndRedirectToNext();
		request.getRequestDispatcher("/ajax.jsp").forward(request, request.getContextPath());
		assertNotNull(request.getAttribute("msg-header"));
		assertEquals("msg-success", request.getAttribute("msg-header"));
	}
	
	/**
	
		* Tests the functionality of this action by verifying that a un-pending queue entry can be read.
	
		*/
	@Test
	void successNoExpectedInReadQueueEntry() {
		HttpServletRequest request = AuthenticationTools.loginAndRedirectToNext();
		request.getRequestDispatcher("/ajax.jsp").forward(request, request.getContextPath());
		assertNull(request.getAttribute("msg-header"));
		assertTrue(!request.getAttribute("pending"));
	}
	
	/**
	
		* Tests the functionality of this action by verifying that a no-pending queue entry can be read.
	
		*/
	@Test
	void successfulNotExpectedInReadQueueEntry() {
		HttpServletRequest request = AuthenticationTools.loginAndRedirectToNext();
		request.getRequestDispatcher("/ajax.jsp").forward(request, request.getContextPath());
		assertEquals("msg-success", request.getAttribute("msg-header"));
		assertTrue(!request.getAttribute("pending"));
		assertTrue(!request.getAttribute("queue-entry-id"));
	}
	
	/**
	
		* Tests the functionality of this action by verifying that a no-pending queue entry can be approved.
	
		*/
	@Test
	void actionRequiresLoggedInUserToReadQueueEntry() {
		HttpServletRequest request = AuthenticationTools.loginAndRedirectToNext();
		request.getRequestDispatcher("/ajax.jsp").forward(request, request.getContextPath());
		assertEquals("msg-success", request.getAttribute("msg-header"));
		assertTrue(!request.getAttribute("queue-entry-id"));
		assertEquals("queued", request.getAttribute("pending-desc"));
		assertTrue(request.getAttribute("approval-comment-desc"));
		assertTrue(request.getAttribute("approval-comment-desc-formatted"));
	}
	
	/**
	
		* Test that reads a queue entry with the Pending
	
		*/
	@Test
	void actionRequiresLoggedInUserToReadNonPendingQueueEntry() {
		HttpServletRequest request = AuthenticationTools.loginAndRedirectToNext();
		request.getRequestDispatcher("/ajax.jsp").forward(request, request.getContextPath());
		assertEquals("msg-success", request.getAttribute("msg-header"));
		assertTrue(!request.getAttribute("queue-entry-id"));
		assertEquals("queued", request.getAttribute("pending-desc"));
		assertEquals("", request.getAttribute("approval-comment-desc"));
		assertEquals("pending", request.getAttribute("approval-comment-desc-formatted"));
	}
}
