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
    void actionRequiresLogin() {
        CancelEditMetadataAction a = new CancelEditMetadataAction();
        assertTrue( a.actionRequiresLogin());
    }
	
	@Test
	void perform() throws ServletException {
		CancelEditMetadataAction a = new CancelEditMetadataAction();
        assertFalse(a.perform( null, null, null));
    }
	
	@Test
	void perform_nullServletRequest_nullResponse() throws IOException {
		String url = "http://localhost:8001/cataloger/cataloger";
		
		HttpServletRequest request = null;
		HttpServletResponse response = null;
		
		try {
			AuthenticationTools.doLoggedRequestAuthentication( null, null, url, null, request, response);
		} catch(IllegalArgumentException e) {
			assertEquals( "The url of the cataloger resource is invalid!", e.getMessage());
			return;
		} catch (Exception e) {
			fail("Unexpected exception was thrown:" + e.getMessage());
			return;
		}        
	}

	@Test
	void getErrorServlet() throws ServletException {
		HttpServlet errorServlet = new CancelEditMetadataErrorServlet();
    	try {
        	AuthenticationTools.doLoggedRequestAuthentication( null, null, null, null, null, null);
        } catch(Exception e) {
        	assertTrue(e instanceof IOException);
        }		
	}
	
	@Test
	void getErrorServlet_illegalHttpMethod() throws ServletException {
		HttpServlet errorServlet = new CancelEditMetadataErrorServlet();
        try {
        	AuthenticationTools.doLoggedRequestAuthentication(null, null, null, "GET", null, null);
        } catch(Exception e) {
			assertEquals( "Method not allowed. GET not allowed.", e.getMessage());
        }		
	}
	
	
	@Test
	void getInfoServlet() throws ServletException {
		HttpServlet infoServlet = new CancelEditMetadataInfoServlet();
        try {
        	AuthenticationTools.doLoggedRequestAuthentication( null, null, null, "GET", null, null);
        } catch(Exception e) {
			assertEquals( "No info for this request. GET not allowed.", e.getMessage());
        }		
	}
	
	@Test
	void getInfoServlet_illegalHttpMethod() throws ServletException {
		HttpServlet infoServlet = new CancelEditMetadataInfoServlet();
        try {
        	AuthenticationTools.doLoggedRequestAuthentication(null, null, null, "GET", "POST", null);
        } catch(Exception e) {
			assertEquals( "Method not allowed. GET not allowed.", e.getMessage());
        }		
	}
}

class CancelEditMetadataErrorServlet extends HttpServlet {

}