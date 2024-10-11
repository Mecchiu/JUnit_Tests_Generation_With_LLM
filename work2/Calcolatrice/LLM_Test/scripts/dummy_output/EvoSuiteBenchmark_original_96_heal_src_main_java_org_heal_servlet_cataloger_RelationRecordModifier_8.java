// RelationRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.CompleteMetadataBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RelationRecordModifier}.
* It contains one unit test case for the {@link RelationRecordModifier#actionRequiresLogin()} method.
*/
class RelationRecordModifierTest {
		private final HttpServlet servlet = new HttpServlet() {
			@Override
			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				RequestDispatcher dispatcher =
				    request.getRequestDispatcher("/cataloger/RelationRecordModifier.jsp");
				dispatcher.forward(request, response);
			}};

		/**
		* Checks that an exception is thrown if there is no RelationBean to edit or if the RelationBean to edit
		* isn't in the list of Relations.
		*/
		@Test
		public void shouldExceptionIfNoRelationBeanToEditIfNoRelationsAreSet() throws IllegalArgumentException, IllegalAccessException, InterruptedException, IOException {
			String msg = "There should be no relation bean in the list of Relations";
			list(msg);

			// the following will fail
			HttpServletRequest request =
			    servlet.getRequest();
			@SuppressWarnings("unused")
			HttpServletResponse response =
			    servlet.getResponse();

			// we must fail to get the request or response
			request.setAttribute("Request", request);
			request.setAttribute("Response", response);

			// make sure the request comes from a session that contains at least one relation
			request.getSession(true);

			// we can verify the request is not redirected and that it's an HTTP Request
			RequestDispatcher dispatcher =
			    request.getRequestDispatcher("/cataloger/RelationRecordModifier.jsp");

			request.setAttribute("Request", request);
			request.setAttribute("Response", response);

			try {
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				// should be thrown
				assertEquals(e.getMessage(), msg);
			}
		}

		/**
		 * @param msg the test message
		*/
		private final void list(final String msg) {
			assertNotNull(msg);

			// now test we have the correct message for the request
			assertNull(request.getAttribute("Request", "Not Available"));

			Iterator<RelationsBean> it =
			    list(request.getAttribute("Request"));
			assertTrue(it.hasNext());
			Iterator<CompleteMetadataBean> itmd =
			    list(it.next().getBean());
			assertTrue(itmd.hasNext());
			assertEquals(CompleteMetadataBean.class, itmd.next().getClass());
		}

		// helper method for list() (to check that the list is not empty).
		private Iterator<RelationsBean> list(Object list) {
			assertNotNull(list);
			assertFalse(list.equals(""));
			@SuppressWarnings("unchecked")
			Iterable<RelationBean> rels = (Iterable<RelationBean>) list;
			@SuppressWarnings("unchecked")
			List<RelationBean> relsList = (List) rels;
			return relsList.iterator();
		}
}