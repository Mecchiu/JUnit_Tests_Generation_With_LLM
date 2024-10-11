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
	 * Tests all the methods of {@link SaveMetadataAction}
	 *
	 * @throws Exception if a test fails for any reason
	 */
	@Test
	public void testAll() throws Exception {
		
		// The following code is taken from
		// https://github.com/jdbloch/java-boot-cli-web-servlet
		// with minor modifications.
		
		CompleteMetadataBean cmb = new CompleteMetadataBean();

		MetametadataContributorBean[] mbList = new MetametadataContributorBean[cmb.getMetametadataContributor().size()];

		Iterator<MetametadataContributorBean> it = cmb.getMetametadataContributor().iterator();
		for (int i = 0; i < cmb.getMetametadataContributor().size(); i++) {
			mbList[i] = it.next();
		}
		
		// Get an iterator with the contents of the MetametadataContributorBean array.
		Iterator<MetametadataContributorBean> metametametadatacontributorBeanIterator = cmb.getMetametadataContributor().iterator();
		Iterator<MetametadataContributorBean> mtbList = mbList;
		Iterator<MetametadataContributorBean> iter = mbList;

		int numberOfContributors = mtbList.iterator().next().getContributors().size();
		int numberOfTaxa = mtbList.iterator().next().getTaxa().size();
		int numberOfTags = mtbList.size();

		// Set the MetametadataContributorBean to be the one that was just
		// built as the most recent. This may not be the most recent as it
		// could have been added to another contributor, but I would prefer
		// to be able to remove just enough information.
		// At this point, the MetadatalistBean should be loaded correctly.
		// Set it to null before calling {@link #runTest()}, in case the
		// {@link SaveMetadataAction} tries to access an invalid instance.
		mtbList.set(0, null);
		
		// Set the MetametadataContributorBean to be the only contributor. This is only
		// a check, not if something else is present.
		for (int i = 1; i < numberOfContributors; i++) {
			ContributorBean contributor = mtbList.next().getContributors().get(i);
			mtbList.set(i, new MetametadataContributorBean(contributor));
			if (i == numberOfContributors)
				break;
		}
		
		// Set the MetametadataContributorBean to be the first one and set its name.
		for (int i = 1; i < numberOfContributors; i++) {
			contributor = mtbList.next().getContributors().get(i);
			if (i == 1)
				mtbList.set(i, mtbList.set(i, contributor.getName()));
			mtbList.set(i, new MetametadataContributorBean(contributor));
		}
			
		final double[][] mapOfTaxa = new double[numberOfTaxa][];
		final double[][] mapOfTags = new double[numberOfTags][];
		
		// Set the list of TaxonBeans to be the first
		for (int i = 1; i < numberOfTaxa; i++) {
			TaxonBean taxon = mtbList.next().getTaxa().get(i);
			mapOfTaxa[i] = new double[taxon.getTaxa().size()];
			for (int j = 0; j < taxon.getTaxa().size(); j++) {
				mapOfTaxa[i][j] = taxon.getTaxa().get(j);
				assertTrue(false); // This test should be in all cases, not just the first taxon.
			}
		}
		
		// Set the list of TaxonBeans to be empty
		for (int i = 1; i < numberOfTaxa; i++)
			mapOfTaxa[i] = new double[0];
		
		// Set the list of TagBeanes to be the second
		for (int i = 1; i < numberOfTags; i++) 
			mapOfTags[i] = new double[i - 1];
		
		// Call the Save Metadata method.
}
}