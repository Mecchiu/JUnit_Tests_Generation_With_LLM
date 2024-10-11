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

	private static final String TLD = "ttld";
	private static final String US = "ust";
	private static final String NAMESPACE = "http://www.opentahy.org/catalog/policies/namespaces/";
//		private static final String NAMESPACE = "test/pdc";
	
	private final QueueDAO queueDAO = QueueDAO.getInstance();
	
	// tests
	
	@Test
	public void testGetCatalogUrlsForNamespaces() throws ServletException, IOException {
		
		HttpServletRequest request = new HttpServletRequest("GET", "/servlet/catalog-request-example.html");
		QueueDAO.getInstance().initialise(request);
		List<String> content = queueDAO.getCatalogUrlsForNamespaces(TLD, US);
		assertEquals("Only one catalog url should be returned", 1, content.size());
	}
	
	@Test
	public void testShowCatalogWithMultipleTLDs() throws ServletException, IOException {
		
		long numResults = queueDAO.count();
		HttpServletRequest request = new HttpServletRequest("GET", "/servlet/catalog-request-example-with-multiple-ttlds.html");
		QueueDAO.getInstance().initialise(request);
		List<String> m = queueDAO.getCatalogUrlsForNamespaces(null, TLD);
		assertContains("1.0", m);
		assertContains("1.0", queueDAO.getCatalogUrlsForNamespaces(US, TLD));
		assertContains("1.0", queueDAO.getCatalogUrlsForNamespaces(TLD, US));
		assertDoesNotContain("1.0", queueDAO.getCatalogUrlsForNamespaces(US, null));
		assertDoesNotContain("1.0", queueDAO.getCatalogUrlsForNamespaces("not-a-pk", null));
		request = new HttpServletRequest("GET", "/servlet/catalog-request-example-with-multiple-namespaces.html");
		QueueDAO.getInstance().initialise(request);
		m = queueDAO.getCatalogUrlsForNamespaces(TLD, NAMESPACE);
		assertContains("1.0", m); // "ns" is default namespace.
		m = queueDAO.getCatalogUrlsForNamespaces(US, NAMESPACE);
		assertContains("1.0", m); // "ns" is default namespace.
		request = new HttpServletRequest("GET", "/servlet/catalog-request-with-multiple-namespaces.html");
		QueueDAO.getInstance().initialise(request);
		m = queueDAO.getCatalogUrlsForNamespaces(null, NAMESPACE);
		assertDoesNotContain("1.0", m);
		m = queueDAO.getCatalogUrlsForNamespaces(US, NAMESPACE);
		assertDoesNotContain("1.0", m);
	}
	
	@Test
	public void testGetCatalogUrlsWithEmptyCatalog() throws ServletException, IOException {
		HttpServletRequest request = new HttpServletRequest("GET", "/servlet/catalog-request-empty-catalog.html");
		List<String> content = queueDAO.getCatalogUrlsForNamespaces(TLD, US);
		assertEquals("0.0", content.get(0));
	}
	
//	@Test
//	public void testAddToCache() throws ServletException, IOException {
//		HttpServletRequest request = new HttpServletRequest("GET", "/servlet/catalog-request-update-namespace.html");
//		QueueDAO.getInstance().initialise(request);
//		String updatedNameSpace = "test/namespace/new-name";
//		queueDAO.addCatalogToCache(updatedNameSpace);
//		assertEquals("Cache record should add a new entry", updatedNameSpace, queueDAO.getCacheNamespace(false));
//		request = new HttpServletRequest("GET", "/servlet/catalog-request-missing-namespace.html");
//		QueueDAO.getInstance().initialise(request);
//		assertEquals("Cache record should not add a new entry", "");
//	}
	
}

// EOF
