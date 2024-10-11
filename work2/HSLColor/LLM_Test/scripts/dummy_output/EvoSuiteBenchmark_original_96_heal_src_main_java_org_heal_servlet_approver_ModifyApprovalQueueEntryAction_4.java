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
		public void testActionRequiresLogin() throws IOException, ServletException {
			// given
        Long userId = (Long) (AuthenticationTools.isSessionAuth()? "testUserId" : null);
        Integer appQueueItemId = 1;
        String appQueueItemValue = "1";
        Long queueId = QueueDAO.get(userId, appQueueItemId, QueuedRecordBean.DBConstants.QueueItemStates.RUNNING).getId();
        Long appQueueItemId2 = QueueDAO.get(userId, appQueueItemId, QueuedRecordBean.DBConstants.QueueItemStates.RUNNING).getId();
        Long appQueueItemId3 = QueueDAO.get(userId, appQueueItemId, QueuedRecordBean.DBConstants.QueueItemStates.NOT_RUNNING).getId();
		        // when
			// assertGet("/approver/modifyApprovalQueueEntryAction", appQueueItemId)
			// contains:
			// 1/ appQueueItemId can't be changed for an application queue item with a state of RUNNING
			String response = action(appQueueItemId2, userId, appQueueItemValue, queueId, "", userId).toString();
			assertGet("/approver/modifyApprovalQueueEntryAction", appQueueItemId2).contains(response);
		        // then
			// assertGet("/approver/modifyApprovalQueueEntryAction", appQueueItemId3)
			// does not contain:
			// 1/ appQueueItemId can't be changed for an application queue item with a state of RUNNING OR NOT_RUNNING
			String response2 = action(appQueueItemId2, userId, appQueueItemValue, queueId, "", userId).toString();
			assertGet("/approver/modifyApprovalQueueEntryAction", appQueueItemId2).doesNotContain(response2);

		}

		private String action(Long appQueueItemId, Long userId, String appQueueItemValue, Long queueId, String queueType, Long userId2) throws IOException, ServletException
		{
			String response = HttpServletResponse.SC_BAD_REQUEST;
			// given
            // act when
			// assertGet("/approver/modifyApprovalQueueEntryAction?qiu={i.id}", i.id).equals(appQueueItemId)
			// is true
			// then
			// assertGet("/approver/modifyApprovalQueueEntryAction?qiu={i.id}", i.id).equals(appQueueItemId)
			// is false
			QueueDAO.update(queueId, QueuedRecordBean.DBConstants.QueueItemStates.RUNNING, QueuedRecordBean.DBConstants.AppQueueItemStates.PROCESSING, appQueueItemId, appQueueItemValue, userId2);
			QueueDAO.update(queueId, QueuedRecordBean.DBConstants.QueueItemStates.NOT_RUNNING, QueuedRecordBean.DBConstants.AppQueueItemStates.PROCESSING, appQueueItemId, appQueueItemValue, userId);
			QueueDAO.delete(queueId);
			QueueDAO.purge();
			return response + response2;
		}


		private Long[] testSetQueueItem(Long appQueueItemId, int appQueueItemValue, Long appQueueItemId2, boolean queueType, Long userId2) throws IOException, ServletException
		{
			Long[] results = new Long[7];
			QueueDAO.update(appQueueItemValue.intValue(), QueuedRecordBean.DBConstants.QueueItemStates.RUNNING, queueType, appQueueItemId2, appQueueItemId.intValue());
			QueueDAO.delete(appQueueItemId2);
			for (int i = 0; i < 5; i++) {
				QueueDAO.update(appQueueItemValue.intValue(), queueType, appQueueItemId.intValue(), appQueueItemId2.intValue(), appQueueItemValue.intValue());
			}
			QueueDAO.delete(appQueueItemId2);
			QueueDAO.purge();
			for (int i = 0; i < 7; i++) {
				results[i] = QueueDAO.get(queueType,  appQueueItemId2.intValue());
			}
			return results;
		}
}