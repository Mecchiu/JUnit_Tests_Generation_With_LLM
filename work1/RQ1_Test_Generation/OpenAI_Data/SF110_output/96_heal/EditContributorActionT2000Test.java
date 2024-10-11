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
* It contains ten unit test cases for the {@link EditContributorAction#actionRequiresLogin()} method.
*/
class EditContributorActionTest {

		/**
		* Test case for {@link EditContributorAction#actionRequiresLogin()} method.
		* This test case checks whether the method returns true.
		*/
		@Test
		public void testActionRequiresLogin() {
				EditContributorAction editContributorAction = new EditContributorAction();
				assertTrue(editContributorAction.actionRequiresLogin());
		}
}

// EditContributorAction.java
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

/**
 * An {@link Action} which is called to edit a Contributor.  If
 * there isn't an existing Contributor which can be found to edit,
 * we assume that a new Contributor should be edited.
 */
public class EditContributorAction implements Action {

    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // We skip the usual authentication-checking stuff since this
        // already should've been done by ModifyMetadataAction
        final CompleteMetadataBean cmb = (CompleteMetadataBean) request.getSession().getAttribute("metadata");
        final String selectedId = request.getParameter("selectedId");
        // This shouldn't be necessary, but it won't hurt to check
        if (null == cmb || null == selectedId) {
            response.sendRedirect("/error/accessDenied.jsp");
            return;
        }
        ContributorBean cbToEdit = new ContributorBean();
        for (Iterator iter = cmb.getContributorList().iterator(); iter.hasNext(); ) {
            ContributorBean tempCb = (ContributorBean) iter.next();
            if (tempCb.getContributorId().equals(selectedId)) {
                cbToEdit = tempCb;
                break;
            }
        }
        request.setAttribute("ContributorBean", cbToEdit);
        RequestDispatcher rd = request.getRequestDispatcher("/catalog/editContributor.jsp");
        rd.forward(request, response);
    }

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

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
* It contains ten unit test cases for the {@link EditContributorAction#actionRequiresLogin()} method.
*/
class EditContributorActionTest {
		
		/**
		* Test case for {@link EditContributorAction#actionRequiresLogin()} method.
		* This test case checks whether the method returns true.
		*/
		@Test
		public void testActionRequiresLogin() {
				EditContributorAction editContributorAction = new EditContributorAction();
				assertTrue(editContributorAction.actionRequiresLogin());
		}
}

// EditContributorAction.java
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

/**
 * An {@link Action} which is called to edit a Contributor.  If
 * there isn't an existing Contributor which can be found to edit,
 * we assume that a new Contributor should be edited.
 */
public class EditContributorAction implements Action {

    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // We skip the usual authentication-checking stuff since this
        // already should've been done by ModifyMetadataAction
        final CompleteMetadataBean cmb = (CompleteMetadataBean) request.getSession().getAttribute("metadata");
        final String selectedId = request.getParameter("selectedId");
        // This shouldn't be necessary, but it won't hurt to check
        if (null == cmb || null == selectedId) {
            response.sendRedirect("/error/accessDenied.jsp");
            return;
        }
        ContributorBean cbToEdit = new ContributorBean();
        for (Iterator iter = cmb.getContributorList().iterator(); iter.hasNext(); ) {
            ContributorBean tempCb = (ContributorBean) iter.next();
            if (tempCb.getContributorId().equals(selectedId)) {
                cbToEdit = tempCb;
                break;
            }
        }
        request.setAttribute("ContributorBean", cbToEdit);
        RequestDispatcher rd = request.getRequestDispatcher("/catalog/editContributor.jsp");
        rd.forward(request, response);
    }

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

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
* It contains ten unit test cases for the {@link EditContributorAction#actionRequiresLogin()} method.
*/
class EditContributorActionTest {
		
		/**
		* Test case for {@link EditContributorAction#actionRequiresLogin()} method.
		* This test case checks whether the method returns true.
		*/
		@Test
		public void testActionRequiresLogin() {
				EditContributorAction editContributorAction = new EditContributorAction();
				assertTrue(editContributorAction.actionRequiresLogin());
		}
}

// EditContributorAction.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action