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
     * Unit test case for {@link EditControlledVocabularyAction#actionRequiresLogin()}.
     * Makes sure that we are getting an error when we have no item on a page which can be edited.
     */
	@Test
	public void getNoItem() {
					
		// This should fail as the user has no edit rights for this item
		HttpServletRequest currentRequest = new HttpServletRequest("GET", "/home");
		EditorResponse response = new EditorResponse();
		Iterator<CompleteMetadataBean> it = BookCatalogs.getBookCatalogs().getCompleteMetadataBeans();
		assertFalse(it.hasNext());
		response.renderEditor(currentRequest, null);
		assertNotNull(response.getErrorMessage());
	}
	
	/**
     * Unit test case for {@link EditControlledVocabularyAction#actionRequiresLogin()}.
     * Makes sure that we are getting an error when the user cannot edit a Controlled Vocabulary item.
     */
	@Test
	public void notEditable() {
		
		// This should fail as the user cannot edit any item on a page which can be edited
        HttpServletRequest currentRequest = new HttpServletRequest("GET", "/home");
        EditorResponse response = new EditorResponse();
        Iterator<CompleteMetadataBean> it = BookCatalogs.getBookCatalogs().getCompleteMetadataBeans();
		assertTrue(it.hasNext());
		response.renderEditor(currentRequest, null);
		boolean isItemEditable = response.getMetadataItemByPath("name").canEdit();
		assertTrue(!isItemEditable);
		response.renderEditor(currentRequest, null);
		assertTrue(isItemEditable);
		response.renderEditor(currentRequest, null);
		isItemEditable = response.getTaxon().canEdit();
		assertFalse(!isItemEditable);
	}
	
	/**
     * Unit test case for {@link EditControlledVocabularyAction#isLoginAuthorized()}.
     * Makes sure that we are getting an error when the user isn't logind on the page.
	 */
	@Test
	public void nonLoginPageError() {
		
		// This should fail as the user isn't on the edit page
		HttpServletRequest currentRequest = new HttpServletRequest("GET", "/edit");
		EditorResponse response = new EditorResponse();
        Iterator<CompleteMetadataBean> it = BookCatalogs.getBookCatalogs().getCompleteMetadataBeans();
		assertFalse(it.hasNext());
		response.renderEditor(currentRequest, null);
		boolean isItemEditable = response.getMetadataItemByPath("name").canEdit();
		boolean isTaxonEditable = response.getTaxon().canEdit();
		boolean statusCode = response.getStatusCode();
		assertTrue(!isItemEditable);
		assertTrue(!isTaxonEditable);
		assertTrue(!statusCode);
		response.renderLoginPage(currentRequest, null);
		response.renderLoginPage(currentRequest, null);
		assertTrue(isItemEditable);
		assertTrue(isTaxonEditable);
		assertTrue(!statusCode);
		response.renderLoginPage(currentRequest, null);
		assertTrue(isItemEditable);
		response.renderLoginPage(currentRequest, null);
		assertFalse(isItemEditable);
		response.renderLoginPage(currentRequest, null);
		assertTrue(isItemEditable);
		assertTrue(!isTaxonEditable);
		response.renderLoginPage(currentRequest, null);
		assertTrue(isItemEditable);
		assertTrue(isTaxonEditable);
		assertTrue(!statusCode);
		response.renderLoginPage(currentRequest, null);
		assertTrue(!isItemEditable);
		assertTrue(!isTaxonEditable);
		assertTrue(!statusCode);
		response.renderLoginPage(currentRequest, null);
		assertTrue(isItemEditable);
	}
	
}