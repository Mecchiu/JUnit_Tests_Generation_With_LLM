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
		
    private final AccessChecker accessChecker;

    public ShowApprovalQueueActionTest() {
        this.accessChecker = new AccessChecker();
    }

    @Test
    public void test() throws IOException {

        // setup test credentials
        String userName   = "name0";
        String password   = "password0";
        String token      = "token0";
        String hostname   = "test1";
   		QueueDAO queueDAO       = new QueueDAO(userName, password, token, hostname);
   		List<ApprovalQueueInfo> queueInfos = AccessTestUtilitiesTest.generateQueueInfo(queueDAO.getApprovalQueues());
          
        // execute test case
        Action resultAction        = this.accessChecker.runTest(QueueDAOTests.setUpAndAssert());
        assertEquals(null, resultAction);
        
		RequestDispatcher dispatcher    = this.accessChecker.buildRequestDispatcher("/ShowApprovalQueueAction/showApprovalQueue.jsp", null);
        assertNotNull(dispatcher);

        this.accessChecker.login(dispatcher, userName, password, token, hostname);
        
        // show actions
        String pageName = "/ShowApprovalQueueAction/showApprovalQueue.jsp";
        RequestDispatcher showApprovalQueueAction = this.accessChecker.buildRequestDispatcher(pageName, null);
        ResponseWrapper response = assertThrows(null, showApprovalQueueAction, true);
        assertEquals(302, response.getStatusCode());

        String responseString = IOUtils.toString(response.getResponse());
        assertEquals("success", responseString);
        
    }
    
    public class AccessChecker {

    	public AccessChecker(HttpServletRequest  request) {
    		this.request = request;
    	}
   		
    	
		public String runTest(Runnable actions) throws IOException {
    		List<ApprovalQueueInfo> queueInfo = actions.getActualResult();
    		for (ApprovalQueueInfo queueInfo : queueInfo) {
    			AuthenticationTools.addAdminLogin(this.request);
    			this.request.getSession(false).setAttribute("queueName", queueInfo.getQueueName());
    			actions.run();
    		}
    		return "success";
    	}
	
	    private Object request;
		private Runnable getRunnable(String pageName) {

			return new Runnable() {
                
   				public void run() {
                	RequestDispatcher dispatcher = (RequestDispatcher) request.getAttribute("actionDispatcher");
    				((RequestDispatcherAction) dispatcher).init(null);
                // setup request
        System.out.println("*** " + pageName);
   				
    				RequestDispatcher page =
	            	    ( (RequestDispatcherAction) dispatcher).buildPage(pageName);
    				System.out.println(page);
    				
    				((RequestDispatcherAction) dispatcher).setRequest((HttpServletRequest) request);
   					
  	            System.out.println(DispatchingServlet.class);
                boolean result = page.include(request, (HttpServletResponse) response);
                
    	            boolean expectedResult = pageName.equals("ShowApprovalQueueAction") // if app asks to approve a queue, it should return true
				&& result;
    	            
    	            assertEquals(expectedResult, result);
    	            
                System.out.println(DispatchingServlet.class);
                }
        };
		}
    
}
}