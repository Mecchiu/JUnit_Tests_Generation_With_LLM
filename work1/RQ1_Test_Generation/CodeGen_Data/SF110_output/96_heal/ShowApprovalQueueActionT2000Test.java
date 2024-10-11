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

	@org.junit.jupiter.api.Test
	void testWithoutLogin() throws IOException, ServletException {
		assertNotNull(QueueDAO.dao);
		assertNotNull(QueueDAO.dao.findApprovalQueue());
	}


	@org.junit.jupiter.api.Test
	void testWithAuthentification() throws IOException, ServletException {
		assertNotNull(QueueDAO.dao);
		assertNotNull(QueueDAO.dao.findApprovalQueue());

		AuthenticationTools.authenticate(SessionUtils.getCurrentJwt(request));
		verifyRequest();
	}


	@org.junit.jupiter.api.Test
	void testWithAuthentificationAndWrongPassword() throws IOException, ServletException {
		assertNotNull(QueueDAO.dao);
		assertNotNull(QueueDAO.dao.findApprovalQueue());

		AuthenticationTools.authenticate(SessionUtils.getCurrentJwt(request), "wrongpasswd");
		fail();
	}


	@Test
	void testWithSimpleAccessDeniedException() throws IOException, ServletException {
		assertNotNull(QueueDAO.dao);
		final List approvalQueue = QueueDAO.dao.getApprovalQueue();
		assertNotNull(approvalQueue);
		assertTrue(approvalQueue.isEmpty());

		// try {
			Thread.sleep(30000l);
		// } catch (InterruptedException e) { fail(e.getMessage()); }
	}


	@Test
	void testWithSimpleAccessDeniedExceptionWithEmptyQueue() throws IOException, ServletException {
		assertNotNull(QueueDAO.dao);
		final List approvalQueue = QueueDAO.dao.getApprovalQueue();
		assertNotNull(approvalQueue);
		assertNotEquals(approvalQueue.size(), 0);

		// try {
			Thread.sleep(30000l);
		// } catch (InterruptedException e) { fail(e.getMessage()); }
	}


	@Test
	void testWithSimpleAccessDeniedExceptionWithOverLimit() throws IOException, ServletException {
		assertNotNull(QueueDAO.dao);
		final List approvalQueue = QueueDAO.dao.getApprovalQueue();
		assertNotNull(approvalQueue);
		assertFalse(approvalQueue.isEmpty());
		assertTrue(approvalQueue.size() > 10000);
		assertNotEquals(approvalQueue.size(), 0);

		//
		List approvalQueue = QueueDAO.dao.getApprovalQueue();
		
		int size = approvalQueue.size();
		// the number of apps that have been marked to be active since the last time the app was marked
		int approvalStart = queueManager.getApprovalState(approvalQueue.get(0)).getActiveAppCount() - 1;
		// set up
		advanceApprovalQueue(approvalQueue, approvalStart);
		assertTrue(queueManager.getApprovalState(approvalQueue.get(approvalQueue.size() - 1)).getActiveAppCount() == approvalStart);

		// try {
			Thread.sleep(30000l);
		// } catch (InterruptedException e) { fail(e.getMessage()); }
	}


	@Test
	void testWithSimpleAccessDeniedExceptionAndWrongApprovalQueueOrderAsc() throws IOException, ServletException {
		assertNotNull(QueueDAO.dao);
		final List approvalQueue = QueueDAO.dao.getApprovalQueue();
		assertNotNull(approvalQueue);
		assertTrue(approvalQueue.isEmpty());

		//
		List approvalQueue = QueueDAO.dao.getApprovalQueue();
		advanceApprovalQueue(approvalQueue, approvalQueue.size() - 1);
		assertTrue(approvalQueue.size() == 0);

	}


	void advanceApprovalQueue(List approvalQueue, int i) {
		for (int j = 0; j < i && i > 0; j++) {
			approvalQueue.add(approvalQueue.get(i - 1));
		}
	}
}
