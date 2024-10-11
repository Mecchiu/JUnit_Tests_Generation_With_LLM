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
     * It tests the {@link ShowCatalogQueueAction#actionRequiresLogin()} method.
     */
    @Test
    void testActionRequiresLogin() {

    	RequestDispatcher rd = new RequestDispatcher("/catalog-queue.jsp?userID=" +
    			AuthenticationTools.getUserID("climatic-pigeon") + "&id=" + Integer.toString(Integer.MAX_VALUE + 1));
	
    	HttpServletRequest req = new HttpServletRequest("GET", new String[] {"/catalog-order.jsp"});
	
	    RequestDispatcherRequest rdr = new RequestDispatcherRequest("/catalog-queue.jsp", req);
	    rdr.setAttribute(AuthenticationTools.COOKIE_NAME, "1");
	    
        rdr.setVirtualAction(new ShowCatalogQueueAction());
        
        assertTrue(rdr.isDispatchedToApplet());
     	
        int retVal = rd.handleRequest(req, true);
     	
        assertEquals(Action.StatusCode.FAILED, retVal);
        
        assertTrue(AuthenticationTools.isUserDispatchedToApplet());
    }
	
    /**
     * It tests the {@link ShowCatalogQueueAction#actionRequiresLogin()} method.
     */
    @Test
    void testActionWithDisabledLogin() {
		
		RequestDispatcher rd = new RequestDispatcher("/catalog-queue.jsp?userID=" +
    			AuthenticationTools.getUserID("clIMatic-pigeon"));
	
		HttpServletRequest req = new HttpServletRequest("GET", new String[] {"/catalog-queue.jsp"});
	
		RequestDispatcherRequest rdr = new RequestDispatcherRequest("/catalog-queue.jsp", req);
	
		rdr.setAttribute(AuthenticationTools.COOKIE_NAME, "1");
		
        rdr.setVirtualAction(new ShowCatalogQueueAction());
        
        assertTrue(rdr.isDispatchedToApplet());
     	
        int retVal = rd.handleRequest(req, true);
     	
        assertEquals(Action.StatusCode.FAILED, retVal);
        
        assertTrue(AuthenticationTools.isUserDispatchedToApplet());
    }

    /**
     * It tests the {@link ShowCatalogQueueAction#actionRequiresLogin()} method with
     * an URL with no user credentials.
     */
    @Test
    void testActionWithUnloggedRequest() {
		
        RequestDispatcher rd = new RequestDispatcher("/catalog-queue.jsp", true);
        
        assertTrue(rd.isDispatchedToApplet());
     	
        int retVal = rd.handleRequest(null, true);
     	
        assertEquals(Action.StatusCode.FAILED, retVal);
        
        assertTrue(AuthenticationTools.isUserDispatchedToApplet());
    }

    /**
     * It tests the {@link ShowCatalogQueueAction#actionRequiresLogin()} method with
     * a URL with a user ID.
     */
    @Test
    void testActionWithUserID() {
		
        Integer intCookie = Integer.MAX_VALUE;
        
        RequestDispatcher rd = new RequestDispatcher("/catalog-queue.jsp?userID=" +
    			AuthenticationTools.getUserID(getRandomUserName()) + "&id=" + 
    			Integer.toString(intCookie++));
        
        HttpServletRequest req = new HttpServletRequest("GET", new String[] {"/catalog-queue.jsp"});
    
        RequestDispatcherRequest rdr = new RequestDispatcherRequest("/catalog-queue.jsp", req);
        
        rdr.setAttribute(AuthenticationTools.COOKIE_NAME, "1");
        rdr.setAttribute(AuthenticationTools.USER_ID_NAME, "catalog-queue-test-user-id-test-id");
        
        rdr.setVirtualAction(new ShowCatalogQueueAction());
        
        assertTrue(rdr.isDispatchedToApplet());
     	
        int retVal = rd.handleRequest(req, true);
     	
        assertEquals(Action.StatusCode.SUCCESS, retVal);
        
        assertTrue(AuthenticationTools.isUserDispatchedToApplet());
    }

    /**
     * Creates a random user for use with the URL.
     * @return the user name
     */
    private String getRandomUserName() {
        int randInt = (int) (Math.random() * 10);
        return AuthenticationTools.getUserName(randInt);
    }

}