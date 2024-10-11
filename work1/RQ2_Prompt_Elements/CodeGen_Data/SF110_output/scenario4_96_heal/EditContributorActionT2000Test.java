// EditContributorActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContributorBean;
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
* Test class of {@link EditContributorAction}.
* It contains one unit test case for the {@link EditContributorAction#actionRequiresLogin()} method.
*/
class EditContributorActionTest {
/**
		* Test method for {@link EditContributorAction#actionRequiresLogin()}.
		*/
	@Test
	public void testActionRequiresLogin() {
		assertEquals(false, EditContributorAction.actionRequiresLogin());
	}

	/**
	 * Test method for {@link EditContributorAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}.
	 * @throws javax.servlet.ServletException
	 */
	@Test
	public void testPerform() throws ServletException {
		// setup
		ContributorBean beanA;
		CompleteMetadataBean metadata;
		Action.ErrorResponse res;
		Iterator<ContributorBean> i;
		Iterator<CompleteMetadataBean> j;
		// perform
		i = EditContributorAction.perform(EditContributorAction.class, request, response);
		// assert
		assertNotNull(i);
		assertTrue(i.hasNext());
		beanA = i.next();
		metadata = EditContributorAction.metadataService.save(beanA, true);
		res = EditContributorAction.errorResponseService.saveBeanContent(beanA);	
		// assert
		assertNotNull(metadata);
		assertNotNull(res);
		assertEquals(EditContributorAction.errorResponseService.errorSaved, res);	
		// test for a success condition
		i.next();
		j = EditContributorAction.metadataService.findAll();
		assertEquals(EditContributorAction.metadataService.count(), EditContributorAction.errorResponseService.errorCount, EditContributorAction.errorResponseService.errorCount);
		// the error should NOT be set
		assertTrue(EditContributorAction.errorResponseService.getError()==null);
		EditContributorAction.dataService.getMetaData(EditContributorAction.dataName, beanA, true);	
		// test for a successful condition
		i.next();
		j = EditContributorAction.metadataService.findAll();
		assertFalse(EditContributorAction.metadataService.hasData(EditContributorAction.dataName));
		assertEquals(EditContributorAction.metadataService.count(), EditContributorAction.dataService.count(EditContributorAction.dataName), EditContributorAction.dataService.count());
	}

	/** Helper method to get the request dispatcher to dispatch the request.
	 *  It is used to make the test case more similar to TestEditContributorAction.java.
	 *  This will return the servlet request dispatcher.
	 *  @return RequestDispatcher
	 */
	private RequestDispatcher getRequestDispatcher(){
		// setup
		RequestDispatcher resolver = null;
		// test for a success condition
		HttpServletRequest request = EditContributorActionTest.this.request;
		// test for an exception
		ServletException error = EditContributorActionTest.this.error;
		// ensure it is not null
		assertNotNull(request);
		// ensure it is set
		// if (error == null)
		//	// should not be null
		assertTrue(request.getAttribute("exception") == null);
		try {
			// ensure it is not null
			resolver = RequestDispatcher.getInstance(editContributorJsp);
			// assert that the resolver is using servletRequest dispatcher
			assertNotNull(resolver);
		} catch (ServletException e) {
			e.printStackTrace();
			error = e;
		}
		// return the request dispatcher
		return resolver;
	}
}
