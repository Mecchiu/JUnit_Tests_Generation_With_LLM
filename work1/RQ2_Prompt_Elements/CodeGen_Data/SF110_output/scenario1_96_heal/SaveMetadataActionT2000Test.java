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
	 * Class constructor.
	 */
	public SaveMetadataActionTest() {
		
	}
	
	@Test
	public void actionTest() throws IOException, ServletException {
		
		String id = "1";
		SaveMetadataAction sa = new SaveMetadataAction();
		try {
			RequestDispatcher reqMain = this.getMainAction();
			reqMain.forward(this.getMainRequest(), this.getMainResponse());
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	/**
	 * Main function.
	 */
	private RequestDispatcher getMainAction() throws ServletException {
		
		// Main content.
		StringBuffer sb = new StringBuffer(500);
		sb.append(actionHeader());
		sb.append(actionBody(id));
		
		// Return a main request.
		return this.getMainRequest();
	}
	
	/**
	 * Action header.
	 */
	private String actionHeader() {

        return "Action <strong>SaveMetadataAction</strong>";
	}
	
	/**
	 * Action body.
	 */
	private String actionBody(String id) {

        return "<strong>Request ID: " + id + "</strong><hr>"
        	+ "<br>Action: SaveMetadataAction";
	}
	
    private RequestDispatcher getMainRequest() {

        // Initializer.
        ContextURLBean url = new ContextURLBean();
        url.setHref("/app/catalog/metadata/metadata");
        
        // Main content.
        StringBuffer sb = new StringBuffer(512);
        sb.append(actionHeader());
        sb.append(actionBody("4"));
        sb.append(actionBody(id));
        sb.append(actionBody(id));

        return this.getServletContext().getRequestDispatcher("/cataloging.jsp").
    	getServletContext().getRequestDispatcher("/application.jsp").
    	getRequestDispatcher("/catalog-view.jsp").
    	getRequestDispatcher("/catalog-metadata.jsp").
    	getRequestDispatcher("/catalog-metadata.jsp").
    	getRequestDispatcher("/catalog-metadata.jsp").
    	getRequestDispatcher("/catalog-summary.jsp").
    	getRequestDispatcher("/catalog-summary.jsp").
    	getRequestDispatcher("/catalog-status.jsp").
    	getRequestDispatcher("/catalog-detail-view.jsp").
    	getRequestDispatcher("/catalog-detail-view.jsp").
    	getRequestDispatcher("/catalog/metadata/metadata").
    	getRequestDispatcher("/catalog/metadata/metadata").
    	getRequestDispatcher("/catalog/metadata/metadata").getRequestDispatcher(url.getHref()).
    	getRequestDispatcher(url.getHref()).getRequestDispatcher(url.getHref());
    	
	}
	
    private RequestDispatcher getServletContext() {
//		return new MainRequestDispatch()
    	return null;
	}

}
