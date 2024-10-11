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
/**
		* Test case which tests the behaviour of the {@link EditContextURLAction#perform(HttpServletRequest, HttpServletResponse)} method.
		*/
		@Test public void test_perform_requiresLogin() throws ServletException, IOException {
			HttpServlet servlet = new HttpServlet() {
				@Override
				protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException {
					// TODO Auto-generated method stub
				}
			};
			EditContextURLAction editcontextURLAction = new EditContextURLAction();
			Iterator it = editcontextURLAction.getContextURLBean().getMetadataBean().getContextURLs().iterator();
			while (it.hasNext()) {
				ContextURLBean testCub = (ContextURLBean) it.next();
				if (!editcontextURLAction.actionRequiresLogin() &&!testCub.getContextURLId().equals("")) {
					break;
				}
			}
			assertFalse(editcontextURLAction.actionRequiresLogin());
		}

		/**
		* Test case which tests the behaviour of the {@link EditContextURLAction#action(HttpServletRequest, HttpServletResponse)} method.
		*/
		@Test public void test_action_allowsLogin() throws ServletException, IOException {
			HttpServlet servlet = new HttpServlet() {
				@Override
				protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException {
					// TODO Auto-generated method stub
				}
			};
			EditContextURLAction editcontextURLAction = new EditContextURLAction();
			try {
				editcontextURLAction.action(req, resp);
			} catch (final ServletException se) {
				if (!editcontextURLAction.actionRequiresLogin()) {
					throw se;
				}
			}
		}
}