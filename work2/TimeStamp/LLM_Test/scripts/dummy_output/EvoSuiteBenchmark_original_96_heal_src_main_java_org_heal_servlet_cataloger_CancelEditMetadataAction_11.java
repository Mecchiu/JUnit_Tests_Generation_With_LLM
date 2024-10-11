// CancelEditMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CancelEditMetadataAction}.
* It contains one unit test case for the {@link CancelEditMetadataAction#actionRequiresLogin()} method.
*/
class CancelEditMetadataActionTest {
		
	@Test
	void testRequiredLogin_actionRequiresLogin_logout() {
		assertTrue(AuthenticationTools.isCalledAs(this.getClass(), CancelEditMetadataAction.class.getName() + ":hasRole('admin')"));
	}

	@Test
	void testCancellation() {
		HttpServlet servlet = new CancelEditMetadataAction();

		// clear session
		HttpSession session = Application.getSessionFactory().getCurrentSession();
		session.invalidate();

		String path = "/cataloger/";
		Action cancel = new CancelEditMetadataAction();
		cancel.perform(servlet, new HttpServletRequest(new HttpServletRequest[]{new GetMetadataAction(new Metadata(path)})));

		cancel.perform(servlet, new HttpServletRequest(new HttpServletRequest[]{new GetMetadataAction(new Metadata(path), MetadataStatus.DELETED)}));

		cancel.perform(servlet, new HttpServletRequest(new HttpServletRequest[]{new GetMetadataAction(new Metadata(path), MetadataStatus.NOT_EDITABLE)}));

		assertTrue(CancelEditMetadataAction.actionRequiresLogin());
	}

}

class GetMetadataAction implements Action {

    private String path = null;

    private int metadataStatus = Status.NOT_EDITABLE;

    public GetMetadataAction(Metadata metadata) {
        this.path = metadata.getPath();
		this.metadataStatus = metadata.getStatus();
    }

    public void perform(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		try {
            dispatcher.forward(request, response);
        } finally {
            response.setStatus(metadataStatus);
        }

    }
}

class CancelEditMetadataAction implements Action {

    private String path = null;

    public CancelEditMetadataAction() {

    }

    public void perform(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            RequestDispatcher dispatcher = request.getRequestDispatcher(path);
            try {
                response.forward(request, response);
            } finally {
                response.setStatus(HttpServletResponse.SC_OK);
            }
        } catch (Exception e){
            throw new ServletException(e);
        }

    }
}