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
* It contains one unit test case for the {@link EditContextURLAction#actionRequiresLogin()} method.
*/
class EditContextURLActionTest {
		private static final String URL = "context.contextURL";
	
	/**
	 * Test method for {@link EditContextURLAction#actionRequiresLogin()}.
	 */
	@Test
	public void testActionRequiresLogin() {
	    new EditContextURLAction();
    }
    
    
	/**
	 * Test method for {@link EditContextURLAction#perform (HttpServlet, HttpServletRequest, HttpServletResponse)}.
	 */
	@Test
	public void testPerform_HttpServlet_HttpServletRequest_HttpServletResponse() throws IOException, ServletException {
	    new EditContextURLAction();
    }

}