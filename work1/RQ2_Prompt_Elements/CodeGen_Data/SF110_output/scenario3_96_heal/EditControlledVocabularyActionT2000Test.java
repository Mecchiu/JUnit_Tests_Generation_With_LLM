// EditControlledVocabularyActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
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
* Test class of {@link EditControlledVocabularyAction}.
* It contains one unit test case for the {@link EditControlledVocabularyAction#actionRequiresLogin()} method.
*/
class EditControlledVocabularyActionTest {
/**
		 * Unit test case for actionRequiresLogin().
		 * First action is tested with http://localhost:8080/admin/metadata/taxons/1/
		 * Second action is tested with http://localhost:8080/admin/metadata/taxons/2/
		 * Second action is returned with empty metadata object.
		 */
@Test
public class EditControlledVocabularyActionTest
{
	/**
	 * Test if action requires login for editing a controlled vocabulary if configured by the user.
	 */
	@Test
	public void testActionRequiresLogin() {
		final HttpServletRequest req = new HttpServletRequest();
		final HttpServletResponse resp = new HttpServletResponse();
		final RequestDispatcher rd = req.getRequestDispatcher("/metadata/taxons/1/cataloger/catalogerEditControlVocabulary.jsp");	//jsp /Catalogs/Catalogs/metadata/taxons/ID/editContentFromTaxonomicon
		final CompleteMetadataBean mbe = new CompleteMetadataBean();
		String response = rd.forward(req, resp);
		assertTrue("This should be an edit:", response.contains("CONTENT"));
	}

	/**
* Test if returns empty metadata object for a controlled vocabulary if configured by the user.
*/
	@Test
	public void testDoesntAcceptUserRequestBecauseNoPermissions() throws ServletException {
		final HttpServletRequest req = new HttpServletRequest();
		final HttpServletResponse resp = new HttpServletResponse();
		final RequestDispatcher rd = req.getRequestDispatcher("/metadata/taxons/1/cataloger/catalogerEditControlVocabulary.jsp");	//jsp /Catalogs/Catalogs/metadata/taxons/ID/editContentFromTaxonomicon
		final CompleteMetadataBean mbe = new CompleteMetadataBean();
		rd.include(req, resp);	// forward to /admin/metadata/taxons/
		final Iterator<Iterator<TaxonBean>> it = mbe.getTaxons().iterator();

		Iterator<Iterator<TaxonBean>> it2 = mbe.getIncludeedItems().iterator();
		while (it.hasNext()) {
			if(!it2.next().hasNext()) {
				it.next().next().completeMetadataBean(); // this item isn't included in the catalog
				it.remove();
			}
		}
		// Check that the metadata includes everything
		assertTrue("metadata contains nothing", it.hasNext()); // not included in catalog metadata
		assertTrue("metadata contains no taxonomies", it2.hasNext());

		// Finally, we add some taxonomies
		doAddTaxonomies(it);
		it2 = mbe.getIncludeedItems().iterator();
		while (it.hasNext()) {
			it.next().next().completeMetadataBean(); // this item isn't included in the catalog
			if(!it2.hasNext()) {
				it.next().next().completeMetadataBean(); // this item isn't included in the catalog
				it.remove();
			}
		}
		doAddTaxonomies(it);
	}
private void doAddTaxonomies(Iterator<Iterator<TaxonBean>> it) throws ServletException {
		// get the taxonomies again
		Iterator<TaxonBean> it2 = it.next();
		Iterator<TaxonPathBean> it3 = it2.next();

		while (it2.hasNext()) {
			it2.next().next().delete();
		}

		// add and add taxonomies
		while(it3.hasNext()) {
			it3.next().next().completeMetadataBean(); // this item isn't included in the catalog
			it3.remove();
		}

		// now add again, this time including taxonomies
		for(int i = 0; i < 10; i++) {
			if(it2.hasNext()) {
				it2.next().next().completeMetadataBean(); // this item isn't included in the catalog
				it2.remove();
			}
		}
	}
		/**
	 * Unit test case for actionRequiresLogin.
	 * First action is tested with http://localhost:8080/admin/metadata/taxons/1/
	 * Second action is tested with http://localhost:8080/admin/metadata/taxons/2/
	 * Second action is returned with empty metadata object.
	 */
}
