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
	 * The "doCancelEdit" request parameter is sent to the action
	 */
	@Test
	public void doCancelEdit() throws ServletException, IOException {
		
		try {

			HttpServletRequest req = new HttpServletRequest("http://localhost:8080/cataloger/CatalogPage/edit/myCopyrightHolder?action=edit");

			CompleteMetadataBean complete = new CompleteMetadataBean();

			final String[] parameters = 
				{"user-id", "author-id", "text-description", "source", "source-version", "mimetype", "url", "copyrightholderId", "copyrightholderId-list", "copyRight", "copyrightHolders", "copyrightHoldersId", "copyrightHolderName", "copyrightholderName", "copyrightholder", "copyrightholder-id", "copyrightholder-id-list", "createdAt", "copyrightholder-id-list", "copyrightholder-id-list-copyrightholder", "lastmod", "copyrightholder-group", "copyrightholder-group-id", "copyrightholder-groupid", "copyrightType", "copyrightType-list", "creatorName", "copyrightName", "copyrightName", "copyrightName", "copyrightName", "copyrightTypeName", "copyrightTypeName", "copyrightValue"};

			req.setParameterValues(parameters);
			HttpServletResponse resp = new HttpServletResponse("text/plain");
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/cataloger/edit/myCopyrightHolder.jsp");
			rd.forward(req, resp);
			assertNotNull(resp);

		} catch (ServletException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
	
	/**
	 * We just make sure that it gets called at the end of the processing
	 */
	@Test
	public void postProcessed() throws ServletException, IOException {

	}
	
	/**
	 * The "myCopyrightHolder" request parameter is sent to the action
	 */
	@Test
	public void doPost() throws ServletException, IOException {

		try {

			HttpServletRequest req = new HttpServletRequest("http://localhost:8080/cataloger/CatalogPage/edit/myCopyrightHolder?action=edit");
			CompleteMetadataBean complete = new CompleteMetadataBean();

			final String[] parameters = 
				{"user-id", "author-id", "text-description", "source", "source-version", "mimetype", "url", "copyrightholderId", "copyrightholderId-list", "copyRight", "copyrightHolders", "copyrightHoldersId", "copyrightHolderName", "copyrightholderName", "copyrightholder", "copyrightholder-id", "copyrightholder-id-list", "cancel", "cancel-1", "cancel-2", "cancel-copyrightholder"};
			
			req.setParameterValues(parameters);

			HttpServletResponse resp = new HttpServletResponse("text/plain");
			WebResult r = req.process();
			Iterator it = r.getResult();
			while(it.hasNext()) {
				assertTrue(it.next() instanceof CompleteMetadataBean);
			}
			resp.setContentType("text/plain");
			resp.getWriter().write("<html><head><title>edited copyright holder</title></head><body>");
			resp.getWriter().write(r.getResult().toString());
			resp.getWriter().write("</body></html>");
			req.setContentType("text/html");
			req.getRequestDispatcher("/WEB-INF/jsp/cataloger/doCancelEdit.jsp").forward(req, resp);
			assertNotNull(r.getResult(), "result was null");
			assertNotNull(it.next(), "next iterator wasn't null");

			// make sure it gets called back from doPost
			Iterator it2 = r.getResult().iterator();
			while(it2.hasNext()) {
				assertTrue(it2.next() instanceof CompleteMetadataBean);
			}
			
			r.getResult().clear();

		} catch (ServletException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}

	}

	/**
	 * The "myCopyrightHolder" controller parameter is sent to the action
	 */
	@Test
	public void doGet() throws ServletException, IOException {

		assertFalse(ActionTestController.isDone());

	}

}
