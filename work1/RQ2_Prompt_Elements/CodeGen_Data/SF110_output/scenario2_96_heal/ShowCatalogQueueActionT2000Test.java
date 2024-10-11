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
	 * Tests when the catalog queue list is not present.
	 */
	@Test
	void catalogsAreNotPresent() {
		RequestDispatcher dispatcher = RequestDispatcher.getRequestDispatcher("/catalogs.jsp?catalog_list=" + QueueDAO.MISSING_CATALOGQUEUE);
		String[] expected = { };
		List result = (List) dispatcher.handleRequest(new HttpServletRequest("GET", "/"));
		assertEquals(expected.length, result.size());
	}
	
	/**
	 * Tests when the catalog list is not present. This test case is used to verify that errors thrown by the dispatcher are correctly handled
	 * by the servlet.
	 */
	@Test
	void catalogsAreNotPresentWhenCatalogListIsNotPresent() {
		RequestDispatcher dispatcher = RequestDispatcher.getRequestDispatcher("/catalogs.jsp?catalog_list=" + QueueDAO.MISSING_CATALOGQUEUE);
		String[] expected = { "MISSING_CATALOGQUEUE", "catalog_list", "" };
		List result = (List) dispatcher.handleRequest(new HttpServletRequest("GET", "/"));
		assertEquals(expected.length, result.size());
	}
	
	/**
	 * Tests when the catalog list is present. This test case is used to verify that errors thrown by the dispatcher are correctly handled
	 * by the servlet.
	 */
	@Test
	void catalogsAreAvailable() {
		RequestDispatcher dispatcher = RequestDispatcher.getRequestDispatcher("/catalogs.jsp?catalog_list=" + QueueDAO.CATALOG_LIST_PRESENT);
		String[] expected = { "CATALOG_ID", "CATALOG_FIRST_NAME", "CATALOG_LAST_NAME" };
		List result = (List) dispatcher.handleRequest(new HttpServletRequest("GET", "/"));
		assertEquals(expected.length, result.size());
	}
	
	/**
	 * Tests when the catalog is not present. This test case is used to verify that errors thrown by the dispatcher are correctly handled
	 * by the servlet.
	 */
	@Test
	void catalogIsNotAvailable() {
		RequestDispatcher dispatcher = RequestDispatcher.getRequestDispatcher("/catalogs.jsp?catalog_list=" + QueueDAO.MISSING_CATALOGQUEUE);
		String[] expected = { "" };
		result = (List) dispatcher.handleRequest(new HttpServletRequest("GET", "/"));
		assertEquals(1, result.size());
		assertEquals(expected.length, result.size());
	}
	
	/**
	 * Tests the rendering of a catalog detail page. This test case is used to verify that the detail page can be rendered in various ways when a catalog is present and
	 * in which case validation of a catalog is expected.
	 */
	@Test
	void catalogDetailPageIsLoadedSuccessfully() throws IOException {
		QueueDAO catalogDAO = QueueDAO.getInstance();
		int catalogId = catalogDAO.loadCatalog();
		
		catalogDAO.addOrUpdateCatalog(User.get("Test User"));
		List<QueueDAO.Catalog> catalogs = catalogDAO.loadCatalogs();
		assertEquals(1, catalogs.size());
		
		RequestDispatcher dispatcher = RequestDispatcher.getRequestDispatcher("/catalogs.jsp?catalog_list=" + catalogId);
		List result = (List) dispatcher.handleRequest(new HttpServletRequest("GET", "/"));
		assertEquals(1, result.size());
		assertEquals(CatalogDBTest.CATALOG + " - " + catalogId, result.get(0).getId());
		
		RequestDispatcher catalogDetail = RequestDispatcher.getRequestDispatcher("/catalogs/" + catalogId);
		result = (List) catalogDetail.handleRequest(new HttpServletRequest("GET", "/"));
		
		// verify that the detail page is loaded properly
		assertEquals(CatalogDBTest.CATALOG + " - " + catalogId, result.get(0).getId());
		assertEquals(CatalogDAO.CATALOG_FIRST_NAME + " - " + catalogDAO.loadCatalogName(catalogId), result.get(0).getFirstName());
		assertEquals(CatalogDAO.CATALOG_LAST_NAME, result.get(0).getLastName());
		
		assertTrue(AuthenticationTools.isLoggedInByServletRequest(catalogDetail));
	}
}