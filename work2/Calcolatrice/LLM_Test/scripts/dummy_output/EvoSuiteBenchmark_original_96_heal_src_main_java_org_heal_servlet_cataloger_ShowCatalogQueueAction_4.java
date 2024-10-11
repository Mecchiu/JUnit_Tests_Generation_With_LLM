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
		   int page;
				 
		   /**
		   * Set up the unit test case for {@link ShowCatalogQueueActionTest}.
		   * @throws Exception 
		   */
		  @Test
    public void testConstructor() throws Exception {
				// prepare a catalog
		   CatalogResource catalog = new CatalogResource("catalog", "catalog", "test", "test");

		    // perform actions
		   CatalogResource response = new ShowCatalogQueueAction().perform(CatalogResource.class, request, response);

		   // Check the state of the response
		   assertEquals("Invalid catalog.", response.getCatalog().get("category"), "catalog test");
		   assertEquals("Invalid catalog.", response.getCatalog().get("name"), "test test test");
    }
				
				
				/**
		   * @throws IOException 
		   */
		  @Test
    public void testCatalogCreationAndAccess() throws IOException {
		   response = new ShowCatalogQueueAction().perform(CatalogResource.class, request, response);

		   List<QueueDAO.CatalogItem> cat = response.getCatalog();

		   assertTrue(cat.size() == 1);
		   assertTrue(cat.get(0).getId().startsWith("catalog/"));
    }
}