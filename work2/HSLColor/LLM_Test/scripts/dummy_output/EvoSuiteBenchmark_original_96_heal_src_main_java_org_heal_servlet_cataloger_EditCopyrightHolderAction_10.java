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
	 * An instance of EditCopyrightHolderAction.
	 */
	public static class TestAction extends HttpServlet {

        static final long serialVersionUID = 1L;

		public void action(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, NoSuchMethodException {
			assertTrue(EditCopyrightHolderAction.actionRequiresLogin());
			request.setAttribute("result", "ok");
			request.getRequestDispatcher("/WEB-INF/jsp/completenamesh.jsp").forward(request, response);
		}

		final public String getName() { return "TestGetName"; }
	}

    /**
     * An instance of EditCopyrightHolderBean with the correct value on the name attribute.
     */
    public static class TestCopyrightHolderBean extends CompleteMetadataBean {

        static final long serialVersionUID = 1L;

        /**
         * @param name name of the object representing the copyright holder.
         */
        public TestCopyrightHolderBean(Object name) { super(name); }
    }
    
    final CompleteMetadataBean testOne = new TestMetadataBean(new TestCopyrightHolderBean("testOne"));
    final CompleteMetadataBean testTwo = new TestMetadataBean(new TestCopyrightHolderBean("testTwo"));

}