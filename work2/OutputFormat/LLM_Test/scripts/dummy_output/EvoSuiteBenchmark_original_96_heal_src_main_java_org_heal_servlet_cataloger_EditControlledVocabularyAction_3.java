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
		
    private static final String PARAMETER_NAME = "Vocabulary";
	@Test
    void testAction() { 
        EditControlledVocabularyAction action = new EditControlledVocabularyAction();
        CompleteMetadataBean cmb = action.getCompleteMetadataBean(PARAMETER_NAME);
				
        // The result is the same as the default value for
        // the parameter in the request.
        assertEquals(cmb.getControlledVocabulary(), CompleteMetadataBean.DEFAULT_CONTROLLED_VOCABULARY);
        
        // Now change the value of the parameter to an
        // alternative value.
        cmb.setControlledVocabulary(CompleteMetadataBean.MOTIVAL); 
		
        // Check that we're getting the expected result
        assertEquals(CompleteMetadataBean.MOTIVAL, cmb.getControlledVocabulary());
        
        // Check if the value for the parameter changed
        assertNotEquals(CompleteMetadataBean.DEFAULT_CONTROLLED_VOCABULARY, cmb.getControlledVocabulary());
    }
}