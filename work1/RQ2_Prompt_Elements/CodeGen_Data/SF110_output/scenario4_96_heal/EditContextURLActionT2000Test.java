// EditContextURLActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContextURLBean;
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
* Test class of {@link EditContextURLAction}.
* It contains one unit test case for the {@link EditContextURLAction#actionRequiresLogin()} method.
*/
class EditContextURLActionTest {

	// edit the context URL in the context URL beanutil and make sure it should work
	@Test
	public void testContextURLWithEditPermission() throws IOException, ServletException {
		CompleteMetadataBean completeBean = new CompleteMetadataBean();
		ContextURLBean ctxURLBean = new ContextURLBean(); ctxURLBean.setSiteUrl("http://curl.com");
		CompleteMetadataBean completeBean2 = new CompleteMetadataBean();
		CompleteMetadataBean completeBean3 = new CompleteMetadataBean();
		CompleteMetadataBean completeBean4 = new CompleteMetadataBean();
		CompleteMetadataBean completeBean5 = new CompleteMetadataBean();
		CompleteMetadataBean completeBean6 = new CompleteMetadataBean();
		CompleteMetadataBean completeBean7 = new CompleteMetadataBean();
		
		Iterator<MetadataBean> iter = completeBean.iterator();
		Iterator<MetadataBean> iter2 = completeBean2.iterator();
		Iterator<MetadataBean> iter3 = completeBean3.iterator();
		Iterator<MetadataBean> iter4 = completeBean4.iterator();
		Iterator<MetadataBean> iter5 = completeBean5.iterator();
		Iterator<MetadataBean> iter6 = completeBean6.iterator();
		Iterator<MetadataBean> iter7 = completeBean7.iterator();
		
		Action action = new EditContextURLAction();
		
		@SuppressWarnings("resource")
		RequestDispatcher mockREQUEST = mock(RequestDispatcher.class);
		
		// Mock requests
		when(mockREQUEST.getContextPath()).thenReturn("");
		when(mockREQUEST.getPathInfo())
				.thenReturn("contexturl");
		when(mockREQUEST.getMatchedURI())
				.thenReturn("");
		when(mockREQUEST.getQueryString()).thenReturn("");
		when(mockREQUEST.getQueryString(String.class)).thenReturn("");
		when(mockREQUEST.getRequestURI())
				.thenReturn("/contexturl?user=albert");
		when(mockREQUEST.getServletPath()).thenReturn("/contexturl");
		when(mockREQUEST.getAttribute("ContextPath")).thenReturn("");
		when(mockREQUEST.getAttribute("PathInfo")).thenReturn("");
		when(mockREQUEST.getAttribute("QueryString")).thenReturn("");
		when(mockREQUEST.getAttribute("RequestURI")).thenReturn("");
		when(mockREQUEST.getAttribute("ServletPath")).thenReturn("");
		when(mockREQUEST.getAttribute("RequestURI")).thenReturn("");
		when(mockREQUEST.getAttribute("Path")).thenReturn("/contexturl");
		when(mockREQUEST.getAttribute(String.class)).thenReturn("Context");
		when(mockREQUEST.getAttribute("UserPrincipal")).thenReturn("albert");
		
		int rc=-1;
		
		rc = action.doActionRequest(mockREQUEST, completeBean);
		
		assertEquals("Expected status " + rc + ", but got response code " + rc, rc, rc);
		
		assertEquals(ctxURLBean.getSiteUrl(), completeBean2.getSiteUrl());
		assertEquals(ctxURLBean.getSiteUrl(), completeBean3.getSiteUrl());
		assertTrue("Expected SiteUrl not equal", ctxURLBean.getSiteUrl().equals(completeBean_.getSiteUrl()));
		assertEquals("SiteUrl not equal", ctxURLBean.getSiteUrl(), ctxURLBean.getSiteUrl2());
		assertEquals("Expected SiteUrl2 not equal", ctxURLBean.getSiteUrl(), ctxURLBean.getSiteUrl3());
		
		assertEquals("Non context URL should be not be equal",
				!iter == iter2 || 
				!iter!= iter2 || 
				!iter!= iter2 || 
				iter2!= iter3 ||
				!iter2!= iter3 ||
				iter!= iter.next() || 
				iter.hasNext(),
				true);
		
		assertEquals("Non context URL should be not be equal",
				!iter2 == iter3 || 
				!iter3!= iter3 || 
				!iter3!= iter5 || 
				iter3.hasNext(),
				true);
		
		assertEquals("Non context URL should be not be equal",
				!iter5 == iter4 || 
				!iter4!= iter4 || 
				!iter4!= iter.next() || 
				!iter4.hasNext(),
				false);
		
		assertEquals("Non context URL should be not be equal",
				!iter5 == iter.next() || 
				!iter.hasNext(),
				false);
		
		assertEquals("Non context URL should be not be equal",
				iter2.hasNext(), true);
		
		assertEquals("Non context URL should be not be equal",
				iter3.hasNext(), true);
		
		assertEquals("Non context URL should be not be equal",
				iter.hasNext(), true);
		
		assertTrue("Non context URL should contain 2 contexts", iter.hasNext());
		assertEquals("Non context URL should contain a context",
				iter.next().getPath(), "/contexturl");
		
		assertTrue("Non context URL should contain a context", iter.hasNext());
		assertEquals("Non context URL should contain a context2",
				iter.next().getPath(), "/contexturl2");
		
		assertFalse("Non context URL should be null", null == iter);
	}
}
