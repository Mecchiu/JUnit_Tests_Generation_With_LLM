// HttpBot_3Test.java
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
* It contains one unit test case for the {@link HttpBot#getBytes(String)} method.
*/
class HttpBot_3Test {
// this test case is a stub which will be executed when the action
		// "http://xxx.xxx.xxx.xxx:xxxx/foo", when the action "http://yyy.yyy.yyy.yyy"
		// which is a request for {@link Get} is executed.
		// we check that the response from the request is what we get upon receiving 
		// the response. 
        private final URL url;
        
        public HttpBot_3Test(String url) throws MalformedURLException {
            this.url = new URL(url);
        }

        @Test
		public void getBytes_request_is_requested() throws MalformedURLException, IOException, ProcessException   {
                        ActionExecute request = new ActionExecute();
                        HttpActionClient.setCredentials(request, "xxx-yyy");
                       
                        new GetPage().execute(new ActionExecutable(), request);
                        
                        String res = new String(cc.get(new Get(url.toExternalForm())));
                        assertEquals("GET /foo", res);
                        
        }
}