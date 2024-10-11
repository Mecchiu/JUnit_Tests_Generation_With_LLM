// HttpBot_2Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains one unit test case for the {@link HttpBot#getPage(String)} method.
*/
class HttpBot_2Test {
private final String PAGE_URL = "index.php?title=Main_Page";
		/**
		 * @throws MalformedURLException
		 * @throws IOException
		 * @throws ActionException
		 */
		@Test
		public void test() throws MalformedURLException, IOException, ActionException, Exception {
			HttpActionClient httpClient = new HttpActionClient();
			//
			httpClient.login(CUSTOMER_USERNAME, CUSTOMER_PASSWORD);
			//
            //
            String url = PAGE_URL;
        	// http get URL
            // TODO: Make use of JWBLog to print exceptions?
            System.out.println("test: ");
   		//
            //
            url = "http://" + url;
            // the action client should give 500 error and redirect
            // httpActionClient.setContentType("text/html", "UTF-8");
            // ActionClient should be able to handle page with unknown protocol
            // https://sourceforge.net/action/actionclient/bugs/253938/
            String statusCode = httpClient.getStatus();
            //
			//
            //
            GetPage gp = new GetPage(url);
            //
            ProcessException e = null;
            try {
	            performAction(gp);
            } catch (Exception e1) {
                e = e1;
            }
            assertNotNull("Expected exception was not set",e);
	        System.out.println("gp");
	        System.out.println(gp.asString());
            
        	// try to get content via another action client that supports this feature
        	httpClient.setContentType("text/html", "UTF-8");                	
        	e = null;
            try {
	            httpClient.getPage(url);
	            // this should fail as content type isn't set properly
	            assertNull("Response did not fail",e);
            } catch (Exception e1) {
                e = e1;
            }

	        //
            try {
	            httpClient.getAllPages();
		        Exception ex = null;
	            // this should fail as Content-Type is not yet set
		        httpClient.setContentType("text/html", "UTF-8");
	            try{
	            performAction(httpClient);
	            } catch(Exception e1){
	            	ex = e1;
	            }
	            assertNull("Response did not fail",ex);
	            // can do getPage
	            // but still fails
	            assertFalse("Response got content for page that doesn't have one",httpClient.getAllPages().isEmpty());
            } catch (Exception e1) {
                System.out.println("*** Exception:");
                e1.printStackTrace();
            }
        }
        
        // test for custom page URL
        // it will return content for specified url.
        // It will return content for specified url
        // it will return content for specified url
        
        public ContentProcessable performAction(GetPage pg) throws ActionException, MalformedURLException {
    		
            System.out.println("performAction: ");
            
            return pg;
        }
    }
