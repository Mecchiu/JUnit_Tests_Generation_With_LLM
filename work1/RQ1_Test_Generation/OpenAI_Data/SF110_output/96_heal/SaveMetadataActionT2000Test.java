// SaveMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SaveMetadataAction}.
* It contains ten unit test cases for the {@link SaveMetadataAction#actionRequiresLogin()} method.
*/
class SaveMetadataActionTest {

	/**
	* Test case for {@link SaveMetadataAction#actionRequiresLogin()} method.
	* It tests the method with the following assumptions:
	* Assumption 1: The method returns true.
	*/
	@Test
	void testActionRequiresLogin() {
		assertTrue(new SaveMetadataAction().actionRequiresLogin());
	}
}

// SearchAction.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.MetadataDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * An {@link org.heal.servlet.Action Action} used to search for
 * metadata records.
 */
public class SearchAction implements Action {

    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        final String searchString = request.getParameter("searchString");
        final MetadataDAO metadataServices = (MetadataDAO) servlet.getServletContext().getAttribute("MetadataDAO");
        try {
            final List results = metadataServices.search(searchString);
            request.setAttribute("results", results);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
        RequestDispatcher rd = request.getRequestDispatcher("/cataloger/searchResults.jsp");
        rd.forward(request, response);
    }

    /**
     * @return <code>false</code>
     */
    public boolean actionRequiresLogin() {
        return false;
    }
}

// SearchActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.MetadataDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchAction}.
* It contains ten unit test cases for the {@link SearchAction#actionRequiresLogin()} method.
*/
class SearchActionTest {
		
	/**
	* Test case for {@link SearchAction#actionRequiresLogin()} method.
	* It tests the method with the following assumptions:
	* Assumption 1: The method returns false.
	*/
	@Test
	void testActionRequiresLogin() {
		assertFalse(new SearchAction().actionRequiresLogin());
	}
}

// ShowMetadataAction.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.MetadataDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * An {@link org.heal.servlet.Action Action} used to show metadata
 * records.
 */
public class ShowMetadataAction implements Action {

    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        final String metadataId = request.getParameter("metadataId");
        final MetadataDAO metadataServices = (MetadataDAO) servlet.getServletContext().getAttribute("MetadataDAO");
        try {
            request.setAttribute("metadata", metadataServices.getMetadata(metadataId));
        } catch (SQLException e) {
            throw new ServletException(e);
        }
        RequestDispatcher rd = request.getRequestDispatcher("/cataloger/showMetadata.jsp");
        rd.forward(request, response);
    }

    /**
     * @return <code>false</code>
     */
    public boolean actionRequiresLogin() {
        return false;
    }
}

// ShowMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.MetadataDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ShowMetadataAction}.
* It contains ten unit test cases for the {@link ShowMetadataAction#actionRequiresLogin()} method.
*/
class ShowMetadataActionTest {
		
	/**
	* Test case for {@link ShowMetadataAction#actionRequiresLogin()} method.
	* It tests the method with the following assumptions:
	* Assumption 1: The method returns false.
	*/
	@Test
	void testActionRequiresLogin() {
		assertFalse(new ShowMetadataAction().actionRequiresLogin());
	}
}

// ShowQueueAction.java
package org.heal.servlet.cataloger;

import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * An {@link org.heal.servlet.Action Action} used to show the
 * contents of a queue.
 */
public class ShowQueueAction implements Action {

    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        final String queueType = request.getParameter("queueType");
        final QueueDAO queueManager = (QueueDAO) servlet.getServletContext().getAttribute("QueueDAO");
        try {
            final List queue = queueManager.getQueue(queueType);
            request.setAttribute("queue", queue);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
        RequestDispatcher rd = request.getRequestDispatcher("/cataloger/showQueue.jsp");
        rd.forward(request, response);
    }

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// ShowQueueActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import