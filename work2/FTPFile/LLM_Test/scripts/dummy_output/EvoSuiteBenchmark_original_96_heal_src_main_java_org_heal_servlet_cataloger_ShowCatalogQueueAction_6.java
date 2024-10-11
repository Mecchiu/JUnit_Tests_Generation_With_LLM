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
		* Performs the test.
		*
		* @throws ServletException if there was a problem executing the test
		* @throws IOException if there was a problem executing the test
		*/
		@Test
		public void testRunGet() throws ServletException, IOException{
			Action action = new ShowCatalogQueueAction();
			List<String> results = action.actionRequiresLogin(new String[]{"jane", "jb", "joe", "joe"});
			assertEquals(3, results.size());
			assertTrue(results.contains("jane"));
			assertTrue(results.contains("jb"));
			assertTrue(results.contains("joe"));
		}
	}


// ShowCatalogQueueJUnitTest.java