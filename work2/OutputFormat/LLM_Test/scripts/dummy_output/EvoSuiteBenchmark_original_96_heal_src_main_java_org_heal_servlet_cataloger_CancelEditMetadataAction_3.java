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
		
   /**
    * Check value of {@link CancelEditMetadataAction#actionRequiresLogin()}
    */
   @Test
   
   public void testActionRequiresLogin() throws IOException, ServletException {
       
       // Get request URL without prefix
       HttpServletRequest request =
               (HttpServletRequest) requestProperties().get("Request");
       
       // Check the value of {@literal RequestDispatcher#forward} property
       assertNull(request.getServletPath());
       assertNull(request.getRequestURI());
       
       // Check the value of {@literal HttpServletRequest#getSession} property
       assertNotNull(request.getSession());
       
       // Check the value of {@literal HttpServletRequest#getRequestURL} property
       assertSame(HttpServletRequest.class,
           request.getRequestDispatcher().getClass());
   }
}