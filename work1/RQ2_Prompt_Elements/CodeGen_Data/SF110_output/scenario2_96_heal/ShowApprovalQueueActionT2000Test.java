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
	* Test method with no parameter tests {@link ShowApprovalQueueAction#actionRequiresLogin()}.
	*
	* @throws IOException
	*
	*/
	@Test
	public void actionsWithoutParameterTest()
	throws ServletException, IOException {
		requestRequiresLogin(true);
	}
	
	/**
	* Test method with null parameter test {@link ShowApprovalQueueAction#actionRequiresLogin()}.
	*
	* @throws IOException
	*
	*/
	@Test (expected = ServletException.class)
	public void errorsInParameterTest() throws ServletException, IOException {
		requestRequiresLogin(true);
	}
	
	/**
	* Test method with valid parameter tests {@link ShowApprovalQueueAction#actionRequiresLogin()}.
	*
	* @throws ServletException
	*
	*/
	@Test
    public void actionParameterValidTest() throws ServletException {
		HttpServletRequest request = HttpServletRequest.getRequest(
			getClass().getCanonicalName(), "123", "junitApprovalQueue");
		// Check parameters
		assertEquals("123", request.getParameter("param1"));
		assertEquals("junitApprovalQueue", request.getParameter("param2"));
		String param3 = request.getParameter("param3");
		String param4 = request.getParameter("param4");
		assertNotNull(param4);
		requestRequiresLogin(true);
	}
	
	/**
	* Test method with an invalid parameter test {@link ShowApprovalQueueAction#actionRequiresLogin()}.
	*
	* @throws ServletException
	*
	*/
	@Test (expected = ServletException.class)
	public void errorsInInvalidParameterTest() throws ServletException {
		requestRequiresLogin(true);
	}
	
	/**
	* Test method that fetching the approval queue and checking permissions
	*
	* @throws ServletException
	*
	*/
	@Test
	public void testApprovalQueuePermission() throws ServletException {
		// Fetch the approval queue and check permissions
		List<QueueItem> approvalList = QueueDAO.getAllQueue();
		assertEquals("123", ApproverDAO.getA(approvalList, "param0")); // 0
		assertEquals((int) QueueDAO.GET_PUBLIC_QUEUE.value(), ApproverDAO.getA(approvalList, "param1")); // 1
		List<QueueItem> approvalList1 = QueueDAO.getA("p0", "param2"); // 2
		assertFalse(approvalList1.isEmpty());
		assertEquals("junitApprovalQueue", ApproverDAO.getA(approvalList1, "param1")); // 3
		List<QueueItem> approvalList2 = ApproverDAO.getA("p0", "param3"); // 4
		assertEquals(3, approvalList2.size());
		assertEquals("junitApprovalQueue", ApproverDAO.getA(approvalList2, "param1")); // 5
		List<QueueItem> approvalList3 = ApproverDAO.getP();
		assertTrue(approvalList3.isEmpty());
	}
	
	/**
	* Test method that fetching the approval queue and checking permissions and
	* checking permissions on a request parameter.
	*
	* @throws ServletException
	*
	*/
	@Test
    public void testApprovalQueuePermission1() throws ServletException {
		// Fetch the approval queue and check permissions
		List<QueueItem> approvalList = QueueDAO.getAllQueue();
		assertEquals("123", ApproverDAO.getA(approvalList, "param0")); // 0
		assertEquals((int) QueueDAO.GET_PUBLIC_QUEUE.value(), ApproverDAO.getA(approvalList, "param1")); // 1
		List<QueueItem> approvalList1 = ApproverDAO.getA("p0", "param2"); // 2
		assertFalse(approvalList1.isEmpty());
		assertEquals("junitApprovalQueue", ApproverDAO.getA(approvalList1, "param1")); // 3
		List<QueueItem> approvalList2 = ApproverDAO.getA("p0", "param3"); // 4
		assertEquals(1, approvalList2.size());
		assertEquals("junitApprovalQueue", ApproverDAO.getA(approvalList2, "param2")); // 5
		List<QueueItem> approvalList3 = ApproverDAO.getPA();
		assertFalse(approvalList3.isEmpty());
	}
	
}
