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
     * @return The {@link SaveMetadataAction} instance created by this test.
     */
    public static SaveMetadataAction buildInstance() {
            return new SaveMetadataAction();
    }
    
    /**
     * @throws ServletException
     * @throws IOException
     */
    @Test
    public void testSaveMetadataAction() throws ServletException, IOException {	

		SaveMetadataAction saM = new SaveMetadataAction();
		
		// Check the set up
		assertNotNull(saM.context);
		assertNotNull(saM.taxonPathBean);

		// Start it
		saM.doGet( new HttpServletRequest( "/saveMetadata.action" ) );
		
		// Wait for the completion
		while (saM.getIsDone()) {
			QueueDAO.clear();
			
			try { Thread.sleep(1000); } catch (InterruptedException ie) { }
		}

		// Check it
		assertTrue( saM.getStatus() == 200 );

        // Check the values of the expected values
        //
		String taxonPath = saM.taxonPathBean.getTaxonPath();
		if (taxonPath.length() == 0) saM.taxonPathBean.setTaxonPath(null);
		String contextURL = saM.context.getContextURL();
		if (contextURL.length() == 0) saM.context.setContextURL(null);
		String copyrightHolderName = saM.context.getCopyrightHolderName();
		if (copyrightHolderName.length() == 0) saM.context.setCopyrightHolderName(null);
		String copyrightHolderURL = saM.context.getCopyrightHolderURL();
		if (copyrightHolderURL.length() == 0) saM.context.setCopyrightHolderURL(null);
		String contributorName = saM.context.getContributorName();
		if (contributorName.length() == 0) saM.context.setContributorName(null);
		String contributorURL = saM.context.getContributorURL();
		if (contributorURL.length() == 0) saM.context.setContributorURL(null);
		String copyrightHolderURL = saM.context.getCopyrightHolderURL();
		if (copyrightHolderURL.length() == 0) saM.context.setCopyrightHolderURL(null);

		assertNotNull(saM.taxonPathBean.getTaxonPath());
        assertNotNull(saM.context.getContextURL());
        assertNotNull(saM.context.getCopyrightHolderURL());
        assertNotNull(saM.context.getContributorName());
    
        assertNotNull(saM.taxonPathBean.getTaxonPath());
		assertNotNull(saM.context.getContributorURL());
		assertNotNull(saM.context.getCopyrightHolderURL());
			
	}
	
}
