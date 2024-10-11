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
		
	@Test
	public void testGetPath() {
		
		List<QueueDAO.QueueAccessRequestInfo> list = queueAccessDAO.getQueueAccessRequestInfo(QueueDAO.QueueAccessOption.ALL);
		assertNotNull("No access type is set", list);
		assertEquals("Wrong length of access type", 1, list.size());
		assertTrue("Access type is wrong", list.get(0).accessType.equals(QueueDAO.AccessType.CATALOG));
		
	}
	
	@Test
	public void testCreateDispatcher() throws Exception {
		
		String path = ShowCatalogQueueAction.class.getName();
		RequestDispatcher rd = servlet.getServletContext().getRequestDispatcher(path);
		AuthenticationTools.assertRequestAuthorization(rd, "viewcatalogqueue", "admin");
	}

}