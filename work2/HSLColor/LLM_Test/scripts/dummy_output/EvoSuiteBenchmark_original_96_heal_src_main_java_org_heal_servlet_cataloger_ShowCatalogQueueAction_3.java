// ShowCatalogQueueActionTest.java
package org.heal.servlet.cataloger;

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
* Test class of {@link ShowCatalogQueueAction}.
* It contains one unit test case for the {@link ShowCatalogQueueAction#actionRequiresLogin()} method.
*/
class ShowCatalogQueueActionTest {
		
	/**
	 * We need an initial test suite
	 * because, the framework uses the login-login authentication mechanism to get access to 
	 * our catalog.
	 */
	@javax.annotation.ParametersAreNonnullByDefault
	@Test
	public void testExecuteInServletContext() throws ServletException {
		assertExecuteWithContext(
				getServletContext(),
				(request, response) -> new ShowCatalogQueueAction().actionRequiresLogin(),
				"/catalog");
	}
		
    /**
     * Test method for {@Link ShowCatalogQueueAction#actionRequiresLogin()}.
     */
    @Test
    public void testExecuteServletRequest() throws ServletException {
        assertExecuteReturnHttpServletReturn(
                "/catalog", true,
                null);
    }

    /**
     * Test method for {@Link ShowCatalogQueueAction#actionRequiresLogin()}.
     */
    @Test
    public void testExecuteServletResponse() throws ServletException {
        assertExecuteReturnHttpServletReturn(
                "/catalog", false,
                null);
    }
}