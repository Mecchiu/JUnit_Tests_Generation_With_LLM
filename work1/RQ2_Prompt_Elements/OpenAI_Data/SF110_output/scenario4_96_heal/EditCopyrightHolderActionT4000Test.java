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
	* This test case checks if the method returns true.
	*/
	@Test
	public void testActionRequiresLogin() {
		EditCopyrightHolderAction editCopyrightHolderAction = new EditCopyrightHolderAction();
		assertTrue(editCopyrightHolderAction.actionRequiresLogin());
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

    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;

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

    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        CompleteMetadataBean completeMetadataBean = (CompleteMetadataBean) request.getSession().getAttribute("completeMetadataBean");
        if (completeMetadataBean == null) {
            completeMetadataBean = new CompleteMetadataBean();
            request.getSession().setAttribute("completeMetadataBean", completeMetadataBean);
        }
        CopyrightHolderBean copyrightHolderBean = null;
        String copyrightHolderId = request.getParameter("copyrightHolderId");
        if (copyrightHolderId != null) {
            Iterator copyrightHolderBeans = completeMetadataBean.getCopyrightHolderBeans().iterator();
            while (copyrightHolderBeans.hasNext()) {
                CopyrightHolderBean currentCopyrightHolderBean = (CopyrightHolderBean) copyrightHolderBeans.next();
                if (copyrightHolderId.equals(currentCopyrightHolderBean.getId())) {
                    copyrightHolderBean = currentCopyrightHolderBean;
                    break;
                }
            }
        }
        if (copyrightHolderBean == null) {
            copyrightHolderBean = new CopyrightHolderBean();
            completeMetadataBean.getCopyrightHolderBeans().add(copyrightHolderBean);
        }
        request.setAttribute("copyrightHolderBean", copyrightHolderBean);
        RequestDispatcher dispatcher = servlet.getServletContext().getRequestDispatcher("/editCopyrightHolder.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
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
* It contains ten unit test cases for the {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
*/
class EditCopyrightHolderActionTest {
		
	/**
	* Test case for {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
	* This test case checks if the method returns true.
	*/
	@Test
	public void testPerform() {
		EditCopyrightHolderAction editCopyrightHolderAction = new EditCopyrightHolderAction();
		assertTrue(editCopyrightHolderAction.perform(HttpServlet, HttpServletRequest, HttpServletResponse));
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

    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        CompleteMetadataBean completeMetadataBean = (CompleteMetadataBean) request.getSession().getAttribute("completeMetadataBean");
        if (completeMetadataBean == null) {
            completeMetadataBean = new CompleteMetadataBean();
            request.getSession().setAttribute("completeMetadataBean", completeMetadataBean);
        }
        CopyrightHolderBean copyrightHolderBean = null;
        String copyrightHolderId = request.getParameter("copyrightHolderId");
        if (copyrightHolderId != null) {
            Iterator copyrightHolderBeans = completeMetadataBean.getCopyrightHolderBeans().iterator();
            while (copyrightHolderBeans.hasNext()) {
                CopyrightHolderBean currentCopyrightHolderBean = (CopyrightHolderBean) copyrightHolderBeans.next();
                if (copyrightHolderId.equals(currentCopyrightHolderBean.getId())) {
                    copyrightHolderBean = currentCopyrightHolderBean;
                    break;
                }
            }
        }
        if (copyrightHolderBean == null) {
            copyrightHolderBean = new CopyrightHolderBean();
            completeMetadataBean.getCopyrightHolderBeans().add(copyrightHolderBean);
        }
        request.setAttribute("copyrightHolderBean", copyrightHolderBean);
        RequestDispatcher dispatcher = servlet.getServletContext().getRequestDispatcher("/editCopyrightHolder.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
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
* It contains ten unit test cases for the {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
*/
class EditCopyrightHolderActionTest {
		
	/**
	* Test case for {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
	* This test case checks if the method returns true.
	*/
	@Test
	public void testPerform() {
		EditCopyrightHolderAction editCopyrightHolderAction = new EditCopyrightHolderAction();
		assertTrue(editCopyrightHolderAction.perform(HttpServlet, HttpServletRequest, HttpServletResponse));
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

    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        CompleteMetadataBean completeMetadataBean = (CompleteMetadataBean) request.getSession().getAttribute("completeMetadataBean");
        if (completeMetadataBean == null) {
            completeMetadataBean = new CompleteMetadataBean();
            request.getSession().setAttribute("completeMetadataBean", completeMetadataBean);
        }
        CopyrightHolderBean copyrightHolderBean = null;
        String copyrightHolderId = request.getParameter("copyrightHolderId");
        if (copyrightHolderId != null) {
            Iterator copyrightHolderBeans = completeMetadataBean.getCopyrightHolderBeans().iterator();
            while (copyrightHolderBeans.hasNext()) {
                CopyrightHolderBean currentCopyrightHolderBean = (CopyrightHolderBean) copyrightHolderBeans.next();
                if (copyrightHolderId.equals(currentCopyrightHolderBean.getId())) {
                    copyrightHolderBean = currentCopyrightHolderBean;
                    break;
                }
            }
        }
        if (copyrightHolderBean == null) {
            copyrightHolderBean = new CopyrightHolderBean();
            completeMetadataBean.getCopyrightHolderBeans().add(copyrightHolderBean);
        }
        request.setAttribute("copyrightHolderBean", copyrightHolderBean);
        RequestDispatcher dispatcher = servlet.getServletContext().getRequestDispatcher("/editCopyrightHolder.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
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
* It contains ten unit test cases for the {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
*/
class EditCopyrightHolderActionTest {
		
	/**
	* Test case for {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
	* This test case checks if the method returns true.
	*/
	@Test
	public void testPerform() {
		EditCopyrightHolderAction editCopyrightHolderAction = new EditCopyrightHolderAction();
		assertTrue(editCopyrightHolderAction.perform(HttpServlet, HttpServletRequest, HttpServletResponse));
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

    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        CompleteMetadataBean completeMetadataBean = (CompleteMetadataBean) request.getSession().getAttribute("completeMetadataBean");
        if (completeMetadataBean == null) {
            completeMetadataBean = new CompleteMetadataBean();
            request.getSession().setAttribute("completeMetadataBean", completeMetadataBean);
        }
        CopyrightHolderBean copyrightHolderBean = null;
        String copyrightHolderId = request.getParameter("copyrightHolderId");
        if (copyrightHolderId != null) {
            Iterator copyrightHolderBeans = completeMetadataBean.getCopyrightHolder