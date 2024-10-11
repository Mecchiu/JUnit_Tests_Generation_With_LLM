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
	 * Unit test case for {@link SaveMetadataAction#actionRequiresLogin()}.
	 */
	@Test
	public final void testActionRequiresLogin() {
		
		MetadataDAO mdDao = QueueDAO.getDataContext().getCatalogManager().create();
		ctxDao = new ContextURLBean("http://example.com");
	
		// save metadata
		MetadataBean cmb = new MetadataBean();
		cmb.setName("Testing");
		MetametadataIdentifierBean mdId = new MetametadataIdentifierBean(cmb);
		mdId.setValue("This is an example for MetametadataIdentifierBean");
		
		MetametadataContributorBean mbc = new MetametadataContributorBean();
		mbc.setName("testingMetametadataContributors");
		Iterator<MetametadataIdentifierBean> mbdIt = mdId.getMetametadataIdentifiers();
		Iterator<ContributorBean> mbdItr = mbdIt.next().getContributors();
		Iterator<RequirementBean> reqItr = 
			  mbdItr.next().getRequirements();
		Iterator<TaxonPathBean> taxonitr = mbdItr.next().getTaxonPaths();
		Iterator<TaxonBean> taxonItr = 
			  taxonitr.next().getTaxa();
		Iterator<Iterable<TaxonBean>> taxonItrs = 
			    taxonItr.next().getTaxons();
		Iterator<TaxonPathBean> taxonPathItr = 
			  taxonItr.next().getTaxonPaths().iterator();
	
		Iterator<ContributorBean> mb2Itr = mbc.getContributors();
		Iterator<RequirementBean> mbd2Itr = 
			  mbdItr.next().getRequirements();
		Iterator<TaxonPathBean> taxonPath2Itr = 
			  taxonPathItr.next().getTaxonPaths();
		Iterator<TaxonBean> taxon2Itr = 
			  taxonItr.next().getTaxa();
		Iterator<Iterable<TaxonBean>> taxonItrs2 = 
			  taxonItr.next().getTaxons();
		Iterator<TaxonPathBean> taxonPathItrs2 = 
			  taxonPathItr.next().getTaxonPaths();
				
		Iterator<TaxonPathBean> taxonPaths2Itr = 
			  taxonPathItrs2.next().getTaxonPaths();

		final CompleteMetadataBean cmBean;
}
}