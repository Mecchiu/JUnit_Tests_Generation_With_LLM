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
	 * This unit test case checks whether the correct number of allowed user is returned for each action based on the expected number of allowed taxonomies.
	 * It uses the {@code EditControlledVocabularyAction} object that has only one allowed taxonomy. 
	 */
	@Test
	public void testReturnsNumberOfAllowedTaxonomies() {
		EditControlledVocabularyAction expectedNumberOfAllowedTaxonomies = new EditControlledVocabularyAction();
		
		int numberOfAllowedTaxonomies = expectedNumberOfAllowedTaxonomies.getTaxonomies().iterator().next().size();	
		
		Iterator<TaxonBean> taxonomiesForUser = expectedNumberOfAllowedTaxonomies.getTaxonomiesForUser();
		Iterator<CompleteMetadataBean> metadataForUser = expectedNumberOfAllowedTaxonomies.getMetadataForUser();
		Iterator<TaxonPathBean> taxonomiesForTaxon = expectedNumberOfAllowedTaxonomies.getTaxonomiesForTaxon();
		Iterator<TaxonBean> taxonomiesForPath = expectedNumberOfAllowedTaxonomies.getTaxonomiesForPath();
		
		assertEquals("Invalid number of allowed allowed taxonomies for this user", 
				numberOfAllowedTaxonomies, 
				numberOfAllowedTaxonomies.iterator().next().size());
		
		assertTrue("There should be exactly 1 taxonomy returned so far from allowed taxonomies specified", 
				!taxonomiesForUser.hasNext());
		
		assertTrue("There should be exactly 1 metadata returned so far from allowed taxonomies specified",
				!metadataForUser.hasNext());
		
		assertTrue("There should be exactly 1 taxonomies returned so far from allowed taxonomies specified",
				!taxonomiesForPath.hasNext());
	}

	
	/**
	 * This test case checks whether the correct number of taxonomies is returned for each action of the {@link EditControlledVocabularyAction} object specified.
	 * It uses {@code EditControlledVocabularyAction} object that has two allowed taxonomies. 
	 */
	@Test
	public void testReturnsNumberOfAllowedTaxonomiesForOneAllowed() {
		EditControlledVocabularyAction expectedNumberOfAllowedTaxonomiesForOneAllowed = new EditControlledVocabularyAction();
		
		int expectedNumberOfAllowedTaxonomiesForOneAllowed = expectedNumberOfAllowedTaxonomiesForOneAllowed.getTaxonomiesForOneAllowed().iterator().next().size();	
		
		int numberOfAllowedTaxonomiesForOneAllowed = expectedNumberOfAllowedTaxonomiesForOneAllowed.getTaxonomiesForOneAllowed().iterator().next().size();	
		
		Iterator<TaxonBean> taxonomies = expectedNumberOfAllowedTaxonomiesForOneAllowed.getTaxonomiesForOneAllowed().iterator();
		Iterator<CompleteMetadataBean> metadata = expectedNumberOfAllowedTaxonomiesForOneAllowed.getMetadataForOneAllowed().iterator();
		Iterator<TaxonPathBean> taxonomiesForTaxon = metadata.iterator();
		Iterator<TaxonBean> taxonomiesForPath = taxonomies.iterator();

		assertEquals("Invalid number of allowed taxonomies returned as expected", 
				numberOfAllowedTaxonomiesForOneAllowed.getTaxonomies().size(), 
				expectedNumberOfAllowedTaxonomiesForOneAllowed.getTaxonomies().size());
		
		assertEquals("Invalid number of allowed taxonomies returned as expected", 
				expectedNumberOfAllowedTaxonomiesForOneAllowed.getMetadata().size(), 
				metadata.iterator().next().size());
		
		assertTrue("There should be exactly 1 taxonomies returned.",
				!taxonomiesForTaxon.hasNext());
		
		assertTrue("There should be exactly 2 taxonomies returned", 
				!taxonomiesForPath.hasNext());
	}
	
    /**
     * This test case checks whether the correct number of taxonomies is returned for each action of the {@link EditControlledVocabularyAction} object specified.
     * It uses {@code EditControlledVocabularyAction} object that has three allowed taxonomies. 
     */
	@Test
	public void testReturnsNumberOfAllowedTaxonomiesForThreeAllowed() {
		EditControlledVocabularyAction expectedNumberOfAllowedTaxonomiesForThreeAllowed = new EditControlledVocabularyAction();
		
		int expectedNumberOfAllowedTaxonomiesForThreeAllowed = expectedNumberOfAllowedTaxonomiesForThreeAllowed.getTaxonomiesForThreeAllowed().iterator().next().size();	
		
		int numberOfAllowedTaxonomiesForThreeAllowed = expectedNumberOfAllowedTaxonomiesForThreeAllowed.getTaxonomiesForThreeAllowed().iterator().next().size();	
		
		Iterator<TaxonBean> taxonomies = expectedNumberOfAllowedTaxonomiesForThreeAllowed.getTaxonomiesForThreeAllowed().iterator();
		Iterator<CompleteMetadataBean> metadata = expectedNumberOfAllowedTaxonomiesForThreeAllowed.getMetadataForThreeAllowed().iterator();
		Iterator<TaxonPathBean> taxonomiesForTaxon = metadata.iterator();
		Iterator<TaxonBean> taxonomiesForPath = taxonomies.iterator();

		assertEquals("Invalid number of allowed taxonomies returned as expected", 
				expectedNumberOfAllowedTaxonomiesForThreeAllowed.getTaxonomies().size(), 
				expectedNumberOfAllowedTaxonomiesForThreeAllowed.getTaxonomies().size());

		assertEquals("Invalid number of allowed taxonomies returned as expected", 
				numberOfAllowedTaxonomiesForThreeAllowed.getMetadata().size(), 
				metadata.iterator().next().size());

		assertTrue("There should be six taxonomies returned.",
				!taxonomiesForTaxon.hasNext());
		
		assertTrue("There should be exactly one taxonomies returned.",
				!taxonomiesForPath.hasNext());
	}

}