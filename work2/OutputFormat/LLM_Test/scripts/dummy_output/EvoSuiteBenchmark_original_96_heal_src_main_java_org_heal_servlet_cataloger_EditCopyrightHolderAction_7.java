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
		
    /** Test method. */
    @Test
    public void testRequiresAdminLogin() throws IOException, ServletException {
        RequestDispatcher dispatcher = new RequestDispatcher() {

			public void include(RequestEvent requestEvent) throws IOException, ServletException {
				String fileName = requestEvent.getUrl().substring(requestEvent.getUrl().indexOf("/edit/") + 17);
				FileHolder holder = new FileHolder();
				holder.initialise(fileName);
				String newFileName = requestEvent.getUrl().substring(requestEvent.getUrl().indexOf("/edit/"));
				requestEvent.getRequest().setAttribute("holder", holder);
				requestEvent.setRedirectedUrl(newFileName);
			}

			public void include(RedirectRequestEvent redirectEvent) throws IOException, ServletException {
			}

			public void include(RequestHeaderRequestEvent headerEvent) throws IOException, ServletException {
			}

			public void include(RequestHeaderResponseEvent headerEvent) throws IOException, ServletException {
			}

			public void include(RequestEntityRequestEvent requestEntityEvent) throws IOException, ServletException {
			}

			public void include(EntityResponseEvent entityResponseEvent) throws IOException, ServletException {
			
			}

			public void forward(RequestEvent requestEvent) throws IOException, ServletException {
				String fileName = requestEvent.getUrl().substring(requestEvent.getUrl().indexOf("/edit/") + 17);
				FileHolder holder = (FileHolder) requestEvent.getRequest().getAttribute("holder");
				holder.editTitle(fileName, "Edited Title", "File edited", requestEvent.getParameter("name"), "File edited.pdf", requestEvent.getParameter("filename"));
				requestEvent.getRequest().setAttribute("holder", holder);
				requestEvent.getRequest().setAttribute("copyrightHolder", holder.getCopyrightHolder());
			}

			public void forward(RedirectRequestEvent redirectEvent) throws IOException, ServletException {
			
			
			}

			public void forwardExceptionally(Exception exception) throws IOException, ServletException {
				assertNotNull(exception);
				throw new ServletException(exception);
			}

		};     
		
        Action action = new EditCopyrightHolderAction();
        assertFalse((action.actionRequiresLogin()));
    }

     
}