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
		
    /**
     * Empty method.
     */
    @Test
    public void cannotAccessMethodWithoutLoggedInDetails() {
        EditCopyrightHolderAction action = EditCopyrightHolderAction.getInstance(null, null, null, null, null, null, null, null);
        assertEquals("No copyright holder found", null, action.actionRequiresLogin());
    }
    
    /**
     * Test method for EditCopyrightHolderAction.perform.
     */
    @Test
    public void performsNoWorkOnNotLoggedIn() throws Exception {
        String username = "NotLoggedIn";
        String ipAddress = "NotLoggedIn";
        String firstName = "NotLoggedIn";
        String lastName = "";
        HttpServletRequest request = getHttpRequest(username, ipAddress, firstName, lastName);
        CompleteMetadataBean md = CompleteMetadataBean.getInstance();

        // Test case 1 (no changes needed): no metadata changes
        Action action1 = new EditCopyrightHolderAction(request, md, null, null, null, null);
        assertEquals("No copyright holder found", null, action1.actionRequiresLogin());
        perform(request, null, null);
        assertEquals("No copyright holder found", null, action1.actionRequiresLogin());

        // Test case 2 (changes in first name and last name): no changes
        request.setParameter("firstName", "NotLoggedIn");
        request.setParameter("lastName", "NotLoggedIn");
        action1 = new EditCopyrightHolderAction(request, md, null, null, null, null);
        perform(request, null, null);
        assertEquals("No copyright holder found", null, action1.actionRequiresLogin());

        // Test case 3 (changes in firstname and lastname but not secondname): first change required
        request.setParameter("firstName", "NotLoggedIn");
        request.setParameter("lastName", "NotLoggedIn");
        request.setParameter("secondName", "NotLoggedIn");
        action1 = new EditCopyrightHolderAction(request, md, null, null, null, null);
        perform(request, null, null);
        assertEquals("No copyright holder found", null, action1.actionRequiresLogin());

        // Test case 4 (no changes in firstName, first name, secondName, secondName)
        request.setParameter("firstName", "NotLoggedIn");
        request.setParameter("firstName", "NotLoggedIn");
        request.setParameter("lastName", "NotLoggedIn");
        request.setParameter("secondName", "NotLoggedIn");
        request.setParameter("thirdName", "NotLoggedIn");
        request.setParameter("fourthName", "NotLoggedIn");
        action1 = new EditCopyrightHolderAction(request, md, null, null, null, null);
        perform(request, null, null);
        assertEquals("No copyright holder found", null, action1.actionRequiresLogin());

        // Test case 5 (two changes, first and second)
        request.setParameter("firstName", "NotLoggedIn");
        request.setParameter("firstName", "NotLoggedIn");
        request.setParameter("secondName", "NotLoggedIn");
        request.setParameter("thirdName", "NotLoggedIn");
        action1 = new EditCopyrightHolderAction(request, md, null, null, null, null);
        request.setParameter("firstName", "NotLoggedIn");
        request.setParameter("secondName", "NotLoggedIn");
        perform(request, null, null);
        assertEquals("No copyright holder found", null, action1.actionRequiresLogin());
        
        // Test case 6 (one change to three changes, second and third)
        request.setParameter("secondName", "NotLoggedIn");
        request.setParameter("thirdName", "NotLoggedIn");
        request.setParameter("fourthName", "NotLoggedIn");
        action1 = new EditCopyrightHolderAction(request, md, null, null, null, null);
        request.setParameter("secondName", "NotLoggedIn");
        request.setParameter("fourthName", "NotLoggedIn");
        request.setParameter("thirdName", "NotLoggedIn");
        perform(request, null, null);
        assertEquals("No copyright holder found", null, action1.actionRequiresLogin());        
    }
    
    /**
     * Test method for {@link EditCopyrightHolderAction#actionRequiresLogin()}.
     */
    @Test
    public void performsTwoCopiesOfChanges() throws Exception {
        String username = "NotLoggedIn";
        String ipAddress = "NotLoggedIn";
        String firstName = "NotLoggedIn";
        String lastName = "NotLoggedIn";
        HttpServletRequest request = getHttpRequest(username, ipAddress, firstName, lastName);
        CompleteMetadataBean md = CompleteMetadataBean.getInstance();

        // Test case 1 (copies nothing): no changes
        Action action1 = new EditCopyrightHolderAction(request, md, null, null, null, null);
        perform(request, null, null);
        assertEquals("No copyright holder found", null, action1.actionRequiresLogin());

        Iterator<Copies> allCopiesIterator = md.getCopies().iterator();
        Copies copiedCopies = allCopiesIterator.next();
        Copies copiedCopies2 = allCopiesIterator.next();
        Copies copiedCopies3 = allCopiesIterator.next();
        Copies copiedCopies4 = allCopiesIterator.next();
        assertTrue("First copies must not become equal with second copies.", copiedCopies.copiesEquals(copiedCopies2));
        assertTrue("First copies must not become equal with third copies.", copiedCopies.copiesEquals(copiedCopies3));
        assertTrue("First copies must not become equal with forth copies.", copiedCopies.copiesEquals(copiedCopies4));
    }
    
    /**
     * Test method for {@link EditCopyrightHolderAction#getParameterNames()}.
     */
    @Test
    public void getParameterNames() throws ServletException {
        String username = "NotLoggedIn";
        String ipAddress = "NotLoggedIn";
        String firstName = "NotLoggedIn";
}
}