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
* It contains ten unit test cases for the {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
*/
class EditCopyrightHolderActionTest {

	/**
	* Test case for {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
	* It tests the method with the following assumptions:
	* <ul>
	* <li>The method returns <code>true</code>.</li>
	* </ul>
	*/
	@Test
	public void testActionRequiresLogin() {
		assertTrue(new EditCopyrightHolderAction().actionRequiresLogin());
	}
}

// EditCopyrightHolderAction.java
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

/**
 * An {@link Action} which is called to edit a Copyright Holder.  If
 * there isn't an existing Copyright Holder which can be found to edit,
 * we assume that a new Copyright Holder should be edited.
 */
public class EditCopyrightHolderAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// EditCopyrightHolderAction.java
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

/**
 * An {@link Action} which is called to edit a Copyright Holder.  If
 * there isn't an existing Copyright Holder which can be found to edit,
 * we assume that a new Copyright Holder should be edited.
 */
public class EditCopyrightHolderAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }

    /**
     * @param request the {@link HttpServletRequest} which is used to
     *        determine which Copyright Holder should be edited
     * @param response the {@link HttpServletResponse} which is used to
     *        forward the user to the appropriate page
     * @param servlet the {@link HttpServlet} which is used to get the
     *        {@link RequestDispatcher}
     * @throws ServletException if there is a problem forwarding the
     *         user to the appropriate page
     * @throws IOException if there is a problem forwarding the user to
     *         the appropriate page
     */
    public void performAction(HttpServletRequest request,
                              HttpServletResponse response,
                              HttpServlet servlet)
        throws ServletException, IOException {
        CompleteMetadataBean metadata =
            (CompleteMetadataBean)request.getSession().getAttribute("metadata");
        String copyrightHolderId = request.getParameter("copyrightHolderId");
        CopyrightHolderBean copyrightHolder = null;
        if (copyrightHolderId != null) {
            Iterator copyrightHolders = metadata.getCopyrightHolders();
            while (copyrightHolders.hasNext()) {
                CopyrightHolderBean currentCopyrightHolder =
                    (CopyrightHolderBean)copyrightHolders.next();
                if (currentCopyrightHolder.getId().equals(copyrightHolderId)) {
                    copyrightHolder = currentCopyrightHolder;
                    break;
                }
            }
        }
        if (copyrightHolder == null) {
            copyrightHolder = new CopyrightHolderBean();
            metadata.addCopyrightHolder(copyrightHolder);
        }
        request.setAttribute("copyrightHolder", copyrightHolder);
        RequestDispatcher dispatcher =
            servlet.getServletContext().getRequestDispatcher("/editCopyrightHolder.jsp");
        dispatcher.forward(request, response);
    }
}

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
* It contains ten unit test cases for the {@link EditCopyrightHolderAction#performAction(HttpServletRequest, HttpServletResponse, HttpServlet)} method.
*/
class EditCopyrightHolderActionTest {
		
	/**
	* Test case for {@link EditCopyrightHolderAction#performAction(HttpServletRequest, HttpServletResponse, HttpServlet)} method.
	* It tests the method with the following assumptions:
	* <ul>
	* <li>The method returns <code>true</code>.</li>
	* </ul>
	*/
	@Test
	public void testPerformAction() {
		assertTrue(new EditCopyrightHolderAction().actionRequiresLogin());
	}
}

// EditCopyrightHolderAction.java
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

/**
 * An {@link Action} which is called to edit a Copyright Holder.  If
 * there isn't an existing Copyright Holder which can be found to edit,
 * we assume that a new Copyright Holder should be edited.
 */
public class EditCopyrightHolderAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }

    /**
     * @param request the {@link HttpServletRequest} which is used to
     *        determine which Copyright Holder should be edited
     * @param response the {@link HttpServletResponse} which is used to
     *        forward the user to the appropriate page
     * @param servlet the {@link HttpServlet} which is used to get the
     *        {@link RequestDispatcher}
     * @throws ServletException if there is a problem forwarding the
     *         user to the appropriate page
     * @throws IOException if there is a problem forwarding the user to
     *         the appropriate page
     */
    public void performAction(HttpServletRequest request,
                              HttpServletResponse response,
                              HttpServlet servlet)
        throws ServletException, IOException {
        CompleteMetadataBean metadata =
            (CompleteMetadataBean)request.getSession().getAttribute("metadata");
        String copyrightHolderId = request.getParameter("copyrightHolderId");
        Copyright