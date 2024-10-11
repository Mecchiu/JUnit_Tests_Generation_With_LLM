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
		final CompleteMetadataBean metadataBean_ = new CompleteMetadataBean("metadataTest");;

		final CopyrightHolderBean copyrightHolder_ = new CopyrightHolderBean("name", "metadataTest");
		
		EditCopyrightHolderActionTest(){}
	/**
	*  @see {@link EditCopyrightHolderAction#perform(HttpServlet,
	*                  HttpServletRequest, HttpServletResponse)}
	*/
	@Test
	public void testPerform(){
			assertEquals("Expected result 'true'.", true, this.metadataBean_.isNew());
	}
	/**
	*  Note that the first parameter in this method is the
	* {@link HttpServletRequest} which contains the information from the original HttpServlet request,
	* and the fourth parameter is the HttpServlet response, which is not supported yet.
	* We can support it. (As of {@link HttpServletRequest} it is unused, however as of now.
	* There is an assumption that the request has no HttpServlet request parameters.)
	* @see {@link EditCopyrightHolderAction#perform(HttpServlet,
	*                  HttpServletRequest, HttpServletResponse)}
	*/
	@Test
	public void testPerform2(){
		HttpServletRequest request_ = new HttpServletRequest();
		request_.setParameter("c");
		request_.setParameter("a");
		request_.setParameter("d");
		request_.setParameter("f");
		request_.setParameter("h");
		request_.setParameter("*");
		HttpServletResponse response_ = new JHIPrintWriter.HttpServletResponse("");
		EditCopyrightHolderAction action_ = new EditCopyrightHolderAction();
	
		action_.perform(request_, response_);
		
		Iterator<CopyrightHolderBean> it = action_.result.getIterator();
	
		assertEquals("The request is a HttpServletRequest", request_, request_.getRequest());
		assertTrue("The result was not an Iterator", it.hasNext());
		
		assertTrue("The action did not produce an iterator", it.hasNext());
		
		assertTrue("The result was not an Iterator", it.hasNext());
	}
}