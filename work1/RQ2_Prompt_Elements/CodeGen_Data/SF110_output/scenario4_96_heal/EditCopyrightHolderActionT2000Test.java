// EditCopyrightHolderActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
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
* Test class of {@link EditCopyrightHolderAction}.
* It contains one unit test case for the {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
*/
class EditCopyrightHolderActionTest {

	/**
	 * Test case which sets the complete metadata to <code>CompleteMetadataBean.class</code>.
	 * The copyright holder should set its identifier property to <code>1.0</code>.
	*/
	@Test
	public void testActionSetCopyrightHolderCompleteMetadata() {
	
		EditCopyrightHolderAction action = new EditCopyrightHolderAction();
		
		// get the first copyright holder
		CopyrightHolderBean copyrightHolderBean = action.getNewCopyrightHolder();
		assertNotNull("An existing copyright holder should have been edited.", copyrightHolderBean);
		
		// call it with an empty request
		assertFalse("The author of the copyright holder should not be set (in case there is nothing to edit) or the second result doesn't contain the copyright holder property.", action.actionRequiresLogin());
		
		// edit the copyright holder
		Iterator<CopyrightHolderBean> iterator = action.getAuthorIterator();
		assertNotNull("An existing copyright holder should be edited.", iterator.next());
		Iterator<CompleteMetadataBean> metadataIterator = action.getCompleteMetadataIterator();
		assertNotNull("The metadata of the existing copyright holder should be found.", metadataIterator.next());
		assertEquals("The identifier of the new copyright holder should be correct.", copyrightHolderBean.getId(), action.getNewCopyrightHolder().getId());
		assertEquals("The author of the copyright holder should not be set (in case the original author is unchanged) or the second result contains the new copyright holder property.", "", action.getNewCopyrightHolder().getAuthor());
		assertEquals("The metadata of the old copyright holder should not be found.", copyrightHolderBean.getLastModificationInfo().getProperty("author"), action.getOldCopyrightHolder().getLastModificationInfo().getProperty("author"));
	}
	
	/**
	 * Test case which sets the complete metadata to one of the first available values.
	 * The copyright holder should set its identifier property to <code>1.0</code> if the first possible author could not be found.
	*/
	@Test
	public void testActionSetCopyrightHolderFirstAuthorCompleteness() {
	
		// get the first copyright holder
		CopyrightHolderBean copyrightHolderBean = new CopyrightHolderBean();
		assertFalse("This action should not be able to set a copyright (author) property.", action.actionRequiresLogin());
		
		// call it with empty request
		assertFalse("The author of the copyright holder should not be set (in case there is nothing to edit) or the second result doesn't contain the copyright holder property.", action.actionRequiresLogin());
		
		// edit the copyright holder
		Iterator<CopyrightHolderBean> iterator = action.getAuthorIterator();
		iterator.next();
		int counter = 0;
		assertOneOf("The first possible author can be found, but only one result should be generated.", action.getAuthorIterator().hasNext(), "1 author found");
		for (Iterator<CompleteMetadataBean> metadataIterator = action.getCompleteMetadataIterator(); metadataIterator.hasNext();) {
			CompleteMetadataBean completeMetadataBean = metadataIterator.next();
			if (completeMetadataBean.getProperty("author").equals(action.getNewCopyrightHolder().getAuthor())) {
				counter++;
				assertTrue("The first possible author should be used", counter == 1);
				return;
			}
		}
		assertEquals("There should be only one metadata result for a given valid title.", 1, counter);
	}
	
	/**
	 * Test case which just checks the author name of the new copyright holder.
	 * The copyright holder should set its name to the author of the new copyright holder.
	 */
	@Test
	public void testAuthorName() {
	
		EditCopyrightHolderAction action = new EditCopyrightHolderAction();
		

		// call it with empty request
		assertEquals("The author name should be the name of the new copyright holder", action.getNewCopyrightHolder().getFirstComplete().getDisplayName(), action.getNewCopyrightHolder().getAuthor());
	}
	
	@Test
	public void testRemoveTitleAndAuthor() throws Exception {
		
		EditCopyrightHolderAction action = new EditCopyrightHolderAction();
	
		// set the author name to the first author and the title to the first title
		action.setAuthor("1.0");
		action.setTitle("First title");
		action.setTitle("First title\u2015");
	}
	
	/**
	 * The first way in which a {@link EditCopyrightHolderAction} can be used
	 * is using a {@link HttpServlet} to do the actual editing.
	 * This is done by providing a {@link RequestDispatcher}
	 * implementation which will return a {@link RequestDispatcher#forward(String, javax.servlet.http.HttpServletRequest, HttpServletResponse)} method which
	 * forwards the actual request to its target
	 * {@link #testAuthorName()}} method (called by the
	 * {@link #testSetTitleAndAuthor()} method).
	 * The first way in which an {@link EditCopyrightHolderAction} can be used
	 * can be set up by passing in a {@link HttpServletRequest} implementation and
	 * a {@link HttpServletResponse} implementation which will forward the original
	 * request and the modified request to its target
	 * {@link #testAuthorName()}} method (called by the
	 * {@link #testRemoveTitleAndAuthor()}} method).
	 * @throws Exception An Exception which should be caught
	*/
	@Test
	public void testForward() throws Exception {
		
		EditCopyrightHolderAction action = new EditCopyrightHolderAction();
	
		final String[] requestParameters = {
				"title=1.0 title=First title test",
				"author=1.0 author=First author test"
		};
		
		HttpServletRequest originalRequest = buildHttpMethod(requestParameters).getHttpRequest();
		HttpServletResponse originalResponse = buildHttpMethod(requestParameters).getHttpResponse();
		
		// call the method under test
		action.setAuthor("1.0");
		action.setTitle("First title");
		action.setAuthor("First author");
		
		// set the response headers to the correct ones and
		// forward
		assertNotNull("The original request headers should not be null