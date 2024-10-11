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
* The {@link EditCopyrightHolderAction} class.
*/
	private final EditCopyrightHolderAction action = new EditCopyrightHolderAction();

	/**
* Test method to edit a {@link CopyrightHolder} when there
* isn't an existing CopyrightHolder.  Assert that the
* {@link AboutCopyrightHolderAction} instance will work.
*/
	@Test
    public void testEditCopyrightHolder_noExistingCopyrightHolder() {
        // The correct request should be made
		request("EditCopyrightHolderAction.action", null);
	}

	/**
* Test method to edit a {@link CopyrightHolder} which matches
* the {@link CopyrightHolder} supplied.  If the edited
* {@link CopyrightHolder} is empty, we do not do any
* action, which is the expected behaviour.
*/
	@Test
    public void testEditCopyrightHolder_duplicateCopyrights() throws ServletException, IOException {
		CopyrightHolderBean copyrightHolder = new CopyrightHolderBean();

        publish(copyrightHolder);
		assertThrown(() -> request("EditCopyrightHolderAction.action", copyrightHolder),
				getServletContext().getMessage("EditCopyrightHolderAction.exception.CopyrightsMismatch")
				);
	}

	/**
* Test method to edit a {@link CopyrightHolder} which matches
* the {@link CompleteMetadataBean} supplied.  If the edited
* {@link CopyrightHolder} is empty, we do not do any
* action, which is the expected behaviour.
*/
	@Test
    public void testEditCopyrightHolder_duplicateCompleteMetadata() {
        CompleteMetadataBean completeMetadata = new CompleteMetadataBean();

        publishAndSave(completeMetadata);
		assertThrown(() -> request("EditCopyrightHolderAction.action", completeMetadata),
				getServletContext().getMessage("EditCopyrightHolderAction.exception.MetadataCompleteMismatch")
				);
	}

	/**
* Test method to edit a {@link CopyrightHolder} which matches
* the {@link CompleteMetadataBean} supplied.  If the edited
* {@link CopyrightHolder} is empty, we do not do any
* action, which is the expected behaviour.
*/
	@Test
    public void testEditCopyrightHolder_duplicateCompleteMetadataAndCopyright() {

        CompleteMetadataBean completeMetadata = new CompleteMetadataBean();
        CompleteMetadataBean copyrightMetadata = new CompleteMetadataBean();

        publish(completeMetadata);
        publish(copyrightMetadata);
		assertThrown(() -> request("EditCopyrightHolderAction.action", completeMetadata, copyrightMetadata),
				getServletContext().getMessage("EditCopyrightHolderAction.exception.MetadataDifferentCopyrightMismatch")
				);
	}

	private void publish(CopyrightHolderBean copyrightHolder) {
        HttpServletRequest request = this.request("EditCopyrightHolderAction.action", copynrHolder);
        request.getSession().setMaxInactiveInterval(1);
        request.getSession().setAttribute("copynr", copynrHolder);
      
        Iterator<String> iterator = author.getFieldNames().iterator();
        while (iterator.hasNext()) {
            String fieldName = iterator.next();

            request.getSession().setAttribute(fieldName, author.getPublicField(fieldName));
        }
      
        try {
            request.getSession('cat' + this.getClass().getSimpleName() + ".class").setAttribute("cat", request.getParameter("cat"));
        } catch (NullPointerException nullpE) {
        } catch (IllegalArgumentException e) {
            fail("Field is present");
        }
        request.getSession().setAttribute("cat", request.getParameter("cat"));

        RequestDispatcher dispatcher = this.getContext().getRequestDispatcher("cataloger/edit");
        dispatcher.include(request);
	}

	/* Get a response object */
	private HttpServletRequest request(String baseAction, CopyrightHolderBean copyrightHolder, 
			CompleteMetadataBean metadata) throws ServletException, IOException {
		final HttpServletRequest request = this.request(baseAction, copyrightHolder, metadata);
		request.setAttribute("user", USER_NAME);
		return request;
	}

	private HttpServletRequest request(String baseAction, 
			CopyrightHolderBean copyrightHolder, CompleteMetadataBean metadata,
			String session) throws ServletException, IOException {
		final HttpServletRequest request = this.request(baseAction, copyrightHolder, metadata, session);
		request.setAttribute("user", USER_NAME);
		return request;
	}

}
