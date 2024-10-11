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
		* Test of {@link EditControlledVocabularyAction#actionRequiresLogin()} method, of class {@link EditControlledVocabularyAction}.
		*/
	@Test
	void test_actionRequiresLogin() throws ServletException {
		CompleteMetadataBean metadataBean = new CompleteMetadataBean();
		metadataBean.put("Complete Metadata", "completeMetadata");
		metadataBean.put("Complete Metadata Bean for the New Catalog Entry", "newCatBeanMetadataBean");
		completeVocabulary(metadataBean);
		assertEquals(new TaxonBean().getPaths().size(), 2);
		assertEquals(new TaxonBean().getPaths().get(0).getPath(), "/taxons.txt");
		assertEquals(new TaxonBean().getPaths().get(1).getPath(), "/controlledVocabularies.txt");
	}

		/**
		* Test of {@link EditControlledVocabularyAction#perform(HttpServletRequest, HttpServletResponse)}.
		*/
	@Test
	void perform_HttpServletRequest_HttpServletResponse_CompleteMetadataBean_CreateControlledVocabulary() throws ServletException {
		CompleteMetadataBean metadataBean = new CompleteMetadataBean();
		metadataBean.put("Complete Metadata", "completeMetadata");
		completeVocabulary(metadataBean);
		Iterator iterator = metadataBean.getAllPaths().iterator();
		assertFalse(iterator.hasNext());
		assertEquals("/taxons.txt", ((TaxonBean)iterator.next()).getPath());
		assertEquals("/controlledVocabularies.txt", ((TaxonBean)iterator.next()).getPath());
	}

		/**
		* Test of {@link EditControlledVocabularyAction#perform(HttpServletRequest, HttpServletResponse)}.
		*/
	@Test
	void perform_HttpServletRequest_HttpServletResponse_DeleteCatalogEntries_CompleteMetadataBean_deleteCatalogEntries() throws ServletException {
		CompleteMetadataBean metadataBean = new CompleteMetadataBean();
		completeVocabulary(metadataBean);
		System.out.println(metadataBean);
		metadataBean = null;
		completeVocabulary(metadataBean);
		assertFalse(metadataBean.containsKey("Complete Metadata"));
	}

	/**
	* Test of {@link DefaultCatalogEditorServlet#createCatalogEditorServlet(org.heal.module.Metadata)}.
	*/
	@Test
	void createCatalogEditorServlet_createCatalogEditorServlet() throws ServletException {

		CompleteMetadataBean metadataBean = new CompleteMetadataBean();
		metadataBean.put("Complete Metadata", "completeMetadata");
		CompleteMetadataBean completeMetadataBean = CompleteMetadataBean.getCompleteMetadataBean();
		completeMetadataBean.merge(metadataBean);
		completeMetadataBean = completeMetadataBean.getCompleteMetadataBean();
		DefaultCatalogEditorServlet catalogEditorServlet = DefaultCatalogEditorServlet.createCatalogEditorServlet(metadataBean);
		assertEquals(catalogEditorServlet.getServletContext().getInitParameter("javacatalogcontext"), "/catalogeditor.jsp");
	}

	/**
	* Test of {@link Action#getName()}.
	*/
	@Test
	public void getName() {
		EditControlledVocabularyAction instance = new EditControlledVocabularyAction();
		assertEquals(instance.getName(), "Edit Controlled Vocabulary");
	}

	private void completeVocabulary(CompleteMetadataBean metadataBean) {
		CompleteMetadataBean completeVocabularyBean = new CompleteMetadataBean();
		completeVocabularyBean.put("Complete Metadata", "completeMetadata");
		completeVocabularyBean.put("Complete Metadata Bean for the New Catalog Entry", "newCatBeanMetadataBean");
		metadataBean.merge(completeVocabularyBean);
	}

	private void completeVocabulary(Iterator iterator) {
		CompleteMetadataBean completeVocabularyBean = new CompleteMetadataBean();
		completeVocabularyBean.put("Complete Metadata", "completeMetadata");
		completeVocabularyBean.put("Complete Metadata Bean for the New Catalog Entry", "newCatBeanMetadataBean");
		iterator.next();
		completeVocabularyBean.merge(iterator);
	}

//	/**
//	* Test of {@link Action#toString()}.
//	*/
//	@Test
//	public void toString() {
//		EditControlledVocabularyAction instance = new EditControlledVocabularyAction();
//		String expected = String
//				.format("EditControlledVocabularyAction[%s, %s]", 
//						instance.getClass().getSimpleName(),
//						instance.getName());
//		assertEquals(expected, "EditControlledVocabularyAction");
//	}
}