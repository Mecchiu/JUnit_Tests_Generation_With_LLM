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
		
	// Initialization
	private ShowApprovalQueueAction action;
	
	/**
	 * Constructor.
	 *
	 * @param actionClassName
	 * A class name.
	 *
	 * @throws InstantiationException
	 * If an 
	 * error occurs in the constructor of {@link ShowApprovalQueueAction}.
	 *
	 * @throws IllegalAccessException
	 * If 
	 * the constructor of {@link ShowApprovalQueueAction} is 
	 * not public.
	 */
	public ShowApprovalQueueActionTest(String actionClassName) {
	
		try {
			Class.forName(actionClassName);

		} catch (ClassNotFoundException e) {
			throw new IllegalStateException(String.format("The %s class cannot be loaded.", actionClassName));
		}
		
	}

	private String doLogin() {
		
		return AuthenticationTools.getCurrentUser(getServletContext()).getFirstName();
	}

	private void verifyResult(String s) throws IOException {
		
		HttpServletRequest request = ((HttpServletRequest) getRequestDispatcher("/ShowApprovalQueueActionTest.jsp").getServletRequest());
		
		request.setAttribute("FirstName", s);
		
		assertNotNull(AuthenticationTools.getCurrentUser(getServletContext()).getFirstName());
		assertNotNull(AuthenticationTools.getCurrentUser(getServletContext()).getName());
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ApprovalQueueTableTest.jsp");
		request = ((HttpServletRequest) dispatcher.getServletRequest());
		
		String expectedReturn = "user_role_to_approver:";
		String result = request.getHeader("user_role_to_approver");
		assertEquals(expectedReturn, result);
		List<QueueUserRole> listUsers = QueueDAO.getInstance().getListOfUsers();
		
		if(listUsers == null){
			request.setAttribute("ErrorMsg", "The List of users is null");

		}
		else{
			request.setAttribute("AllowedUsers", listUsers);
		}
		
	}
	
	private void verify() throws IOException {
		
		String firstName = "";
		
		try {
			firstName = doLogin();
			
		} catch (IOException e) {
			
			request = ((HttpServletRequest) getRequestDispatcher("/ApprovalQueueTableTest.jsp").getServletRequest());

			firstName = doLogin();
			
		}

		assertNotNull(AuthenticationTools.getCurrentUser(getServletContext()).getEmail());
		
		verifyResult(firstName);
	}

	@Test
	public void testAction() throws IOException, ServletException {
		verify();
	}

}