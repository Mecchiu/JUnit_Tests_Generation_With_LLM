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
@javax.inject.Inject
		QueueDAO dao;
		
	
		RequestDispatcher dispatch;
		@Test
		public void test_actionRequiresLogin() {
			// setup
			// setup expected action result
			String q_id = "P001";
			List<ApprovalQueue> approvalQueueList = dao.queryByQueueId(q_id);
			assertEquals("Unexpected approved queue list", 1, approvalQueueList.size());
			ApprovalQueue approvalQueue = approvalQueueList.get(0);
			assertEquals("Unexpected id", q_id, approvalQueue.getId());
			assertEquals("Unexpected name", "p001", approvalQueue.getDescription());
			assertNotNull("Non-null approval queue", approvalQueue);
			assertFalse("Null approval queue", approvalQueue.getName().equals("p001"));
			assertString("Unexpected title", "P001", approvalQueue.getHeaderName());
			assertEquals("Unexpected description", "Approval queue name", approvalQueue.getHeaderDescription());
			assertString("Unexpected location", "", approvalQueue.getLocation());
			assertTrue("Unexpected approval type", approvalQueue.isApproval());
			Action result = this.actionRequiresLogin();
			List<String> expectedActions = 
			this.dao.queryByName("");
			assertNotNull("Unexpected actions", expectedActions);
			assertFalse("Unexpected list", expectedActions.isEmpty());
			
			assertFalse("Unexpected action result", result.actionRequiresLogin());
			assertNotNull("Non-null action results", result.getActions());
			assertFalse("Unexpected number of actions", result.getActions().isEmpty());
		}
		
		/**
		 * Test that the view displays actions based on an approved queue, as expected.
		 */
		private Action actionRequiresLogin() {
			// setup
			AuthenticationTools auth = new AuthenticationTools();
			String admin = "admin";
			String name = "name";
			String q_name = "p001";
			String auth_id = "123";
			String description = "description";
			String location = "location";
			String location_sublocation = "location sublocation";
			List<ApprovalQueue> approvalQueueList = dao.queryByQueueId(q_id);

			return new ShowApprovalQueueAction(
				auth.getAuthorization(admin, name, auth_id),
				location,
				location_sublocation,
				q_name
			) {
				
				List<Approval> approvalList = new java.util.AbstractList().toList();
				List<String> expectedActions = 
					this.dao.queryByName("");
				// query actions for approved queue
				expectedActions = this.dao.queryAllButNot(this.dao.queryAllButByNameAndStatus(this.dao.queryAllButNot(this.dao.queryAllButByNameAndStatus(this.dao.queryByName(this.dao.queryAllButByNameAndStatus(this.dao.queryByDescriptionAndLocation(q_name, location_sublocation), this.dao.queryAllNot(this.dao.queryAllNotAndDescriptionAndLocationNot(this.dao.queryAllByAuthorizationNot(this.dao.queryAllByName(name)), this.dao.queryAllByDescriptionNot(description)))))))).toList();
				
				assertEquals("Unexpected actions list", 1, approvalQueueList.size());
				ApprovalQueue approvalQueue = approvalQueueList.get(0);
				assertEquals("Unexpected name", q_name, approvalQueue.getHeaderName());
				assertEquals("Unexpected location", location, approvalQueue.getHeaderLocation());
				assertEquals("Unexpected auth type", this.dao.queryById(auth_id), approvalQueue.getHeaderAuthorization());
				assertEquals("Unexpected description", description, approvalQueue.getHeaderDescription());

				if (expectedActions.isEmpty()) {
					fail("Unexpected actions from result.");
				}

				return (Action) this.dao.queryByName(expectedActions.toArray());
			};
		}
}
