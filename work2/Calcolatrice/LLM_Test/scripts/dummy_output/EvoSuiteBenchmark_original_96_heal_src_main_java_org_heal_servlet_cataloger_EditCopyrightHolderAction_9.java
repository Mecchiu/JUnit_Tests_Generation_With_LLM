// EditCopyrightHolderActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditCopyrightHolderAction}.
* It contains one unit test case for the {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
*/
class EditCopyrightHolderActionTest {
		
	// Test cases
	
	/**
	 * Performs an action requiring login.  We assume that
	 * a user is not logged in before we try to login.
	 * @throws IOException 
	 * @throws ServletException 
	*/
	@Test
	public void testActionRequiresLogin() throws IOException, ServletException {
		assertFalse("User is not logged in from EditCopyrightHolderAction", EditCopyrightHolderAction.actionRequiresLogin());
	}

	/**
	 * Perform the action and we assert that the copyright holder
	 * changes the copyright holder.  We call {@link EditCopyrightHolderAction#perform(javax.servlet.http.HttpServlet, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)} with the 
	 * first argument being the servlet request.
	 * @throws IOException 
	* @throws ServletException 
	*/
	@Test
	public void testPerformWithServletRequest() throws IOException, ServletException {

		EditCopyrightHolderAction action = new EditCopyrightHolderAction();
		HttpServletRequest req = new EditCopyrightHolderRequest(new String[]{"AUTHOR", "EDITOR"});
		
		Iterator<CopyrightHolderBean> itm = action.perform(req, new CompleteMetadataBean(""), null);
		assertTrue("User was expected to have edited his copyrightholder", itm.hasNext());

		// Check the first one 
		assertTrue("Wrong copyright", itm.next().isCopyright());
		assertEquals("Wrong first author", "AUTHOR", itm.next().getAuthor());
		assertEquals("Wrong first editor", "EDITOR", itm.next().getEditor());
		
		// Check the second one
		itm = action.perform(req, new CompleteMetadataBean(""), null);
		assertTrue("User was expected to have edited his new copyright", itm.hasNext());
		assertEquals("Wrong second copyright", itm.next().getAuthor(), "AUTHOR");
		assertEquals("Wrong second editor", itm.next().getEditor(), "EDITOR");
	}
}