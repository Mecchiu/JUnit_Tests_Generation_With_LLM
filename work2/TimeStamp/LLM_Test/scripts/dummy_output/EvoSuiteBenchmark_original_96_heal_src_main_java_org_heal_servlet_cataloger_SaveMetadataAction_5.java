// SaveMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SaveMetadataAction}.
* It contains one unit test case for the {@link SaveMetadataAction#actionRequiresLogin()} method.
*/
class SaveMetadataActionTest {
		
	/**
	 * Creates the test instance of the test.
	 *
	 */
	public SaveMetadataActionTest() {}
	
	/**
	 * @return The name of the test.
	 */
	private String getTestName() {
		return "SaveMetadataActionTest";
	}
	
	/**
	 * @return the name of the test.
	 */
	private String getTestScriptName() {
		return "SaveMetadataActionTest.js";
	}

	/**
	 * @return the name of the test.
	 */
	private String getTestScriptFileName() {
		return "test.js";
	}
	
	/**
	 * The test scenario.
	 * It checks the request is either authenticated OR not.
	 *
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Test
	public final void testAuthorizableAuthentication() throws ServletException, IOException {
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/test/testAuthorizableAuthentication.jsp");
		HttpServletResponse resp = getRequestResponse(rd);
		final boolean expectError =!Action.actionRequiresLogin(rd, null);
		if (expectError) {
			assertEquals(HttpServletResponse.SC_UNAUTHORIZED, resp.getResponseCode());
		} else {
			Iterator<MetametadataContributorBean> it = QueryDAO.select(MetadataDAO.typeContributors(), null).iterator();
			boolean foundNewContributorBean = false;
			String nameOfContributor = null;
			
			while (it.hasNext()) {
				MetametadataContributorBean next = it.next();
				if (next.getAuthor().getUsername().equals("New Contributor")) {
					foundNewContributorBean = true;
					nameOfContributor = next.getName();
				}
			}
			
			// Check that there is only one new contributor and that the 
			// author is the new contributor.
			assertNotNull(nameOfContributor);
			assertTrue(!foundNewContributorBean);
			
		}
		assertEquals(expectError, resp.getResponseCode() == HttpServletResponse.SC_UNAUTHORIZED);
	}
	
	/**
	 * The test scenario.
	 * It checks the request is authenticated OR not.
	 *
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Test
	public final void testAuthorizableAuthorisation() throws ServletException, IOException {
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/test/testAuthorizableAuthorisation.jsp");
		HttpServletResponse resp = getRequestResponse(rd);
		
		boolean expectError =!Action.actionRequiresLogin(rd, null);
}
}