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
		
	/**
	 * Test method: {@link org.heal.servlet.approver.ShowApprovalQueueAction#actionRequiresLogin()}
	 */
	@Test
	public void testActionRequiresLogin() {
		assertEquals(true, ShowApprovalQueueAction.this.actionRequiresLogin());
	}
	
	/**
	 * Test method: {@link org.heal.servlet.approver.ShowApprovalQueueAction#actionRequiresLogin()}
	 */
	@Test
	void testRunWithoutUserInfo() {
		boolean passed = false;
		try {
			PassingQueueDAO queueDAO = (PassingQueueDAO) QueueDAO.makeQueueDAO();
			List userInfoList = queueDAO.getUserInfoList();
			assertNotNull("There should be a list of userInfo if passed.", userInfoList);
			List list = AuthenticationTools.createDelegatedUserInfo();
			request = null;
			response = null;
			assertFalse("There should no userInfo if passed.", list.isEmpty());
			passed = true;
			assertEquals(2, list.size());
			Set<String> users = QueueDAO.findUserIDByList(list);
			assertTrue("The user's ID should be part of the users list.", users.contains("John Doe"));
			assertTrue("The user's ID should be part of the users list.", users.contains("Bobby Doe"));
		} catch (IOException e) {
			fail("Exception thrown: " + e.getMessage());
		} catch (ServletException e) {
			fail("Exception thrown: " + e.getMessage());
		}
		assertTrue("The user's ID should be part of the users list.", passed == true);

	}
		
	/**
	 * Test method: {@link org.heal.servlet.approver.ShowApprovalQueueAction#run()}
	 */
	@Test
	public void testRun() {
		String actionId = "actionId";
		String role = "role";
		String accessLevel = "accessLevel";
		String user = "user";
		List list = QueueDAO.getAllUsers();
		assertNotNull("Should have a list of users.", list);
		request = null;
		response = null;
		assertEquals("Action list must be one item.", 1, list.size());
		Action[] acts = (Action[])list.toArray(new Action[1]);
		QueueDAO queueDAO = (QueueDAO) QueueDAO.makeQueueDAO();
		Action approver = queueDAO.getActUserById(queueDAO, user);
		assertEquals("Action is supposed to be approver", approver, acts[0]);

		request = new HttpServletRequest() {

			@Override
			public String getParameter(String key) {
				return "";
			}

		};
		response = new HttpServletResponse();
		RequestDispatcher rd = null;
		try {
			rd = request.getRequestDispatcher("org/heal/servlet/approval/ShowApprovalQueueAction.jsp");
			assertEquals("RequestDispatcher return null.", "/", rd.includeRequestURL().getPath());
		} catch (ServletException e) {
			fail("ServletException should not have been thrown.");
		} catch (IOException e) {
			fail("IOException should not have been thrown.");
		}
		assertNotNull("Rd from action should still exist.", rd);
	}

}