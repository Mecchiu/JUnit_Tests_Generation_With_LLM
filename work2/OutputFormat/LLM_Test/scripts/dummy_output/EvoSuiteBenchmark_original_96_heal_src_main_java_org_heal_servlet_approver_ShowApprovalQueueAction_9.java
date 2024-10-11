// ShowApprovalQueueActionTest.java
package org.heal.servlet.approver;

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
* Test class of {@link ShowApprovalQueueAction}.
* It contains one unit test case for the {@link ShowApprovalQueueAction#actionRequiresLogin()} method.
*/
class ShowApprovalQueueActionTest {
		
	/** Shows the approval queue view. */
	@Test
    public void testAction() throws Exception {
		
		final String action = "ShowApprovalQueueAction";
        try {
            requestInit();
            Action a = (Action) Class.forName( action ).newInstance();
            if (! a.actionRequiresLogin() ) {
                throw new Exception( "Action with the no-login flag required by the implementation." );
            }
            request.setAttribute( QueueDAO.ACTION_INDEX, a.actionName() );
        	renderServlet(action);
        } catch (Exception e) {
            failed( e, action );
        }
        
    }
	
    private void requestInit(){
        final String action = "Action";
        try {
            request.setAttribute( QueueDAO.ACTION_INDEX, action );
            request.setAttribute( QueueDAO.APPROVAL_QUEUE_NAME, "Q1" );
        } catch ( Exception e ) {
            throw new IllegalStateException( e.getMessage(), e );
        }
    }
    
    private void renderServlet(String action) throws ServletException, IOException {
        
        try {
            String content = "";

            // Request dispatcher
            final HttpServletRequest request = (HttpServletRequest) requestInit();
            final RequestDispatcher requestDispatcher = request.getRequestDispatcher( action );
            request.setAttribute("RDFQuery", new RDFQuery( requestDispatcher ) );
            request.setAttribute("queryURL", requestDispatcher.getUrl());
            request.setAttribute( QueueDAO.QUEUE_NAME_INDEX, "Q1" );
            request.setAttribute("actionName", action );
            request.setAttribute("actionType", action );
            request.setAttribute("actionType", action );
            request.setAttribute( QueueDAO.ACTION_INDEX, action );
            request.setAttribute( Action.HTTP_REQUEST_URI, request.getRequestURI() );
            content = getResultContent( request );
            requestDispatcher.forward( request, content );
        } catch (ServletException e) {
            throw e;
        } catch ( IOException e ) {
            throw e;
        } catch (Exception e) {
            throw new ServletException( e );
        }
        
    }
	
    private String getResultContent(HttpServletRequest request) throws ServletException, IOException {
        final StringBuilder b = new StringBuilder( 8192);
        try{
            request.setCharacterEncoding( "latin-1" );

            List<QueueDAO.QueueData> results = QueueDAO.queueDAO().listAll();
            for ( QueueDAO.QueueData queue : results ) {
                System.out.println( queue.toString() );
            }
            request.setCharacterEncoding( null );

            return b.toString();
        }
        catch (Exception e){
            return e.getMessage();
        }
    }

}