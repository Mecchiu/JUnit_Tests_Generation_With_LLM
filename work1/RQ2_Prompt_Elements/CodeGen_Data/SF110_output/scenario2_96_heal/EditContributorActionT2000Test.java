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

    @Test
    public void testActionRequiresLogin() throws ServletException, IOException {
        ContributorBean bean = new ContributorBean();
        bean.setName("test");
        boolean isEdit = EditContributorAction.actionRequiresLogin();
        assertTrue(isEdit);
    }
	
	@Test
	public void testActionInvokedWithoutLogin() throws ServletException, IOException {
		ContributorBean bean = new ContributorBean();
		bean.setName("test");
		
		HttpServletRequest req = null;
		HttpServletResponse resp = null;
        RequestDispatcher dispatcher = null;
        Iterator iter = null;
        
        try {
            req = new HttpServletRequest("/edit");
            req.getSession().setAttribute("contributorBean", bean);
            resp = new HttpServletResponse("");
            dispatcher = RequestDispatcher.getRequestDispatcher("/edit");
            iter = req.getParameterOrder();
            assertTrue(!iter.hasNext());
        }
        
        finally {
            if (resp!= null) {
                resp.getWriter().close();
            }
            if (dispatcher!= null) {
                dispatcher.forward(req, resp);
            }
        }
	}
}