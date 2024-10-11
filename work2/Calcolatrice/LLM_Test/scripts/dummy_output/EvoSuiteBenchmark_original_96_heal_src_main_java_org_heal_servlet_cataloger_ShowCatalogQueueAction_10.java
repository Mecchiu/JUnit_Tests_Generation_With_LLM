// ShowCatalogQueueActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ShowCatalogQueueAction}.
* It contains one unit test case for the {@link ShowCatalogQueueAction#actionRequiresLogin()} method.
*/
class ShowCatalogQueueActionTest {
		
    /**
     * Tests the response of {@link ShowCatalogQueueAction#actionRequiresLogin()},
     * that the response should include a <code>&quot;no authorization&quot;</code> in the response when the user's credentials are not supplied.
     */
    @Test 
    void testGetResponseWithoutCredentials() throws Exception {
    	String expected = "<h1>Catalog Queue</h1><hr/><p>"
                 + "<code>"
                 + "<a href=\"../catalog.jsp?catalog=Queue&catalog=Queue.View&id=show&queue=catalog&catalogid=&type=text\">"
                 + "<img src=\"../images/small.png\" height=30 width=30 onerror=\"window.location.reload()\" style=\"height: 30px; width: 30px\" alt=\"Catalog Queue\"/>"
                 + "</a>"
                 + "</code></b>: "
                 + "<hr/><p>";
                
        // this method will always return a new request
        String response = AuthenticationTools.test(new HttpServletRequest[]{LoginUserServlet.request()},
                String.valueOf(Integer.valueOf(0)),
                String.valueOf(Integer.valueOf(0)),
                expected,
                null);
        
        // if the action requires authentication, the expected value is not sent to 
        assertNotNull("Check for login if <code>false</code>.", response);
        
        assertTrue("Check if the request was rejected because it is required and not included in the <code>response</code>",!response.contains("<code>Authorization required</code>"));
		
        // if the action doesn't require authentication and the response matches the expected, it should return success
        AuthenticationTools.getRequestURL(HttpServletRequest.class, HttpServletResponse.class);
        String result = response;
        
        if (expected.contains("<b>")) {
            // this is a known issue, which probably means we should be using <strong> or <b> instead of <code> in the <code> result</code> 
            result = result.substring(0, result.indexOf("<code>")) + "<br>" + result.substring(result.indexOf("</b>") + 8, result.indexOf("</font>"));
        }
                
		assertEquals("Check if the response matches the expected response", expected, result);
		
	}
	
    /**
     * Tests that the response returned by the servlet is a valid JavaScript
     * document if the response is not successful.
     */
    @Test
    void testGetResponse() throws Exception {
		String expected = "<p>This is an existing document.<p>";
		
        // this method will always return a new request
        String response = AuthenticationTools.test(new HttpServletRequest[]{LoginUserServlet.request()},
                String.valueOf(Integer.valueOf(0)),
                String.valueOf(Integer.valueOf(0)),
                expected,
                null);
        
        // if the action requires authentication, the expected value is not sent to 
        assertNotNull("Check for login if <code>false</code>.", response);
        
        assertTrue("Check if the request was rejected because it is required and not included in the <code>response</code>",!response.contains("<h1>") 
                ||!response.contains("<font"));
		
		assertTrue("Check if the response matches the expected response", response.contains("'page'"));
		assertTrue("Check if the response matches the expected response", response.contains("alert('You have used the 'catalog_queue' page')"));
		
		assertTrue("Check if the response matches the expected response", response.contains("<b>OK</b>"));
			
	}
	
    /**
     * Tests that the response returned by the servlet is generated in the success case if the
     * user does not supply credentials to fetch the information.
     */
    @Test
    void testGetResponseWithCredentials() throws Exception {
        String expected = "<br/>"
                          + "<h1>Queue</h1>"
                          + "<p>"
                          + "<a href=\"../catalog.jsp?catalog=Queue&catalog=Queue.View&id=show&queue=catalog&catalogid=&type=text\">"
                          + "<img src=\"../images/small.png\" height=30 width=30 onerror=\"window.location.reload()\" style=\"height: 30px; width: 30px\" alt=\"Catalog Queue\"/>"
                          + "</a>"
                          + "<b>The queue <code>CatCatalogQueue</code> has been successfully loaded.</b><p>";
        
        // this method will always return a new request
		String response = AuthenticationTools.test(new HttpServletRequest[]{LoginUserServlet.request()},
                String.valueOf(Integer.valueOf(0)),
                String.valueOf(Integer.valueOf(0)),
                expected,
                null);
        
        // if the action requires authentication and the response matches the expected, it should return success
        assertNotNull("Check for login if <code>false</code>.", response);
		
		assertTrue("Check if the request was rejected because it is required and not included in the <code>response</code>",!response.contains("<code>Authorization required</code>"));
		
		// if the action doesn't require authentication and the response matches the expected, it should return success
		AuthenticationTools.getRequestURL(HttpServletRequest.class, 
				HttpServletResponse.class);
		String result = response;
		
        if (expected.contains("<code>")) {
            // this is a known issue, which probably means we should be using <strong> or <b> instead of <code> in the <code> result</code> 
            result = result.substring(0, result.indexOf("<code>"));
        }
                
		assertEquals("Check if the response matches the expected response", expected, result);
		
	}
	
}