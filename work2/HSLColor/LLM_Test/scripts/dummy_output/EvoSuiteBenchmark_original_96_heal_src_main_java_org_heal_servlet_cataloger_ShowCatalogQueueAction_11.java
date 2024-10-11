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
		
    private HttpServlet servlet = new HttpServlet(){

          /**
          * Show a specified catalog queue.
          *
          * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
          * @return a {@link String} containing the content of the specified catalog queue;
          */
          protected String doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          	return "OK";
          }
          
          /**
          * Action which must provide credentials for a login on the current browser to use the catalog queue.
          *
          * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
          */
          protected Action doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          	return new ShowCatalogQueueAction();
          }
    };
    
    @Test
    public void testAction(){
        RequestDispatcher dispatcher = getRequestDispatcher("/catalog-queue-action.jsp");
        assertNotNull(dispatcher); 
    }
}