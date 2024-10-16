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
* It contains ten unit test cases for the {@link ShowCatalogQueueAction#actionRequiresLogin()} method.
*/
class ShowCatalogQueueActionTest {
		
	/**
	* Test case for {@link ShowCatalogQueueAction#actionRequiresLogin()} method.
	* It tests the method with the following assumptions:
	* <ul>
	* <li>The method returns true.</li>
	* </ul>
	*/
	@Test
	void testActionRequiresLogin() {
		ShowCatalogQueueAction showCatalogQueueAction = new ShowCatalogQueueAction();
		assertTrue(showCatalogQueueAction.actionRequiresLogin());
	}
}