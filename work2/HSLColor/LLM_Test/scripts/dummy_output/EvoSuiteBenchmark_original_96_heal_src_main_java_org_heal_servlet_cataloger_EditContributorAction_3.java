// EditContributorActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContributorBean;
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
* Test class of {@link EditContributorAction}.
* It contains one unit test case for the {@link EditContributorAction#actionRequiresLogin()} method.
*/
class EditContributorActionTest {
		
    /**
     * Test method for {@link EditContributorAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}.
     * This method is only called when a login is required to edit an existing Contributor.
     * It tests the functionality.
     * @throws IOException an exception which should never be thrown
     * @throws ServletException an exception which should never be thrown
     */
    @Test
    public void testAction() throws IOException, ServletException {
        ContributorBean cNew = new ContributorBean();
        cNew.setUsername("newusername");
        cNew.setPassword("newpassword");
        CompleteMetadataBean completeMetadataBean = new CompleteMetadataBean();
        cNew.setCompleteMetadata(completeMetadataBean);
        
        EditContributorAction action = new EditContributorAction();
        action.perform(null, null, null);
        
    }

    /**
     * Test method for {@link EditContributorAction#perform(HttpServletRequest, HttpServletResponse)}.
     * This method is only called when an existing Contributor has found by checking if it has 
     * a username which doesn't already exist.
     * It tests the functionality.
     * @throws IOException an exception which should never be thrown
     * @throws ServletException an exception which should never be thrown
     */
    @Test
    public void testActionWithExistingUsernameDoesNotExist() throws IOException, ServletException {
        ContributorBean cExisting =  new ContributorBean();
        cExisting.setUsername("existingusername");
        
        EditContributorAction action = new EditContributorAction();
        action.perform(null, null, null);

    }

	/**
	 * Test method for {@link EditContributorAction#perform(HttpServletRequest, HttpServletResponse)}.
	 * This method is only called when no existing Contributor has found by checking if it has 
	 * a new username.
	 * This method tests the functionality.
	 * @throws IOException an exception which should never be thrown
	 * @throws ServletException an exception which should never be thrown
	 */
	@Test
    public void testActionWithNoUsername() throws IOException, ServletException {
		EditContributorAction action = new EditContributorAction();
		action.perform(null, null, null);
	}

	/**
	 * Test method for {@link EditContributorAction#getRequestDispatcher()}.
	 * It tests the functionality.
	 * @throws IOException an exception which should never be thrown
	 * @throws ServletException an exception which should never be thrown
	 */
	@Test
    public void testGetRequestDispatcher() throws IOException, ServletException {
        EditContributorAction action = new EditContributorAction();
        Iterator<RequestDispatcher> expected = null;
        RequestDispatcher actual = action.getRequestDispatcher();
        expected = expected==null? expected : expected.iterator();
        assertNotNull("getRequestDispatcher is not supposed to return a null RequestDispatcher", actual);
        if (expected!=null){
        	assertTrue("getRequestDispatcher is supposed to return an empty RequestDispatcher object ", expected.hasNext());
           assertEquals(expected.next(), actual);
        }
	}

	/**
	 * Test method for {@link EditContributorAction#isActionRequiresLogin()}.
	 * This method tests the functionality.
	 * @throws IOException an exception which should never be thrown
	 * @throws ServletException an exception which should never be thrown
	 */
	@Test
    public void testIsActionRequiresLogin() throws IOException, ServletException{
        EditContributorAction action = new EditContributorAction();
        assertTrue("isActionRequiresLogin is supposed to return true", action.isActionRequiresLogin());
    }

}