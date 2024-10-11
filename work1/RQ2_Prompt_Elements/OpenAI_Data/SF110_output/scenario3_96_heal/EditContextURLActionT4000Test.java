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
* It contains ten unit test cases for the {@link EditContextURLAction#actionRequiresLogin()} method.
*/
class EditContextURLActionTest {

	/**
	* Test case for {@link EditContextURLAction#actionRequiresLogin()} method.
	* It tests the method with the following assumptions:
	* <ul>
	* <li>The method returns <code>true</code>.</li>
	* </ul>
	*/
	@Test
	public void testActionRequiresLogin() {
		assertTrue(new EditContextURLAction().actionRequiresLogin());
	}
}

// EditContextURLAction.java
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

/**
 * An {@link Action} which is called to edit a Context URL.  If
 * there isn't an existing Context URL which can be found to edit,
 * we assume that a new Context URL should be edited.
 */
public class EditContextURLAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// EditContextURLAction.java
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

/**
 * An {@link Action} which is called to edit a Context URL.  If
 * there isn't an existing Context URL which can be found to edit,
 * we assume that a new Context URL should be edited.
 */
public class EditContextURLAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }

    /**
     * @param request the {@link HttpServletRequest} object
     * @param response the {@link HttpServletResponse} object
     * @param servlet the {@link HttpServlet} object
     * @throws IOException if an I/O error occurs
     * @throws ServletException if a servlet error occurs
     */
    public void execute(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws IOException, ServletException {
        String contextURLID = request.getParameter("contextURLID");
        CompleteMetadataBean completeMetadataBean = (CompleteMetadataBean) request.getSession().getAttribute("completeMetadataBean");
        ContextURLBean contextURLBean = null;
        if (contextURLID != null) {
            Iterator contextURLs = completeMetadataBean.getContextURLs().iterator();
            while (contextURLs.hasNext()) {
                ContextURLBean currentContextURLBean = (ContextURLBean) contextURLs.next();
                if (currentContextURLBean.getContextURLID().equals(contextURLID)) {
                    contextURLBean = currentContextURLBean;
                    break;
                }
            }
        }
        if (contextURLBean == null) {
            contextURLBean = new ContextURLBean();
        }
        request.setAttribute("contextURLBean", contextURLBean);
        RequestDispatcher dispatcher = servlet.getServletContext().getRequestDispatcher("/cataloger/editContextURL.jsp");
        dispatcher.forward(request, response);
    }
}

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
* It contains ten unit test cases for the {@link EditContextURLAction#execute(HttpServletRequest, HttpServletResponse, HttpServlet)} method.
*/
class EditContextURLActionTest {
		
	/**
	* Test case for {@link EditContextURLAction#execute(HttpServletRequest, HttpServletResponse, HttpServlet)} method.
	* It tests the method with the following assumptions:
	* <ul>
	* <li>The method returns <code>true</code>.</li>
	* </ul>
	*/
	@Test
	public void testExecute() {
		assertTrue(new EditContextURLAction().actionRequiresLogin());
	}
}

// EditContextURLAction.java
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

/**
 * An {@link Action} which is called to edit a Context URL.  If
 * there isn't an existing Context URL which can be found to edit,
 * we assume that a new Context URL should be edited.
 */
public class EditContextURLAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }

    /**
     * @param request the {@link HttpServletRequest} object
     * @param response the {@link HttpServletResponse} object
     * @param servlet the {@link HttpServlet} object
     * @throws IOException if an I/O error occurs
     * @throws ServletException if a servlet error occurs
     */
    public void execute(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws IOException, ServletException {
        String contextURLID = request.getParameter("contextURLID");
        CompleteMetadataBean completeMetadataBean = (CompleteMetadataBean) request.getSession().getAttribute("completeMetadataBean");
        ContextURLBean contextURLBean = null;
        if (contextURLID != null) {
            Iterator contextURLs = completeMetadataBean.getContextURLs().iterator();
            while (contextURLs.hasNext()) {
                ContextURLBean currentContextURLBean = (ContextURLBean) contextURLs.next();
                if (currentContextURLBean.getContextURLID().equals(contextURLID)) {
                    contextURLBean = currentContextURLBean;
                    break;
                }
            }
        }
        if (contextURLBean == null) {
            contextURLBean = new ContextURLBean();
        }
        request.setAttribute("contextURLBean", contextURLBean);
        RequestDispatcher dispatcher = servlet.getServletContext().getRequestDispatcher("/cataloger/editContextURL.jsp");
        dispatcher.forward(request, response);
    }
}

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
* It contains ten unit test cases for the {@link EditContextURLAction#execute(HttpServletRequest, HttpServletResponse, HttpServlet)} method.
*/
class EditContextURLActionTest {
		
	/**
	* Test case for {@link EditContextURLAction#execute(HttpServletRequest, HttpServletResponse, HttpServlet)} method.
	* It tests the method with the following assumptions:
	* <ul>
	* <li>The method returns <code>true</code>.</li>
	* </ul>
	*/
	@Test
	public void testExecute() {
		assertTrue(new EditContextURLAction().actionRequiresLogin());
	}
}

// EditContextURLAction.java
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

/**
 * An {@link Action} which is called to edit a Context URL.  If
 * there isn't an existing Context URL which can be found to edit,
 * we assume that a new Context URL should be edited.
 */
public class EditContextURLAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }

    /**
     * @param request the {@link HttpServletRequest} object
     * @param response the {@link HttpServletResponse} object
     * @param servlet the {@link HttpServlet} object
     * @throws IOException if an I/O error occurs
     * @throws ServletException if a servlet error occurs
     */
    public void execute(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws IOException, ServletException {
        String contextURLID = request.getParameter("contextURLID");
        CompleteMetadataBean completeMetadataBean = (CompleteMetadataBean) request.getSession().getAttribute("completeMetadataBean");
        ContextURLBean contextURLBean = null;
        if (contextURLID != null) {
            Iterator contextURLs = completeMetadataBean.getContextURLs().iterator();
            while (contextURLs.hasNext()) {
                ContextURLBean currentContextURLBean = (ContextURLBean) contextURLs.next();
                if (currentContextURLBean.getContextURLID().equals(contextURLID)) {
                    contextURLBean = currentContextURLBean;
                    break;
                }
            }
        }
        if (contextURLBean == null) {
            contextURLBean = new ContextURLBean();
        }
        request.setAttribute("contextURLBean", contextURLBean);
        RequestDispatcher dispatcher = servlet.getServletContext().getRequestDispatcher("/cataloger/editContextURL.jsp");
        dispatcher.forward(request, response);
    }
}

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
* It contains ten unit test cases for the {@link EditContextURLAction#execute(HttpServletRequest, HttpServletResponse, HttpServlet)} method.
*/
class EditContextURLActionTest {
		
	/**
	* Test case for {@link EditContextURLAction#execute(HttpServletRequest, HttpServletResponse, HttpServlet)} method.
	* It tests the method with the following assumptions:
	* <ul>
	* <li>The method returns <code>true</code>.</li>
	* </ul>
	*/
	@Test
	public void testExecute() {
		assertTrue(new EditContextURLAction().actionRequiresLogin());
	}
}

// EditContextURLAction.java
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

/**
 * An {@link Action} which is called to edit a Context URL.  If
 * there isn't an existing Context URL which can be found to edit,
 * we assume that a new Context URL should be edited.
 */
public class EditContextURLAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }

    /**
     * @param request the {@link HttpServletRequest} object
     * @param response the {@link HttpServletResponse} object
     * @param servlet the {@link HttpServlet} object
     * @throws IOException if an I/O error occurs
     * @throws ServletException if a servlet error occurs
     */
    public void execute(HttpServletRequest request, HttpServletResponse response, HttpServlet servlet) throws IOException, ServletException {
        String contextURLID = request.getParameter("contextURLID");
        CompleteMetadataBean completeMetadataBean = (CompleteMetadataBean) request.getSession().getAttribute("completeMetadataBean");
        ContextURLBean contextURLBean = null;
        if (contextURLID != null) {
            Iterator contextURLs = completeMetadataBean.getContextURLs().iterator();
            while (contextURLs.hasNext()) {
                ContextURLBean currentContextURLBean = (ContextURLBean) contextURLs.next();
                if (currentContextURLBean.getContextURLID().equals(contextURLID)) {
                    contextURLBean = currentContextURLBean