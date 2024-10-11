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
     * Test method of {@link CancelEditMetadataAction#actionRequiresLogin()}.
     */
    @Test
    public void testActionRequiresLogin() {
        final CancelEditMetadataAction action = new CancelEditMetadataAction();
        assertNotNull( action );
        assertTrue(! action.requiresLogin() );
    }
    
    /**
     * Test method of {@link CancelEditMetadataAction#actionRequiresLogin()}.
     */
    @Test
    public void testCancelAllMetadataAction() {
        final CancelEditMetadataAction action = CancelEditMetadataAction.actionCancelAllMetadata();
        assertSame( action, action );
    }    
    
    /**
     * Test method of {@link CancelEditMetadataAction#actionRequiresLogin()}.
     */
    @Test
    public void testRedirectToMetadataForLogin() {
        final CancelEditMetadataAction action = CancelEditMetadataAction.actionCancelAllMetadata();
        final RequestDispatcher d1 = RequestDispatcher.getInstance("view");
        d1.forward( null, new String[]{"test"} );
        final HttpServletRequest req = null;
        final HttpServletResponse res = null;
        assertEquals( "test", d1.getTheRequestURL(req, res).getParameter("metadata"));
        
        assertSame( d1, d1.getParent() );
        
        assertEquals( HttpServletResponse.SC_MOVED_PERMANENTLY, res.getStatus());
        assertEquals("redirected", res.getHeader("Location"));
    }
    
    /**
     * Test method of {@link CancelEditMetadataAction#actionRequiresLogin()}.
     */
    @Test
    public void actionCancelAllMetadata() {
        final CancelEditMetadataAction action = CancelEditMetadataActionTest.testActionCancelAllMetadata();
        final RequestDispatcher d1 = RequestDispatcher.getInstance("view");
        assertEquals("view", d1.getServletPath());
        assertEquals( "/cataloger/editMetadata.jsp", d1.getServletPath());
        assertEquals( (String)"/cataloger/editMetadata.jsp", d1.getUrl());
        assertIsRedirected( action.getClass().getName(), "/cataloger/editMetadata.jsp" );
            
        assertSame( d1, d1.getParent() );
        
        assertFalse( d1.containsRequest( d1.getParent().getRequest() ) );
    }
    
    /**
     * Test method of {@link CancelEditMetadataAction#isSucceeded()}.
     */
    @Test
    public void testIsSucceeded() {
        final CancelEditMetadataAction action = CancelEditMetadataActionTest.testActionCancelAllMetadata();
        final RequestDispatcher d1 = RequestDispatcher.getInstance("view");
        assertTrue( d1.containsRequest( d1.getParent().getRequest() ) );
        assertTrue( action.isSucceeded() );
        
        final HttpServletRequest req = null;
        final HttpServletResponse res = null;
        assertFalse( d1.containsRequest( req ) );
        
        assertTrue( d1.containsRequest( d1.getParent().getRequest() ) );
    }
    
    /**
     * Test method of {@link CancelEditMetadataAction#isSucceeded()}.
     */
    @Test
    public void testSucceededWithErrorResponse() throws IOException {
        final HttpServletRequest req = null;
        final HttpServletResponse res = null;
        final CancelEditMetadataAction action = CancelEditMetadataActionTest.testActionCancelAllMetadata();
        assertTrue( action.isSucceeded() );
        assertNotNull( action.getErrorMessage() );
        
        assertTrue( action.hasErrorResponse() );
    }
    
    @Test
    public void testInvalidActionName() throws Exception {
        try {
            // invalid action name (expect invalid name in the action name
            final CancelEditMetadataAction invalidAction = CancelEditMetadataAction.actionCancelAllMetadata().withName("invalid_action_name");
            assertThrows( ServletException.class, invalidAction::doGet );
            
            // invalid action name (should have error message
            
        } catch( final ServletException e ) {
            assertEquals( HttpServletResponse.SC_NOT_FOUND, e.getResponse().getStatus() );
            assertEquals( "cancelMetadata", e.getMessage());
        }
    }
    
    /**
     * Test method of {@link RequestDispatcher#sendError(int, java.lang.Exception)}.
     */
    @Test
    public void testSendError() throws IOException, ServletException {
        final HttpServletRequest req = null;
        final HttpServletResponse res = null;
        final RequestDispatcher d1 = RequestDispatcher.getInstance("view");
        d1.forward( req, res );
        
        assertTrue( d1.containsRequest( req ) );
        assertTrue( res.contains( "POST", "/cataloger/editMetadata.jsp", null ) );
        
        int status = d1.getStatus();
        final Exception err = (Exception) d1.getException();
        assertEquals( 401, status );
        assertSame( err, (ServletException)d1.getException() );
        assertFalse( res.contains( "POST", "/cataloger/editMetadata.jsp", null ) );
        
        getRequest( req );
    }
    
    /**
     * Gets request.
     * 
     * @param req
     *            the req
     * @return the request
     */
    protected void getRequest( final HttpServletRequest req ) {
        assertNotNull( req );
        assertFalse( req.containsParameter( "action" ) );
        assertFalse( req.containsParameter( "cataloger" ) );
        assertNotNull( authTools.checkAuthentication( req ) );
    }
    
    /**
     * Gets authTools.
     * 
     * @return the authTools
     */
    protected AuthenticationTools authTools() {
        return AuthenticationTools.create("user", "guest", "password");
    }
    
    /**
     * Gets HttpServlet.
     * 
     * @return the HttpServlet
     */
    protected HttpServlet getHttpServlet() {
        return new HttpServlet("http://example.com/cataloger/editMet