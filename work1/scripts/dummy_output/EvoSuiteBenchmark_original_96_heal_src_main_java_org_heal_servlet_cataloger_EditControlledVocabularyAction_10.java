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
		
    @Test
    void testActionRequiresLogin() throws IOException, ServletException, Exception {

        String path = "test";
        int taxonID = 1;
        CompleteMetadataBean completeMetadata = new CompleteMetadataBean("");
        
        RequestDispatcher ajaxRequest = RequestDispatcher.valueOf(path);
        
        final Action action = new EditControlledVocabularyAction(ajaxRequest, completeMetadata, path);
        assertFalse(action.actionRequiresLogin());
	}
	
	@Test
    void testPerform() throws IOException, ServletException, Exception {
		
        String completePath = "test-complete-path";
        int taxonID = 1;
        CompleteMetadataBean completeMetadata = new CompleteMetadataBean("");
        
		int numOfTaxons = 4;
		int numOfPathsPerTaxon = 2;  // This test only checks the path lengths.  If they're too long, the test won't fail.
		CompleteMetadataBean completeMetadataForTaxon = new CompleteMetadataBean("");
		for (int i = 0; i < numOfTaxons; i++) {
			completeMetadataForTaxon.addTaxon(
				new TaxonBean(
					CompleteMetadataBean.DEFAULT_NAME+taxonID+(i+1)
				)
			);
			
			taxonID++;
			
		}
		
		TaxonPathBean[] taxonPaths = new TaxonPathBean[numOfTaxons];
		for (int i = 0; i < taxonPaths.length; i++) {
			taxonPaths[i] = new TaxonPathBean(CompleteMetadataBean.DEFAULT_NAME+i, completeMetadataForTaxon);
		}
		
		String completePath = "test-complex-path";
		int numOfPathsPerCompletePath = 2;  // This test only checks the path lengths and only validates the path lengths. 
		for (int i = 0; i < completePath.length(); i++) {
			completeMetadataForTaxon.addComplete(
				new CompleteMetadataBean(
						CompleteMetadataBean.DEFAULT_NAME+i
				)
			);
		}
                
        String taxonID1 = "A";
        String taxonID2 = "B";
        
		//
		// Create the metadata 
        CompleteMetadataBean completeMetadata = new CompleteMetadataBean("");
		
        //Add taxon metadata and complete metadata
        CompleteMetadataBean completeMetadataCopy = completeMetadata.duplicate();
        completeMetadataCopy.addComplete(new CompleteMetadataBean(CompleteMetadataBean.DEFAULT_NAME, completeMetadata.getComplete()));
		
        CompleteMetadataBean completeMetadataWithTaxon1 = new CompleteMetadataBean(CompleteMetadataBean.DEFAULT_NAME, completeMetadata.getComplete());
        CompleteMetadataBean completeMetadataWithTaxon2 = null;
        if(completenames[0]!=null) {
            completeMetadataWithTaxon2 = new CompleteMetadataBean(CompleteMetadataBean.DEFAULT_NAME, completeMetadata.getComplete());
        }
            
		//
		// Create the taxonomy with the path information
		TaxonPathBean[] taxonPathsWithTaxons = new TaxonPathBean[numOfPathsPerCompletePath];
		for (int i = 0; i < taxonPaths.length; i++) {
			taxonPathsWithTaxons[i] = new TaxonPathBean(
				CompleteMetadataBean.DEFAULT_NAME+i
			);
		}
		
		
        final Iterator<CompleteMetadataBean> completedMetadataValues = completeMetadataCopy.values(taxonID1, completePath).iterator();
        
		//
		// Create the current taxon path
		final Iterator<CompleteMetadataBean> completeMetaValues = completeMetadataWithTaxon1.values(taxonID1, completePath).iterator();

		//
		// Create the taxon paths
		final Iterator<CompleteMetadataBean> completionMetaValues = completeMetaWithTaxon2.values(taxonID2,completePath).iterator();
				
        
        for(int i=0; i<numOfTaxons; i++) {
            CompleteMetadataBean completeMetadata = completeMetadataCopy.getComplete();
			
			final Iterator<CompleteMetadataBean> complenMetadataValues = completeMetadata.values(taxonID1, completePath).iterator();
			if (completeMetadata.getComplete().getTaxonyIDs().elementAt(i)!= null) {

				while (complenMetadataValues.hasNext()) {
					CompleteMetadataBean completionMetadata = complenMetadataValues.next();
					Iterator<CompleteMetadataBean> completionMetadataValues2 = completionMetadataWithTaxon2.values(i, completePath).iterator();
					CompletionMetadataBean currentMetadata;                                                        
					while (completionMetadataValues2.hasNext()) {
                        currentMetadata = completionMetadataValues2.next();
                        // Skip the first two elements (the complete taxon and the path)
                        currentMetadata = currentMetadata.substitute(TaxonBean.DEFAULT_NAME+completionMetadata.getComplete().getTaxonyIDs().elementAt(i), taxonID);
						
					}                            
					CompletionMetadataBean completeMetadataCopy2 = new CompleteMetadataBean(
						CompleteMetadataBean.DEFAULT_NAME+i
					).setCompletion(currentMetadata);
					completeMetadataCopy.addComplete(completeMetadataCopy2);
				}
        	}			
        } 

		for (int i=0; i<numOfTaxons; i++) {
            assertFalse(completedMetadataValues.hasNext());    
        }

        assertTrue(completedMetadataValues.hasNext());
        
        Iterator<CompleteMetadataBean> firstOne = completedMetadataValues.next();        
}
}