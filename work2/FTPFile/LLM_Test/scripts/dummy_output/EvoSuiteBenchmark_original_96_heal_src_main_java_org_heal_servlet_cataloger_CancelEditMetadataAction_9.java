// CancelEditMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CancelEditMetadataAction}.
* It contains one unit test case for the {@link CancelEditMetadataAction#actionRequiresLogin()} method.
*/
class CancelEditMetadataActionTest {
		
    @Test
	public void testActionRequiresLogin() throws Exception{
		String username = "foo";
		String password = "bar";
        
        // Create server
        CancelEditMetadataAction servlet = new CancelEditMetadataAction();
        
        // Login
        assertFalse("The operation should not be authorized.",
                servlet.actionRequiresLogin(username, password));
        
        RequestDispatcher req = servlet.getDerivedRequest(request);
        assertFalse("The request should not be authorized.",
                servlet.actionRequiresLogin(username, password));
        
        assertFalse("The operation should not be authorized.",
                req.getRequestDispatcher("/catalog") == null);
        assertFalse("The request should not be authorized.",
                req.getRequestDispatcher("/catalog/search") == null);
    }        
}