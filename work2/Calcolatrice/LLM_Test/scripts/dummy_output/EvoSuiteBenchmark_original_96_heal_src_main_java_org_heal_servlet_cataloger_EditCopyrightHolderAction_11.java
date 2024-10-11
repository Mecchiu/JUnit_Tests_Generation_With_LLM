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
	 * Checks the result of {@link EditCopyrightHolderAction#getRequiredParameters(Iterator, HttpServletRequest, HttpServletResponse)}
	 * with a {@link java.util.Iterator} that only contains the {@link org.heal.module.metadata.CopyrightHolderBean}.
	 */
	@Test
	public void getRequiredParameters_IteratorAndReq_ResultSetContainsOnlyTheNewlyCreatedCopyrightHolderBean() {
		Iterator<CopyrightHolderBean> iterator = ((Iterator<CopyrightHolderBean>) (new EditCopyrightHolderAction().getRequiredParameters(iterator, null, null)));
		assertNotNull("Iterator returned a null",iterator);
	}
	
	/**
	 * Checks the result code of {@link EditCopyrightHolderAction#actionRequiredParameterNotSpecified(HttpServletRequest)}
	 * with a {@link java.util.Iterator} that only contains the {@link org.heal.module.metadata.CopyrightHolderBean}.
	 */
	@Test
	public void actionRequiredParameterNotSpecified_IteratorAndReq_CodeContainsFalseResult() {
		assertFalse("Result code doesn't contain true",new EditCopyrightHolderAction().actionRequiredParameterNotSpecified((HttpServletRequest) (new EditCopyrightHolderAction().getRequiredParameters(iterator, null, null))));
	}

	/**
	 * Checks the result of {@link EditCopyrightHolderAction#getRequiredParameters(Iterator, HttpServletRequest, HttpServletResponse)}
	 * with several parameters.
	 * These parameters should all be included in the Result code; they should not be included in the request.
	 */
	@Test
	public void getRequiredParameters_IteratorAndReq_AllIncludeTheirsResultsInTrueResult() {
		Iterator<CopyrightHolderBean> iterator =
			((Iterator<CopyrightHolderBean>) (new EditCopyrightHolderAction().getRequiredParameters(iterator, new EditCopyrightHolderAction().getRequiredParameters(iterator, null, null), null)));
		assertNotNull("Iterator returned a null",iterator);
		assertTrue("Iterator returned more than one element",iterator.hasNext());
		assertTrue("Iterator returned more than one element",iterator.hasNext());
		assertEquals("Iterator returned the wrong length",iterator.next(),CopyrightHolderBean.createCompleteMetadata(CompleteMetadataBean.fromString("")));
		assertFalse("Iterator returned more than one element",iterator.hasNext());
	}

	/**
	 * Checks the result of {@link EditCopyrightHolderAction#getRequiredParameters(Iterator, HttpServletRequest, HttpServletResponse)}
	 * with three parameters and two other parameters.
	 * The parameters should be included in the result code; they should be included in the request.
	 */
	@Test
	public void getRequiredParameters_IteratorAndReq_TwoIncludingTheirsResultsInTrueResult() {
		Iterator<CopyrightHolderBean> iterator =
			((Iterator<CopyrightHolderBean>) (new EditCopyrightHolderAction().getRequiredParameters(iterator, null, null)));
		assertNotNull("Iterator returned a null",iterator);
		assertTrue("Iterator returned more than one element",iterator.hasNext());
		assertTrue("Iterator returned more than one element",iterator.hasNext());
		assertEquals("Iterator returned the wrong length",iterator.next(),CopyrightHolderBean.createCompleteMetadata(CompleteMetadataBean.fromString("")));
		assertFalse("Iterator returned more than one element",iterator.hasNext());
		assertTrue("Iterator returned more than one element",iterator.hasNext());
		assertEquals("Iterator returned the wrong length",iterator.next(),
			CopyrightHolderBean.createCompleteMetadata(CompleteMetadataBean.fromString("")));
	}

	@Test
	public void getRequiredParameters_IteratorAndReq_ErrorReturning() {
		Exception error = new Exception();
		assertThrows(error,()->((Iterator<CopyrightHolderBean>) (new EditCopyrightHolderAction().getRequiredParameters(iterator, null, null))),String.format("Failed to create new instance of '%s'", (new EditCopyrightHolderAction()).getRequiredParameters(iterator, null, null)));
	}

}